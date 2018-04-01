package quantumzone.stereowalker.world.biomes;

import java.util.Random;

import net.minecraft.entity.monster.EntityCreeper;
import net.minecraft.entity.monster.EntityEnderman;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.biome.Biome.SpawnListEntry;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import quantumzone.stereowalker.entity.EntityGhost;
import quantumzone.stereowalker.entity.EntityQuantumSoldier;
import quantumzone.stereowalker.entity.EntityTraveller;
import quantumzone.stereowalker.init.Blk;
import quantumzone.stereowalker.world.feature.tree.WorldGenQuantumTree;

public class BiomeQuantumForest extends Biome {

	protected static final WorldGenAbstractTree TREE = new WorldGenQuantumTree();
	public BiomeQuantumForest() {
        super(new BiomeProperties("Quantum Forest").setBaseHeight(0.25F).setHeightVariation(0.4F).setTemperature(0F).setWaterColor(51915653).setRainfall(10.0F).setSnowEnabled());
        topBlock = Blk.BLOCK_QUANTEX_SOIL.getDefaultState();
        fillerBlock = Blk.QUANTEX.getDefaultState();
        
        this.decorator.treesPerChunk = 3; 
        
        this.spawnableCreatureList.clear();
        
        this.spawnableMonsterList.add(new SpawnListEntry(EntityZombie.class, 10, 1, 5));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityGhost.class, 10, 1, 5));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityCreeper.class, 10, 1, 5));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityEnderman.class, 10, 1, 5));
        this.spawnableMonsterList.add(new SpawnListEntry(EntitySkeleton.class, 10, 1, 5));
        this.spawnableMonsterList.add(new SpawnListEntry(EntitySpider.class, 10, 1, 5));
        //this.spawnableWaterCreatureList.add(new SpawnListEntry(EntityShark.class, 1, 5, 5));
        this.spawnableCreatureList.add(new SpawnListEntry(EntityQuantumSoldier.class, 5, 1, 7));
        this.spawnableMonsterList.add(new SpawnListEntry(EntityTraveller.class, 5, 1, 7));
    }
	
	@Override
	public WorldGenAbstractTree getRandomTreeFeature(Random rand) {
		return TREE;
	}

}
