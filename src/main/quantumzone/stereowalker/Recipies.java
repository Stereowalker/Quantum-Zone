package quantumzone.stereowalker;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import quantumzone.stereowalker.init.Blk;
import quantumzone.stereowalker.init.Itm;

public class Recipies {
	public static void registerSmelting() {
		GameRegistry.addSmelting(Blk.ORE_QUANTUM, new ItemStack(Itm.INGOT_QUANTUM), 25);
		GameRegistry.addSmelting(Blk.ORE_COPPER, new ItemStack(Itm.INGOT_COPPER), 11);
		GameRegistry.addSmelting(Blk.ORE_ELECTRUM, new ItemStack(Itm.INGOT_ELECTRUM), 16);
		GameRegistry.addSmelting(Blk.ORE_LEAD, new ItemStack(Itm.INGOT_LEAD), 15);
		GameRegistry.addSmelting(Blk.ORE_NICKEL, new ItemStack(Itm.INGOT_NICKEL), 10);
		GameRegistry.addSmelting(Blk.ORE_PLATINUM, new ItemStack(Itm.INGOT_PLATINUM), 20);
		GameRegistry.addSmelting(Blk.ORE_SILVER, new ItemStack(Itm.INGOT_SILVER), 8);
		GameRegistry.addSmelting(Blk.ORE_TIN, new ItemStack(Itm.INGOT_TIN), 8);
		GameRegistry.addSmelting(Blk.SAND, new ItemStack(Blocks.GLASS), 10);
		GameRegistry.addSmelting(Blk.LOGS, new ItemStack(Items.COAL, 1, 1), 10);
		GameRegistry.addSmelting(Blk.BLUE_COBBLE, new ItemStack(Blk.BLUE_STONE, 1), 10);
		GameRegistry.addSmelting(new ItemStack(Blk.BLUE_STONE_BRICK, 1, 0), new ItemStack(Blk.BLUE_STONE_BRICK, 1, 1), 1);
		GameRegistry.addSmelting(Items.IRON_INGOT, new ItemStack(Itm.INGOT_STEEL), 10);
		GameRegistry.addSmelting(Itm.CAN_BEEF, new ItemStack(Itm.CAN_ROAST_BEEF), 0);
		GameRegistry.addSmelting(Itm.CAN_CHICKEN, new ItemStack(Itm.CAN_ROAST_CHICKEN), 0);
		GameRegistry.addSmelting(Itm.CAN_MUTTON, new ItemStack(Itm.CAN_ROAST_MUTTON), 0);
		GameRegistry.addSmelting(Itm.CAN_PORK, new ItemStack(Itm.CAN_ROAST_PORK), 0);
		GameRegistry.addSmelting(Itm.CAN_RABBIT, new ItemStack(Itm.CAN_ROAST_RABBIT), 0);
	}

}
