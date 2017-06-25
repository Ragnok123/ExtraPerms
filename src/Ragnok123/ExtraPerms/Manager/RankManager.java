package Ragnok123.ExtraPerms.Manager;

import Ragnok123.ExtraPerms.ExtraPerms;

import cn.nukkit.Server;
import cn.nukkit.utils.*;

import java.util.*;
import java.io.*;

public class RankManager
{

	public ExtraPerms extraperms;
	
	public HashMap<String, Boolean> perms = new HashMap<String, Boolean>();

	public RankManager(ExtraPerms extraperms)
	{
		this.extraperms = extraperms;
	}
	
	public String getRank(String rankname)
	{
		File file = new File(ExtraPerms.getInstance().getDataFolder() + "rankmanager.yml");
		Config config = new Config(file, Config.YAML);
		return String.valueOf(config.get("ranks"));
	}
	
	public void addRank(String rankname)
	{
		File file = new File(ExtraPerms.getInstance().getDataFolder() + "rankmanager.yml");
		Config config = new Config(file, Config.YAML);
		HashMap<String, HashMap<String, String[]>> data = new HashMap<String, HashMap<String, String[]>>();
		HashMap<String, String[]> permsData = new HashMap<String, String[]>();
		permsData.put("permissions", new String[]{"extraperms.command.info"});
		data.put(rankname, permsData);
		config.set("ranks", data);
		config.save();
	}
	
	public void addPermission(String rankname, String permission)
	{
		File file = new File(ExtraPerms.getInstance().getDataFolder() + "rankmanager.yml");
		Config config = new Config(file, Config.YAML);
		HashMap<String, HashMap<String, String[]>> data = new HashMap<String, HashMap<String, String[]>>();
		HashMap<String, String[]> permsData = new HashMap<String, String[]>();
		permsData.put("permissions", new String[]{permission});
		data.put(rankname, permsData);
		config.set("ranks", data);
		config.save();
	}
	
	public HashMap<String, String[]> getPermissions(String rankname)
	{
		File file = new File(ExtraPerms.getInstance().getDataFolder() + "rankmanager.yml");
		Config config = new Config(file, Config.YAML);
		HashMap<String, HashMap<String, String[]>> data = (HashMap<String, HashMap<String, String[]>>) config.get("rank");
		return data.get("permissions");
	}
	
	
}
