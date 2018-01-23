package quantum.st.objects.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import quantum.st.Main;
import quantum.st.init.BlockInit;
import quantum.st.init.ItemInit;
import quantum.st.util.interfaces.IHasModel;

public class BlockStair extends BlockStairs implements IHasModel{

	public BlockStair(String name, IBlockState modelState) {
		super(modelState);
		this.useNeighborBrightness = true;
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabQuantum);
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}

}
