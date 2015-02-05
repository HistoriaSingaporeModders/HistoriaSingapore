package spyobird.java.historia.item;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import spyobird.java.historia.util.Data;
import spyobird.java.historia.util.Init;

public class ItemHistoriapedia extends ItemHistoria
{
	public ItemHistoriapedia()
	{
		super(Data.ItemData.HISTORIAPEDIA_TEXTURE);
		this.setUnlocalizedName(Data.ItemData.HISTORIAPEDIA_KEY);
		this.setMaxStackSize(1);
	}
	
	@Override
	//testing still, as in prob going to create an arry to store all the info and add the ids with debug screen
	public boolean onItemUse(ItemStack stack, EntityPlayer player, World world, int x, int y, int z, int side, float hitX, float hitY, float hitZ)
    {
		if (!world.isRemote)
		{
			Block block = world.getBlock(x, y, z);
			String infoText = EnumChatFormatting.WHITE + "Block " + EnumChatFormatting.BLUE + block.getLocalizedName() + EnumChatFormatting.RED + "[" + block.getIdFromBlock(block) + "]" + EnumChatFormatting.WHITE + ": ";
			if (block == Init.BlockInit.oreTin)
			{
				player.addChatMessage(new ChatComponentText(infoText + EnumChatFormatting.YELLOW + "Creates stuff."));
			}
		}
        return true;
    }
}