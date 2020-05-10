package com.github.argoninc.Listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.CraftItemEvent;

public class ListenerCraft implements Listener {
	
	@EventHandler

	//M�todo para fazer listener em todos os eventos de crafting
	public void onCraftItem(CraftItemEvent event) {
		
		//Pega o player que tentou realizar o crafiting
		Player player = (Player) event.getWhoClicked();
		//Pega o item que houve a tentativa de crafiting
		Material item = event.getInventory().getResult().getType();
		
		//If para comparar se � um crafting v�lido 
		if (WhitelistBlock.isValidCraft(item)) {
			player.sendMessage("*MENSAGEM TESTE* VOC� CRAFTOU: " + item);

		}else {
			player.sendMessage("*MENSAGEM TESTE* VOC� TENTOU CRAFTAR E N�O FOI: " + item);
			event.setCancelled(true);
		}
		
	}

}
