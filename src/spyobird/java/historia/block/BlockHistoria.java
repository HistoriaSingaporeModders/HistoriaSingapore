package spyobird.java.historia.block;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import spyobird.java.historia.HistoriaSingapore;
import spyobird.java.historia.util.Data;
import spyobird.java.historia.util.Init;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockHistoria extends Block
{
	public String textureName;
	
	protected BlockHistoria(Material material, String textureName)
	{
		super(material);
		this.textureName = textureName;
		this.setCreativeTab(Init.MiscInit.tabs);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register)
	{
        blockIcon = register.registerIcon(Data.ModData.TEXTURE_LOCATION + ":" + textureName);
	}
}
