package spyobird.java.historia.lib;

import java.util.HashMap;
import java.util.UUID;

import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;

public enum EnumRace
{
	CHINESE("Chinese", EnumChatFormatting.YELLOW ),
	MALAY("Malay", EnumChatFormatting.GOLD),
	INDIAN("Indian", EnumChatFormatting.DARK_RED),
	EUROPEAN("European", EnumChatFormatting.WHITE),
	MODERATOR("Mods", EnumChatFormatting.LIGHT_PURPLE),
	FORGEDEVNAME("ForgeDevName", EnumChatFormatting.RED),
	DEVELOPERS("Devs", EnumChatFormatting.BLUE);
	
	private String name;
	private EnumChatFormatting prefix;
	
	public static HashMap<UUID, EnumRace> raceMap = new HashMap();
	
	private EnumRace(String name, EnumChatFormatting prefix)
	{
		this.name = name;
		this.prefix = prefix;
	}
	
	public EnumChatFormatting getChatPrefix()
	{
		return this.prefix;
	}
}
