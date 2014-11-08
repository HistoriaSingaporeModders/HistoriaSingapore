package spyobird.java.historia.item;

import spyobird.java.historia.util.Data;
import net.minecraft.item.Item;

public class ItemHistoriapedia extends ItemHistoria
{
	public ItemHistoriapedia()
	{
		super(Data.ItemData.HISTORIAPEDIA_TEXTURE);
		this.setUnlocalizedName(Data.ItemData.HISTORIAPEDIA_KEY);
		this.setMaxStackSize(1);
	}
}
