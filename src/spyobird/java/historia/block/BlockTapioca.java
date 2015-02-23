package spyobird.java.historia.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPotato;
import net.minecraft.client.renderer.texture.IIconRegister;
import spyobird.java.historia.util.Data;
import spyobird.java.historia.util.Init;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockTapioca extends BlockPotato
{
	public BlockTapioca()
	{
		super();
		this.setBlockName(Data.BlockData.TAPIOCA_KEY);
	}
}
