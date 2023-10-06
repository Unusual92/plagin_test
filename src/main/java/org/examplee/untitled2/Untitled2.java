package org.examplee.untitled2;

import org.bukkit.plugin.java.JavaPlugin;

public final class Untitled2 extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getLogger().info("Hello World");

    }

    @Override
    public void onDisable() {
        getLogger().info("Goodbye World");
    }
}
