package me.slime_e.playertracker;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Item {

    public static ItemStack tracker;
    public static ItemStack token;

    public static void apply(){
        buildTracker();
        buildToken();
    }

    private static void buildTracker(){

        ItemStack item = new ItemStack(Material.COMPASS, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Player Tracker");
        List<String> info = new ArrayList<>();
        info.add("&7Currently tracking the nearest player.");
        meta.setLore(info);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        tracker = item;

    }

    private static void buildToken(){

        ItemStack item = new ItemStack(Material.JACK_O_LANTERN, 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("Spooky Token");
        List<String> info = new ArrayList<>();
        info.add("&7Boo!");
        meta.setLore(info);
        meta.addEnchant(Enchantment.LUCK, 1, false);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
        item.setItemMeta(meta);
        token = item;
    }

}
