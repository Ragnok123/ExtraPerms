package Ragnok123.ExtraPerms.Manager;

import Ragnok123.ExtraPerms.ExtraPerms;

import cn.nukkit.Server;
import cn.nukkit.utils.*;

import java.util.*;
import java.io.*;

public class RankManager
{

	public ExtraPerms extraperms;

	public RankManager(ExtraPerms extraperms)
	{
		this.extraperms = extraperms;
	}
	
	public String getRank(String username)
	{
		File file = new File(ExtraPerms.getInstance().getDataFolder() + "rankmanager.yml");
		Config config = new Config(file, Config.YAML);
		return config.get("users").get("rank");
	}
	
	
}
