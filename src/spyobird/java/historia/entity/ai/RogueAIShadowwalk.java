package spyobird.java.historia.entity.ai;

import spyobird.java.historia.entity.EntityRogue;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAITarget;

public class RogueAIShadowwalk extends EntityAIBase
{
	private EntityRogue entity;
	private EntityLivingBase target;
	
	public RogueAIShadowwalk(EntityRogue entity)
	{
		this.entity = entity;
		this.setMutexBits(1);
	}
	
	@Override
	public boolean shouldExecute()
	{
		this.target = this.entity.getAttackTarget();
		
		if (entity.getAttackTarget() == null)
		{
			return false;
		}
		else
		{
			System.out.println("shouldExecute true");
			double d = this.entity.getDistanceSqToEntity(this.target);
            return d >= 36.0D && d <= 256.0D;
		}
	}
	
	@Override
	public void startExecuting()
	{
		System.out.println("startExecute");
		this.entity.setPosition(this.target.posX, this.target.posY, this.target.posZ);
	}
	
	@Override
	public boolean continueExecuting()
	{
		return false;
	}
}
