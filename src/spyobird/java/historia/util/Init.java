package spyobird.java.historia.util;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.RegistryNamespaced;
import spyobird.java.historia.block.BlockTinOre;
import cpw.mods.fml.common.registry.GameData;
import cpw.mods.fml.common.registry.GameRegistry;

public class Init
{
	public static class BlockInit
	{
		public static RegistryNamespaced registry = GameData.getBlockRegistry();
		
		public static final Block oreTin = new BlockTinOre();
		
		public static void load()
		{
			registry.addObject(700, Data.BlockData.TIN_ORE_KEY, oreTin);
			
			GameRegistry.registerBlock(oreTin, Data.BlockData.TIN_ORE_KEY);
		}
	}
	
	public static class ItemInit
	{
		public static void load()
		{
			
		}
	}
	
	public static class MiscInit
	{
		public static CreativeTabs tabs = new CreativeTabs("historiaSingapore")
		{
			@Override
			public Item getTabIconItem()
			{
				return Item.getItemById(256);
			}
		};
		
		public static void load()
		{
			
		}
	}
}
