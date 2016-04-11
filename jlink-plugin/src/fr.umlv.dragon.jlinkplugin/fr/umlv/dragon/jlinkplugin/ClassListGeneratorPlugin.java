package fr.umlv.dragon.jlinkplugin;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Map;
import java.util.Set;

import jdk.tools.jlink.plugin.PluginException;
import jdk.tools.jlink.plugin.Pool;
import jdk.tools.jlink.plugin.Pool.ModuleDataType;
import jdk.tools.jlink.plugin.TransformerPlugin;

public class ClassListGeneratorPlugin implements TransformerPlugin {
    private Path outputPath;
    
    public ClassListGeneratorPlugin() {
    }

    @Override
    public Set<PluginType> getType() {
        return Set.of(CATEGORY.TRANSFORMER);
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
    public Set<STATE> getState() {
        return EnumSet.of(STATE.FUNCTIONAL);
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

    @Override
    public void visit(Pool in, Pool out) {
        if (outputPath == null) {
          throw new PluginException("no output path set !");
        }
      
        ArrayList<String> classList = new ArrayList<>();
        for (Pool.ModuleData data : in.getContent()) {
          out.add(data);
           
          String path = data.getPath();
          if (data.getType() == ModuleDataType.CLASS_OR_RESOURCE && path.endsWith(".class")) {
            int firstSlash = path.indexOf('/', 1); // skip root '/'
            String className = path.substring(firstSlash + 1, path.length() - ".class".length()); 
            if (className.equals("module-info")) {
              continue;
            }
            classList.add(className);
          }
        }
        classList.sort(null);
        
        Path outputPath = this.outputPath;
        System.out.println("generate classfile " + outputPath);
        try {
          Files.createDirectories(outputPath.getParent());
          Files.write(outputPath, classList);
        } catch(IOException e) {
          throw new UncheckedIOException(e);
        }
    }
}
