package spyobird.java.historia.item;

import spyobird.java.historia.lib.EnumRace;
import spyobird.java.historia.util.Data;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;

public class ItemStaffOfDivination extends ItemHistoria
{
	public ItemStaffOfDivination()
	{
		super(Data.ItemData.STAFF_OF_DIVINATION_KEY);
		this.setUnlocalizedName(Data.ItemData.STAFF_OF_DIVINATION_KEY);
	}
	
	@Override
	public ItemStack onItemRightClick(ItemStack stack, World world, EntityPlayer player)
    {
		if (Data.MiscData.raceMap.get(player.getUniqueID()) != EnumRace.MODERATOR)
		{
			Data.MiscData.raceMap.put(player.getUniqueID(), EnumRace.MODERATOR);
			player.addChatMessage(new ChatComponentText(EnumChatFormatting.LIGHT_PURPLE + "You are a moderator."));
		}
        return stack;
    }
}
