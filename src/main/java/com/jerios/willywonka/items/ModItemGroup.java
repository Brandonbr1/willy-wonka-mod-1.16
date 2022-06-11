package com.jerios.willywonka.items;


import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup  {

    public static final ItemGroup WILLYWONKA_GROUP = new ItemGroup("WillyWonkaTab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.GOLDENTICKET.get());
        }
    };
}
