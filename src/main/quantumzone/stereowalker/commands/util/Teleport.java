package quantumzone.stereowalker.commands.util;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldServer;

public class Teleport extends Teleporter{
	private final WorldServer world;
	private double x,y,z;

	public Teleport(WorldServer world, double x, double y, double z) {
		super(world);
		this.world = world;
		this.x = x;
		this.y = y;
		this.z = z;		
	}

	@Override
	public void placeInPortal(Entity entity, float rotationYaw) {
		this.world.getBlockState(new BlockPos((int)this.x,(int)this.y,(int)this.z));
		entity.setPosition(x,y,z);
		entity.motionX = 0F;
		entity.motionY = 0F;
		entity.motionZ = 0F;
	}
	
	public static void teleportToDimension(EntityPlayer player, int dim, double x, double y, double z) {
		int aldim = player.getEntityWorld().provider.getDimension();
		EntityPlayerMP playermp = (EntityPlayerMP)player;
		MinecraftServer server = player.getEntityWorld().getMinecraftServer();
		WorldServer wserver = server.getWorld(dim);
		
		if(wserver == null || server == null)throw new IllegalArgumentException("Dimension " + dim + " does not exist");
		wserver.getMinecraftServer().getPlayerList().transferPlayerToDimension(playermp, dim, new Teleport(wserver, x, y, z));
		player.setPositionAndUpdate(x, y, z);
	}
}
