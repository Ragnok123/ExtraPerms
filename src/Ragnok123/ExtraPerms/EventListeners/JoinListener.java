package Ragnok123.ExtraPerms.EventListeners;

import cn.nukkit.event.Listener;
import cn.nukkit.event.player.*;

import cn.nukkit.Player;
import Ragnok123.ExtraPerms.*;
import cn.nukkit.event.*;

public class JoinListener implements Listener
{
	
	public ExtraPerms extraperms;
	
	public JoinListener(ExtraPerms extraperms)
	{
		this.extraperms = extraperms;
	}
	
	@EventHandler
	public void onJoin(PlayerJoinEvent event)
	{
		Player player = event.getPlayer();
		if(!ExtraPerms.getInstance().groupmanager.accExists(player.getName()))
		{
			ExtraPerms.getInstance().groupmanager.createData(player.getName());
		} /* else {
			player.addAtachment(ExtraPerms.getInstance(), ExtraPerms.getInstance().rankmanager.getRankPermissions(), true);
		} */
	}
	
	
}
