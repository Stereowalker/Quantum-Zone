package quantumzone.stereowalker.init;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntityIronGolem;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import quantumzone.stereowalker.Main;
import quantumzone.stereowalker.entity.EntityBrute;
import quantumzone.stereowalker.entity.EntityCopperGolem;
import quantumzone.stereowalker.entity.EntityDrone;
import quantumzone.stereowalker.entity.EntityGhost;
import quantumzone.stereowalker.entity.EntityPlatinumGolem;
import quantumzone.stereowalker.entity.EntityQCreeper;
import quantumzone.stereowalker.entity.EntityQEnderman;
import quantumzone.stereowalker.entity.EntityQSkeleton;
import quantumzone.stereowalker.entity.EntityQSpider;
import quantumzone.stereowalker.entity.EntityQZombie;
import quantumzone.stereowalker.entity.EntityQuantumSoldier;
import quantumzone.stereowalker.entity.EntityTraveller;
import quantumzone.stereowalker.entity.EntityWereWolf;
import quantumzone.stereowalker.entity.blocks.EntityMTNTPrimed;
import quantumzone.stereowalker.entity.items.EntityEnderPearl;
import quantumzone.stereowalker.entity.projectiles.EntityGhostBlast;
import quantumzone.stereowalker.entity.projectiles.EntityGhostShot;
import quantumzone.stereowalker.util.Reference;

public class Ent {
	public static void registerEntities() {
		registerEntity("traveller", EntityTraveller.class, Reference.ENTITY_TRAVELLER, 50, 2583722, 0000000);
		//registerEntity("Lion", EntityLion.class, Reference.ENTITY_LION, 50, 16742912, 0000000);
		//registerEntity("Shark", EntityShark.class, Reference.ENTITY_SHARK, 50, 52223, 16777215);
		//registerEntity("Chameleon", EntityChamelion.class, Reference.ENTITY_CHAMELION, 50, 3700795, 0000000);
		//registerEntity("BossMan", EntityQuantumboss.class, Reference.ENTITY_QUANTUMBOSS, 50, 16777215, 0000000);
		registerEntity("quantum_horror", EntityQuantumSoldier.class, Reference.ENTITY_QUANTUMSOLDIER, 50, 16777215, 0000000);
		registerEntity("drone", EntityDrone.class, Reference.ENTITY_DRONE, 50, 16777215, 0000222);
		//registerEntity("Car", EntityCar.class, Reference.ENTITY_CAR, 50, 16777215, 0000000);
		//registerEntity("Dog", EntityDog.class, Reference.ENTITY_DOG, 50, 11829589, 0000000);
		registerEntity("infected_spider", EntityQSpider.class, Reference.ENTITY_QSPIDER, 50, 2105376, 255);
		registerEntity("infected_creeper", EntityQCreeper.class, Reference.ENTITY_QCREEPER, 50, 34816, 255);
		registerEntity("infected_zombie", EntityQZombie.class, Reference.ENTITY_QZOMBIE, 50, 4375234, 255);
		registerEntity("infected_enderman", EntityQEnderman.class, Reference.ENTITY_QENDERMAN, 50, 1381656, 255);
		registerEntity("infected_skeleton", EntityQSkeleton.class, Reference.ENTITY_QSKELETON, 50, 12632770, 255);
		registerEntity("brute", EntityBrute.class, Reference.ENTITY_BRUTE, 50, 12632770, 55255);
		registerEntity("ghost", EntityGhost.class, Reference.ENTITY_GHOST, 50, 11829589, 255);
		registerEntity("ghost_blast", EntityGhostBlast.class, Reference.ENTITY_GB, 50);
		registerEntity("ghost_shot", EntityGhostShot.class, Reference.ENTITY_GS, 50);
		registerEntity("MTNT", EntityMTNTPrimed.class, Reference.ENTITY_TNT, 50);
		registerEntity("ender_pearl", EntityEnderPearl.class, Reference.ENTITY_ED, 50);
		registerEntity("platinum_golem", EntityPlatinumGolem.class, Reference.ENTITY_PLGOLEM, 50);
		registerEntity("copper_golem", EntityCopperGolem.class, Reference.ENTITY_COGOLEM, 50);
		registerEntity("werewolf", EntityWereWolf.class, Reference.ENTITY_WEREWOLF, 50, 1381656, 2105376);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range, int color1, int color2) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true, color1, color2);
	}
	
	private static void registerEntity(String name, Class<? extends Entity> entity, int id, int range) {
		EntityRegistry.registerModEntity(new ResourceLocation(Reference.MODID + ":" + name), entity, name, id, Main.instance, range, 1, true);
	}
	
	public static void addSpawns() {
		EntityRegistry.addSpawn(EntityGhost.class, 200, 5, 15, EnumCreatureType.MONSTER, getBiomes(BiomeDictionary.Type.FOREST));
		EntityRegistry.addSpawn(EntityGhost.class, 200, 5, 15, EnumCreatureType.MONSTER, getBiomes(BiomeDictionary.Type.JUNGLE));
		EntityRegistry.addSpawn(EntityGhost.class, 200, 5, 15, EnumCreatureType.MONSTER, getBiomes(BiomeDictionary.Type.SPOOKY));
		EntityRegistry.addSpawn(EntityGhost.class, 200, 5, 15, EnumCreatureType.MONSTER, getBiomes(BiomeDictionary.Type.COLD));
		EntityRegistry.addSpawn(EntityBrute.class, 1000000000, 1, 1, EnumCreatureType.CREATURE, getBiomes(BiomeDictionary.Type.FOREST));
		copySpawns(EntityCopperGolem.class, EnumCreatureType.AMBIENT, EntityIronGolem.class, EnumCreatureType.AMBIENT);
		copySpawns(EntityPlatinumGolem.class, EnumCreatureType.AMBIENT, EntityIronGolem.class, EnumCreatureType.AMBIENT);
		copySpawns(EntityBrute.class, EnumCreatureType.CREATURE, EntityIronGolem.class, EnumCreatureType.AMBIENT);
	}
	
	private static Biome[] getBiomes(final BiomeDictionary.Type type) {
		return BiomeDictionary.getBiomes(type).toArray(new Biome[0]);
	}
	
	private static void copySpawns(final Class<? extends EntityLiving> classToAdd, final EnumCreatureType creatureTypeToAdd, final Class<? extends EntityLiving> classToCopy, final EnumCreatureType creatureTypeToCopy) {
		for (final Biome biome : ForgeRegistries.BIOMES) {
			biome.getSpawnableList(creatureTypeToCopy).stream()
					.filter(entry -> entry.entityClass == classToCopy)
					.findFirst()
					.ifPresent(spawnListEntry ->
							biome.getSpawnableList(creatureTypeToAdd).add(new Biome.SpawnListEntry(classToAdd, spawnListEntry.itemWeight, spawnListEntry.minGroupCount, spawnListEntry.maxGroupCount))
					);
		}
	}

}
