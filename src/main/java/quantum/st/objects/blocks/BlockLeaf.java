package quantum.st.objects.blocks;

import java.util.List;
import java.util.Random;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockPlanks.EnumType;
import net.minecraft.block.SoundType;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import quantum.st.Main;
import quantum.st.init.BlockInit;
import quantum.st.init.ItemInit;
import quantum.st.objects.blocks.item.ItemBlockVariants;
import quantum.st.util.handlers.TreeHandler;
import quantum.st.util.interfaces.IHasModel;
import quantum.st.util.interfaces.IMetaName;

public class BlockLeaf extends BlockLeaves implements IHasModel, IMetaName
{
	public static final PropertyEnum<TreeHandler.EnumType> VARIANT = PropertyEnum.<TreeHandler.EnumType>create("variant", TreeHandler.EnumType.class, new Predicate<TreeHandler.EnumType>()
	{
		public boolean apply(@Nullable TreeHandler.EnumType apply) {
			return apply.getMeta() < 2;
		}
	});
	
	private String name;
	
	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(VARIANT, TreeHandler.EnumType.byMetadata(meta % 2));
	}
		
	
	public static final PropertyBool DECAYABLE = PropertyBool.create("decayable");
    public static final PropertyBool CHECK_DECAY = PropertyBool.create("check_decay");
    protected boolean leavesFancy;
    int[] surroundings;

    public BlockLeaf(String name)
    {
        this.setSoundType(SoundType.PLANT);
        setUnlocalizedName(name);
		setRegistryName(name);
		this.name = name;
		setCreativeTab(Main.tabQuantum);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, TreeHandler.EnumType.QUANTUM).withProperty(CHECK_DECAY, Boolean.valueOf(true)).withProperty(DECAYABLE, Boolean.valueOf(true)));
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
    }
    
    @Override
    public int getMetaFromState(IBlockState state) {
		int i = ((TreeHandler.EnumType)state.getValue(VARIANT)).getMeta();
		
		if(!((Boolean)state.getValue(DECAYABLE)).booleanValue()) {
			i |= 2;
		}
		
		if(!((Boolean)state.getValue(CHECK_DECAY)).booleanValue()) {
			i |= 4;
		}
		
		return 1;
    	
    }
    
    @Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
		for (TreeHandler.EnumType blockplanks$enumtype : TreeHandler.EnumType.values()) {
			items.add(new ItemStack(this, 1, blockplanks$enumtype.getMeta()));
		}
	}
    
    @Override
	public ItemStack getSilkTouchDrop(IBlockState state){
		return new ItemStack(Item.getItemFromBlock(this), 1, ((TreeHandler.EnumType)state.getValue(VARIANT)).getMeta());
	}
    
    @Override
	public int damageDropped(IBlockState state) {
		return ((TreeHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
    
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(BlockInit.SAPLING);
    }
    
    @Override
	public String getSpecialName(ItemStack stack) {
		return TreeHandler.EnumType.values()[stack.getItemDamage()].getName();
	}



    @Override
    protected void dropApple(World worldIn, BlockPos pos, IBlockState state, int chance)
    {
    	return;
    }

    @Override
    protected int getSaplingDropChance(IBlockState state)
    {
    	return 20;
    }
    

 
    
    @Override
    public boolean isOpaqueCube(IBlockState state){
    	return false;
    }
    
    @Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {VARIANT,DECAYABLE,CHECK_DECAY});
	}

 
	@Override
	public List<ItemStack> onSheared(ItemStack item, IBlockAccess world, BlockPos pos, int fortune) {
		return NonNullList.withSize(1, new ItemStack(this, 1, world.getBlockState(pos).getValue(VARIANT).getMeta()));
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.TRANSLUCENT;
	}
	
	@Override
	public void registerModels() {
		for(int i = 0; i < TreeHandler.EnumType.values().length; i++) {
			
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "leaves_" +TreeHandler.EnumType.values()[i].getName(), "inventory");
		}
	}

	@Override
	public EnumType getWoodType(int meta) {
		return null;
	}
}