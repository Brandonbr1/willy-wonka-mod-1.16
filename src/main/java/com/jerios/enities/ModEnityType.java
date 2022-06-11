package com.jerios.enities;

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

    public static RegistryObject<EntityType<OompaLoompaEntity>> OOMPA_LOOMPA =
            ENTITY_TYPES.register("oompa_loompas", () -> EntityType.Builder.createNothing(OompaLoompaEntity::new, EntityClassification.CREATURE).sized(0.5 , 1).build(new ResourceLocation(WillyWonka.MOD_ID, "oompa_loompas").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
