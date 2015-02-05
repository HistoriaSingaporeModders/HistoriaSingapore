package spyobird.java.historia.util.oredict;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class ModOreDictRecipes
{
	public static void load()
	{
		GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack(Blocks.glass_pane, 16), new Object[] {
				"XXX",
				"XXX",
				'X', "blockGlassColorless" }));
	}
}
