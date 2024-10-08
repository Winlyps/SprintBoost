package winlyps.sprintBoost

import org.bukkit.plugin.java.JavaPlugin

class SprintBoost : JavaPlugin() {

    override fun onEnable() {
        // Register the event listener
        server.pluginManager.registerEvents(SprintBoostListener(this), this)
        logger.info("SprintBoost plugin enabled.")
    }

    override fun onDisable() {
        logger.info("SprintBoost plugin disabled.")
    }
}