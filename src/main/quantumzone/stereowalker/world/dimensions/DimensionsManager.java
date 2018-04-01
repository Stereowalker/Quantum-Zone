package quantumzone.stereowalker.world.dimensions;

import net.minecraft.world.DimensionType;
import net.minecraftforge.common.DimensionManager;
import quantumzone.stereowalker.world.dimensions.worldproviders.WorldProviderQuantum;

public class DimensionsManager {
	public static void MainRegistry() {
		registerDimension();
	}
	
	public static final DimensionType QUANTUM = DimensionType.register("Quantum Zone", "_dm", 2, WorldProviderQuantum.class, false);
	
	public static void registerDimension() {
		DimensionManager.registerDimension(2, QUANTUM);
	}

}
