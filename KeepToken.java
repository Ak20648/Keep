package me.slime_e.playertracker;

import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerRespawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;

import java.util.HashMap;

public class KeepToken {
    public HashMap<Player , ItemStack[]> items = new HashMap<Player , ItemStack[]>();

    @EventHandler()
    public void onRespawn(PlayerRespawnEvent e){
        if(items.containsKey(e.getPlayer())){
            e.getPlayer().getInventory().clear();
            for(ItemStack stack : items.get(e.getPlayer())){
                if(stack != null){
                    e.getPlayer().getInventory().addItem(stack);
                }
            }

            items.remove(e.getPlayer());
        }
    }

    @EventHandler()
    public void onDeath(PlayerDeathEvent e){
        Entity cause = e.getEntity().getKiller();
        Player victim = e.getEntity();
        if (cause instanceof Player){

        }else {
            if (victim.getInventory().contains(Item.token))

                ItemStack tokens = ;
                items.put(victim, ;
                e.getEntity().getInventory().clear();
        }

    }
}

