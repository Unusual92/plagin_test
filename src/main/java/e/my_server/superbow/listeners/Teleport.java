package e.my_server.superbow.listeners;

import org.bukkit.Material;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class Teleport implements Listener {

    @EventHandler
    public void onProjectileHit(ProjectileHitEvent event) {
        if (!(event.getEntity() instanceof Arrow)) return;

        Arrow arrow = (Arrow) event.getEntity();
        if (!(arrow.getShooter() instanceof Player)) return;

        Player player = (Player) arrow.getShooter();
        if (player.getInventory().getItemInMainHand().getType() != Material.BOW ||
                !player.getInventory().getItemInMainHand().hasItemMeta() ||
                !player.getInventory().getItemInMainHand().getItemMeta().getDisplayName().equals("Телепортационный Лук")) return;

        player.teleport(arrow.getLocation());
        arrow.remove();
    }
}