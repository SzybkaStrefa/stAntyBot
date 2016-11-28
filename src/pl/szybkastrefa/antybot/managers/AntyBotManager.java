package pl.szybkastrefa.antybot.managers;

import pl.szybkastrefa.antybot.Main;

public class AntyBotManager {

	public static boolean playedBefore(String s){
		if (Main.getInst().getConfig().getString("users." + s) == null){
			Main.getInst().getConfig().set("users." + s, true);
			Main.getInst().saveConfig();
			Main.getInst().reloadConfig();
			return false;
		}
		if (Main.getInst().getConfig().getBoolean("users." + s)){
			return true;
		}
		Main.getInst().getConfig().set("users." + s, true);
		Main.getInst().saveConfig();
		Main.getInst().reloadConfig();
		return false;
	}
}