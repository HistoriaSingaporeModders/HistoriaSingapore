package spyobird.java.historia;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import spyobird.java.historia.util.Data;
import spyobird.java.historia.util.ModData;
import spyobird.java.historia.util.config.ConfigHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = Data.ModData.ID, name = Data.ModData.NAME, version = Data.ModData.VERSION)
public class HistoriaSingapore
{
	@Instance(Data.ModData.ID)
	public static HistoriaSingapore instance;
	
	@SidedProxy(clientSide = Data.ModData.CLIENT_PROXY_LOCATION, serverSide = Data.ModData.COMMON_PROXY_LOCATION)
	public static CommonProxy proxy;

	public static CreativeTabs tabs = new CreativeTabs("historiaSingapore")
	{
		@Override
		public Item getTabIconItem()
		{
			return Item.getItemById(256);
		}
	};	
	
	public static ConfigHandler config;

	@EventHandler
	public void preLoad(FMLPreInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void postLoad(FMLPostInitializationEvent event)
	{
		LanguageRegistry.instance().addStringLocalization("itemGroup.historiaSingapore", "en_US", "Historia Singapore");
	}
}
