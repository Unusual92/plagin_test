package listeners;

import com.destroystokyo.paper.event.player.PlayerJumpEvent;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
public class jumpHelloListener implements Listener{
    @EventHandler
    public void jumpHelloListener(PlayerJumpEvent event) {
        Player player = event.getPlayer();
        player.sendMessage("Hello");
    }
}
