package spyobird.java.historia.item.itemblock;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import spyobird.java.historia.block.BlockEdgedGlass;
import spyobird.java.historia.util.Init;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemBlockEdgedGlass extends ItemBlock
{
	public ItemBlockEdgedGlass(Block block)
	{
		super(block);
	}

	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean flag)
	{
		list.add(1, EnumChatFormatting.GREEN + "Decorative Block.");
		if (player.inventory.hasItem(Init.ItemInit.historiapedia))
		{
			list.add(2, EnumChatFormatting.GREEN + "For decorative uses.");
		}
		else
		{
			list.add(2, EnumChatFormatting.WHITE + "Get the <" + EnumChatFormatting.GOLD + "Historiapedia" + EnumChatFormatting.WHITE + "> for more info.");
		}
	}
}
