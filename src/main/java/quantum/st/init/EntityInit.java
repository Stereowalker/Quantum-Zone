package quantum.st.init;

import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import quantum.st.Main;
import quantum.st.entity.EntityCar;
import quantum.st.entity.EntityChamelion;
import quantum.st.entity.EntityDog;
import quantum.st.entity.EntityQEnderman;
import quantum.st.entity.EntityQSkeleton;
import quantum.st.entity.EntityGhost;
import quantum.st.entity.EntityLion;
import quantum.st.entity.EntityQCreeper;
import quantum.st.entity.EntityQSpider;
import quantum.st.entity.EntityQZombie;
import quantum.st.entity.EntityTraveller;
import quantum.st.entity.items.EntityEnderPearl;
import quantum.st.entity.projectiles.EntityGhostBlast;
import quantum.st.entity.projectiles.EntityGhostShot;
import quantum.st.objects.items.EntityMTNTPrimed;
import quantum.st.entity.EntityQuantumSoldier;
import quantum.st.entity.EntityQuantumboss;
import quantum.st.entity.EntityShark;
import quantum.st.entity.EntityDrone;
import quantum.st.util.Reference;

public class EntityInit {
	public static void registerEntities() {
		registerEntity("Traveller", EntityTraveller.class, Reference.ENTITY_TRAVELLER, 50, 2583722, 0000000);
		//registerEntity("Lion", EntityLion.class, Reference.ENTITY_LION, 50, 16742912, 0000000);
		//registerEntity("Shark", EntityShark.class, Reference.ENTITY_SHARK, 50, 52223, 16777215);
		//registerEntity("Chameleon", EntityChamelion.class, Reference.ENTITY_CHAMELION, 50, 3700795, 0000000);
		//registerEntity("BossMan", EntityQuantumboss.class, Reference.ENTITY_QUANTUMBOSS, 50, 16777215, 0000000);
		registerEntity("QuantumSoldier", EntityQuantumSoldier.class, Reference.ENTITY_QUANTUMSOLDIER, 50, 16777215, 0000000);
		registerEntity("Drone", EntityDrone.class, Reference.ENTITY_TANK, 50, 16777215, 0000222);
		//registerEntity("Car", EntityCar.class, Reference.ENTITY_CAR, 50, 16777215, 0000000);
		//registerEntity("Dog", EntityDog.class, Reference.ENTITY_DOG, 50, 11829589, 0000000);
		registerEntity("QSpider", EntityQSpider.class, Reference.ENTITY_QSPIDER, 50, 1677665, 0000000);
		registerEntity("QCreeper", EntityQCreeper.class, Reference.ENTITY_QCREEPER, 50, 11829589, 0000000);
		registerEntity("QZombie", EntityQZombie.class, Reference.ENTITY_QZOMBIE, 50, 11829589, 0000000);
		registerEntity("QEnderman", EntityQEnderman.class, Reference.ENTITY_QENDERMAN, 50, 11829589, 0000000);
		registerEntity("QSkeleton", EntityQSkeleton.class, Reference.ENTITY_QSKELETON, 50, 11829589, 0000000);
		registerEntity("Ghost", EntityGhost.class, Reference.ENTITY_GHOST, 50, 11829589, 0000000);
		registerEntity("GhostBlast", EntityGhostBlast.class, Reference.ENTITY_GB, 50);
		registerEntity("GhostShot", EntityGhostShot.class, Reference.ENTITY_GS, 50);
		registerEntity("MTNT", EntityMTNTPrimed.class, Reference.ENTITY_TNT, 50);
		registerEntity("EnderPearl", EntityEnderPearl.class, Reference.ENTITY_ED, 50);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true);
	}

}
