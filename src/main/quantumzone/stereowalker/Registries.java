package quantumzone.stereowalker;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemSlab;
import net.minecraft.potion.Potion;
import net.minecraft.world.WorldType;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import quantumzone.stereowalker.capabilities.Capabilities;
import quantumzone.stereowalker.client.render.MainRenderer;
import quantumzone.stereowalker.commands.CommandDimensionTeleport;
import quantumzone.stereowalker.init.Bio;
import quantumzone.stereowalker.init.Blk;
import quantumzone.stereowalker.init.Ent;
import quantumzone.stereowalker.init.FluidsInit.ModFluid;
import quantumzone.stereowalker.init.ItemBlockInit;
import quantumzone.stereowalker.init.Itm;
import quantumzone.stereowalker.potion.PotionFreeze;
import quantumzone.stereowalker.potion.PotionList;
import quantumzone.stereowalker.tileentity.TileEntityMiner;
import quantumzone.stereowalker.util.Reference;
import quantumzone.stereowalker.util.gui.GuiHandler;
import quantumzone.stereowalker.util.handlers.OreDictionaryHandler;
import quantumzone.stereowalker.util.handlers.SoundHandler;
import quantumzone.stereowalker.util.interfaces.IHasModel;
import quantumzone.stereowalker.world.dimensions.DimensionsManager;
import quantumzone.stereowalker.world.gen.WorldGenCustomOres;
import quantumzone.stereowalker.world.gen.structures.StructureBlueStonePieces;
import quantumzone.stereowalker.world.types.WorldTypeInfection;
import quantumzone.stereowalker.world.types.WorldTypeQuantum;

@EventBusSubscriber
public class Registries {
	public static final Potion FREEZE_POTION = new PotionFreeze();
	@SubscribeEvent
	public static void onBlockRegister(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(Blk.BLOCKS.toArray(new Block [0]));
	}
	@SubscribeEvent
	public static void onItemRegister(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(Itm.ITEMS.toArray(new Item [0]));
	}
	
	@SubscribeEvent
	public static void onItemBlockRegister(RegistryEvent.Register<Item> event){
		event.getRegistry().registerAll(ItemBlockInit.ITEMBLOCKS.toArray(new ItemSlab [0]));
	}
	
	
	@SubscribeEvent
	public static void onModelRegister(ModelRegistryEvent event) {
		for(Block block : Blk.BLOCKS) {
			if(block instanceof IHasModel) {
				((IHasModel)block).registerModels();
			}
		}
		
		for(Item item : Itm.ITEMS) {
			if(item instanceof IHasModel) {
				((IHasModel)item).registerModels();
			}
		}
		
		
		for(ItemBlock block : ItemBlockInit.ITEMBLOCKS) {
			if(block instanceof IHasModel) {
				((IHasModel)block).registerModels();
			}
		}
	}
	
	public static void preInitRegistries() {
		FluidRegistry.registerFluid(ModFluid.ACID);
		GameRegistry.registerWorldGenerator(new WorldGenCustomOres(), 0);
		//GameRegistry.registerWorldGenerator(new WorldGenCustomTrees(), 0);
		//GameRegistry.registerWorldGenerator(new WorldGenCustomStructures(), 0);
		Bio.registerBiomes();
		Ent.registerEntities();
		Ent.addSpawns();
		MainRenderer.registerEntityRenders();
		Recipies.registerSmelting();
		GameRegistry.registerTileEntity(TileEntityMiner.class, Reference.MODID + ":miner");
		NetworkRegistry.INSTANCE.registerGuiHandler(Main.instance, new GuiHandler());
		ForgeRegistries.POTIONS.register(FREEZE_POTION);
		PotionList.registerPotionTypes();
		Capabilities.registerCapabilities();
		StructureBlueStonePieces.registerNetherFortressPieces();
	}
	
	public static void initRegistries() {
		SoundHandler.registerSounds();
		OreDictionaryHandler.registerOreDictionary();
		DimensionsManager.MainRegistry();
	}
	
	public static void postInitRegistries() {
		WorldType INFECTION = new WorldTypeInfection();
		WorldType QUANTUM = new WorldTypeQuantum();
		Recipies.registerSmelting();
	}
	
	public static void serverRegistries(FMLServerStartingEvent event) {
		event.registerServerCommand(new CommandDimensionTeleport());
	}

}
