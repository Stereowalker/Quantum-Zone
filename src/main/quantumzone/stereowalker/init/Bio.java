package quantumzone.stereowalker.init;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import quantumzone.stereowalker.world.biomes.BiomeColdDesert;
import quantumzone.stereowalker.world.biomes.BiomeQuantum;
import quantumzone.stereowalker.world.biomes.BiomeQuantumForest;
import quantumzone.stereowalker.world.biomes.BiomeQuantumHell;
import quantumzone.stereowalker.world.biomes.BiomeTropicalForest;

public class Bio {
	public static final Biome QUANTUM = new BiomeQuantum();
	public static final Biome QUANTUMFOREST = new BiomeQuantumForest();
	public static final Biome COLDDESERT = new BiomeColdDesert();
	public static final Biome TROPICALFOREST = new BiomeTropicalForest();
	public static final Biome QUANTUMZONE = new BiomeQuantumHell();
	public static void registerBiomes() {
		initBiome(QUANTUM, "quantum", BiomeType.WARM, Type.DRY);
		initBiome(QUANTUMFOREST, "quantum_forest", BiomeType.WARM, Type.DRY);
		initBiome(QUANTUMZONE, "quantum_zone", BiomeType.WARM, Type.DRY, Type.COLD);
		initBiome(COLDDESERT, "cold_desert", BiomeType.DESERT, Type.DRY, Type.COLD, Type.SNOWY);
		initBiome(TROPICALFOREST, "tropical_forest", BiomeType.WARM, Type.CONIFEROUS, Type.FOREST, Type.LUSH);
		
	}
	
	private static Biome initBiome (Biome biome, String name, BiomeType biomeType, Type... types) {
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(QUANTUM, 8));
		BiomeManager.addBiome(biomeType, new BiomeEntry(QUANTUMFOREST, 8));
		BiomeManager.addBiome(biomeType, new BiomeEntry(COLDDESERT, 9));
		BiomeManager.addBiome(biomeType, new BiomeEntry(TROPICALFOREST, 9));
		BiomeManager.addSpawnBiome(biome);
		return biome;
	}

}
