/*
   Copyright 2013 William Reed

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
   */

package io.github.wreed12345;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public final class MTCPotions extends JavaPlugin {
	/**
	 * @author William Reed <br>
	 *         First plugin made!
	 */

	final String VERSION = "1.0.0";
	boolean canUsePotion;

	@Override
	public void onEnable() {
		getLogger().info("MTCPotions " + VERSION + " has been enabled!");
		canUsePotion = true;
	}

	@Override
	public void onDisable() {
		getLogger().info("MTCPotions " + VERSION + " has been disabled");
	}

	final int ticksPerSecond = 20;
	final int cooldownInSeconds = 60;
			
	public boolean onCommand(CommandSender sender, Command cmd, String label,
			String[] args) {

		// if command is typed do some stuff.
		if (cmd.getName().equalsIgnoreCase("potion")) {
			// check if running form console
			if (!(sender instanceof Player)) {
				sender.sendMessage(ChatColor.RED
						+ "This command can only be run by a player.");
			} else {// if not console, execute command!
				final Player player = (Player) sender;
				
				if(!player.hasPermission("potions.use")){
					sender.sendMessage(ChatColor.RED + "You do not have permission for this command.");
					return false;
				}
				if (!canUsePotion) {
					sender.sendMessage(ChatColor.RED
							+ "Please wait a little longer until you can use your potion again");
					return false;
				}
				// test if command is correct
				if (args.length > 2) {
					sender.sendMessage(ChatColor.RED + "Too many arguments!");
					sender.sendMessage("Usage: /potion {potion type} {length of its effect in seconds}");
					return false;
				}
				if (args.length < 2) {
					sender.sendMessage(ChatColor.RED + "Not enough arguments!");
					sender.sendMessage("Usage: /potion {potion type} {length of its effect in seconds}");
					return false;
				}
				
				String currentPotion = args[0];
				int timePotionLasts = Integer.valueOf(args[1]);
				
				// make sure timePotionLasts is under ten minutes
				if (timePotionLasts > 600) {
					timePotionLasts = 600;
				}

				// Since switch statements are only in java 7 seems like good
				// idea to do this
				if (currentPotion.equalsIgnoreCase("fireresistance")) {
					if (player.hasPermission("potions.use.fireresistance")) {
						player.addPotionEffect(new PotionEffect(
								PotionEffectType.FIRE_RESISTANCE,
								timePotionLasts * ticksPerSecond, 0));
					} else {
						sender.sendMessage(ChatColor.RED
								+ "You don't have permission for this.");
						return false;
					}
				} else if (currentPotion.equalsIgnoreCase("invisibility")) {
					if (player.hasPermission("potions.use.invisibility")) {
						player.addPotionEffect(new PotionEffect(
								PotionEffectType.INVISIBILITY, timePotionLasts
										* ticksPerSecond, 0));
					} else {
						sender.sendMessage(ChatColor.RED
								+ "You don't have permission for this.");
						return false;
					}
				} else if (currentPotion.equalsIgnoreCase("nightvision")) {
					if (player.hasPermission("potions.use.nightvision")) {
						player.addPotionEffect(new PotionEffect(
								PotionEffectType.NIGHT_VISION, timePotionLasts
										* ticksPerSecond, 0));
					} else {
						sender.sendMessage(ChatColor.RED
								+ "You don't have permission for this.");
						return false;
					}
				} else if (currentPotion.equalsIgnoreCase("regeneration")) {
					if (player.hasPermission("potions.use.regeneration")) {
						player.addPotionEffect(new PotionEffect(
								PotionEffectType.REGENERATION, timePotionLasts
										* ticksPerSecond, 0));
					} else {
						sender.sendMessage(ChatColor.RED
								+ "You don't have permission for this.");
						return false;
					}
				} else if (currentPotion.equalsIgnoreCase("strength")) {
					if (player.hasPermission("potions.use.strength")) {
						player.addPotionEffect(new PotionEffect(
								PotionEffectType.INCREASE_DAMAGE,
								timePotionLasts * ticksPerSecond, 0));
					} else {
						sender.sendMessage(ChatColor.RED
								+ "You don't have permission for this.");
						return false;
					}
				} else if (currentPotion.equalsIgnoreCase("swiftness")) {
					if (player.hasPermission("potions.use.swiftness")) {
						player.addPotionEffect(new PotionEffect(
								PotionEffectType.SPEED, timePotionLasts
										* ticksPerSecond, 0));
					} else {
						sender.sendMessage(ChatColor.RED
								+ "You don't have permission for this.");
						return false;
					}
				} else if (currentPotion.equalsIgnoreCase("swiftness")) {
					if (player.hasPermission("potions.use.swiftness")) {
						player.addPotionEffect(new PotionEffect(
								PotionEffectType.SPEED, timePotionLasts
										* ticksPerSecond, 0));
					} else {
						sender.sendMessage(ChatColor.RED
								+ "You don't have permission for this.");
						return false;
					}
				} else if (currentPotion.equalsIgnoreCase("jump")) {
					if (player.hasPermission("potions.use.jump")) {
						player.addPotionEffect(new PotionEffect(
								PotionEffectType.JUMP, timePotionLasts
										* ticksPerSecond, 0));
					} else {
						sender.sendMessage(ChatColor.RED
								+ "You don't have permission for this.");
						return false;
					}
				} else if (currentPotion.equalsIgnoreCase("haste")) {
					if (player.hasPermission("potions.use.haste")) {
						player.addPotionEffect(new PotionEffect(
								PotionEffectType.FAST_DIGGING, timePotionLasts
										* ticksPerSecond, 0));
					} else {
						sender.sendMessage(ChatColor.RED
								+ "You don't have permission for this.");
						return false;
					}
				} else if (currentPotion.equalsIgnoreCase("scuba")) {
					if (player.hasPermission("potions.use.scuba")) {
						player.addPotionEffect(new PotionEffect(
								PotionEffectType.WATER_BREATHING,
								timePotionLasts * ticksPerSecond, 0));
					} else {
						sender.sendMessage(ChatColor.RED
								+ "You don't have permission for this.");
						return false;
					}
				}
				sender.sendMessage(currentPotion + " has been enabled!");
				canUsePotion = false;
				
				Long cooldownDuration = (long) ((timePotionLasts * ticksPerSecond) + (cooldownInSeconds * ticksPerSecond));
				
				this.getServer().getScheduler()
						.scheduleSyncDelayedTask(this, new Runnable() {

							public void run() {
								//i think this will set to true after 1 minute
								canUsePotion = true;
								getLogger().info("canUsePotion == true!");
							}
						}, (cooldownDuration));//1 minute
			}
			return true;
		}

		if (cmd.getName().equalsIgnoreCase("potionlist")) {
			sender.sendMessage(ChatColor.BLUE + "List of available potions:");
			sender.sendMessage(ChatColor.LIGHT_PURPLE + "- fireresistance");
			sender.sendMessage(ChatColor.LIGHT_PURPLE + "- invisibility");
			sender.sendMessage(ChatColor.LIGHT_PURPLE + "- night vision");
			sender.sendMessage(ChatColor.LIGHT_PURPLE + "- regeneration");
			sender.sendMessage(ChatColor.LIGHT_PURPLE + "- strength");
			sender.sendMessage(ChatColor.LIGHT_PURPLE + "- swiftness");
			sender.sendMessage(ChatColor.LIGHT_PURPLE + "- jump");
			sender.sendMessage(ChatColor.LIGHT_PURPLE + "- dig");
			sender.sendMessage(ChatColor.LIGHT_PURPLE + "- scuba");
			return true;
		}

		return false;
	}

}
