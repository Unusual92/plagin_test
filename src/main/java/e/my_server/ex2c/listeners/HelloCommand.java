package e.my_server.ex2c.listeners;

import co.aikar.commands.BaseCommand;
import co.aikar.commands.annotation.CommandAlias;
import co.aikar.commands.annotation.CommandPermission;
import co.aikar.commands.annotation.Default;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

@CommandAlias("hello")
public class HelloCommand extends BaseCommand {

    @Default
    @CommandPermission("minecraft.command.op")
    public void onHelloCommand(CommandSender sender) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            String playerName = player.getName();
            player.sendMessage("Привет, " + playerName + "!");
            //sender.sendMessage("ку");
        } else {
            sender.sendMessage("только с op");
        }
    }
}