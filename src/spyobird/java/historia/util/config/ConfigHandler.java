package spyobird.java.historia.util.config;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class ConfigHandler
{
	public static Configuration config;
	
	public static void load(File file)
	{
		if (config == null)
			config = new Configuration(file);
		config.load();
		
		
		
		if (config.hasChanged())
			config.save();
	}
}
