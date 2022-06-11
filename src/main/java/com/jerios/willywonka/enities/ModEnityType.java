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
            ENTITY_TYPES.register("buff_zombie",
                    () -> EntityType.Builder.of(OompaLoompaEntity::new,
                                    EntityClassification.MONSTER).sized(0.5f, 2f)
                            .build(new ResourceLocation(WillyWonka.MOD_ID, "oompa_loompa").toString()));

    //public static final RegistryObject<EntityType<AgressiveOompaLoompaEntity>> agressive_OOMPA_LOOMPA =
            //ENTITY_TYPES.register("buff_zombie",
                    //() -> EntityType.Builder.of(AgressiveOompaLoompaEntity::new,
                                    //EntityClassification.MONSTER).sized(0.5f, 2f)
                            //.build(new ResourceLocation(WillyWonka.MOD_ID, "agressive_oompa_loompa").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
