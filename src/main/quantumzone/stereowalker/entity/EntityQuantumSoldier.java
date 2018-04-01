package quantumzone.stereowalker.entity;

import javax.annotation.Nullable;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntityEvoker;
import net.minecraft.entity.monster.EntityIllusionIllager;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import quantumzone.stereowalker.init.Itm;
import quantumzone.stereowalker.util.LootTable;

public class EntityQuantumSoldier extends EntityEvoker{
	

	
	public EntityQuantumSoldier(World worldIn) {
		super(worldIn);
		this.setSize(1F, 2F);
	}
	//net.minecraft.client.renderer.entity.EntityCow
	protected void initEntityAI() {
		this.tasks.addTask(9, new EntityAISwimming(this));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntitySpider.class, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
		this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityCreeper.class, true));
		this.targetTasks.addTask(4, new EntityAINearestAttackableTarget(this, EntityEnderman.class, true));
		this.targetTasks.addTask(5, new EntityAINearestAttackableTarget(this, EntityZombie.class, true));
		this.targetTasks.addTask(6, new EntityAINearestAttackableTarget(this, EntitySkeleton.class, true));
		this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, EntitySlime.class, true));
		this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, false));
		this.tasks.addTask(2, new EntityAIWander(this, 0.9D));
		this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
		//this.tasks.addTask(7, new EntityAITempt(this, 1.25D, ItemInit.CORE_Q, false));
		
	}
	
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		//this.getEntityAttribute(SPAWN_REINFORCEMENTS_CHANCE).setBaseValue(2.0D) EntityGuardian;
		this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(50.0D);
		this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(1.0D);
		this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(10.0D);
		this.getEntityAttribute(SharedMonsterAttributes.FOLLOW_RANGE).setBaseValue(10.0D);
		
	}
	
	@Override
	public float getEyeHeight() {
		return 1.8F;
	}
	
	@Nullable
    protected ResourceLocation getLootTable()
    {
        return LootTable.SOLDIER;
    }
	
	@Override
	public void onKillEntity(EntityLivingBase entityLivingIn) {
		// TODO Auto-generated method stub
		super.onKillEntity(entityLivingIn);
		if (entityLivingIn instanceof EntityZombie)
        {

            EntityZombie entityzombie = (EntityZombie)entityLivingIn;
            EntityQZombie entityqzombie = new EntityQZombie(this.world);
            entityqzombie.copyLocationAndAnglesFrom(entityzombie);
            this.world.removeEntity(entityzombie);
            entityqzombie.setNoAI(entityzombie.isAIDisabled());

            if (entityzombie.hasCustomName())
            {
                entityqzombie.setCustomNameTag(entityzombie.getCustomNameTag());
                entityqzombie.setAlwaysRenderNameTag(entityzombie.getAlwaysRenderNameTag());
            }

            this.world.spawnEntity(entityqzombie);
            this.world.playEvent((EntityPlayer)null, 1026, new BlockPos(this), 0);
        }
		
		else if (entityLivingIn instanceof EntitySkeleton)
        {

            EntitySkeleton entityskeleton = (EntitySkeleton)entityLivingIn;
            EntityQSkeleton entityqskeleton = new EntityQSkeleton(this.world);
            entityqskeleton.copyLocationAndAnglesFrom(entityskeleton);
            this.world.removeEntity(entityskeleton);
            entityqskeleton.setHeldItem(entityskeleton.getActiveHand(), entityskeleton.getHeldItemMainhand());
            entityqskeleton.setNoAI(entityskeleton.isAIDisabled());

            if (entityskeleton.hasCustomName())
            {
            	entityqskeleton.setCustomNameTag(entityskeleton.getCustomNameTag());
            	entityqskeleton.setAlwaysRenderNameTag(entityskeleton.getAlwaysRenderNameTag());
            }

            this.world.spawnEntity(entityqskeleton);
            this.world.playEvent((EntityPlayer)null, 1026, new BlockPos(this), 0);
        }
		
		else if (entityLivingIn instanceof EntitySpider)
        {

            EntitySpider entityspider = (EntitySpider)entityLivingIn;
            EntityQSpider entityqspider = new EntityQSpider(this.world);
            entityqspider.copyLocationAndAnglesFrom(entityspider);
            this.world.removeEntity(entityspider);
            entityqspider.setNoAI(entityspider.isAIDisabled());

            if (entityspider.hasCustomName())
            {
                entityqspider.setCustomNameTag(entityspider.getCustomNameTag());
                entityqspider.setAlwaysRenderNameTag(entityspider.getAlwaysRenderNameTag());
            }

            this.world.spawnEntity(entityqspider);
            this.world.playEvent((EntityPlayer)null, 1026, new BlockPos(this), 0);
        }
		
		else if (entityLivingIn instanceof EntityEnderman)
        {

            EntityEnderman entityenderman = (EntityEnderman)entityLivingIn;
            EntityQEnderman entityqenderman = new EntityQEnderman(this.world);
            entityqenderman.copyLocationAndAnglesFrom(entityenderman);
            this.world.removeEntity(entityenderman);
            entityqenderman.setNoAI(entityenderman.isAIDisabled());

            if (entityenderman.hasCustomName())
            {
                entityqenderman.setCustomNameTag(entityenderman.getCustomNameTag());
                entityqenderman.setAlwaysRenderNameTag(entityenderman.getAlwaysRenderNameTag());
            }

            this.world.spawnEntity(entityqenderman);
            this.world.playEvent((EntityPlayer)null, 1026, new BlockPos(this), 0);
        }
		
		else if (entityLivingIn instanceof EntityCreeper)
        {

			EntityCreeper entitycreeper = (EntityCreeper)entityLivingIn;
			EntityQCreeper entityqcreeper = new EntityQCreeper(this.world);
			entityqcreeper.copyLocationAndAnglesFrom(entitycreeper);
            this.world.removeEntity(entitycreeper);
            entityqcreeper.setNoAI(entitycreeper.isAIDisabled());

            if (entitycreeper.hasCustomName())
            {
            	entityqcreeper.setCustomNameTag(entitycreeper.getCustomNameTag());
            	entityqcreeper.setAlwaysRenderNameTag(entitycreeper.getAlwaysRenderNameTag());
            }

            this.world.spawnEntity(entityqcreeper);
            this.world.playEvent((EntityPlayer)null, 1026, new BlockPos(this), 0);
        }
	}
	



}
