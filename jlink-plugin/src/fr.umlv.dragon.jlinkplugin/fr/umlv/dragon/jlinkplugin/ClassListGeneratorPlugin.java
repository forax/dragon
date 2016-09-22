package fr.umlv.dragon.jlinkplugin;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import jdk.tools.jlink.plugin.PluginException;
import jdk.tools.jlink.plugin.ResourcePool;
import jdk.tools.jlink.plugin.ResourcePoolBuilder;
import jdk.tools.jlink.plugin.ResourcePoolEntry;
import jdk.tools.jlink.plugin.ResourcePoolEntry.Type;
import jdk.tools.jlink.plugin.Plugin;

public class ClassListGeneratorPlugin implements Plugin {
    private Path outputPath;
    
    public ClassListGeneratorPlugin() {
    }
    
    @Override
    public String getName() {
        return "genclasslist";
    }

    @Override
    public String getDescription() {
        return "generate Class Data Sharing classfile";
    }

    @Override
    public boolean hasArguments() {
        return true;
    }

    @Override
    public String getArgumentsDescription() {
       return "output classfile name";
    }

    @Override
    public void configure(Map<String, String> config) {
        String argument = config.get(getName());
        outputPath = Paths.get(argument);
    }

    private static String className(String path) {
      int firstSlash = path.indexOf('/', 1); // skip root '/'
      String className = path.substring(firstSlash + 1, path.length() - ".class".length()); 
      return className;
    }
    
    @Override
    public ResourcePool transform(ResourcePool in, ResourcePoolBuilder builder) {
        if (outputPath == null) {
          throw new PluginException("no output path set !");
        }
      
        List<String> classList =
          in.entries()
            .filter(entry -> entry.type() == Type.CLASS_OR_RESOURCE)
            .map(ResourcePoolEntry::path)
            .filter(path -> path.endsWith(".class"))
            .map(path -> className(path))
            .filter(name -> !name.equals("module-info"))
            .sorted()
            .collect(Collectors.toList());
        
        Path outputPath = this.outputPath;
        System.out.println("generate classfile " + outputPath);
        try {
          Files.createDirectories(outputPath.getParent());
          Files.write(outputPath, classList);
        } catch(IOException e) {
          throw new UncheckedIOException(e);
        }
        
        return in;
    }
}
