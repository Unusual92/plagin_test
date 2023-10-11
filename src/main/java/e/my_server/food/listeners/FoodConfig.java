package e.my_server.food.listeners;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.Default;
import e.my_server.food.Food;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import net.kyori.adventure.text.Component;
@CommandAlias("food")
public class FoodConfig extends BaseCommand {

    private final Food plugin;

    public FoodConfig(Food plugin) {
        this.plugin = plugin;
    }

    @Default
    public void onFavouriteFood(CommandSender sender, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage(Component.text("ну э брат, тут только с op"));
            return;
        }

        Player player = (Player) sender;

        if (args.length > 0) {
            String newFavouriteFood = String.join("", args);
            this.plugin.getConfig().set("favourite-food", newFavouriteFood);
            this.plugin.saveConfig();
            player.sendMessage(Component.text("Любимая еда была изменена на " + newFavouriteFood));
        } else {
            String favouriteFood = this.plugin.getConfig().getString("favourite-food");
            player.sendMessage(Component.text("Любимая еда - " + favouriteFood));
        }
    }
}

