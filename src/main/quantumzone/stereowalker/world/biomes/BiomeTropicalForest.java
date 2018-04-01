package quantumzone.stereowalker.world.biomes;

import java.util.Random;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockOldLeaf;
import net.minecraft.block.BlockPlanks;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityParrot;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biome.BiomeProperties;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenMelon;
import net.minecraft.world.gen.feature.WorldGenShrub;
import net.minecraft.world.gen.feature.WorldGenTallGrass;
import net.minecraft.world.gen.feature.WorldGenVines;
import net.minecraft.world.gen.feature.WorldGenerator;
import quantumzone.stereowalker.blocks.BlockLeaf;
import quantumzone.stereowalker.blocks.BlockLogs;
import quantumzone.stereowalker.init.Blk;
import quantumzone.stereowalker.util.handlers.variants.TreeHandler;
import quantumzone.stereowalker.world.feature.tree.WorldGenSilkyOakTree;

public class BiomeTropicalForest extends Biome {

	protected static final WorldGenAbstractTree TREE = new WorldGenSilkyOakTree();
	private static final IBlockState JUNGLE_LOG = Blk.LOGS.getDefaultState().withProperty(BlockLogs.VARIANT, TreeHandler.EnumType.SILKOAK);
    /** The Silky Blockstate **/
    private static final IBlockState JUNGLE_LEAF = Blk.LEAVES.getDefaultState().withProperty(BlockLeaf.VARIANT, TreeHandler.EnumType.SILKOAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));
    /** The block state for the Oak leaf */
    private static final IBlockState OAK_LEAF = Blocks.LEAVES.getDefaultState().withProperty(BlockOldLeaf.VARIANT, BlockPlanks.EnumType.OAK).withProperty(BlockLeaves.CHECK_DECAY, Boolean.valueOf(false));

    public BiomeTropicalForest()
    {
        super(new BiomeProperties("Tropical Forest").setBaseHeight(0.15F).setHeightVariation(0.3F).setTemperature(10F).setRainfall(20.0F));

        
        this.decorator.treesPerChunk = 50;
        

        this.decorator.grassPerChunk = 25;
        this.decorator.flowersPerChunk = 4;


        //this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityParrot.class, 40, 1, 2));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityChicken.class, 10, 4, 4));
        this.spawnableCreatureList.add(new Biome.SpawnListEntry(EntityChicken.class, 10, 4, 4));
    }

    public WorldGenAbstractTree getRandomTreeFeature(Random rand)
    {
        if (rand.nextInt(10) == 0)
        {
            return BIG_TREE_FEATURE;
        }
        else if (rand.nextInt(2) == 0)
        {
            return new WorldGenShrub(JUNGLE_LOG, JUNGLE_LEAF);
        }
        else
        {
        	return TREE;
        }
    }

    /**
     * Gets a WorldGen appropriate for this biome.
     */
    public WorldGenerator getRandomWorldGenForGrass(Random rand)
    {
        return rand.nextInt(4) == 0 ? new WorldGenTallGrass(BlockTallGrass.EnumType.FERN) : new WorldGenTallGrass(BlockTallGrass.EnumType.GRASS);
    }

    public void decorate(World worldIn, Random rand, BlockPos pos)
    {
        super.decorate(worldIn, rand, pos);
        int i = rand.nextInt(16) + 8;
        int j = rand.nextInt(16) + 8;
        int height = worldIn.getHeight(pos.add(i, 0, j)).getY() * 2; // could == 0, which crashes nextInt
        if (height < 1) height = 1;
        int k = rand.nextInt(height);
        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.BIG_SHROOM))
        (new WorldGenMelon()).generate(worldIn, rand, pos.add(i, k, j));
        WorldGenVines worldgenvines = new WorldGenVines();

        if(net.minecraftforge.event.terraingen.TerrainGen.decorate(worldIn, rand, pos, net.minecraftforge.event.terraingen.DecorateBiomeEvent.Decorate.EventType.GRASS))
        for (int j1 = 0; j1 < 50; ++j1)
        {
            k = rand.nextInt(16) + 8;
            int l = 128;
            int i1 = rand.nextInt(16) + 8;
            worldgenvines.generate(worldIn, rand, pos.add(k, 128, i1));
        }
    }

}