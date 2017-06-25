package Ragnok123.ExtraPerms;

import Ragnok123.ExtraPerms.EventListeners.*;
import Ragnok123.ExtraPerms.Manager.*;

import cn.nukkit.Player;
import cn.nukkit.Server;

import cn.nukkit.utils.*;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.event.Listener;

public class ExtraPerms extends PluginBase implements Listener
{
	
	public ExtraPerms instance;
	
	@Override
	public void onEnable()
	{
		
	}
	
	public static ExtraPerms getInstance()
	{
		return instance;
	}
	
	
}
