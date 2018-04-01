package quantumzone.stereowalker.util.handlers.variants;

import net.minecraft.util.IStringSerializable;
import quantumzone.stereowalker.blocks.BlockStoneBricks;

public class StoneBricksHandler {
	public static enum EnumType implements IStringSerializable
    {
        DEFAULT(0, "stonebrick", "default"),
        //MOSSY(1, "mossy_stonebrick", "mossy"),
        CRACKED(1, "cracked_stonebrick", "cracked"),
        CHISELED(2, "chiseled_stonebrick", "chiseled");

		private static final StoneBricksHandler.EnumType[] META_LOOKUP = new StoneBricksHandler.EnumType[values().length];
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
		
		public static StoneBricksHandler.EnumType byMetadata(int meta) {
			if (meta < 0 || meta >= META_LOOKUP.length)
            {
                meta = 0;
            }
			return META_LOOKUP[meta];
		}
		
		static {
			for(StoneBricksHandler.EnumType blockplanks$enumtype : values()) {
				META_LOOKUP[blockplanks$enumtype.getMeta()] = blockplanks$enumtype;
			}
		}
    }

}
