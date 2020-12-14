import org.pf4j.Plugin;
import org.pf4j.PluginWrapper;

public class MouseClickCounter extends Plugin
{
    public MouseClickCounter(PluginWrapper wrapper)
    {
        super(wrapper);
    }
    
    @Override
    public void start()
    {
        System.out.println("Starting mouse clicker plugin");
    }
    
    @Override
    public void stop()
    {
        System.out.println("Stopping mouse clicker plugin");
    }
}
