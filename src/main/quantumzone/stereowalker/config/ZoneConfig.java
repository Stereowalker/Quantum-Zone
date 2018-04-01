package quantumzone.stereowalker.config;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.common.config.Property;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.eventhandler.EventPriority;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import quantumzone.stereowalker.util.Reference;

public class ZoneConfig {
	
	/**
	 * The object which holds the actual config file
	 */
	private static Configuration config = null;
	
	/**
	 * The name of the category for our blocks
	 */
	public static final String CATEGORY_NAME_BLOCKS = "blocks";
	
	/**
	 * The values which are loaded from the config file
	 */
	public static int machineCooldownBasic;
	public static int machineCooldownAdvanced;
	
	/**
	 * Called on the server and the client setting up the config file
	 */
	public static void preInit() {
		File configFile = new File(Loader.instance().getConfigDir(), "QuantumZone.cfg");
		config = new Configuration(configFile);
		syncFromFiles();
	}
	
	/**
	 * Receive the config object for use in the gui factory
	 * @return the config element
	 */
	public static Configuration getConfig() {
		return config;
	}
	
	/**
	 * Register our event which handles the gui factory saving the config
	 */
	public static void clientPreInit() {
		MinecraftForge.EVENT_BUS.register(new ConfigEventHandler());
	}
	
	/**
	 * Sync the config from a change in the file
	 */
	public static void syncFromFiles() {
		syncConfig(true, true);
	}
	
	/**
	 * Sync the config from a change in the gui
	 */
	public static void syncFromGui() {
		syncConfig(false, true);
	}
	
	/**
	 * Sync the config from a change in the fields (i.e changing the machineCooldownBasic property using BoeConfig.machineCooldownBasic = ...)
	 */
	public static void syncFromFields() {
		syncConfig(false, false);
	}
	
	/**
	 * Used internally to sync all of our properties and fields
	 * @param loadFromConfigFile Should load the actual config file?
	 * @param readFieldsFromConfig Should read the values from the config?
	 */
	private static void syncConfig(boolean loadFromConfigFile, boolean readFieldsFromConfig) {
		if(loadFromConfigFile)
			config.load();
		
		
		Property propertyMachineCooldownAdvanced = config.get(CATEGORY_NAME_BLOCKS, "machine_cooldown_advanced", 50);
		propertyMachineCooldownAdvanced.setLanguageKey("gui.config.blocks.machine_cooldown_advanced.name");
		propertyMachineCooldownAdvanced.setComment("The cooldown for the advanced tier of machine");
		propertyMachineCooldownAdvanced.setMinValue(10);
		propertyMachineCooldownAdvanced.setMaxValue(200);
		
		List<String> propertyOrderBlocks = new ArrayList<String>();
		propertyOrderBlocks.add(propertyMachineCooldownAdvanced.getName());
		config.setCategoryPropertyOrder(CATEGORY_NAME_BLOCKS, propertyOrderBlocks);
		
		if(readFieldsFromConfig) {
			machineCooldownAdvanced = propertyMachineCooldownAdvanced.getInt();
		}
		
		propertyMachineCooldownAdvanced.set(machineCooldownAdvanced);
		
		if(config.hasChanged())
			config.save();
	}
	
	/**
	 * Handles the updating of the config from the gui factory
	 * @author Stereowalker
	 *
	 */
	public static class ConfigEventHandler {
		
		/**
		 * Syncs the update from the gui factory
		 */
		@SubscribeEvent(priority = EventPriority.LOWEST)
		public void onEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
			if(event.getModID().equals(Reference.MODID)) {
				syncFromGui();
			}
		}
		
	}

}