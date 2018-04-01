package quantumzone.stereowalker.init;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.renderer.block.statemap.StateMapperBase;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;
import quantumzone.stereowalker.Main.Materials;
import quantumzone.stereowalker.init.FluidsInit.ModFluid;
import quantumzone.stereowalker.util.Reference;

public class FluidsInit {
	/*private static ModelResourceLocation LOCATION1 = new ModelResourceLocation(Reference.MODID + ":" + FluidsList.ACID, "fluid");
	
	public static void register() {
		FluidRegistry.registerFluid(FluidsList.ACID);
		Item acid = Item.getItemFromBlock(BlockInit.ACID);
		ModelLoader.setCustomMeshDefinition(acid, new ItemMeshDefinition() {
			@Override
			public ModelResourceLocation getModelLocation(ItemStack stack) {
				return LOCATION1;
			}
		});
		ModelLoader.setCustomStateMapper(BlockInit.ACID, new StateMapperBase() {
			@Override
			protected ModelResourceLocation getModelResourceLocation(IBlockState state) {
				return LOCATION1;
			}
		});
	}*/
	
	/*public static final class FluidAcid extends Fluid{
		
		
		public static String name = "acid";

		public FluidAcid() {
			super(name, new ResourceLocation(Reference.MODID + ":blocks/" + name + "_still"), new ResourceLocation (Reference.MODID + ":blocks/" + name + "_flow"));
			this.setLuminosity(5);
		}
		
	}*/
	
	public static class ModFluid extends Fluid
	{
	    protected static int mapColor = 0xFFFFFFFF;
	    protected static float overlayAlpha = 0.2F;
	    protected SoundEvent emptySound = SoundEvents.ITEM_BUCKET_EMPTY;
	    protected static SoundEvent fillSound = SoundEvents.ITEM_BUCKET_FILL;
	    protected static Material material = Material.WATER;
	 
	    public ModFluid(String fluidName, ResourceLocation still, ResourceLocation flowing) 
	    {
	        super(fluidName, still, flowing);
	    }
	 
	    public ModFluid(String fluidName, ResourceLocation still, ResourceLocation flowing, int mapColor) 
	    {
	        this(fluidName, still, flowing);
	        setColor(mapColor);
	    }
	 
	    public ModFluid(String fluidName, ResourceLocation still, ResourceLocation flowing, int mapColor, float overlayAlpha) 
	    {
	        this(fluidName, still, flowing, mapColor);
	        setAlpha(overlayAlpha);
	    }
	 
	    @Override
	    public int getColor()
	    {
	        return mapColor;
	    }
	 
	    public ModFluid setColor(int parColor)
	    {
	        mapColor = parColor;
	        return this;
	    }
	 
	    public float getAlpha()
	    {
	        return overlayAlpha;
	    }
	 
	    public ModFluid setAlpha(float parOverlayAlpha)
	    {
	        overlayAlpha = parOverlayAlpha;
	        return this;
	    }
	 
	    @Override
	    public ModFluid setEmptySound(SoundEvent parSound)
	    {
	        emptySound = parSound;
	        return this;
	    }
	 
	    @Override
	    public SoundEvent getEmptySound()
	    {
	        return emptySound;
	    }
	 
	    @Override
	    public ModFluid setFillSound(SoundEvent parSound)
	    {
	        fillSound = parSound;
	        return this;
	    }
	 
	    @Override
	    public SoundEvent getFillSound()
	    {
	        return fillSound;
	    }
	 
	    public ModFluid setMaterial(Material parMaterial)
	    {
	        material = parMaterial;
	        return this;
	    }
	 
	    public Material getMaterial()
	    {
	        return material;
	    }
	 
	    @Override
	    public boolean doesVaporize(FluidStack fluidStack)
	    {
	        if (block == null)
	            return false;
	        return block.getDefaultState().getMaterial() == getMaterial();
	    }
	    
	    public static final ModFluid ACID = (ModFluid) new ModFluid(
				   "acid", 
				   new ResourceLocation(Reference.MODID,"acid_still"), 
				   new ResourceLocation(Reference.MODID, "acid_flow")
				   )
				   .setMaterial(Materials.ACID)
				   .setDensity(1100)
				   .setGaseous(false)
				   .setLuminosity(9)
				   .setViscosity(25000)
				   .setTemperature(300);
	}
	

	public static class ModFluidBlock extends BlockFluidClassic{

		public ModFluidBlock(Fluid fluid, Material material) {
			super(fluid, material);
			
		}
		
		
		
	}

	

}
