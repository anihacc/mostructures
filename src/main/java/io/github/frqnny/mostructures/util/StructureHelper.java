package io.github.frqnny.mostructures.util;

import io.github.frqnny.mostructures.MoStructures;
import io.github.frqnny.mostructures.generator.*;
import net.minecraft.entity.EntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.Pool;
import net.minecraft.world.biome.SpawnSettings;

//Helper class to move all the IDs from former Structure classes
public class StructureHelper {
    public static final Pool<SpawnSettings.SpawnEntry> ICE_TOWER_SPAWNS = Pool.of(new SpawnSettings.SpawnEntry(EntityType.STRAY, 1, 2, 2), new SpawnSettings.SpawnEntry(EntityType.CREEPER, 1, 1, 1));


    public static final Identifier ABANDONED_CHURCH = MoStructures.id("abandoned_church");
    public static final Identifier BARN_HOUSE = MoStructures.id("barn_house");
    public static final Identifier BIG_PYRAMID = MoStructures.id("big_pyramid");
    public static final Identifier ICE_TOWER = MoStructures.id("ice_tower");
    public static final Identifier JUNGLE_PYRAMID = MoStructures.id("jungle_pyramid");
    public static final Identifier KILLER_BUNNY_CASTLE = MoStructures.id("killer_bunny_castle");
    public static final Identifier PILLAGER_FACTORY = MoStructures.id("pillager_factory");
    public static final Identifier TAVERN = MoStructures.id("tavern");
    public static final Identifier VILLAGER_TOWER = MoStructures.id("villager_tower");
    public static final Identifier THE_CASTLE_IN_THE_SKY = MoStructures.id("the_castle_in_the_sky");
    public static final Identifier VILLAGER_MARKET = MoStructures.id("villager_market");

    //Makes sures pools are registered
    public static void initPools() {
        AbandonedChurchGenerator.init();
        BarnHouseGenerator.init();
        BigPyramidGenerator.init();
        IceTowerGenerator.init();
        JunglePyramidGenerator.init();
        KillerBunnyCastleGenerator.init();
        PillagerFactoryGenerator.init();
        TavernGenerator.init();
        TheCastleInTheSkyGenerator.init();
        VillagerMarketGenerator.init();
        VillagerTowerGenerator.init();

    }
}