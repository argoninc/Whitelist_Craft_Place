package com.github.argoninc.Listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.inventory.CraftItemEvent;

import com.github.argoninc.Messages.MensagensUsuario;

public class ListenerCraft implements Listener {
	
	@EventHandler

	//M�todo para fazer listener em todos os eventos de crafting
	public void onCraftItem(CraftItemEvent event) {
		
		//Pega o player que tentou realizar o crafiting
		Player player = (Player) event.getWhoClicked();
		//Pega o item que houve a tentativa de crafiting
		Material item = event.getInventory().getResult().getType();
		
		//If para comparar se � um crafting v�lido 
		if (!WhitelistBlock.isValidCraft(item)) {
			MensagensUsuario.blockCraftMessageToUser(player, "Voc� n�o pode craftar ");
			//Canecela a a��o de crafting para o case de ser um item inv�lido
			event.setCancelled(true);
		}
			
	}
	
	@EventHandler
	public void onPlaceBlock(BlockPlaceEvent event) {
		Player player = event.getPlayer();
		
		Material item = event.getBlockPlaced().getType();
		
		//If para comparar se � um crafting v�lido 
		if (!WhitelistBlock.isValidPlace(item)) {
			MensagensUsuario.blockPlaceMessageToUser(player, "Voc� n�o pode colocar ");
			//Canecela a a��o de crafting para o case de ser um item inv�lido
			event.setCancelled(true);
		}
	}

}
