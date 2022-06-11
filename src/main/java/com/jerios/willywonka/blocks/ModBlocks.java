package com.jerios.willywonka.blocks;

import com.jerios.willywonka.WillyWonka;
import com.jerios.willywonka.items.ModItems;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

public class ModBlocks {

    public static final DeferredRegister<Block> BLOCKS
            = DeferredRegister.create(ForgeRegistries.BLOCKS, WillyWonka.MOD_ID);

    public static final RegistryObject<Block> LOLLYPOP3DVERSION = BLOCKS.register("Lollypop3dversion",
            () -> new Block(AbstractBlock.Properties.of(Material.WOOL)));


    private static <T extends  Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);

        registerBlockItem(name, toReturn);

        return toReturn;
    }

    private static  <T extends  Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties() ));
    }


    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

}
