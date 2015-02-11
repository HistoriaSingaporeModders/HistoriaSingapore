package spyobird.java.historia.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import spyobird.java.historia.entity.ai.RogueAIShadowwalk;

public class EntityRogue extends EntityMob
{
	private int stepCounter = 0;
	private boolean canStep = false;
	
	public EntityRogue(World world)
	{
		super(world);
		this.AITasks();
	}

	protected void AITasks()
	{
		this.tasks.taskEntries.clear();
		this.targetTasks.taskEntries.clear();
		
		this.tasks.addTask(0, new EntityAISwimming(this));
		this.tasks.addTask(1, new RogueAIShadowwalk(this));
		this.tasks.addTask(4, new EntityAIAttackOnCollide(this, 1.0D, false));
		this.tasks.addTask(5, new EntityAIWander(this, 0.8D));
	    this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
	    this.tasks.addTask(6, new EntityAILookIdle(this));
	    this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	    this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, false));
	}
	
	@Override
	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		
		this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(16.0D);
		this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.32D);
		this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.8D);
		this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(8.0D);

		this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(3.0D);
	}
	
	@Override
	protected boolean isAIEnabled()
	{
		return true;
	}
}
