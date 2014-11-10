package spyobird.java.historia.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.util.ForgeDirection;
import spyobird.java.historia.util.Data;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockConnnectedBlock extends BlockHistoria
{
	private IIcon[] icons = new IIcon[16];
	private IIcon blankIcon;
	
	protected BlockConnnectedBlock(Material material, String textureName)
	{
		super(material, textureName);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister register)
	{
        this.blankIcon = register.registerIcon(Data.ModData.TEXTURE_LOCATION + ":" + Data.MiscData.BLANK_ICON_TEXTURE);
        
        for (int i = 0; i < 16; i++)
        {
        	this.icons[i] = register.registerIcon(Data.ModData.TEXTURE_LOCATION + ":" + this.textureName + i);
        }
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(int side, int meta)
	{
		return icons[0];
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public IIcon getIcon(IBlockAccess blockaccess, int x, int y, int z, int side)
    {	
		Block block = blockaccess.getBlock(x, y, z);
		
		ForgeDirection off = ForgeDirection.getOrientation(side);
		if(blockaccess.getBlock(x + off.offsetX, y + off.offsetY, z + off.offsetZ) == block)
				return blankIcon;
		
		int index = 0;
		
		ForgeDirection[] dir = Data.MiscData.dirOnOtherAxes(ForgeDirection.getOrientation(side));
		
		for (int i = 0; i < dir.length; i++)
		{
			if(blockaccess.getBlock(x + dir[i].offsetX, y + dir[i].offsetY, z + dir[i].offsetZ) == block)
			{
				index |= 1 << i;
			}
		}
        return icons[index];
    }
}
