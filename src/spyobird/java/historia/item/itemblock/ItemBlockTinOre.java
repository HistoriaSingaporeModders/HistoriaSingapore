package spyobird.java.historia.item.itemblock;

import java.util.List;

import spyobird.java.historia.util.Init;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemBlockTinOre extends ItemBlock
{
	public ItemBlockTinOre(Block block)
	{
		super(block);
	}

	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean flag)
	{
		list.add(1, EnumChatFormatting.YELLOW + "Raw Material.");
		if (player.inventory.hasItem(Init.ItemInit.historiapedia))
		{
			list.add(2, EnumChatFormatting.YELLOW + "Creates stuff.");
		}
		else
		{
			list.add(2, EnumChatFormatting.WHITE + "Get the <" + EnumChatFormatting.GOLD + "Historiapedia" + EnumChatFormatting.WHITE + "> for more info.");
		}
	}
}
