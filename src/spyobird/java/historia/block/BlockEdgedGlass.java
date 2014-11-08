package spyobird.java.historia.block;

import spyobird.java.historia.util.Data;
import net.minecraft.block.material.Material;

public class BlockEdgedGlass extends BlockConnnectedBlock
{
	public BlockEdgedGlass()
	{
		super(Material.glass, Data.BlockData.EDGED_GLASS_TEXTURE);
		this.setBlockName(Data.BlockData.EDGED_GLASS_KEY);
	}
	
	@Override
	public boolean isOpaqueCube()
	{
		return false;
	}
}
