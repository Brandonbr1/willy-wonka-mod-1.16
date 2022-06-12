package com.jerios.willywonka.food;

import net.minecraft.item.Food;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class ModFoodBase {



    public static final Food CHOCLATE_BAR = new Food.Builder()
            .effect(() -> new EffectInstance(Effects.MOVEMENT_SPEED, 800, 2), 0.7f).fast().alwaysEat().build();


    public static final Food FAST_FOOD = new Food.Builder()
            .effect(() -> new EffectInstance(Effects.POISON, 1500, 2), 0.7f).fast().alwaysEat().build();




}



