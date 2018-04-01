package quantumzone.stereowalker.util.handlers.materials;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import quantumzone.stereowalker.init.Itm;

public enum ToolMaterials1
{
	BANTUM(2, 300, 7.5F, 3.5F, 17),
	
    QUANTUM(2, 250, 6.5F, 2.5F, 13),
    
    PLATINUM(3, 1718, 10.0F, 2.8F, 8),
    
    GHOST(3, 20, 30F, 20F, 50);

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

    private ToolMaterials1(int harvestLevel, int maxUses, float efficiency, float damageVsEntity, int enchantability)
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
        if (this == BANTUM)
        {
            return Itm.INGOT_BANTUM;
        }
        else if (this == QUANTUM)
        {
            return Itm.INGOT_QUANTUM;
        }
        else if (this == PLATINUM)
        {
            return Itm.INGOT_PLATINUM;
        }
        else
        {
            return this == GHOST ? Itm.SOUL_INGOT : null;
        }
    }

    public ToolMaterials1 setRepairItem(ItemStack stack)
    {
        if (!this.repairMaterial.isEmpty()) throw new RuntimeException("Repair material has already been set");
        if (this == BANTUM || this == QUANTUM || this == PLATINUM || this == GHOST) throw new RuntimeException("Can not change quantum tool repair materials");
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