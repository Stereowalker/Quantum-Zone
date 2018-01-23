/*package quantum.st.objects.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import quantum.st.Main;
import quantum.st.init.BlockInit;
import quantum.st.init.ItemInit;
import quantum.st.util.handlers.TreeHandler;
import quantum.st.util.interfaces.IHasModel;

public abstract class BlockWoodSlabs extends BlockSlab implements IHasModel
{
    public static final PropertyEnum<TreeHandler.EnumType> VARIANT = PropertyEnum.<TreeHandler.EnumType>create("variant", TreeHandler.EnumType.class);

    public BlockWoodSlabs(String name)
    {
        super(Material.WOOD);
        setUnlocalizedName(name);
    	setRegistryName(name);
    	setCreativeTab(Main.tabQuantum);
    	
        IBlockState iblockstate = this.blockState.getBaseState();

        if (!this.isDouble())
        {
            iblockstate = iblockstate.withProperty(HALF, BlockSlab.EnumBlockHalf.BOTTOM);
        }

        this.setDefaultState(iblockstate.withProperty(VARIANT, TreeHandler.EnumType.QUANTUM));

    	this.useNeighborBrightness = true;
    	BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }


    /**
     * Get the Item that this Block should drop when harvested.
     */
    /*public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Item.getItemFromBlock(BlockInit.QUANTUM_SLAB);
    }

    public ItemStack getItem(World worldIn, BlockPos pos, IBlockState state)
    {
        return new ItemStack(BlockInit.QUANTUM_SLAB, 1, ((TreeHandler.EnumType)state.getValue(VARIANT)).getMeta());
    }

    /**
     * Returns the slab block name with the type associated with it
     */
    /*public String getUnlocalizedName(int meta)
    {
        return super.getUnlocalizedName() + "." + TreeHandler.EnumType.byMetadata(meta).getUnlocalizedName();
    }

    public IProperty<?> getVariantProperty()
    {
        return VARIANT;
    }

    public Comparable<?> getTypeForItem(ItemStack stack)
    {
        return TreeHandler.EnumType.byMetadata(stack.getMetadata() & 7);
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    /*public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        for (TreeHandler.EnumType TreeHandler$enumtype : TreeHandler.EnumType.values())
        {
            items.add(new ItemStack(this, 1, TreeHandler$enumtype.getMeta()));
        }
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    /*public IBlockState getStateFromMeta(int meta)
    {
        IBlockState iblockstate = this.getDefaultState().withProperty(VARIANT, TreeHandler.EnumType.byMetadata(meta & 7));

        if (!this.isDouble())
        {
            iblockstate = iblockstate.withProperty(HALF, (meta & 8) == 0 ? BlockSlab.EnumBlockHalf.BOTTOM : BlockSlab.EnumBlockHalf.TOP);
        }

        return iblockstate;
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    /*public int getMetaFromState(IBlockState state)
    {
        int i = 0;
        i = i | ((TreeHandler.EnumType)state.getValue(VARIANT)).getMeta();

        if (!this.isDouble() && state.getValue(HALF) == BlockSlab.EnumBlockHalf.TOP)
        {
            i |= 8;
        }

        return i;
    }*/

    

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    /*public int damageDropped(IBlockState state)
    {
        return ((TreeHandler.EnumType)state.getValue(VARIANT)).getMeta();
    }
    
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
	
	@SideOnly(Side.CLIENT)
    protected static boolean isHalfSlab(IBlockState state)
    {
        Block block = state.getBlock();
        return block == BlockInit.QUANTUM_SLAB;
    }
	

	
}*/