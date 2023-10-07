package e;

import listeners.jump_hello_listener;
import org.bukkit.plugin.java.JavaPlugin;

public final class My_server extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new jump_hello_listener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
