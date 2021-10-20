package me.slime_e.playertracker;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

public class TrackPlayer implements Listener {
    ItemStack tracker = Item.tracker;
    ItemStack token = Item.token;


    public static void inInventory(PlayerInventory e){

        if(e.contains(Item.tracker)){



        }
    }

}
