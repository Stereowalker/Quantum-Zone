package quantumzone.stereowalker.entity;

import com.google.common.base.Predicate;

import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.world.World;

public class EntityLion extends EntityOcelot{

	private EntityAITempt aiTempt;

	public EntityLion(World worldIn) {
		super(worldIn);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void initEntityAI() {
		super.initEntityAI();
		this.aiTempt = new EntityAITempt(this, 0.6D, Items.MUTTON, true);
		this.aiTempt = new EntityAITempt(this, 0.6D, Items.BEEF, true);
		this.aiTempt = new EntityAITempt(this, 0.6D, Items.PORKCHOP, true);
		this.tasks.addTask(5, new EntityAIAttackMelee(this, 1.0D, true));
		this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, EntityAnimal.class, true));
		this.targetTasks.addTask(10, new EntityAINearestAttackableTarget(this, EntityPlayer.class, true));
	}

}
