package org.examplee.untitled2;

import listeners.jumpHelloListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class Untitled2 extends JavaPlugin {

    @Override
    public void onEnable() {

        getServer().getPluginManager().registerEvents(new jumpHelloListener(), this);
        getLogger().info("Hello World");

    }

    @Override
    public void onDisable() {
        getLogger().info("Goodbye World");
    }
}
