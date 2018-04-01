package quantumzone.stereowalker.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraftforge.fluids.BlockFluidClassic;
import quantumzone.stereowalker.Main;
import quantumzone.stereowalker.Main.Materials;
import quantumzone.stereowalker.blocks.BlockBase;
import quantumzone.stereowalker.blocks.BlockBaseD;
import quantumzone.stereowalker.blocks.BlockCorn;
import quantumzone.stereowalker.blocks.BlockDoubleSlab;
import quantumzone.stereowalker.blocks.BlockFenceGate;
import quantumzone.stereowalker.blocks.BlockFences;
import quantumzone.stereowalker.blocks.BlockHalfSlab;
import quantumzone.stereowalker.blocks.BlockLeaf;
import quantumzone.stereowalker.blocks.BlockLogs;
import quantumzone.stereowalker.blocks.BlockMTNT;
import quantumzone.stereowalker.blocks.BlockMiner;
import quantumzone.stereowalker.blocks.BlockOres;
import quantumzone.stereowalker.blocks.BlockPlank;
import quantumzone.stereowalker.blocks.BlockQuantumPortal;
import quantumzone.stereowalker.blocks.BlockSand;
import quantumzone.stereowalker.blocks.BlockSandStone;
import quantumzone.stereowalker.blocks.BlockSaplings;
import quantumzone.stereowalker.blocks.BlockSoul;
import quantumzone.stereowalker.blocks.BlockStair;
import quantumzone.stereowalker.blocks.BlockStoneBricks;
import quantumzone.stereowalker.blocks.BlockWalls;
import quantumzone.stereowalker.init.FluidsInit.ModFluid;

