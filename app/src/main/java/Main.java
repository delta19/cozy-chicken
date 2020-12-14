import org.pf4j.DefaultPluginManager;
import org.pf4j.PluginManager;

public class Main
{
    public static void main(String... args)
    {
        System.out.println("cozy chicken started");
    
        // Learning the plugin framework. Start by adding a mouse click counter plugin
        
        PluginManager pluginManager = new DefaultPluginManager();
        pluginManager.loadPlugins();
        pluginManager.startPlugins();
    
        System.out.println("cozy chicken ended");
    }
}