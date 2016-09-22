package fr.umlv.dragon.jlinkplugin;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import jdk.tools.jlink.plugin.*;
import jdk.tools.jlink.plugin.ResourcePoolEntry.Type;

public class ShrinkPlugin implements Plugin {
  private final ArrayList<String> packages = new ArrayList<>();
  private final HashSet<String> classNames = new HashSet<>();

  public ShrinkPlugin() {
  }

  @Override
  public String getName() {
    return "shrink";
  }

  @Override
  public String getDescription() {
    return "only include classes listed";
  }

  @Override
  public boolean hasArguments() {
    return true;
  }

  @Override
  public String getArgumentsDescription() {
    return "list of classes that are needed to run";
  }

  @Override
  public void configure(Map<String, String> config) {
    String argument = config.get(getName());
    Path path = Paths.get(argument);

    try (Stream<String> lines = Files.lines(path)) {
      lines.forEach(line -> {
        String name = line.replace('.', '/');
        if (line.endsWith("*")) {
          packages.add(name.substring(0, name.length() - 1));
        } else {
          classNames.add(name);
        }
      });
    } catch (IOException e) {
      throw new UncheckedIOException(e);
    }
  }

  private static String className(String path) {
    int firstSlash = path.indexOf('/', 1); // skip root '/'
    String className = path.substring(firstSlash + 1, path.length() - ".class".length());
    return className;
  }

  @Override
  public ResourcePool transform(ResourcePool in, ResourcePoolBuilder builder) {
    in.entries().forEach(entry -> {
      if (entry.type() != Type.CLASS_OR_RESOURCE) {
        builder.add(entry);
        return;
      }
      String path = entry.path();
      if (!path.endsWith(".class")) {
        builder.add(entry);
        return;
      }
      String className = className(path);
      if (classNames.contains(className) || packages.stream().anyMatch(className::startsWith)) {
        builder.add(entry);
      }
    });
    return builder.build();
  }
}
