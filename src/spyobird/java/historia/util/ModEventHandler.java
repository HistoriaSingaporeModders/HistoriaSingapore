package spyobird.java.historia.util;

import spyobird.java.historia.lib.EnumRace;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.EnumChatFormatting;
import net.minecraftforge.event.ServerChatEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;

public class ModEventHandler
{
	@SubscribeEvent
	public void onUpdate(LivingUpdateEvent event)
	{
		if (event.entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) event.entity;
			if (player.getDisplayName() == "ForgeDevName")
			{
				Data.MiscData.raceMap.put(player.getUniqueID(), EnumRace.FORGEDEVNAME);
			}
			else
			{
				if (!Data.MiscData.raceMap.containsKey(player.getUniqueID()))
				{
					player.addChatMessage(new ChatComponentText("Choose a race."));
					Data.MiscData.raceMap.put(player.getUniqueID(), EnumRace.CHINESE);
				}
			}
		}
	}
	
	@SubscribeEvent
	public void onPlayerChat(ServerChatEvent event)
	{
		EntityPlayer player = event.player;
		if (!Data.MiscData.raceMap.containsKey(player.getUniqueID()))
		{
			player.addChatMessage(new ChatComponentText("Choose a race."));
		}
		else
		{
			MinecraftServer.getServer().getConfigurationManager().sendChatMsg(new ChatComponentText(Data.MiscData.raceMap.get(player.getUniqueID()).getChatPrefix() + "<" + event.username + "> " + event.message));
		}
		event.setCanceled(true);
	}
}