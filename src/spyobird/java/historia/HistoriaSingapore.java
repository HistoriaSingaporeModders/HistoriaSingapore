package spyobird.java.historia;

import java.io.File;

import spyobird.java.historia.util.Data;
import spyobird.java.historia.util.Init;
import spyobird.java.historia.util.config.ConfigHandler;
import spyobird.java.historia.util.oredict.ModOreDict;
import spyobird.java.historia.util.oredict.ModOreDictRecipes;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Data.ModData.ID, name = Data.ModData.NAME, version = Data.ModData.VERSION)
public class HistoriaSingapore
{
	@Instance(Data.ModData.ID)
	public static HistoriaSingapore instance;
	
	@SidedProxy(clientSide = Data.ModData.CLIENT_PROXY_LOCATION, serverSide = Data.ModData.COMMON_PROXY_LOCATION)
	public static CommonProxy proxy;
	
	public static ConfigHandler config;

	@EventHandler
	public void preLoad(FMLPreInitializationEvent event)
	{
		config.load(new File(event.getModConfigurationDirectory() + "/Historia.cfg"));
		Init.BlockInit.load();
		Init.ItemInit.load();
		Init.MiscInit.load();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public static void postLoad(FMLPostInitializationEvent event)
	{
		ModOreDict.load();
		ModOreDictRecipes.load();
	}
}
