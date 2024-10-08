package winlyps.sprintBoost

import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerToggleSprintEvent
import org.bukkit.potion.PotionEffect
import org.bukkit.potion.PotionEffectType

class SprintBoostListener(private val plugin: SprintBoost) : Listener {

    @EventHandler
    fun onPlayerToggleSprint(event: PlayerToggleSprintEvent) {
        val player: Player = event.player

        // Check if the player is starting to sprint
        if (event.isSprinting) {
            // Apply the speed effect for 10 seconds (200 ticks)
            player.addPotionEffect(PotionEffect(PotionEffectType.SPEED, 200, 0))
        }
    }
}