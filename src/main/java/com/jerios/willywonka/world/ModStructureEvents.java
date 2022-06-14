package com.jerios.willywonka.world;

import com.jerios.willywonka.WillyWonka;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("unused")

@Mod.EventBusSubscriber(modid = WillyWonka.MOD_ID)
public class ModStructureEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event){
        ModTreeGen.GenerateLollypops(event);
    }
}
