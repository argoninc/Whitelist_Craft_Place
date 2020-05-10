package com.github.argoninc.Messages;

import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class MensagensUsuario {
	
	
	public static void blockCraftMessageToUser(Player target, String message) {
		target.sendMessage(ChatColor.DARK_RED + message);
	}
	
	public static void blockPlaceMessageToUser(Player target, String message) {
		target.sendMessage(ChatColor.DARK_RED + message);
	}
	
	public static void blockInteractMessageToUser(Player target, String message) {
		target.sendMessage(ChatColor.DARK_RED + message);
	}


}
