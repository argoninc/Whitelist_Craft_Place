package com.github.argoninc.Listener;

import org.bukkit.Material;

public class WhitelistBlock {
	
	public static boolean isValidCraft(Material item) {
		
		Material[] proib = {Material.TNT, Material.ENDER_CHEST};
		
		for(Material m: proib) {
			if(item.equals(m)) { 
				return false;
			}
		}

		return true;
	}
	
	public static boolean isValidPlace(Material item) {
		
		Material[] proib = {Material.TNT, Material.BEDROCK, Material.ENDER_CHEST};
		
		for(Material m: proib) {
			if(item.equals(m)) { 
				return false;
			}
		}

		return true;
	}
	
}
