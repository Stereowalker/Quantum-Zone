package quantum.st.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import quantum.st.objects.blocks.BlockBase;
import quantum.st.objects.blocks.BlockBaseD;
//import quantum.st.objects.blocks.BlockDoubleSlab;
import quantum.st.objects.blocks.BlockFenceGate;
import quantum.st.objects.blocks.BlockFences;
//import quantum.st.objects.blocks.BlockHalfSlab;
import quantum.st.objects.blocks.BlockLeaf;
import quantum.st.objects.blocks.BlockLogs;
import quantum.st.objects.blocks.BlockMTNT;
import quantum.st.objects.blocks.BlockOres;
import quantum.st.objects.blocks.BlockPlank;
import quantum.st.objects.blocks.BlockSand;
import quantum.st.objects.blocks.BlockSandStone;
import quantum.st.objects.blocks.BlockSaplings;
//import quantum.st.objects.blocks.BlockWoodSlabs;
import quantum.st.util.handlers.TreeHandler;
import quantum.st.objects.blocks.BlockSoul;
import quantum.st.objects.blocks.BlockStair;

public class BlockInit {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block BLOCK_QUANTEX = new BlockBase("block_quantex", Material.ROCK).setHardness(15.0F).setLightLevel(0.5F).setResistance(1.0F);
	public static final Block BLUE_COBBLE = new BlockBase("blue_cobble", Material.ROCK).setHardness(10.0F).setLightLevel(0.25F).setResistance(0.9F);
	public static final Block BLOCK_QUANTEX_SOIL = new BlockBaseD("block_quantex_soil").setHardness(14.0F).setLightLevel(0.4F).setResistance(0.9F);
	public static final Block SAND = new BlockSand("sand");
	public static final Block WHITE_SANDSTONE = new BlockSandStone("white_sandstone");
	public static final Block SOUL_BLOCK = new BlockSoul("soul_block").setHardness(20.0F).setLightLevel(0.5F).setResistance(1.0F);
	public static final Block PLANKS = new BlockPlank("planks");
	public static final Block LOGS = new BlockLogs("log");
	public static final Block LEAVES = new BlockLeaf("leaves");
	public static final Block SAPLING = new BlockSaplings("sapling");
	public static final Block ORE_GEM = new BlockOres("ore_gem", "gem").setHardness(50F);
	public static final Block QUANTUM_FENCE = new BlockFences("quantum_fence").setHardness(5F);
	public static final Block QUANTUM_FENCE_GATE = new BlockFenceGate("quantum_fence_gate").setHardness(5F);
	public static final Block SILK_OAK_FENCE = new BlockFences("silky_oak_fence").setHardness(5F);
	public static final Block SILK_OAK_FENCE_GATE = new BlockFenceGate("silky_oak_fence_gate").setHardness(5F);
	//public static final BlockHalfSlab QUANTUM_SLAB = (BlockHalfSlab) new BlockHalfSlab("quantum_slab").setHardness(5F);
	//public static final BlockDoubleSlab QUANTUM_DOUBLE_SLAB = (BlockDoubleSlab) (new BlockDoubleSlab("double_quantum_slab").setHardness(5F));
	
	public static final Block MEGATNT = new BlockMTNT("mtnt");
	
	public static final Block STAIRSPLANKS0 = new BlockStair("quantum_stairs", BlockInit.PLANKS.getDefaultState());
	public static final Block STAIRSPLANKS1 = new BlockStair("silky_oak_stairs", BlockInit.PLANKS.getDefaultState());
	public static final Block STAIRSSTONE0= new BlockStair("blue_cobble_stairs", BlockInit.BLUE_COBBLE.getDefaultState());
	public static final Block STAIRSSAND = new BlockStair("white_sandstone_stairs", BlockInit.WHITE_SANDSTONE.getDefaultState());
	
	

}
