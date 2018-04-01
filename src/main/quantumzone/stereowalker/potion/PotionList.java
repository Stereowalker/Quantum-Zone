package quantumzone.stereowalker.potion;

import net.minecraft.block.BlockBanner.BlockBannerStanding;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.MobEffects;
import net.minecraft.init.PotionTypes;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.PotionHelper;
import net.minecraft.potion.PotionType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import quantumzone.stereowalker.Registries;

public class PotionList {
	public static final PotionType FREEZE = new PotionType("freeze", new PotionEffect[] {new PotionEffect(Registries.FREEZE_POTION, 3600)/**/, new PotionEffect(MobEffects.JUMP_BOOST, 3600, -1)/**/}).setRegistryName("freeze");
	public static final PotionType LONG_FREEZE = new PotionType("freeze", new PotionEffect[] {new PotionEffect(Registries.FREEZE_POTION, 9600)/**/, new PotionEffect(MobEffects.JUMP_BOOST, 9600, -1)/**/}).setRegistryName("long_freeze");
	
	public static void registerPotionTypes() {
		ForgeRegistries.POTION_TYPES.register(FREEZE);
		ForgeRegistries.POTION_TYPES.register(LONG_FREEZE);
		PotionHelper.addMix(PotionTypes.AWKWARD, Item.getItemFromBlock(Blocks.PACKED_ICE), FREEZE);
		PotionHelper.addMix(FREEZE, Items.REDSTONE, LONG_FREEZE);
	}


}
