package spyobird.java.historia.item;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import spyobird.java.historia.util.Data;
import spyobird.java.historia.util.Init;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;

public class ItemBananaMoney extends ItemHistoria
{
	public ItemBananaMoney()
	{
		super(Data.ItemData.BANANA_MONEY_TEXTURE);
		this.setUnlocalizedName(Data.ItemData.BANANA_MONEY_KEY);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemstack, EntityPlayer player, List list, boolean flag)
	{
		list.add(1, EnumChatFormatting.GOLD + "Just like the real thing.");
		if (player.inventory.hasItem(Init.ItemInit.historiapedia))
		{
			list.add(2, EnumChatFormatting.GOLD + "The banana that is.");
		}
		else
		{
			list.add(2, EnumChatFormatting.WHITE + "Get the <" + EnumChatFormatting.GOLD + "Historiapedia" + EnumChatFormatting.WHITE + "> for more info.");
		}
	}
}
