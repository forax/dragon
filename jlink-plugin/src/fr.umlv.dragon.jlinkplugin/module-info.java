module fr.umlv.dragon.jlinkplugin {
  requires jdk.jlink;    
    
  provides jdk.tools.jlink.plugin.Plugin with fr.umlv.dragon.jlinkplugin.ClassListGeneratorPlugin;
  provides jdk.tools.jlink.plugin.Plugin with fr.umlv.dragon.jlinkplugin.ShrinkPlugin;
}