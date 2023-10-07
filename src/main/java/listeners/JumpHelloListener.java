package listeners;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class JumpHelloListener implements Listener {

    @EventHandler
    public void JumpHelloListener(PlayerJumpEvent event) {
        Player player = event.getPlayer();

        player.sendMessage("Hello");
    }
}