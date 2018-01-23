package quantum.st.init;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSlab;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.item.ItemBlock;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.common.util.EnumHelper;
import quantum.st.objects.armour.ArmourBase;
import quantum.st.objects.items.ItemBase;
import quantum.st.objects.items.ItemBows;
import quantum.st.objects.items.ItemEnderPearl;
import quantum.st.objects.items.ItemFoods;
import quantum.st.objects.tools.ToolAxe;
import quantum.st.objects.tools.ToolHoe;
import quantum.st.objects.tools.ToolPickaxe;
import quantum.st.objects.tools.ToolShovel;
import quantum.st.objects.tools.ToolSword;
import quantum.st.util.Reference;

public class ItemInit {

	public static final List<Item> ITEMS = new ArrayList<Item>();//BlockTNT
	
	//Material ItemEnderPearl
	public static final ToolMaterial TOOL_BIRON = EnumHelper.addToolMaterial("tool_biron", 2, 300, 7.5F, 3.5F, 17);
	public static final ArmorMaterial ARMOR_BIRON = EnumHelper.addArmorMaterial("armor_biron", Reference.MODID + ":qiron", 15, new int[] {2,5,6,2}, 9, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ToolMaterial TOOL_QIRON = EnumHelper.addToolMaterial("tool_qiron", 2, 250, 6.5F, 2.5F, 13);
	public static final ArmorMaterial ARMOR_QIRON = EnumHelper.addArmorMaterial("armor_qiron", Reference.MODID + ":airon", 15, new int[] {3,6,7,3}, 10, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 0.0F);
	public static final ToolMaterial TOOL_GHOST = EnumHelper.addToolMaterial("tool_ghost", 2, 250, 6.5F, 20F, 13);
	
	//Items
	public static final Item INGOT_QUANTUM = new ItemBase("ingot_quantum");
	public static final Item INGOT_BANTUM = new ItemBase("ingot_bantum");
	public static final Item SOUL_INGOT = new ItemBase("soul_ingot");
	public static final Item SOUL_SHARD = new ItemBase("soul_shard");
	public static final Item SOUL_DUST = new ItemBase("soul_dust");
	public static final Item BONE = new ItemBase("bone");
	public static final Item ROTTEN_FLESH = new ItemFoods("rotten_flesh", 6, 10, false).setPotionEffect(new PotionEffect(MobEffects.SATURATION, 500), 70);
	public static final Item SPIDER_EYE = new ItemFoods("spider_eye", 7, 9, false).setPotionEffect(new PotionEffect(MobEffects.REGENERATION, 500), 50);
	public static final Item ENDER_PEARL = new ItemEnderPearl("ender_pearl");
	public static final Item GUNPOWDER = new ItemBase("gunpowder");
	public static final Item STRING = new ItemBase("string");
	
	//Tools
	public static final Item AXE_QIRON = new ToolAxe("axe_qiron", TOOL_QIRON);
	public static final Item HOE_QIRON = new ToolHoe("hoe_qiron", TOOL_QIRON);
	public static final Item PICKAXE_QIRON = new ToolPickaxe("pickaxe_qiron", TOOL_QIRON);
	public static final Item SHOVEL_QIRON = new ToolShovel("shovel_qiron", TOOL_QIRON);
	public static final Item SWORD_QIRON = new ToolSword("sword_qiron", TOOL_QIRON);
	public static final Item AXE_AIRON = new ToolAxe("axe_biron", TOOL_BIRON);
	public static final Item HOE_AIRON = new ToolHoe("hoe_biron", TOOL_BIRON);
	public static final Item PICKAXE_AIRON = new ToolPickaxe("pickaxe_biron", TOOL_BIRON);
	public static final Item SHOVEL_AIRON = new ToolShovel("shovel_biron", TOOL_BIRON);
	public static final Item SWORD_BIRON = new ToolSword("sword_biron", TOOL_BIRON);
	public static final Item SWORD_GHOST = new ToolSword("sword_ghost", TOOL_GHOST);
	public static final Item BOW = new ItemBows("bow");
	
	
	
	//Armour
	public static final Item HELMET_QIRON = new ArmourBase("helmet_qiron", ARMOR_QIRON, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_QIRON = new ArmourBase("chestplate_qiron", ARMOR_QIRON, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_QIRON = new ArmourBase("leggings_qiron", ARMOR_QIRON, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_QIRON = new ArmourBase("boots_qiron", ARMOR_QIRON, 1, EntityEquipmentSlot.FEET);
	public static final Item HELMET_AIRON = new ArmourBase("helmet_biron", ARMOR_BIRON, 1, EntityEquipmentSlot.HEAD);
	public static final Item CHESTPLATE_AIRON = new ArmourBase("chestplate_biron", ARMOR_BIRON, 1, EntityEquipmentSlot.CHEST);
	public static final Item LEGGINGS_AIRON = new ArmourBase("leggings_biron", ARMOR_BIRON, 2, EntityEquipmentSlot.LEGS);
	public static final Item BOOTS_AIRON = new ArmourBase("boots_biron", ARMOR_BIRON, 1, EntityEquipmentSlot.FEET);
	
	
	
	
	

}
