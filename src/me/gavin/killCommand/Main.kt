package me.gavin.killCommand

import org.bukkit.plugin.java.JavaPlugin

class Main: JavaPlugin() {

    override fun onEnable() {
        server.pluginManager.registerEvents(KillCommandListener(), this)
    }
}