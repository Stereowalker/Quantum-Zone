package quantumzone.stereowalker.entity.ai;

import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.monster.EntityGolem;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.entity.passive.EntityVillager;
import quantumzone.stereowalker.entity.EntityCustomGolem;
import quantumzone.stereowalker.entity.EntityPlatinumGolem;

public class EntityAILookAtVillager extends EntityAIBase
{
    private final EntityCustomGolem Golem;
    private EntityVillager villager;
    private int lookTime;

    public EntityAILookAtVillager(EntityCustomGolem platinumGolemIn)
    {
        this.Golem = platinumGolemIn;
        this.setMutexBits(3);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (!this.Golem.world.isDaytime())
        {
            return false;
        }
        else if (this.Golem.getRNG().nextInt(8000) != 0)
        {
            return false;
        }
        else
        {
            this.villager = (EntityVillager)this.Golem.world.findNearestEntityWithinAABB(EntityVillager.class, this.Golem.getEntityBoundingBox().grow(6.0D, 2.0D, 6.0D), this.Golem);
            return this.villager != null;
        }
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean shouldContinueExecuting()
    {
        return this.lookTime > 0;
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.lookTime = 400;
        this.Golem.setHoldingRose(true);
    }

    /**
     * Reset the task's internal state. Called when this task is interrupted by another one
     */
    public void resetTask()
    {
        this.Golem.setHoldingRose(false);
        this.villager = null;
    }

    /**
     * Keep ticking a continuous task that has already been started
     */
    public void updateTask()
    {
        this.Golem.getLookHelper().setLookPositionWithEntity(this.villager, 30.0F, 30.0F);
        --this.lookTime;
    }
}