package quantumzone.stereowalker.world.types;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.layer.GenLayer;
import quantumzone.stereowalker.init.Bio;
import quantumzone.stereowalker.world.types.layer.GenLayerCustom;

public class WorldTypeQuantum extends WorldType{

	public WorldTypeQuantum() {
		super("Quantum");
	}
	
	@Override
	public BiomeProvider getBiomeProvider(World world) {
		return new BiomeProviderSingle(Bio.QUANTUMFOREST);
	}
}
