package spyobird.java.historia;

import net.minecraft.client.model.ModelBiped;
import spyobird.java.historia.entity.EntityRogue;
import spyobird.java.historia.entity.render.RenderRogue;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.EntityRegistry;

public class ClientProxy extends CommonProxy
{
	@Override
	public void registerRendering()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityRogue.class, new RenderRogue(new ModelBiped(), 0.5F));
	}
	
	@Override
	public void registerEntities()
	{
		EntityRegistry.registerModEntity(EntityRogue.class, "Rogue", 64, HistoriaSingapore.instance, 80, 3, false);
	}
}
