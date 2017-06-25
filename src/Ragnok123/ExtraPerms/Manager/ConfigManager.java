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
		HashMap<String, HashMap<String, String>> data = new HashMap<String, HashMap<String, String>>();
		HashMap<String, String> seconddata = new HashMap<String, String>();
		seconddata.put("rank", "user");
		data.put(username, seconddata);
		File file = new File(ExtraPerms.getInstance().getDataFolder() + "rankmanager.yml");
		Config config = new Config(file, Config.YAML);
		config.set("users", data);
		config.save();
	}
	
	
}
