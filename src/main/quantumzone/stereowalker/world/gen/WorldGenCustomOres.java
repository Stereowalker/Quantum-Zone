package quantumzone.stereowalker.world.gen;

import java.util.Random;

import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;
import quantumzone.stereowalker.blocks.BlockOres;
import quantumzone.stereowalker.init.Blk;
import quantumzone.stereowalker.util.handlers.variants.EnumHandler;

public class WorldGenCustomOres implements IWorldGenerator{
	private WorldGenerator quantum_ore, silver_ore, copper_ore, electrum_ore, lead_ore, nickel_ore, platinum_ore, tin_ore, ruby_ore;
	private WorldGenerator quantum_ore2, silver_ore2, copper_ore2, electrum_ore2, lead_ore2, nickel_ore2, platinum_ore2, tin_ore2, iron_ore2, gold_ore2;
	
	public WorldGenCustomOres() {
		
		quantum_ore = new WorldGenMinable(Blk.ORE_QUANTUM.getDefaultState(), 7, BlockMatcher.forBlock(Blocks.STONE));
		silver_ore = new WorldGenMinable(Blk.ORE_SILVER.getDefaultState(), 4, BlockMatcher.forBlock(Blocks.STONE));
		copper_ore = new WorldGenMinable(Blk.ORE_COPPER.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
		electrum_ore = new WorldGenMinable(Blk.ORE_ELECTRUM.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
		lead_ore = new WorldGenMinable(Blk.ORE_LEAD.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
		nickel_ore = new WorldGenMinable(Blk.ORE_NICKEL.getDefaultState(), 9, BlockMatcher.forBlock(Blocks.STONE));
		platinum_ore = new WorldGenMinable(Blk.ORE_PLATINUM.getDefaultState(), 2, BlockMatcher.forBlock(Blocks.STONE));
		tin_ore = new WorldGenMinable(Blk.ORE_TIN.getDefaultState(), 8, BlockMatcher.forBlock(Blocks.STONE));
		ruby_ore = new WorldGenMinable(Blk.ORE_RUBY.getDefaultState(), 5, BlockMatcher.forBlock(Blocks.STONE));
		
		quantum_ore2 = new WorldGenMinable(Blk.ORE_QUANTUM.getDefaultState(), 16, BlockMatcher.forBlock(Blk.QUANTEX));
		silver_ore2 = new WorldGenMinable(Blk.ORE_SILVER.getDefaultState(), 16, BlockMatcher.forBlock(Blk.QUANTEX));
		copper_ore2 = new WorldGenMinable(Blk.ORE_COPPER.getDefaultState(), 16, BlockMatcher.forBlock(Blk.QUANTEX));
		electrum_ore2 = new WorldGenMinable(Blk.ORE_ELECTRUM.getDefaultState(), 16, BlockMatcher.forBlock(Blk.QUANTEX));
		lead_ore2 = new WorldGenMinable(Blk.ORE_LEAD.getDefaultState(), 16, BlockMatcher.forBlock(Blk.QUANTEX));
		nickel_ore2 = new WorldGenMinable(Blk.ORE_NICKEL.getDefaultState(), 16, BlockMatcher.forBlock(Blk.QUANTEX));
		platinum_ore2 = new WorldGenMinable(Blk.ORE_PLATINUM.getDefaultState(), 16, BlockMatcher.forBlock(Blk.QUANTEX));
		tin_ore2= new WorldGenMinable(Blk.ORE_TIN.getDefaultState(), 16, BlockMatcher.forBlock(Blk.QUANTEX));
		iron_ore2 = new WorldGenMinable(Blocks.IRON_ORE.getDefaultState(), 16, BlockMatcher.forBlock(Blk.QUANTEX));
		gold_ore2 = new WorldGenMinable(Blocks.GOLD_ORE.getDefaultState(), 16, BlockMatcher.forBlock(Blk.QUANTEX));
	}
	
	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) {
		switch(world.provider.getDimension()) {
		case 0:
			runGenerator(quantum_ore, world, random, chunkX, chunkZ, 12, 21, 48);
			runGenerator(platinum_ore, world, random, chunkX, chunkZ, 5, 0, 32);
			runGenerator(silver_ore, world, random, chunkX, chunkZ, 12, 0, 48);
			runGenerator(copper_ore, world, random, chunkX, chunkZ, 25, 0, 128);
			runGenerator(electrum_ore, world, random, chunkX, chunkZ, 12, 0, 64);
			runGenerator(lead_ore, world, random, chunkX, chunkZ, 12, 32, 64);
			runGenerator(nickel_ore, world, random, chunkX, chunkZ, 12, 28, 64);
			runGenerator(tin_ore, world, random, chunkX, chunkZ, 12, 0, 64);
			runGenerator(ruby_ore, world, random, chunkX, chunkZ, 5, 12, 98);
			break;
		case 2:
			runGenerator(quantum_ore2, world, random, chunkX, chunkZ, 100, 0, 255);
			runGenerator(platinum_ore2, world, random, chunkX, chunkZ, 100, 0, 255);
			runGenerator(silver_ore2, world, random, chunkX, chunkZ, 100, 0, 255);
			runGenerator(copper_ore2, world, random, chunkX, chunkZ, 100, 0, 255);
			runGenerator(electrum_ore2, world, random, chunkX, chunkZ, 100, 0, 255);
			runGenerator(lead_ore2, world, random, chunkX, chunkZ, 100, 0, 255);
			runGenerator(nickel_ore2, world, random, chunkX, chunkZ, 100, 0, 255);
			runGenerator(tin_ore2, world, random, chunkX, chunkZ, 100, 0, 255);
			runGenerator(iron_ore2, world, random, chunkX, chunkZ, 100, 0, 255);
			runGenerator(gold_ore2, world, random, chunkX, chunkZ, 100, 0, 255);
			break;
		}
		
		
	}
	
	private void runGenerator(WorldGenerator gen, World world, Random rand, int chunkX, int chunkZ, int chance, int minHeight, int maxHeight) {
		if (minHeight > maxHeight || minHeight < 0 ||maxHeight > 256) throw new IllegalArgumentException("Error: Ores Were Spawned Outside Of World");
		
		int heightDiff = maxHeight - minHeight + 1;
		for (int i = 0; i < chance; i++) {
			int x = chunkX * 16 + rand.nextInt(16);
			int y = minHeight + rand.nextInt(heightDiff);
			int z = chunkZ * 16 + rand.nextInt(16);
			
			gen.generate(world, rand, new BlockPos(x,y,z));
		}
		
		
		
	}

}
