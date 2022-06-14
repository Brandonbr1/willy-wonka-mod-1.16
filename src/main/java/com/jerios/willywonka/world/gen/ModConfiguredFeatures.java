package com.jerios.willywonka.world.gen;


import com.jerios.willywonka.blocks.ModBlocks;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

import static net.minecraft.util.registry.Registry.register;

public class ModConfiguredFeatures {
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> RAINBOW_LOLLYPOP_BLOCK = register("rainbow_lollypop", Feature.TREE.configured((new BaseTreeFeatureConfig.Builder(new SimpleBlockStateProvider(ModBlocks.LOLLYPOP_STICK.get().defaultBlockState()), new SimpleBlockStateProvider(ModBlocks.RAINBOW_LOLLYPOP_BLOCK.get().defaultBlockState()), new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3), new StraightTrunkPlacer(10, 4, 3), new TwoLayerFeature(1, 0, 1))).ignoreVines().build()));

    private static ConfiguredFeature<BaseTreeFeatureConfig,?> register(String rainbow_lollypop, ConfiguredFeature<BaseTreeFeatureConfig,?> configured) {
        return configured;
    }
}
