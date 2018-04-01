package quantumzone.stereowalker.util.gui;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import quantumzone.stereowalker.container.ContainerMiner;
import quantumzone.stereowalker.tileentity.TileEntityMiner;

public class GuiHandler implements IGuiHandler {

	/**
	 * Each gui needs an ID
	 */
	public static final int MINER = 0;

	/**
	 * Should return the container for that gui. This is called server side
	 * because servers handle items in guis
	 */
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		switch (ID) {
		case MINER:
			return new ContainerMiner(player.inventory, (TileEntityMiner) world.getTileEntity(pos));
		}
		return null;
	}

	/**
	 * Should return the actual gui. This is called client side as thats where
	 * guis are rendered
	 */
	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		BlockPos pos = new BlockPos(x, y, z);
		switch (ID) {
		case MINER:
			return new GuiMiner(player.inventory, (TileEntityMiner) world.getTileEntity(pos));
		}
		return null;
	}

}