public class Blk {
	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block QUANTEX = new BlockBase("quantex", Material.ROCK).setHardness(14.0F).setLightLevel(0.5F).setResistance(0.9F);
	public static final Block BLOCK_QUANTUM = new BlockBase("quantum_block", Material.IRON).setHardness(15.0F).setLightLevel(0.7F).setResistance(1.0F);
	public static final Block BLOCK_BANTUM = new BlockBase("bantum_block", Material.IRON).setHardness(15.0F).setLightLevel(0.5F).setResistance(1.0F);
	public static final Block BLOCK_SILVER = new BlockBase("silver_block", Material.IRON).setHardness(15.0F).setResistance(1.0F);
	public static final Block BLOCK_BRONZE = new BlockBase("bronze_block", Material.IRON).setHardness(15.0F).setResistance(1.0F);
	public static final Block BLOCK_COPPER = new BlockBase("copper_block", Material.IRON).setHardness(15.0F).setResistance(1.0F);
	public static final Block BLOCK_ELECTRUM = new BlockBase("electrum_block", Material.IRON).setHardness(15.0F).setResistance(1.0F);
	public static final Block BLOCK_INVAR = new BlockBase("invar_block", Material.IRON).setHardness(15.0F).setResistance(1.0F);
	public static final Block BLOCK_LEAD = new BlockBase("lead_block", Material.IRON).setHardness(15.0F).setResistance(1.0F);
	public static final Block BLOCK_NICKEL = new BlockBase("nickel_block", Material.IRON).setHardness(15.0F).setResistance(1.0F);
	public static final Block BLOCK_PLATINUM = new BlockBase("platinum_block", Material.IRON).setHardness(15.0F).setResistance(1.0F);
	public static final Block BLOCK_TIN = new BlockBase("tin_block", Material.IRON).setHardness(15.0F).setResistance(1.0F);
	public static final Block BLOCK_STEEL = new BlockBase("steel_block", Material.IRON).setHardness(17.0F).setResistance(1.0F);
	public static final Block BLOCK_RUBY = new BlockBase("ruby_block", Material.IRON).setHardness(13.0F).setResistance(1.0F);
	public static final Block BLUE_COBBLE = new BlockBase("blue_cobble", Material.ROCK).setHardness(10.0F).setLightLevel(0.25F).setResistance(0.9F);
	public static final Block BLUE_STONE = new BlockBase("blue_stone", Material.ROCK).setHardness(10.0F).setLightLevel(0.25F).setResistance(0.9F);
	public static final Block BLUE_WALL = new BlockWalls("blue_cobble_wall").setLightLevel(0.25F);
	public static final Block BLUE_STONE_BRICK = new BlockStoneBricks("blue_stone_brick").setHardness(10.0F).setLightLevel(0.25F).setResistance(0.9F);
	public static final Block BLOCK_QUANTEX_SOIL = new BlockBaseD("quantex_soil").setHardness(14.0F).setLightLevel(0.4F).setResistance(0.9F);
	public static final Block SAND = new BlockSand("sand");
	public static final BlockQuantumPortal PORTAL = new BlockQuantumPortal("quantum_portal");
	public static final Block MINER = new BlockMiner("miner");
	public static final Block WHITE_SANDSTONE = new BlockSandStone("white_sandstone");
	public static final Block SOUL_BLOCK = new BlockSoul("soul_block").setHardness(20.0F).setLightLevel(0.5F).setResistance(1.0F);
	public static final Block PLANKS = new BlockPlank("planks");
	public static final Block LOGS = new BlockLogs("log");
	public static final Block LEAVES = new BlockLeaf("leaves");
	public static final Block SAPLING = new BlockSaplings("sapling");
	public static final Block ORE_QUANTUM = new BlockOres("quantum_ore").setHardness(3.0F).setResistance(5.0F);
	public static final Block ORE_SILVER = new BlockOres("silver_ore").setHardness(3.0F).setResistance(5.0F);
	public static final Block ORE_COPPER = new BlockOres("copper_ore").setHardness(3.0F).setResistance(5.0F);
	public static final Block ORE_ELECTRUM = new BlockOres("electrum_ore").setHardness(3.0F).setResistance(5.0F);
	public static final Block ORE_LEAD = new BlockOres("lead_ore").setHardness(3.0F).setResistance(5.0F);
	public static final Block ORE_NICKEL = new BlockOres("nickel_ore").setHardness(3.0F).setResistance(5.0F);
	public static final Block ORE_PLATINUM = new BlockOres("platinum_ore").setHardness(3.0F).setResistance(5.0F);
	public static final Block ORE_TIN = new BlockOres("tin_ore").setHardness(3.0F).setResistance(5.0F);
	public static final Block ORE_RUBY = new BlockOres("ruby_ore").setHardness(3.0F).setResistance(5.0F);
	public static final Block QUANTUM_FENCE = new BlockFences("quantum_fence").setHardness(5F);
	public static final Block QUANTUM_FENCE_GATE = new BlockFenceGate("quantum_fence_gate").setHardness(5F);
	public static final Block SILK_OAK_FENCE = new BlockFences("silky_oak_fence").setHardness(5F);
	public static final Block SILK_OAK_FENCE_GATE = new BlockFenceGate("silky_oak_fence_gate").setHardness(5F);
	//public static final BlockLiquidClassic ACID = new BlockLiquidClassic("acid", FluidsList.ACID, Material.WATER);
	public static final Block ACID_BLOCK = new BlockFluidClassic(ModFluid.ACID, Materials.ACID).setCreativeTab(Main.tabQuantum);
	public static final Block CORN = new BlockCorn("corns");
	public static final BlockSlab QUANTUM_SLAB = (BlockSlab) new BlockHalfSlab("quantum_slab").setHardness(5F);
	public static final BlockSlab QUANTUM_DOUBLE_SLAB = (BlockSlab) (new BlockDoubleSlab("double_quantum_slab").setHardness(5F));
	//public static final BlockBlueFire FIRE = new BlockBlueFire("fire");
	public static final Block MEGATNT = new BlockMTNT("mtnt");
	
	public static final Block STAIRSPLANKS0 = new BlockStair("quantum_stairs", Blk.PLANKS.getDefaultState());
	public static final Block STAIRSPLANKS1 = new BlockStair("silky_oak_stairs", Blk.PLANKS.getDefaultState());
	public static final Block STAIRSSTONE0= new BlockStair("blue_cobble_stairs", Blk.BLUE_COBBLE.getDefaultState());
	public static final Block STAIRSSTONE1= new BlockStair("blue_stone_stairs", Blk.BLUE_STONE.getDefaultState());
	public static final Block STAIRSSAND = new BlockStair("white_sandstone_stairs", Blk.WHITE_SANDSTONE.getDefaultState());
	
	

}
