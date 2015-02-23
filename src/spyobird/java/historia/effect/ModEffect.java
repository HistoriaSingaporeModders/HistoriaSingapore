package spyobird.java.historia.effect;

import net.minecraft.client.Minecraft;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import spyobird.java.historia.util.Data;
import spyobird.java.historia.util.Data.ModData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ModEffect extends Potion
{
	public ModEffect(int id, boolean bad, int colourMult, String name, int indexX, int indexY)
	{
		super(id, bad, colourMult);
		this.setPotionName(Data.ModData.ID + "." + name);
		this.setIconIndex(indexX, indexY);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public boolean hasStatusIcon()
	{
		Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation(Data.ModData.TEXTURE_LOCATION, "textures/gui/Icons.png"));
		return true;
	}
}
