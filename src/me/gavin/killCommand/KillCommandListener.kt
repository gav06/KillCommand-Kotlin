package me.gavin.killCommand

import org.bukkit.event.EventHandler
import org.bukkit.event.EventPriority
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerCommandPreprocessEvent

class KillCommandListener : Listener {

    @EventHandler(priority = EventPriority.LOWEST)
    fun processCommand(event: PlayerCommandPreprocessEvent) {
        var command = event.message.substring(1).split(" ")[0]

        if (command.toLowerCase().equals("kill")) {
            event.player.health = 0.0
            event.isCancelled = true
        }
    }
}