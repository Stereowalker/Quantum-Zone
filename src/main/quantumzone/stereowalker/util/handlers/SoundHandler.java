package quantumzone.stereowalker.util.handlers;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import quantumzone.stereowalker.util.Reference;

public class SoundHandler {
	public static SoundEvent ENTITY_GHOST_AMBIENT, ENTITY_GHOST_HURT, ENTITY_GHOST_DEATH;
	
	public static void registerSounds() {
		ENTITY_GHOST_AMBIENT = registerSounds("entity.ghost.ambient");
		ENTITY_GHOST_HURT = registerSounds("entity.ghost.hurt");
		ENTITY_GHOST_DEATH = registerSounds("entity.ghost.death");
	}
	
	private static SoundEvent registerSounds(String name) {
		ResourceLocation location = new ResourceLocation(Reference.MODID, name);
		SoundEvent event = new SoundEvent(location);
		event.setRegistryName(name);
		ForgeRegistries.SOUND_EVENTS.register(event);
		return event;
	}

}
