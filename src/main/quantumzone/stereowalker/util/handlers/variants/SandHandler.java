package quantumzone.stereowalker.util.handlers.variants;

import net.minecraft.block.BlockSand;
import net.minecraft.block.material.MapColor;
import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SandHandler {
public static enum EnumType implements IStringSerializable {
		
	WHITE(0, "white", "default", 12827570);

    private static final SandHandler.EnumType[] META_LOOKUP = new SandHandler.EnumType[values().length];
    private final int meta;
    private final String name;
    private final String unlocalizedName;
    private final int dustColor;

    private EnumType(int p_i47157_3_, String p_i47157_4_, String p_i47157_5_, int p_i47157_7_)
    {
        this.meta = p_i47157_3_;
        this.name = p_i47157_4_;
        this.unlocalizedName = p_i47157_5_;
        this.dustColor = p_i47157_7_;
    }

    @SideOnly(Side.CLIENT)
    public int getDustColor()
    {
        return this.dustColor;
    }

    public int getMeta()
    {
        return this.meta;
    }

    public String toString()
    {
        return this.name;
    }

    public static SandHandler.EnumType byMetadata(int meta)
    {
        if (meta < 0 || meta >= META_LOOKUP.length)
        {
            meta = 0;
        }

        return META_LOOKUP[meta];
    }

    public String getName()
    {
        return this.name;
    }

    public String getUnlocalizedName()
    {
        return this.unlocalizedName;
    }

    static
    {
        for (SandHandler.EnumType blocksand$enumtype : values())
        {
            META_LOOKUP[blocksand$enumtype.getMeta()] = blocksand$enumtype;
        }
    }
}

}
	

