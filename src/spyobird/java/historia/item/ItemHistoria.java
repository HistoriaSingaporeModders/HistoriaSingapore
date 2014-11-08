package spyobird.java.historia.item;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import spyobird.java.historia.HistoriaSingapore;
import spyobird.java.historia.util.Data;
import spyobird.java.historia.util.Init;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

public class ItemHistoria extends Item
{
	public String textureName;
	
	protected ItemHistoria(String textureName)
	{
		super();
		this.textureName = textureName;
		this.setCreativeTab(Init.MiscInit.tabs);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister register)
	{
        itemIcon = register.registerIcon(Data.ModData.TEXTURE_LOCATION + ":" + textureName);
	}
}
