package quantum.st.objects.blocks;

import net.minecraft.block.BlockFence;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import quantum.st.Main;
import quantum.st.init.BlockInit;
import quantum.st.init.ItemInit;
import quantum.st.util.interfaces.IHasModel;

public class BlockFences extends BlockFence implements IHasModel{

	public BlockFences(String name) {
		super(Material.WOOD, Material.WOOD.getMaterialMapColor());
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.tabQuantum);
		this.useNeighborBrightness = true;
		
		BlockInit.BLOCKS.add(this);
		ItemInit.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}

}
