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

	//Método para fazer listener em todos os eventos de crafting
	public void onCraftItem(CraftItemEvent event) {
		
		//Pega o player que tentou realizar o crafiting
		Player player = (Player) event.getWhoClicked();
		//Pega o item que houve a tentativa de crafiting
		Material item = event.getInventory().getResult().getType();
		
		//If para comparar se é um crafting válido 
		if (!WhitelistBlock.isValidCraft(item)) {
			MensagensUsuario.blockCraftMessageToUser(player, "Você não pode craftar ");
			//Canecela a ação de crafting para o case de ser um item inválido
			event.setCancelled(true);
		}
			
	}
	
	@EventHandler
	public void onPlaceBlock(BlockPlaceEvent event) {
		Player player = event.getPlayer();
		
		Material item = event.getBlockPlaced().getType();
		
		//If para comparar se é um crafting válido 
		if (!WhitelistBlock.isValidPlace(item)) {
			MensagensUsuario.blockPlaceMessageToUser(player, "Você não pode colocar ");
			//Canecela a ação de crafting para o case de ser um item inválido
			event.setCancelled(true);
		}
	}

}
