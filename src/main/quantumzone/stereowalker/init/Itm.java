package quantumzone.stereowalker.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.Blocks;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import quantumzone.stereowalker.items.ItemAppleSilver;
import quantumzone.stereowalker.items.ItemBase;
import quantumzone.stereowalker.items.ItemBows;
import quantumzone.stereowalker.items.ItemCanned;
import quantumzone.stereowalker.items.ItemEnderPearl;
import quantumzone.stereowalker.items.ItemSeed;
import quantumzone.stereowalker.items.ItemFoods;
import quantumzone.stereowalker.items.ItemLighter;
import quantumzone.stereowalker.items.ItemLighterBlue;
import quantumzone.stereowalker.items.ItemSwapable;
import quantumzone.stereowalker.items.armour.ArmourBase;
import quantumzone.stereowalker.items.cheats.ItemGodBow;
import quantumzone.stereowalker.items.cheats.SOI;
import quantumzone.stereowalker.items.cheats.SOJ;
import quantumzone.stereowalker.items.cheats.SOL;
import quantumzone.stereowalker.items.cheats.SOS;
import quantumzone.stereowalker.items.cheats.SOV;
import quantumzone.stereowalker.items.tools.ToolAxe;
import quantumzone.stereowalker.items.tools.ToolAxe2;
import quantumzone.stereowalker.items.tools.ToolHoe;
import quantumzone.stereowalker.items.tools.ToolHoe2;
import quantumzone.stereowalker.items.tools.ToolPickaxe;
import quantumzone.stereowalker.items.tools.ToolPickaxe2;
import quantumzone.stereowalker.items.tools.ToolSilverAxe;
import quantumzone.stereowalker.items.tools.ToolSilverHoe;
import quantumzone.stereowalker.items.tools.ToolSilverPickaxe;
import quantumzone.stereowalker.items.tools.ToolSilverSpade;
import quantumzone.stereowalker.items.tools.ToolSilverSword;
import quantumzone.stereowalker.items.tools.ToolSpade;
import quantumzone.stereowalker.items.tools.ToolSpade2;
import quantumzone.stereowalker.items.tools.ToolSword;
import quantumzone.stereowalker.items.tools.ToolSword2;
import quantumzone.stereowalker.items.tools.ToolWarAxe;
import quantumzone.stereowalker.util.Reference;
import quantumzone.stereowalker.util.handlers.materials.ToolMaterials1;
import quantumzone.stereowalker.util.handlers.materials.ToolMaterials2;
import quantumzone.stereowalker.util.handlers.materials.ToolMaterialsSilver;

