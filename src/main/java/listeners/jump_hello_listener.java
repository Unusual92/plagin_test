package listeners;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class jump_hello_listener implements Listener {

    @EventHandler
    public void jump_hello_listener(PlayerJumpEvent event) {
        Player player = event.getPlayer();

        player.sendMessage("Hello");
    }
}