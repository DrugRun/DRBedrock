package me.vinex_.drbedrock.handlers;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;

import me.vinex_.drbedrock.DRBedrock;

public class BedrockHandler implements Listener {

	DRBedrock plugin;

	Map<UUID, Set<Location>> blockData;
	Set<Location> blockLocations;

	public BedrockHandler(DRBedrock plugin) {
		this.plugin = plugin;

		blockData = new HashMap<UUID, Set<Location>>();
		blockLocations = new HashSet<Location>();
	}

	// Load Data
	@EventHandler
	public void onJoin(PlayerJoinEvent e) {
		Player player = e.getPlayer();

		if (plugin.getConfig().getString(player.getUniqueId().toString()) != null) {
			// If UUID is within the configuration file then pull the data.
			blockLocations.add((Location) plugin.getConfig().get("Locations." + player.getUniqueId().toString()));
			blockData.put(player.getUniqueId(), blockLocations);
		}
	}

	// Set Data
	@EventHandler
	public void hasPlacedBedrock(BlockPlaceEvent event) {
		Player player = event.getPlayer();
		Block block = event.getBlock();
		Location blockLoc = block.getLocation();

		if (block.getType() == Material.BEDROCK) {
			blockLocations.add(blockLoc);
			if (!(blockData.containsKey(player.getUniqueId()))) {
				blockData.put(player.getUniqueId(), blockLocations);
				plugin.getConfig().set("Locations." + player.getUniqueId().toString(),
						blockData.get(player.getUniqueId()).toString());
				plugin.saveConfig();
				plugin.reloadConfig();
			}
		}
	}

	// Get / Remove Data
	@EventHandler
	public void hasLeftClickedBedrock(PlayerInteractEvent event) {
		Player player = event.getPlayer();

		if (event.getAction() == Action.LEFT_CLICK_BLOCK) {
			if (event.getClickedBlock() != null || event.getClickedBlock().getType() != Material.AIR) {
				Block block = event.getClickedBlock();
				Location blockLoc = block.getLocation();
				if (event.getClickedBlock().getType() == Material.BEDROCK) {
					if (blockData.containsKey(player.getUniqueId())) {
						if (blockData.get(player.getUniqueId()).contains(blockLoc)) {
							block.setType(Material.AIR);
							player.getInventory().addItem(new ItemStack(Material.BEDROCK, 1));
							blockLocations.remove(blockLoc);
							blockData.put(player.getUniqueId(), blockLocations);
							plugin.getConfig().set("Locations." + player.getUniqueId().toString(), blockData.get(player.getUniqueId()).toString());
							plugin.saveConfig();
							plugin.reloadConfig();
						} else {
							player.sendMessage("§c§lERROR: §7You cannot perform this action. You did not place this block!");
							event.setCancelled(true);
						}
					}
				}
			}
		}
	}
}
