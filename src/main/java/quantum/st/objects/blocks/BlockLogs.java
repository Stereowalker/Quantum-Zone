package quantum.st.objects.blocks;

import javax.annotation.Nullable;

import com.google.common.base.Predicate;

import net.minecraft.block.Block;
import net.minecraft.block.BlockLog;
import net.minecraft.block.BlockRotatedPillar;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.RayTraceResult;
import net.minecraft.world.World;
import quantum.st.Main;
import quantum.st.init.BlockInit;
import quantum.st.init.ItemInit;
import quantum.st.objects.blocks.item.ItemBlockVariants;
import quantum.st.util.handlers.EnumHandler;
import quantum.st.util.handlers.TreeHandler;
import quantum.st.util.interfaces.IHasModel;
import quantum.st.util.interfaces.IMetaName;

public class BlockLogs extends BlockLog implements IHasModel, IMetaName
{
    public static final PropertyEnum<TreeHandler.EnumType> VARIANT = PropertyEnum.<TreeHandler.EnumType>create("variant", TreeHandler.EnumType.class, new Predicate<TreeHandler.EnumType>()
    	{
    	public boolean apply(@Nullable TreeHandler.EnumType apply) {
    		return apply.getMeta() < 2;
    	}
    });
	private String name;

    public BlockLogs(String name)
    {
		setUnlocalizedName(name);
		setSoundType(SoundType.WOOD);
		setRegistryName(name);
		setCreativeTab(Main.tabQuantum);
		setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, TreeHandler.EnumType.QUANTUM).withProperty(LOG_AXIS, EnumAxis.Y));
		
		this.name = name;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlockVariants(this).setRegistryName(this.getRegistryName()));
    }
    
    @Override
	public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items) {
		for (TreeHandler.EnumType blockplanks$enumtype : TreeHandler.EnumType.values()) {
			items.add(new ItemStack(this, 1, blockplanks$enumtype.getMeta()));
		}
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		IBlockState state = this.getDefaultState().withProperty(VARIANT, TreeHandler.EnumType.byMetadata((meta & 1) % 2));
		
		switch(meta & 6) {
		case 0:
			state = state.withProperty(LOG_AXIS, EnumAxis.Y);
			break;
		
		case 2:
			state = state.withProperty(LOG_AXIS, EnumAxis.X);
			break;
		
		case 4:
			state = state.withProperty(LOG_AXIS, EnumAxis.Z);
			break;
		
		default:
			state = state.withProperty(LOG_AXIS, EnumAxis.NONE);
		}
		
		return state;
	}
	
	@Override
	public int damageDropped(IBlockState state) {
		return ((TreeHandler.EnumType)state.getValue(VARIANT)).getMeta();
	}
	
	@SuppressWarnings("incomplete-switch")
    @Override
	public int getMetaFromState(IBlockState state) {
		int i = 0;
		i = i | ((TreeHandler.EnumType)state.getValue(VARIANT)).getMeta();
		switch((BlockLog.EnumAxis)state.getValue(LOG_AXIS)) {
		case X:
			i |= 2;
			break;
		
		case Y:
			i |= 4;
			break;
			
		case Z:
			i |= 6;
		}
			
		return i;
		}
	@Override
	public ItemStack getSilkTouchDrop(IBlockState state){
		return new ItemStack(Item.getItemFromBlock(this), 1, ((TreeHandler.EnumType)state.getValue(VARIANT)).getMeta());
	}
	
	
	
	@Override
	protected BlockStateContainer createBlockState() {
		return new BlockStateContainer(this, new IProperty[] {VARIANT,LOG_AXIS});
	}
	
	@Override
	public String getSpecialName(ItemStack stack) {
		return TreeHandler.EnumType.values()[stack.getItemDamage()].getName();
	}
    
    @Override
	public void registerModels() {
		for(int i = 0; i < TreeHandler.EnumType.values().length; i++) {
			
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i, "log_" +TreeHandler.EnumType.values()[i].getName(), "inventory");
		}
		
	}
}