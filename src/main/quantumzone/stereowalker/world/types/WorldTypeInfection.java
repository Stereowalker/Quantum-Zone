package quantumzone.stereowalker.world.types;

import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.biome.BiomeProvider;
import net.minecraft.world.biome.BiomeProviderSingle;
import net.minecraft.world.gen.ChunkGeneratorSettings;
import net.minecraft.world.gen.layer.GenLayer;
import quantumzone.stereowalker.init.Bio;
import quantumzone.stereowalker.world.types.layer.GenLayerCustom;

public class WorldTypeInfection extends WorldType{

	public WorldTypeInfection() {
		super("Infection");
	}
	
	@Override
	public GenLayer getBiomeLayer(long worldSeed, GenLayer parentLayer, ChunkGeneratorSettings chunkSettings) {
		return new GenLayerCustom(worldSeed, parentLayer, this, chunkSettings);
	}
}
