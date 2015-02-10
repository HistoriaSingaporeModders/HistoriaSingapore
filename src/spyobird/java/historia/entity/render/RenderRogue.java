package spyobird.java.historia.entity.render;

import spyobird.java.historia.util.Data;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderRogue extends RenderLiving
{
	private final ResourceLocation texture = new ResourceLocation(Data.ModData.ENTITY_TEXTURE_LOCATION + "mobs/iconrogue.png");
	
	public RenderRogue(ModelBase model, float shadow)
	{
		super(model, shadow);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity entity)
	{
		return this.texture;
	}

}
