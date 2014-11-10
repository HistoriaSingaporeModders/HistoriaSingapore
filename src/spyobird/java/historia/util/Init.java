package spyobird.java.historia.util;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.RegistryNamespaced;
import spyobird.java.historia.block.BlockEdgedGlass;
import spyobird.java.historia.block.BlockTinOre;
import spyobird.java.historia.item.ItemBananaMoney;
import spyobird.java.historia.item.ItemHistoriapedia;
import spyobird.java.historia.item.itemblock.ItemBlockEdgedGlass;
import spyobird.java.historia.item.itemblock.ItemBlockTinOre;
import spyobird.java.historia.util.config.ConfigHandler;
import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;

public class Init
{
	public static class BlockInit
	{
		public static RegistryNamespaced registry = GameData.getBlockRegistry();
		
		public static final Block oreTin = new BlockTinOre();
		public static final Block edgedGlass = new BlockEdgedGlass();
		
		public static void load()
		{
			registry.addObject(ConfigHandler.BlockConfig.TIN_ORE_ID, Data.BlockData.TIN_ORE_KEY, oreTin);
			registry.addObject(ConfigHandler.BlockConfig.EDGED_GLASS_ID, Data.BlockData.EDGED_GLASS_KEY, edgedGlass);
			
			GameRegistry.registerBlock(oreTin, ItemBlockTinOre.class, Data.BlockData.TIN_ORE_KEY);
			GameRegistry.registerBlock(edgedGlass, ItemBlockEdgedGlass.class, Data.BlockData.EDGED_GLASS_KEY);
		}
	}
	
	public static class ItemInit
	{
		public static RegistryNamespaced registry = GameData.getItemRegistry();
		
		public static final Item historiapedia = new ItemHistoriapedia();
		public static final Item bananaMoney = new ItemBananaMoney();
		
		public static void load()
		{
			registry.addObject(ConfigHandler.ItemConfig.HISTORIAPEDIA_ID, Data.ItemData.HISTORIAPEDIA_KEY, historiapedia);
			registry.addObject(ConfigHandler.ItemConfig.BANANA_MONEY_ID, Data.ItemData.BANANA_MONEY_KEY, bananaMoney);
			
			GameRegistry.registerItem(historiapedia, Data.ItemData.HISTORIAPEDIA_KEY);
			GameRegistry.registerItem(bananaMoney, Data.ItemData.BANANA_MONEY_KEY);
		}
	}
	
	public static class MiscInit
	{
		public static CreativeTabs tabs = new CreativeTabs("historiaSingapore")
		{
			@Override
			public Item getTabIconItem()
			{
				return Item.getItemById(ConfigHandler.ItemConfig.HISTORIAPEDIA_ID);
			}
		};
		
		public static void load()
		{
			
		}
	}
}
