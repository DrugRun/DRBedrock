package me.vinex_.drbedrock;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

import me.vinex_.drbedrock.handlers.BedrockHandler;

public class DRBedrock extends JavaPlugin {

	/*
	 * Created by: ItsVinnyX#0001. 
	 * Date: 08/21/2022. 
	 * Started 7:00 AM EST. 
	 * Project for @Wazupbutrcup#3147.
	 */
	
	private static Plugin plugin;
	
	@Override
	public void onEnable() {
		plugin = this;
		registerEvents();
		
		getConfig().options().copyDefaults(true);
        saveConfig();
	}

	@Override
	public void onDisable() {
		plugin = null;
		saveConfig();
	}

	public void registerEvents() {
		Bukkit.getPluginManager().registerEvents(new BedrockHandler(this), this);
	}

	public static Plugin getPlugin() {
		return plugin;
	}

}
