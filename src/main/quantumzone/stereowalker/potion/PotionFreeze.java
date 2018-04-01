package quantumzone.stereowalker.potion;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.Potion;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.MathHelper;
import quantumzone.stereowalker.Registries;
import quantumzone.stereowalker.util.Reference;

public class PotionFreeze extends Potion{

		public PotionFreeze() {
		super(true, 225);
		setPotionName("effect.freeze");
		setIconIndex(9, 0);
		setRegistryName(new ResourceLocation(Reference.MODID + ":" + "freeze"));
		registerPotionAttributeModifier(SharedMonsterAttributes.MOVEMENT_SPEED, "7107DE5E-7CE8-4030-940E-514C1F160891", -50.D, 2);
		registerPotionAttributeModifier(SharedMonsterAttributes.FLYING_SPEED, "7107DE5E-7CE8-4030-940E-514C1F16082", -50.D, 2);
		//box.jumpMovementFactor = 0;
		//box.setFire(50);
	}

		
	
	
}
