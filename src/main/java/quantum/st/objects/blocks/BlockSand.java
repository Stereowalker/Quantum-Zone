package quantum.st.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockFalling;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyEnum;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import quantum.st.Main;
import quantum.st.init.BlockInit;
import quantum.st.init.ItemInit;
import quantum.st.util.handlers.EnumHandler;
import quantum.st.util.handlers.SandHandler;
import quantum.st.util.handlers.TreeHandler;
import quantum.st.util.interfaces.IHasModel;
import quantum.st.util.interfaces.IMetaName;

public class BlockSand extends BlockFalling implements IHasModel, IMetaName
{
    public static final PropertyEnum<SandHandler.EnumType> VARIANT = PropertyEnum.<SandHandler.EnumType>create("variant", SandHandler.EnumType.class);

    public BlockSand(String name)
    {
        this.setDefaultState(this.blockState.getBaseState().withProperty(VARIANT, SandHandler.EnumType.WHITE));
        setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabQuantum);
		setSoundType(SoundType.SAND);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
    }

    /**
     * Gets the metadata of the item this Block can drop. This method is called when the block gets destroyed. It
     * returns the metadata of the dropped item based on the old metadata of the block.
     */
    public int damageDropped(IBlockState state)
    {
        return ((SandHandler.EnumType)state.getValue(VARIANT)).getMeta();
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    public void getSubBlocks(CreativeTabs itemIn, NonNullList<ItemStack> items)
    {
        for (SandHandler.EnumType blocksand$enumtype : SandHandler.EnumType.values())
        {
            items.add(new ItemStack(this, 1, blocksand$enumtype.getMeta()));
        }
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    public IBlockState getStateFromMeta(int meta)
    {
        return this.getDefaultState().withProperty(VARIANT, SandHandler.EnumType.byMetadata(meta));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    public int getMetaFromState(IBlockState state)
    {
        return ((SandHandler.EnumType)state.getValue(VARIANT)).getMeta();
    }

    protected BlockStateContainer createBlockState()
    {
        return new BlockStateContainer(this, new IProperty[] {VARIANT});
    }

    @SideOnly(Side.CLIENT)
    public int getDustColor(IBlockState state)
    {
        SandHandler.EnumType blocksand$enumtype = (SandHandler.EnumType)state.getValue(VARIANT);
        return blocksand$enumtype.getDustColor();
    }
    
    @Override
	public void registerModels() {
		for(int i = 0; i < SandHandler.EnumType.values().length; i++) {
			
			Main.proxy.registerVariantRenderer(Item.getItemFromBlock(this), i,SandHandler.EnumType.values()[i].getName() + "_sand", "inventory");
		}
    }
    
    @Override
	public String getSpecialName(ItemStack stack) {
		return SandHandler.EnumType.values()[stack.getItemDamage()].getName();
	}
}    