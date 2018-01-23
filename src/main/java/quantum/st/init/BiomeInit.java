package quantum.st.init;

import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.common.BiomeManager.BiomeEntry;
import net.minecraftforge.common.BiomeManager.BiomeType;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import quantum.st.world.biomes.BiomeColdDesert;
import quantum.st.world.biomes.BiomeQuantum;
import quantum.st.world.biomes.BiomeQuantumForest;
import quantum.st.world.biomes.BiomeTropicalForest;

public class BiomeInit {
	public static final Biome QUANTUM = new BiomeQuantum();
	public static final Biome QUANTUMFOREST = new BiomeQuantumForest();
	public static final Biome COLDDESERT = new BiomeColdDesert();
	public static final Biome TROPICALFOREST= new BiomeTropicalForest();
	public static void registerBiomes() {
		initBiome(QUANTUM, "Quantum", BiomeType.WARM, Type.DRY);
		initBiome(QUANTUMFOREST, "Quantum Forest", BiomeType.WARM, Type.DRY);
		initBiome(COLDDESERT, "Cold Desert", BiomeType.DESERT, Type.DRY, Type.COLD, Type.SNOWY);
		initBiome(TROPICALFOREST, "Tropical Forest", BiomeType.WARM, Type.CONIFEROUS, Type.FOREST, Type.LUSH);
		
	}
	
	private static Biome initBiome (Biome biome, String name, BiomeType biomeType, Type... types) {
		biome.setRegistryName(name);
		ForgeRegistries.BIOMES.register(biome);
		System.out.println("Biome " + name +  " Successfully Registered");
		BiomeDictionary.addTypes(biome, types);
		BiomeManager.addBiome(biomeType, new BiomeEntry(biome, 10));
		BiomeManager.addSpawnBiome(biome);
		System.out.println("Biome " + name + " Added to Minecraft");
		return biome;
	}

}
