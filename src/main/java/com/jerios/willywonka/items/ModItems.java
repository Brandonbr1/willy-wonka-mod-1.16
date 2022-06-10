package com.jerios.willywonka.items;

import com.jerios.willywonka.WillyWonka;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WillyWonka.MOD_ID);

    public static final RegistryObject<Item> CHOCLATEBAR = ITEMS.register("choclatebar",
            () -> new Item(new Item.Properties().tab(ItemGroup.TAB_FOOD).food(ModFoodItems.CHOCLATEBAR)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
