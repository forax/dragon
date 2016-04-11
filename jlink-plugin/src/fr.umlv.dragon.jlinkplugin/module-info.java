module fr.umlv.dragon.jlinkplugin {
  requires jdk.jlink;    
    
  provides jdk.tools.jlink.plugin.TransformerPlugin with fr.umlv.dragon.jlinkplugin.ClassListGeneratorPlugin;
}