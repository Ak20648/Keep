package me.slime_e.playertracker;

import org.bukkit.plugin.java.JavaPlugin;

public final class PlayerTracker extends JavaPlugin {

    @Override
    public void onEnable() {
        Item.apply();


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
