package spyobird.java.historia.block;

import spyobird.java.historia.util.Data;
import net.minecraft.block.material.Material;

public class BlockTinOre extends BlockHistoria
{
	public BlockTinOre()
	{
		super(Material.rock, Data.BlockData.TIN_ORE_TEXTURE);
		this.setHardness(3.0F);
	    this.setResistance(5.0F);
	    this.setBlockName(Data.BlockData.TIN_ORE_KEY);
	}

}
