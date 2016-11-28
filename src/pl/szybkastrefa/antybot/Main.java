package pl.szybkastrefa.antybot;

import org.bukkit.plugin.java.JavaPlugin;

import pl.szybkastrefa.antybot.basic.Listeners;
import pl.szybkastrefa.antybot.managers.SettingsManager;

public class Main extends JavaPlugin{
	private static Main instance;
	
	public void onEnable(){
		instance = this;
		SettingsManager.loadConfig();
		Listeners.register();
	}
	public static Main getInst(){
		return instance;
	}
}