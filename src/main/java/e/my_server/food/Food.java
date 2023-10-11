package e.my_server.food;

import co.aikar.commands.BukkitCommandManager;
import e.my_server.food.listeners.FoodConfig;
import org.bukkit.plugin.java.JavaPlugin;

public final class Food extends JavaPlugin {

    @Override
    public void onEnable() {
        getLogger().info("");

        saveDefaultConfig();

        BukkitCommandManager manager = new BukkitCommandManager(this);
        manager.registerCommand(new FoodConfig(this));

        getLogger().info("");
    }

    @Override
    public void onDisable() {
        getLogger().info("Good bay");
    }



}