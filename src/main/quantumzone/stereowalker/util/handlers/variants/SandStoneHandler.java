package quantumzone.stereowalker.util.handlers.variants;

import net.minecraft.util.IStringSerializable;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class SandStoneHandler {
public static enum EnumType implements IStringSerializable {
		
	NORMAL(0, "sandstone", "default"),
    CHISELED(1, "chiseled_sandstone", "chiseled"),
    SMOOTH(2, "smooth_sandstone", "smooth");
		
		private static final SandStoneHandler.EnumType[] META_LOOKUP = new SandStoneHandler.EnumType[values().length];
		private final int meta;
		private final String name, unlocalizedName;
		
		private EnumType(int meta, String name) {
			this(meta, name, name);
		}
		
		private EnumType(int meta, String name, String unlocalizedName) {
			this.meta = meta;
			this.name = name;
			this.unlocalizedName = unlocalizedName;
		}
		
		@Override
		public String getName() {
			return this.name;
		}
		
		public int getMeta() {
			return this.meta;
		}
		
		public String getUnlocalizedName() {
			return this.unlocalizedName;
		}
		
		@Override
		public String toString() {
			return this.name;
		}
		
		public static SandStoneHandler.EnumType byMetadata(int meta) {
			if (meta < 0 || meta >= META_LOOKUP.length)
            {
                meta = 0;
            }
			return META_LOOKUP[meta];
		}
		
		static {
			for(SandStoneHandler.EnumType blockplanks$enumtype : values()) {
				META_LOOKUP[blockplanks$enumtype.getMeta()] = blockplanks$enumtype;
			}
		}
	
	}

}
	

