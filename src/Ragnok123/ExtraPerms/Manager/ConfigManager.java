package Ragnok123.ExtraPerms.Manager;

import Ragnok123.ExtraPerms.ExtraPerms;

import cn.nukkit.Server;
import cn.nukkit.utils.*;

import java.util.*;
import java.io.*;

public class ConfigManager
{
	
	public ExtraPerms extraperms;
	
	public ConfigManager(ExtraPerms extraperms)
	{
		this.extraperms = extraperms;
	}
	
	public void createData(String username)
	{
		HashMap<String, String> rankData = new HashMap<String, String>();
		HashMap<String, HashMap<String, String>> data = new HashMap<String, HashMap<String, String>>();
		rankData.put("rank", "user");
		data.put(player.getName().toLowerCase(), rankData);
		File file = new File(ExtraPerms.getInstance().getDataFolder() + "rankmanager.yml");
		Config config = new Config(file, Config.YAML);
		config.set("users", data);
		config.save();
	}
	
	
}
