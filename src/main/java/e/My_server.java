package e;

import listeners.JumpHelloListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class My_server extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new JumpHelloListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
