package quantumzone.stereowalker.util.handlers.materials;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import quantumzone.stereowalker.init.Itm;

public enum ToolMaterials2
{   
    STEEL(2, 280, 6.7F, 2.3F, 15),
    
	BRONZE(2, 225, 5.4F, 1.8F, 13),
	
	COPPER(2, 202, 4.8F, 1.6F, 12),
	
	INVAR(2, 275, 6.6F, 2.2F, 15);

    /** The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = WOOD/GOLD) */
    private final int harvestLevel;
    /** The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32) */
    private final int maxUses;
    /** The strength of this tool material against blocks which it is effective against. */
    private final float efficiencyOnProperMaterial;
    /** Damage versus entities. */
    private final float damageVsEntity;
    /** Defines the natural enchantability factor of the material. */
    private final int enchantability;
    //Added by forge for custom Tool materials.
    private ItemStack repairMaterial = ItemStack.EMPTY;

    private ToolMaterials2(int harvestLevel, int maxUses, float efficiency, float damageVsEntity, int enchantability)
    {
        this.harvestLevel = harvestLevel;
        this.maxUses = maxUses;
        this.efficiencyOnProperMaterial = efficiency;
        this.damageVsEntity = damageVsEntity;
        this.enchantability = enchantability;
    }

    /**
     * The number of uses this material allows. (wood = 59, stone = 131, iron = 250, diamond = 1561, gold = 32)
     */
    public int getMaxUses()
    {
        return this.maxUses;
    }

    /**
     * The strength of this tool material against blocks which it is effective against.
     */
    public float getEfficiencyOnProperMaterial()
    {
        return this.efficiencyOnProperMaterial;
    }

    /**
     * Returns the damage against a given entity.
     */
    public float getDamageVsEntity()
    {
        return this.damageVsEntity;
    }

    /**
     * The level of material this tool can harvest (3 = DIAMOND, 2 = IRON, 1 = STONE, 0 = IRON/GOLD)
     */
    public int getHarvestLevel()
    {
        return this.harvestLevel;
    }

    /**
     * Return the natural enchantability factor of the material.
     */
    public int getEnchantability()
    {
        return this.enchantability;
    }

    @Deprecated // Use getRepairItemStack below
    public Item getRepairItem()
    {
        if (this == INVAR)
        {
            return Itm.INGOT_INVAR;
        }
        else if (this == COPPER)
        {
            return Itm.INGOT_COPPER;
        }
        else if (this == BRONZE)
        {
            return Itm.INGOT_QUANTUM;
        }       
        else
        {
            return this == STEEL ? Itm.INGOT_STEEL : null;
        }
    }

    public ToolMaterials2 setRepairItem(ItemStack stack)
    {
        if (!this.repairMaterial.isEmpty()) throw new RuntimeException("Repair material has already been set");
        if (this == BRONZE || this == COPPER || this == INVAR || this == STEEL ) throw new RuntimeException("Can not change quantum tool repair materials");
        this.repairMaterial = stack;
        return this;
    }

    public ItemStack getRepairItemStack()
    {
        if (!repairMaterial.isEmpty()) return repairMaterial;
        Item ret = this.getRepairItem();
        if (ret != null) repairMaterial = new ItemStack(ret, 1, net.minecraftforge.oredict.OreDictionary.WILDCARD_VALUE);
        return repairMaterial;
    }
}