package pl.szybkastrefa.antybot.utils;

import org.bukkit.ChatColor;

public class ColorUtil {

	public static String fixColors(String s){
		if (s.equals(null)){
			return "";
		}
		s = s.replaceAll("%newline%", "\n");
		return ChatColor.translateAlternateColorCodes('&', s);
	}
}