package e.my_server.ex2c;

import co.aikar.commands.BukkitCommandManager;
import e.my_server.ex2c.listeners.HelloCommand;
import org.bukkit.plugin.java.JavaPlugin;

public final class Ex2c extends JavaPlugin {

    @Override
    public void onEnable() {

        BukkitCommandManager manager = new BukkitCommandManager(this);

        manager.registerCommand(new HelloCommand());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
