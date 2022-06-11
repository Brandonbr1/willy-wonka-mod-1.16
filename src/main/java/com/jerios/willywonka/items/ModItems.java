package com.jerios.willywonka.items;

import com.jerios.willywonka.WillyWonka;
import com.jerios.willywonka.food.ModFoodBase;
import com.jerios.willywonka.liquid.ModLiquid;
import net.minecraft.block.TallGrassBlock;
import net.minecraft.item.BucketItem;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, WillyWonka.MOD_ID);

    public static final RegistryObject<Item> CHOCLATEBAR = ITEMS.register("choclatebar",
            () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).food(ModFoodItems.CHOCLATEBAR).stacksTo(1).food(ModFoodBase.CHOCLATE_BAR)  ));

    public static final RegistryObject<Item> GOLDENTICKET = ITEMS.register( "goldenticket", () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1)));

    public static final RegistryObject<Item> CHOCLATEBUCKET = ITEMS.register("chocolate_bucket",
            () -> new BucketItem(() -> ModLiquid.CHOCLATE_FLUID.get(),
                    new Item.Properties().stacksTo(1).tab(ModItemGroup.WILLYWONKA_GROUP)));


    public static final RegistryObject<Item> SUGARGRASS = ITEMS.register( "tall_sugar_grass", () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(64).food(ModFoodBase.CHOCLATE_BAR) ));


    public static final RegistryObject<Item> EDIBLE_GRASS = ITEMS.register( "edible_grass", () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(64).food(ModFoodBase.CHOCLATE_BAR) ));

    public static final RegistryObject<Item> LOLLYPOP3DITEM = ITEMS.register( "lollypop3ditemversion", () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(64).food(ModFoodBase.CHOCLATE_BAR).food(ModFoodBase.FAST_FOOD)));







    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
