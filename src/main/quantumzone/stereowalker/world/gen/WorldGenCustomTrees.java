package quantumzone.stereowalker.world.gen;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.WorldType;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import quantumzone.stereowalker.init.Blk;
import quantumzone.stereowalker.world.biomes.BiomeQuantumForest;
import quantumzone.stereowalker.world.biomes.BiomeTropicalForest;
import quantumzone.stereowalker.world.feature.tree.WorldGenQuantumTree;
import quantumzone.stereowalker.world.feature.tree.WorldGenSilkyOakTree;
import scala.actors.threadpool.Arrays;

public class WorldGenCustomTrees implements IWorldGenerator{

	private final WorldGenerator QUANTUM = new WorldGenQuantumTree();
	private final WorldGenerator SILKOAK = new WorldGenSilkyOakTree();
	private final WorldGenerator JUNGLE = new WorldGenSilkyOakTree();
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
		case 1:
			break;
		case 0:
			//runGenerator(QUANTUM, world, random, chunkX, chunkZ, 5, Blk.BLOCK_QUANTEX_SOIL, BiomeQuantumForest.class);
			//runGenerator(SILKOAK, world, random, chunkX, chunkZ, 2, Blocks.GRASS, BiomeTropicalForest.class);
			break;
		case -1:
			
		}
		
	}
	
	private void runGenerator(WorldGenerator generator, World world, Random random, int chunkX, int chunkZ, int chance, Block topBlock, Class<?>... classes)
	{
		ArrayList<Class<?>> classesList = new ArrayList<Class<?>>(Arrays.asList(classes));
		
		int x = (chunkX * 16) + random.nextInt(15);
		int z = (chunkZ * 16) + random.nextInt(15);
		int y = calculateGenerationHeight(world, x, z, topBlock);
		BlockPos pos = new BlockPos(x,y,z);
		
		Class<?> biome = world.provider.getBiomeForCoords(pos).getClass();
		
		if(world.getWorldType() != WorldType.FLAT)
		{
			if(classesList.contains(biome))
			{
				if(random.nextInt(chance) == 0)
				{
					generator.generate(world, random, pos);
				}
			}
		}
	}
	
	private static int calculateGenerationHeight(World world, int x, int z, Block topBlock)
	{
		int y = world.getHeight();
		boolean foundGround = false;
		
		while(!foundGround && y-- >= 0)
		{
			Block block = world.getBlockState(new BlockPos(x,y,z)).getBlock();
			foundGround = block == topBlock;
		}
		
		return y;
	}

}
