package dev.mangojellypudding.compateventjs.kubejs.plugin.event;

import dev.latvian.mods.kubejs.event.EventGroup;
import dev.latvian.mods.kubejs.event.EventTargetType;
import dev.latvian.mods.kubejs.event.TargetedEventHandler;
import dev.mangojellypudding.compateventjs.kubejs.event.living.*;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;

public interface LivingEvents {
    EventGroup GROUP = EventGroup.of("LivingEvents");
    EventTargetType<ResourceKey<EntityType<?>>> TARGET = EventTargetType.registryKey(Registries.ENTITY_TYPE, EntityType.class);

    TargetedEventHandler<ResourceKey<EntityType<?>>> ANIMAL_TAME = GROUP.common("animalTame", () -> AnimalTameKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> ARMOR_HURT = GROUP.common("armorHurt", () -> ArmorHurtKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> CAN_CONTINUE_SLEEPING = GROUP.common("canContinueSleeping", () -> CanContinueSleepingKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> EFFECT_PARTICLE_MODIFICATION = GROUP.common("effectParticleModification", () -> EffectParticleModificationKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> ENDER_MAN_ANGER = GROUP.common("enderManAnger", () -> EnderManAngerKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> AFTER_CONVERSION = GROUP.common("afterConversion", () -> LivingConversionKubeEvent.Post.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> BEFORE_CONVERSION = GROUP.common("beforeConversion", () -> LivingConversionKubeEvent.Pre.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> BREATH = GROUP.common("breath", () -> LivingBreathKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> CHANGE_TARGET = GROUP.common("changeTarget", () -> LivingChangeTargetKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> DESTROY_BLOCK = GROUP.common("destroyBlock", () -> LivingDestroyBlockKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> DROWN = GROUP.common("drown", () -> LivingDrownKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> EXPERIENCE_DROPS = GROUP.common("experienceDrops", () -> LivingExperienceDropKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> FALL = GROUP.common("fall", () -> LivingFallKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> GET_PROJECTILE = GROUP.common("", () -> LivingGetProjectileKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> HEAL = GROUP.common("heal", () -> LivingHealKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> INCOMING_DAMAGE = GROUP.common("incomingDamage", () -> LivingIncomingDamageKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> JUMP = GROUP.common("jump", () -> LivingJumpKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> KNOCK_BACK = GROUP.common("knockBack", () -> LivingKnockBackKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> SHIELD_BLOCK = GROUP.common("shieldBlock", () -> LivingShieldBlockKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> SWAP_ITEM = GROUP.common("swapItem", () -> LivingSwapItemKubeEvent.Hands.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> TOTEM = GROUP.common("totem", () -> LivingUseTotemKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> USE_ITEM_FINISH = GROUP.common("useItemFinish", () -> LivingEntityUseItemKubeEvent.Finish.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> USE_ITEM_START = GROUP.common("useItemStart", () -> LivingEntityUseItemKubeEvent.Start.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> USE_ITEM_STOP = GROUP.common("useItemStop", () -> LivingEntityUseItemKubeEvent.Stop.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> USE_ITEM_TICK = GROUP.common("useItemTick", () -> LivingEntityUseItemKubeEvent.Tick.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> VISIBILITY = GROUP.common("visibility", () -> LivingVisibilityKubeEvent.class).supportsTarget(TARGET);
}
