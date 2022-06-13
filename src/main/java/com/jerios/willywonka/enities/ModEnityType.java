package com.jerios.willywonka.enities;

import com.jerios.willywonka.WillyWonka;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEnityType {

    public static DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, WillyWonka.MOD_ID);

    public static final RegistryObject<EntityType<OompaLoompaEntity>> OOMPA_LOOMPA =
            ENTITY_TYPES.register("oompa_loompa",
                    () -> EntityType.Builder.of(OompaLoompaEntity::new,
                                    EntityClassification.MONSTER).sized(0.5f, 2f)
                            .build(new ResourceLocation(WillyWonka.MOD_ID, "oompa_loompa").toString()));

    public static final RegistryObject<EntityType<OompaLoompaAgressiveEntity>> OOMPA_LOOMPA_AGRESSIVE =
            ENTITY_TYPES.register("oompa_loompa_agressive",
                    () -> EntityType.Builder.of(OompaLoompaAgressiveEntity::new,
                                    EntityClassification.MONSTER).sized(0.5f, 2f)
                            .build(new ResourceLocation(WillyWonka.MOD_ID, "oompa_loompa_agressive").toString()));

    public static final RegistryObject<EntityType<LargeGheeseEnity>> LARGEGHEESE =
            ENTITY_TYPES.register("large_gheese",
                    () -> EntityType.Builder.of(LargeGheeseEnity::new,
                                    EntityClassification.MONSTER).sized(1f, 2f)
                            .build(new ResourceLocation(WillyWonka.MOD_ID, "large_gheese").toString()));



    public static final RegistryObject<EntityType<ExplosiveArrowEntity>> EXPLOSIVE_ARROW = ENTITY_TYPES.register("torch_arrow",
            () -> EntityType.Builder.of((EntityType.IFactory<ExplosiveArrowEntity>) ExplosiveArrowEntity::new, EntityClassification.MISC)
                    .sized(0.5F, 0.5F).build("torch_arrow"));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
