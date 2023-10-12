package e.my_server.superbow;

import co.aikar.commands.PaperCommandManager;
import e.my_server.superbow.listeners.CommandBow;
import e.my_server.superbow.listeners.Teleport;
import org.bukkit.plugin.java.JavaPlugin;

public class SuperBow extends JavaPlugin {

    @Override
    public void onEnable() {
        PaperCommandManager manager = new PaperCommandManager(this);
        manager.registerCommand(new CommandBow());
        getServer().getPluginManager().registerEvents(new Teleport(), this);
    }
}