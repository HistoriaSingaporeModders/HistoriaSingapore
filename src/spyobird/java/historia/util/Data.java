package spyobird.java.historia.util;

import net.minecraftforge.common.util.ForgeDirection;

public class Data
{
	public static class ModData
	{
		//info
		public static final String ID = "historia";
		public static final String NAME = "Historia Singapore";
		public static final String VERSION = "v0.0.1-beta";
		
		//paths
		public static final String TEXTURE_LOCATION = ID;
		public static final String COMMON_PROXY_LOCATION = "spyobird.java.historia.CommonProxy";
		public static final String CLIENT_PROXY_LOCATION = "spyobird.java.historia.ClientProxy";
		
		//config
		public static final int ITEM_CONFIG_ID_RANGE_OFFSET = 256;
	}	
	public static class BlockData
	{
		public static final String TIN_ORE_KEY = "TinOre";
		public static final String TIN_ORE_LOCAL = "Tin Ore";
		public static final String TIN_ORE_TEXTURE = "icontinore";
		
		public static final String EDGED_GLASS_KEY = "EdgedGlass";
		public static final String EDGED_GLASS_LOCAL = "Edged Glass";
		public static final String EDGED_GLASS_TEXTURE = "iconedgedglass";
	}
	
	public static class ItemData
	{
		public static final String HISTORIAPEDIA_KEY = "Historiapedia";
		public static final String HISTORIAPEDIA_LOCAL = "Historiapedia";
		public static final String HISTORIAPEDIA_TEXTURE = "iconhistoriapedia";
		
		public static final String BANANA_MONEY_KEY = "BananaMoney";
		public static final String BANANA_MONEY_LOCAL = "Banana Money";
		public static final String BANANA_MONEY_TEXTURE = "iconbananamoney";
	}
	
	public static class MiscData
	{
		public static final String BLANK_ICON_TEXTURE = "iconblankicon";
		
		public static final ForgeDirection DOWN = ForgeDirection.DOWN;
		public static final ForgeDirection UP = ForgeDirection.UP;
		public static final ForgeDirection NORTH = ForgeDirection.NORTH;
		public static final ForgeDirection SOUTH = ForgeDirection.SOUTH;
		public static final ForgeDirection WEST = ForgeDirection.WEST;
		public static final ForgeDirection EAST = ForgeDirection.EAST;
		
		public static ForgeDirection[] dirOnOtherAxes(ForgeDirection dir)
		{
			switch (dir)
			{
				case DOWN:
					return new ForgeDirection[] {NORTH, SOUTH, WEST, EAST};
				case UP:
					return new ForgeDirection[] {NORTH, SOUTH, WEST, EAST};
				case NORTH:
					return new ForgeDirection[] {UP, DOWN, EAST, WEST};
				case SOUTH:
					return new ForgeDirection[] {UP, DOWN, WEST, EAST};
				case WEST:
					return new ForgeDirection[] {UP, DOWN, NORTH, SOUTH};
				case EAST:
					return new ForgeDirection[] {UP, DOWN, SOUTH, NORTH};
				default:
					return null;
			}
		}
		
		public static ForgeDirection[] dirOnSameAxes(ForgeDirection dir)
		{
			switch (dir)
			{
				case DOWN:
					return new ForgeDirection[] {DOWN, UP};
				case UP:
					return new ForgeDirection[] {DOWN, UP};
				case NORTH:
					return new ForgeDirection[] {NORTH, SOUTH};
				case SOUTH:
					return new ForgeDirection[] {NORTH, SOUTH};
				case WEST:
					return new ForgeDirection[] {WEST, EAST};
				case EAST:
					return new ForgeDirection[] {WEST, EAST};
				default:
					return null;
			}
		}
	}
}
