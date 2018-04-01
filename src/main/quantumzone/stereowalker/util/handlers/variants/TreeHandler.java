package quantumzone.stereowalker.util.handlers.variants;

import net.minecraft.util.IStringSerializable;
import quantumzone.stereowalker.util.handlers.variants.EnumHandler.EnumType;

public class TreeHandler {
public static enum EnumType implements IStringSerializable {
		
		QUANTUM(0, "quantum"),
		SILKOAK(1, "silky_oak");
	
		
		private static final TreeHandler.EnumType[] META_LOOKUP = new TreeHandler.EnumType[values().length];
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
		
		public static TreeHandler.EnumType byMetadata(int meta) {
			if (meta < 0 || meta >= META_LOOKUP.length)
            {
                meta = 0;
            }
			return META_LOOKUP[meta];
		}
		
		static {
			for(TreeHandler.EnumType blockplanks$enumtype : values()) {
				META_LOOKUP[blockplanks$enumtype.getMeta()] = blockplanks$enumtype;
			}
		}
	
	}

}
	

