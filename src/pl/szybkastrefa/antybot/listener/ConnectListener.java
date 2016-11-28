package pl.szybkastrefa.antybot.listener;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent.Result;

import pl.szybkastrefa.antybot.managers.AntyBotManager;
import pl.szybkastrefa.antybot.managers.Settings;
import pl.szybkastrefa.antybot.utils.ColorUtil;

public class ConnectListener implements Listener {

	@EventHandler
	public void onConnect(AsyncPlayerPreLoginEvent e){
		String name = e.getName();
		if (!AntyBotManager.playedBefore(name)){
			e.disallow(Result.KICK_OTHER, ColorUtil.fixColors(Settings.getKickMessage()));
		}
	}
}