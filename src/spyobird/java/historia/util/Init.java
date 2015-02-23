package spyobird.java.historia.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraft.util.RegistryNamespaced;
import spyobird.java.historia.block.BlockEdgedGlass;
import spyobird.java.historia.block.BlockTapioca;
import spyobird.java.historia.block.BlockTinOre;
import spyobird.java.historia.effect.ModEffect;
import spyobird.java.historia.item.ItemBananaMoney;
import spyobird.java.historia.item.ItemHistoriapedia;
import spyobird.java.historia.item.ItemStaffOfDivination;
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
		public static final Block tapioca = new BlockTapioca();
		
		public static void load()
		{
			registry.addObject(ConfigHandler.BlockConfig.TIN_ORE_ID, Data.BlockData.TIN_ORE_KEY, oreTin);
			registry.addObject(ConfigHandler.BlockConfig.EDGED_GLASS_ID, Data.BlockData.EDGED_GLASS_KEY, edgedGlass);
			registry.addObject(ConfigHandler.BlockConfig.TAPIOCA_ID ,Data.BlockData.TAPIOCA_KEY, tapioca);
			
			GameRegistry.registerBlock(oreTin, ItemBlockTinOre.class, Data.BlockData.TIN_ORE_KEY);
			GameRegistry.registerBlock(edgedGlass, ItemBlockEdgedGlass.class, Data.BlockData.EDGED_GLASS_KEY);
			GameRegistry.registerBlock(tapioca, Data.BlockData.TAPIOCA_KEY);
		}
	}
	
	public static class ItemInit
	{
		public static RegistryNamespaced registry = GameData.getItemRegistry();
		
		public static final Item historiapedia = new ItemHistoriapedia();
		public static final Item bananaMoney = new ItemBananaMoney();
		public static final Item staffofdivination = new ItemStaffOfDivination();
		
		public static void load()
		{
			registry.addObject(ConfigHandler.ItemConfig.HISTORIAPEDIA_ID, Data.ItemData.HISTORIAPEDIA_KEY, historiapedia);
			registry.addObject(ConfigHandler.ItemConfig.BANANA_MONEY_ID, Data.ItemData.BANANA_MONEY_KEY, bananaMoney);
			registry.addObject(ConfigHandler.ItemConfig.STAFF_OF_DIVINATION_ID, Data.ItemData.STAFF_OF_DIVINATION_KEY, staffofdivination);
			
			GameRegistry.registerItem(historiapedia, Data.ItemData.HISTORIAPEDIA_KEY);
			GameRegistry.registerItem(bananaMoney, Data.ItemData.BANANA_MONEY_KEY);
			GameRegistry.registerItem(staffofdivination, Data.ItemData.STAFF_OF_DIVINATION_KEY);
		}
	}
	
	public static class MiscInit
	{
		public static CreativeTabs tabs = new CreativeTabs("historiaSingapore")
		{
			@Override
			public Item getTabIconItem()
			{
				return Init.ItemInit.historiapedia;
			}
		};
		
		public static Potion filth;
		
		public static void load()
		{
			Potion[] potionTypes = null;
			for (Field f : Potion.class.getDeclaredFields())
			{
				f.setAccessible(true);
				try
				{
					if (f.getName().equals("potionTypes") || f.getName().equals("field_76425_a"))
					{
						Field modfield = Field.class.getDeclaredField("modifiers");
						modfield.setAccessible(true);
						modfield.setInt(f, f.getModifiers() & ~Modifier.FINAL);
						potionTypes = (Potion[]) f.get(null);
						final Potion[] modPotionTypes = new Potion[256];
						System.arraycopy(potionTypes, 0, modPotionTypes, 0, potionTypes.length);
						f.set(null, modPotionTypes);
					}
				}
				catch (Exception e)
				{
					ModLogger.log("Severe error, please report");
					ModLogger.log("Error with modded potions");
					System.err.println(e);
				}
			}
			
			filth = new ModEffect(33, true, 2445989, Data.MiscData.POTION_FILTH_KEY, 0, -10);
		}
	}
}