public class Itm {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//Material ItemEnderPearl
	public static final ArmorMaterial BANTUM = EnumHelper.addArmorMaterial("bantum", Reference.MODID + ":qiron", 15, new int[] {2,5,6,2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial QUANTUM = EnumHelper.addArmorMaterial("quantum", Reference.MODID + ":airon", 15, new int[] {3,6,7,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ArmorMaterial PLATINUM = EnumHelper.addArmorMaterial("platinum", Reference.MODID + ":platinum", 40, new int[] {4,7,9,4}, 8, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial BRONZE = EnumHelper.addArmorMaterial("bronze", Reference.MODID + ":bronze", 15, new int[]{2, 4, 4, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial COPPER = EnumHelper.addArmorMaterial("copper", Reference.MODID + ":copper", 14, new int[]{2, 5, 5, 2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial INVAR = EnumHelper.addArmorMaterial("invar", Reference.MODID + ":invar", 17, new int[]{3, 6, 7, 3}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial SILVER = EnumHelper.addArmorMaterial("silver", Reference.MODID + ":silver", 7, new int[]{1, 3, 5, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	public static final ArmorMaterial STEEL = EnumHelper.addArmorMaterial("steel", Reference.MODID + ":steel", 7, new int[]{3, 6, 7, 3}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 2.0F);
	
	
	
	/**Quantum Ingot**/
	public static final Item INGOT_QUANTUM = new ItemBase("quantum_ingot");
	/**Quantum Ingot**/
	public static final Item INGOT_BANTUM = new ItemBase("bantum_ingot");
	/**Quantum Ingot**/
	public static final Item SOUL_INGOT = new ItemBase("soul_ingot");
	/**Quantum Ingot**/
	public static final Item INGOT_SILVER = new ItemBase("silver_ingot");
	/**Quantum Ingot**/
	public static final Item INGOT_BRONZE = new ItemBase("bronze_ingot");
	/**Quantum Ingot**/
	public static final Item INGOT_COPPER = new ItemBase("copper_ingot");
	/**Quantum Ingot**/
	public static final Item INGOT_ELECTRUM = new ItemBase("electrum_ingot");
	/**Quantum Ingot**/
	public static final Item INGOT_INVAR = new ItemBase("invar_ingot");
	/**Quantum Ingot**/
	public static final Item INGOT_LEAD = new ItemBase("lead_ingot");
	/**Quantum Ingot**/
	public static final Item INGOT_NICKEL = new ItemBase("nickel_ingot");
	/**Quantum Ingot**/
	public static final Item INGOT_PLATINUM = new ItemBase("platinum_ingot");
	/**Tin Ingot**/
	public static final Item INGOT_TIN = new ItemBase("tin_ingot");
	/**Steel Ingot**/
	public static final Item INGOT_STEEL = new ItemBase("steel_ingot");
	
	//Items
	public static final Item NUGGET_TIN = new ItemBase("tin_nugget");
	public static final Item SOUL_SHARD = new ItemBase("soul_shard");
	public static final Item SOUL_DUST = new ItemBase("soul_dust");
	public static final Item BONE = new ItemBase("bone");
	public static final Item ROTTEN_FLESH = new ItemFoods("rotten_flesh", 6, 10, false).setPotionEffect(new PotionEffect(MobEffects.SATURATION, 500), 70);
	public static final Item SPIDER_EYE = new ItemFoods("spider_eye", 7, 9, false).setPotionEffect(new PotionEffect(MobEffects.REGENERATION, 500), 50);
	public static final Item ENDER_PEARL = new ItemEnderPearl("ender_pearl");
	public static final Item GUNPOWDER = new ItemBase("gunpowder");
	public static final Item STRING = new ItemBase("string");
	public static final Item CORN = new ItemFoods("corn", 0, 0, false);
	public static final Item CORN_SEED = new ItemSeed("corn_seed"/*, Blk.CORN, Blocks.FARMLAND*/);
	public static final Item LIGHTER = new ItemLighter("lighter_open");
	public static final Item LIGHTERX = new ItemSwapable("lighter", new ItemStack(Itm.LIGHTER));
	public static final Item LIGHTERAD = new ItemLighterBlue("lighter_advanced_open");
	public static final Item LIGHTERADX = new ItemSwapable("lighter_advanced", new ItemStack(Itm.LIGHTERAD));
	//public static final Item COIN = new ItemBase("coin");
	public static final Item RUBY = new ItemBase("ruby");
	public static final Item TRINKET = new ItemBase("trinket");
	public static final Item SILVER_APPLE = new ItemAppleSilver("silver_apple", 3, 3, false);
	public static final Item HEART = new ItemFoods("brute_heart", 10, 10, false).setPotionEffect(new PotionEffect(MobEffects.POISON, 500), 500).setPotionEffect(new PotionEffect(MobEffects.STRENGTH, 500), 500);
	
	public static final Item CAN = new ItemBase("can");
	public static final Item CAN_BEEF = new ItemCanned("can_beef", 27);
	public static final Item CAN_PORK = new ItemCanned("can_porkchop", 27);
	public static final Item CAN_MUTTON = new ItemCanned("can_mutton", 18);
	public static final Item CAN_RABBIT = new ItemCanned("can_rabbit", 27);
	public static final Item CAN_CHICKEN = new ItemCanned("can_chicken", 18).setPotionEffect(new PotionEffect(MobEffects.HUNGER, 600, 0), 0.1F);
	public static final Item CAN_ROAST_BEEF = new ItemCanned("can_cooked_beef", 72);
	public static final Item CAN_ROAST_PORK = new ItemCanned("can_cooked_porkchop", 72);
	public static final Item CAN_ROAST_MUTTON = new ItemCanned("can_cooked_mutton", 45);
	public static final Item CAN_ROAST_RABBIT = new ItemCanned("can_cooked_rabbit", 45);
	public static final Item CAN_ROAST_CHICKEN = new ItemCanned("can_cooked_chicken", 36);
	
	//Tools
	public static final Item QUANTUM_AXE = new ToolAxe("quantum_axe", (ToolMaterials1.QUANTUM));
	public static final Item QUANTUM_HOE = new ToolHoe("quantum_hoe", (ToolMaterials1.QUANTUM));
	public static final Item QUANTUM_PICKAXE = new ToolPickaxe("quantum_pickaxe", (ToolMaterials1.QUANTUM));
	public static final Item QUANTUM_SHOVEL = new ToolSpade("quantum_shovel", (ToolMaterials1.QUANTUM));
	public static final Item QUANTUM_SWORD = new ToolSword("quantum_sword", (ToolMaterials1.QUANTUM));
	
	public static final Item BANTUM_AXE = new ToolAxe("bantum_axe", (ToolMaterials1.BANTUM));
	public static final Item BANTUM_HOE = new ToolHoe("bantum_hoe", (ToolMaterials1.BANTUM));
	public static final Item BANTUM_PICKAXE = new ToolPickaxe("bantum_pickaxe", (ToolMaterials1.BANTUM));
	public static final Item BANTUM_SHOVEL = new ToolSpade("bantum_shovel", (ToolMaterials1.BANTUM));
	public static final Item BANTUM_SWORD = new ToolSword("bantum_sword", (ToolMaterials1.BANTUM));
	
	public static final Item PLATINUM_AXE = new ToolAxe("platinum_axe", (ToolMaterials1.PLATINUM));
	public static final Item PLATINUM_HOE = new ToolHoe("platinum_hoe", (ToolMaterials1.PLATINUM));
	public static final Item PLATINUM_PICKAXE = new ToolPickaxe("platinum_pickaxe", (ToolMaterials1.PLATINUM));
	public static final Item PLATINUM_SHOVEL = new ToolSpade("platinum_shovel", (ToolMaterials1.PLATINUM));
	public static final Item PLATINUM_SWORD = new ToolSword("platinum_sword", (ToolMaterials1.PLATINUM));
	
	public static final Item BRONZE_AXE = new ToolAxe2("bronze_axe", (ToolMaterials2.BRONZE));
	public static final Item BRONZE_HOE = new ToolHoe2("bronze_hoe", (ToolMaterials2.BRONZE));
	public static final Item BRONZE_PICKAXE = new ToolPickaxe2("bronze_pickaxe", (ToolMaterials2.BRONZE));
	public static final Item BRONZE_SHOVEL = new ToolSpade2("bronze_shovel", (ToolMaterials2.BRONZE));
	public static final Item BRONZE_SWORD = new ToolSword2("bronze_sword", (ToolMaterials2.BRONZE));
	
	public static final Item COPPER_AXE = new ToolAxe2("copper_axe", (ToolMaterials2.COPPER));
	public static final Item COPPER_HOE = new ToolHoe2("copper_hoe", (ToolMaterials2.COPPER));
	public static final Item COPPER_PICKAXE = new ToolPickaxe2("copper_pickaxe", (ToolMaterials2.COPPER));
	public static final Item COPPER_SHOVEL = new ToolSpade2("copper_shovel", (ToolMaterials2.COPPER));
	public static final Item COPPER_SWORD = new ToolSword2("copper_sword", (ToolMaterials2.COPPER));
	
	public static final Item INVAR_AXE = new ToolAxe2("invar_axe", (ToolMaterials2.INVAR));
	public static final Item INVAR_HOE = new ToolHoe2("invar_hoe", (ToolMaterials2.INVAR));
	public static final Item INVAR_PICKAXE = new ToolPickaxe2("invar_pickaxe", (ToolMaterials2.INVAR));
	public static final Item INVAR_SHOVEL = new ToolSpade2("invar_shovel", (ToolMaterials2.INVAR));
	public static final Item INVAR_SWORD = new ToolSword2("invar_sword", (ToolMaterials2.INVAR));
	
	public static final Item STEEL_AXE = new ToolAxe2("steel_axe", (ToolMaterials2.STEEL));
	public static final Item STEEL_HOE = new ToolHoe2("steel_hoe", (ToolMaterials2.STEEL));
	public static final Item STEEL_PICKAXE = new ToolPickaxe2("steel_pickaxe", (ToolMaterials2.STEEL));
	public static final Item STEEL_SHOVEL = new ToolSpade2("steel_shovel", (ToolMaterials2.STEEL));
	public static final Item STEEL_SWORD = new ToolSword2("steel_sword", (ToolMaterials2.STEEL));
	
	public static final Item SILVER_AXE = new ToolSilverAxe("silver_axe", (ToolMaterialsSilver.SILVER));
	public static final Item SILVER_HOE = new ToolSilverHoe("silver_hoe", (ToolMaterialsSilver.SILVER));
	public static final Item SILVER_PICKAXE = new ToolSilverPickaxe("silver_pickaxe", (ToolMaterialsSilver.SILVER));
	public static final Item SILVER_SHOVEL = new ToolSilverSpade("silver_shovel", (ToolMaterialsSilver.SILVER));
	public static final Item SILVER_SWORD = new ToolSilverSword("silver_sword", (ToolMaterialsSilver.SILVER));

	public static final Item IRON_WARAXE = new ToolWarAxe("iron_waraxe", (ToolMaterial.IRON));
	
	public static final Item GHOST_SWORD = new ToolSword("ghost_sword", (ToolMaterials1.GHOST));
	public static final Item SWORD_S = new SOS("god_sword_speed");
	public static final Item SWORD_J = new SOJ("god_sword_jump");
	public static final Item SWORD_L = new SOL("god_sword_levitation");
	public static final Item SWORD_V = new SOV("god_sword_vision");
	public static final Item SWORD_I = new SOI("god_sword_invisibility");
	public static final Item GHOST_PICKAXE = new ToolPickaxe("ghost_pickaxe", (ToolMaterials1.GHOST));
	
	public static final Item BOW = new ItemBows("bow");
	public static final Item GBOW = new ItemGodBow("god_bow");
	//public static final ItemSlab QUANTUM_SLAB = (ItemSlab) new ItemSlab(BlockInit.QUANTUM_SLAB, BlockInit.QUANTUM_SLAB, BlockInit.QUANTUM_DOUBLE_SLAB).setRegistryName("quantum_slab");
	
	
	
	//Armour
	public static final Item HELMET_QIRON = new ArmourBase("quantum_helmet", QUANTUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_QIRON = new ArmourBase("quantum_chestplate", QUANTUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_QIRON = new ArmourBase("quantum_leggings", QUANTUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_QIRON = new ArmourBase("quantum_boots", QUANTUM, 1, EntityEquipmentSlot.FEET);
	
	public static final Item HELMET_AIRON = new ArmourBase("bantum_helmet", BANTUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_AIRON = new ArmourBase("bantum_chestplate", BANTUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_AIRON = new ArmourBase("bantum_leggings", BANTUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_AIRON = new ArmourBase("bantum_boots", BANTUM, 1, EntityEquipmentSlot.FEET);
	
	public static final Item PLATINUM_HELMET = new ArmourBase("platinum_helmet", PLATINUM, 1, EntityEquipmentSlot.HEAD);
	public static final Item PLATINUM_CHESTPLATE = new ArmourBase("platinum_chestplate", PLATINUM, 1, EntityEquipmentSlot.CHEST);
	public static final Item PLATINUM_LEGGINGS = new ArmourBase("platinum_leggings", PLATINUM, 2, EntityEquipmentSlot.LEGS);
	public static final Item PLATINUM_BOOTS = new ArmourBase("platinum_boots", PLATINUM, 1, EntityEquipmentSlot.FEET);
	
	public static final Item BRONZE_HELMET = new ArmourBase("bronze_helmet", BRONZE, 1, EntityEquipmentSlot.HEAD);
	public static final Item BRONZE_CHESTPLATE = new ArmourBase("bronze_chestplate", BRONZE, 1, EntityEquipmentSlot.CHEST);
	public static final Item BRONZE_LEGGINGS = new ArmourBase("bronze_leggings", BRONZE, 2, EntityEquipmentSlot.LEGS);
	public static final Item BRONZE_BOOTS = new ArmourBase("bronze_boots", BRONZE, 1, EntityEquipmentSlot.FEET);
	
	public static final Item COPPER_HELMET = new ArmourBase("copper_helmet", COPPER, 1, EntityEquipmentSlot.HEAD);
	public static final Item COPPER_CHESTPLATE = new ArmourBase("copper_chestplate", COPPER, 1, EntityEquipmentSlot.CHEST);
	public static final Item COPPER_LEGGINGS = new ArmourBase("copper_leggings", COPPER, 2, EntityEquipmentSlot.LEGS);
	public static final Item COPPER_BOOTS = new ArmourBase("copper_boots", COPPER, 1, EntityEquipmentSlot.FEET);
	
	public static final Item INVAR_HELMET = new ArmourBase("invar_helmet", INVAR, 1, EntityEquipmentSlot.HEAD);
	public static final Item INVAR_CHESTPLATE = new ArmourBase("invar_chestplate", INVAR, 1, EntityEquipmentSlot.CHEST);
	public static final Item INVAR_LEGGINGS = new ArmourBase("invar_leggings", INVAR, 2, EntityEquipmentSlot.LEGS);
	public static final Item INVAR_BOOTS = new ArmourBase("invar_boots", INVAR, 1, EntityEquipmentSlot.FEET);
	
	public static final Item SILVER_HELMET = new ArmourBase("silver_helmet", SILVER, 1, EntityEquipmentSlot.HEAD);
	public static final Item SILVER_CHESTPLATE = new ArmourBase("silver_chestplate", SILVER, 1, EntityEquipmentSlot.CHEST);
	public static final Item SILVER_LEGGINGS = new ArmourBase("silver_leggings", SILVER, 2, EntityEquipmentSlot.LEGS);
	public static final Item SILVER_BOOTS = new ArmourBase("silver_boots", SILVER, 1, EntityEquipmentSlot.FEET);
	
	public static final Item STEEL_HELMET = new ArmourBase("steel_helmet", STEEL, 1, EntityEquipmentSlot.HEAD);
	public static final Item STEEL_CHESTPLATE = new ArmourBase("steel_chestplate", STEEL, 1, EntityEquipmentSlot.CHEST);
	public static final Item STEEL_LEGGINGS = new ArmourBase("steel_leggings", STEEL, 2, EntityEquipmentSlot.LEGS);
	public static final Item STEEL_BOOTS = new ArmourBase("steel_boots", STEEL, 1, EntityEquipmentSlot.FEET);
	
	
	
	
	

}
