package pl.szybkastrefa.antybot.basic;

import org.bukkit.Bukkit;
import org.bukkit.plugin.PluginManager;

import pl.szybkastrefa.antybot.Main;
import pl.szybkastrefa.antybot.listener.ConnectListener;

public class Listeners {

	public static void register(){
		PluginManager pm = Bukkit.getPluginManager();
		pm.registerEvents(new ConnectListener(), Main.getInst());
	}
}