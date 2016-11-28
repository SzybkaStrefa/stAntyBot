package pl.szybkastrefa.antybot.managers;

import pl.szybkastrefa.antybot.Main;

public class SettingsManager {
	public static String message;
	
	public static void loadConfig(){
		Main.getInst().saveDefaultConfig();
		message = Main.getInst().getConfig().getString("settings.kickmessage");
	}
}