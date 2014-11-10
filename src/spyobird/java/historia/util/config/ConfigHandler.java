package spyobird.java.historia.util.config;

import java.io.File;

import spyobird.java.historia.util.Data;
import net.minecraft.block.BlockLog;
import net.minecraftforge.common.config.Configuration;

public class ConfigHandler
{
	public static Configuration config;
	
	public static void load(File file)
	{
		if (config == null)
			config = new Configuration(file);
		config.load();
		
		BlockConfig.blockLoad(config);
		ItemConfig.itemLoad(config);
		
		if (config.hasChanged())
			config.save();
	}
	
	public static class BlockConfig
	{
		public static final String CATAGORY_BLOCK = "Block";

		public static int TIN_ORE_ID;
		public static final int TIN_ORE_ID_DEFAULT = 700;
		
		public static int EDGED_GLASS_ID;
		public static final int EDGED_GLASS_ID_DEFAULT = 701;
		
		public static void blockLoad(Configuration config)
		{
			TIN_ORE_ID = config.get(CATAGORY_BLOCK, Data.BlockData.TIN_ORE_KEY, TIN_ORE_ID_DEFAULT).getInt();
			EDGED_GLASS_ID = config.get(CATAGORY_BLOCK, Data.BlockData.EDGED_GLASS_KEY, EDGED_GLASS_ID_DEFAULT).getInt();
		}
	}
	
	public static class ItemConfig
	{
		public static final String CATAGORY_ITEM = "Item";
		
		public static int HISTORIAPEDIA_ID;
		public static final int HISTORIAPEDIA_ID_DEFAULT = 5999;
		
		public static int BANANA_MONEY_ID;
		public static final int BANANA_MONEY_ID_DEFAULT = 6000;
		
		public static void itemLoad(Configuration config)
		{
			HISTORIAPEDIA_ID = config.get(CATAGORY_ITEM, Data.ItemData.HISTORIAPEDIA_KEY, HISTORIAPEDIA_ID_DEFAULT).getInt();
			BANANA_MONEY_ID = config.get(CATAGORY_ITEM, Data.ItemData.BANANA_MONEY_KEY, BANANA_MONEY_ID_DEFAULT).getInt();
		}
	}
	
	public static class MiscConfig
	{
		
	}
}
