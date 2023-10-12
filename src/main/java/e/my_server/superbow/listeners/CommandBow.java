package e.my_server.superbow.listeners;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Default;
import org.bukkit.Material;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

@CommandAlias("bow")
@CommandPermission("teleportbow.command")
public class CommandBow extends BaseCommand {

    @Default
    public void onCommand(CommandSender sender) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            ItemStack teleportBow = createTeleportBow();
            player.getInventory().addItem(teleportBow);
            player.sendMessage("Вы получили телепортационный лук!");
        } else {
            sender.sendMessage("Эту команду может использовать только игрок!");
        }
    }

    private ItemStack createTeleportBow() {
        ItemStack bow = new ItemStack(Material.BOW);
        ItemMeta meta = bow.getItemMeta();
        meta.setDisplayName("Телепортационный Лук");
        bow.setItemMeta(meta);
        return bow;
    }
}