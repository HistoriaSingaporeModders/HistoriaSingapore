package spyobird.java.historia.util.oredict;

import net.minecraftforge.oredict.OreDictionary;
import spyobird.java.historia.util.Init;

public class ModOreDict
{
	@SuppressWarnings("unchecked")
	public static void load()
	{
		OreDictionary.registerOre("oreTin", Init.BlockInit.oreTin);
		
		OreDictionary.registerOre("blockGlass", Init.BlockInit.edgedGlass);
		OreDictionary.registerOre("blockGlassColorless", Init.BlockInit.edgedGlass);
	}
}
