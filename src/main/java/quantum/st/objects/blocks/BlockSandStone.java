package quantum.st.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import quantum.st.Main;
import quantum.st.init.BlockInit;
import quantum.st.init.ItemInit;
import quantum.st.objects.blocks.item.ItemBlockVariants;
import quantum.st.util.handlers.SandStoneHandler;
import quantum.st.util.interfaces.IHasModel;
import quantum.st.util.interfaces.IMetaName;

public class BlockSandStone extends Block implements IHasModel, IMetaName{
	public static final PropertyEnum<SandStoneHandler.EnumType> TYPE = PropertyEnum.<SandStoneHandler.EnumType>create("type", SandStoneHandler.EnumType.class);
	private String name;
	public BlockSandStone(String name) {
		super(Material.ROCK);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabQuantum);
		setDefaultState(this.blockState.getBaseState().withProperty(TYPE, SandStoneHandler.EnumType.NORMAL));
		
		this.name = name;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return ((SandStoneHandler.EnumType)state.getValue(TYPE)).getMeta();
	}
	
	@Override
	public int getMetaFromState(IBlockState state) {
		return ((SandStoneHandler.EnumType)state.getValue(TYPE)).getMeta();
	}
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return getDefaultState().withProperty(TYPE, SandStoneHandler.EnumType.byMetadata(meta));
	}
	
	@Override
	public ItemStack getPickBlock(IBlockState state, RayTraceResult target, World world, BlockPos pos, EntityPlayer player) {
		return new ItemStack(Item.getItemFromBlock(this), 1, getMetaFromState(world.getBlockState(pos)));
	}
	
	@Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
		for (SandStoneHandler.EnumType TYPE : SandStoneHandler.EnumType.values()) {
			items.add(new ItemStack(this, 1, TYPE.getMeta()));
		}
	}
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {TYPE});
	}
	
	@Override
	public String getSpecialName(ItemStack stack) {
		return SandStoneHandler.EnumType.values()[stack.getItemDamage()].getName();
	}

	@Override
	public void registerModels() {
		for(int i = 0; i < SandStoneHandler.EnumType.values().length; i++) {
			
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "white_" +SandStoneHandler.EnumType.values()[i].getName(), "inventory");
		}
		
	}


}
