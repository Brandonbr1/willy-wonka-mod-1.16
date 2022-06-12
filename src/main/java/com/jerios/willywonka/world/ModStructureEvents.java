package com.jerios.willywonka.world;

import com.jerios.willywonka.WillyWonka;
import com.jerios.willywonka.world.gen.BigRainbowLollypopStructure;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = WillyWonka.MOD_ID)
public class ModStructureEvents {

    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event){
        BigRainbowLollypopStructure.GenerateLollypops(event);
    }
}
