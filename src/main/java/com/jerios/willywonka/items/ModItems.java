package com.jerios.willywonka.items;

import com.jerios.willywonka.WillyWonka;
import com.jerios.willywonka.food.ModFoodBase;
import com.jerios.willywonka.liquid.ModLiquid;
import net.minecraft.block.TallGrassBlock;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
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

    // food

    public static final RegistryObject<Item> SUGARGRASS = ITEMS.register( "tall_sugar_grass", () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(64).food(ModFoodBase.CHOCLATE_BAR) ));

    public static final RegistryObject<Item> EDIBLE_GRASS = ITEMS.register( "edible_grass", () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(64).food(ModFoodBase.CHOCLATE_BAR) ));

    public static final RegistryObject<Item> TAFFY = ITEMS.register( "taffy", () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(64).food(ModFoodBase.CHOCLATE_BAR).food(ModFoodBase.FAST_FOOD)));

    public static final RegistryObject<Item> JAWBREAKER = ITEMS.register( "jawbreaker", () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(64).food(ModFoodBase.CHOCLATE_BAR).food(ModFoodBase.FAST_FOOD)));

    public static final RegistryObject<Item> LOLLYPOP3DITEM = ITEMS.register( "lollypop3ditemversion", () -> new Item(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(64).food(ModFoodBase.CHOCLATE_BAR).food(ModFoodBase.FAST_FOOD)));

    // tools

    public static final RegistryObject<Item> CHOCLATE_SWORD = ITEMS.register("choclate_sword",
            () -> new GoodSpeedBadSlowItem(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1)));

    public static final RegistryObject<Item> CHOCLATE_PICKAXE = ITEMS.register("choclate_pickaxe",
            () -> new PickaxeItem(ModItemTier.CHOCLATETEIR, 0, -2f,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1) ));

    public static final RegistryObject<Item> CHOCLATE_SHOVEL = ITEMS.register("choclate_shovel",
            () -> new ShovelItem(ModItemTier.CHOCLATETEIR, 0, -2f,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1)   ));

    public static final RegistryObject<Item> CHOCLATE_AXE = ITEMS.register("choclate_axe",
            () -> new AxeItem(ModItemTier.CHOCLATETEIR, 4, -6f,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1)  ));

    public static final RegistryObject<Item> CHOCLATE_HOE = ITEMS.register("choclate_hoe",
            () -> new HoeItem(ModItemTier.CHOCLATETEIR, 0, 0f,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1) ));


    // armor

    public static final RegistryObject<Item> PEARL_BOOTS = ITEMS.register("choclate_boots",
            () -> new ArmorItem(ModMaterialArmor.CHOCLATEARMOR, EquipmentSlotType.FEET,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1) ));

    public static final RegistryObject<Item> PEARL_CHESTPLATE = ITEMS.register("choclate_chestplate",
            () -> new ArmorItem(ModMaterialArmor.CHOCLATEARMOR, EquipmentSlotType.CHEST,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1) ));

    public static final RegistryObject<Item> PEARL_LEGGINGS = ITEMS.register("choclate_leggings",
            () -> new ArmorItem(ModMaterialArmor.CHOCLATEARMOR, EquipmentSlotType.LEGS,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1) ));

    public static final RegistryObject<Item> PEARL_HELMET = ITEMS.register("choclate_helmet",
            () -> new ArmorItem(ModMaterialArmor.CHOCLATEARMOR, EquipmentSlotType.HEAD,
                    new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1) ));

    public static final RegistryObject<Item> CHOCLATE_BOW = ITEMS.register("choclate_bow",
            () -> new BowItem(new Item.Properties().tab(ModItemGroup.WILLYWONKA_GROUP).stacksTo(1)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
