package com.github.argoninc.Listener;

import org.bukkit.Material;

public class WhitelistBlock {
	
	public static boolean isValidCraft(Material item) {
		
		Material[] proib = {Material.TNT, Material.CRAFTING_TABLE};
		
		for(Material m: proib) {
			if(item.equals(m)) { 
				return false;
			}
		}

		return true;
	}
	
}
