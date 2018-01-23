package quantum.st.objects.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;

public class BlockSoul extends BlockBase{

	public BlockSoul(String name) {
		super(name, Material.IRON);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}

}
