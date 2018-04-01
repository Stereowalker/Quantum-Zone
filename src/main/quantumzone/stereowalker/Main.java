package quantumzone.stereowalker;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialLiquid;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import quantumzone.stereowalker.init.Blk;
import quantumzone.stereowalker.init.Itm;
import quantumzone.stereowalker.proxy.CommonProxy;
import quantumzone.stereowalker.util.Reference;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class Main 
{

	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT, serverSide = Reference.COMMON)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void preInit(FMLPreInitializationEvent event) {Registries.preInitRegistries();}
	@EventHandler
	public static void Init(FMLInitializationEvent event) {Registries.initRegistries();}
	@EventHandler
	public static void postInit(FMLPostInitializationEvent event) {Registries.postInitRegistries();}
	@EventHandler
	public static void serverInit(FMLServerStartingEvent event) {Registries.serverRegistries(event);}
	
	public static CreativeTabs tabQuantum = new CreativeTabs("tab_quantum") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Blk.QUANTEX);
		}
	};
	
	public static CreativeTabs tabQuantumItem = new CreativeTabs("tab_quantum_items") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Itm.INGOT_QUANTUM);
		}
	};
	
	public static CreativeTabs tabQuantumTools = new CreativeTabs("tab_quantum_tools") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Itm.QUANTUM_AXE);
		}
	};
	
	public static CreativeTabs tabQuantumCombat = new CreativeTabs("tab_quantum_combat") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Itm.QUANTUM_SWORD);
		}
	};
	
	public static CreativeTabs tabQuantumFood = new CreativeTabs("tab_quantum_food") {
		@Override
		public ItemStack getTabIconItem() {
			return new ItemStack(Itm.CAN_ROAST_BEEF);
		}
	};
	
	
	
	public static class Materials 
	{
	    public static final Material ACID = new MaterialLiquid(
	        MapColor.GREEN_STAINED_HARDENED_CLAY);
	}
 
}	

