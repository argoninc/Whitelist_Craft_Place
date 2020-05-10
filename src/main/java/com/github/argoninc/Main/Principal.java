package com.github.argoninc.Main;

import org.bukkit.plugin.java.JavaPlugin;

import com.github.argoninc.Listener.ListenerCraft;

public class Principal extends JavaPlugin{
	@Override
	public void onEnable() {
		getServer().getPluginManager().registerEvents(new ListenerCraft(), this);
		System.out.println("***************** ENABLE ******************");
	}
	
	@Override
	public void onDisable() {
		System.out.println("***************** DISABLE ******************");
	}
}
