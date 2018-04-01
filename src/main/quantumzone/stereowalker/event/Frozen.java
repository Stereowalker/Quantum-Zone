package quantumzone.stereowalker.event;

import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import quantumzone.stereowalker.Registries;

public class Frozen {
	
	@SubscribeEvent
	public void onFrozen(TickEvent.PlayerTickEvent event) {
		if (event.player.isPotionActive(Registries.FREEZE_POTION))
			event.player.motionY = -500F/*(double)((float)(((EntityLivingBase) entity).getActivePotionEffect(Registries.FREEZE_POTION).getAmplifier() + 1) * 50F)*/;
			event.player.moveVertical = 0F;
			event.player.jumpMovementFactor = 0F;
	}

	

}
