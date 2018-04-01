package quantumzone.stereowalker.event;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import quantumzone.stereowalker.entity.EntityQZombie;
import quantumzone.stereowalker.event.entity.QZombieEvent.SummonAidEvent;
//ZombieEvent
public class QuantumEventFactory {
	public static SummonAidEvent fireZombieSummonAid(EntityQZombie qzombie, World world, int x, int y, int z, EntityLivingBase attacker, double summonChance)
    {
        SummonAidEvent summonEvent = new SummonAidEvent(qzombie, world, x, y, z, attacker, summonChance);
        MinecraftForge.EVENT_BUS.post(summonEvent);
        return summonEvent;
    }

}
