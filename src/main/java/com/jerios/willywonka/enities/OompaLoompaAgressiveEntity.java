package com.jerios.willywonka.enities;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.WaterAvoidingRandomWalkingGoal;
import net.minecraft.entity.monster.VindicatorEntity;

import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class OompaLoompaAgressiveEntity extends VindicatorEntity {


    public OompaLoompaAgressiveEntity(EntityType<? extends VindicatorEntity> p_i50189_1_, World p_i50189_2_) {
        super(p_i50189_1_, p_i50189_2_);
    }

    public static AttributeModifierMap.MutableAttribute setCustomAttributes() {
        return MobEntity.createLivingAttributes()
                .add(Attributes.MAX_HEALTH, 30.0D)
                .add(Attributes.MOVEMENT_SPEED, 0.33D)
                .add(Attributes.ATTACK_DAMAGE, 2.0D)
                .add(Attributes.FOLLOW_RANGE, 50.0D)
                .add(Attributes.SPAWN_REINFORCEMENTS_CHANCE);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(7, new WaterAvoidingRandomWalkingGoal(this, 1.0D));
    }


    @Override
    protected SoundEvent getAmbientSound()
    {
        return SoundEvents.WOLF_AMBIENT;
    }


    @Override
    protected SoundEvent getDeathSound()
    {
        return SoundEvents.WOLF_DEATH;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return SoundEvents.PLAYER_ATTACK_NODAMAGE;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState blockIn)
    {
        this.playSound(SoundEvents.WOLF_STEP, 0.20F, 0.5F);
    }

}
