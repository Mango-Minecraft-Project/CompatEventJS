package dev.mangojellypudding.compateventjs.kubejs.plugin.event;

import dev.latvian.mods.kubejs.event.EventGroup;
import dev.latvian.mods.kubejs.event.EventTargetType;
import dev.latvian.mods.kubejs.event.TargetedEventHandler;
import dev.mangojellypudding.compateventjs.kubejs.event.living.mob_effect.MobEffectAddedKubeEvent;
import dev.mangojellypudding.compateventjs.kubejs.event.living.mob_effect.MobEffectApplicableKubeEvent;
import dev.mangojellypudding.compateventjs.kubejs.event.living.mob_effect.MobEffectExpiredKubeEvent;
import dev.mangojellypudding.compateventjs.kubejs.event.living.mob_effect.MobEffectRemoveKubeEvent;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;

public interface MobEffectEvents {
    EventGroup GROUP = EventGroup.of("MobEffectEvents");
    EventTargetType<ResourceKey<EntityType<?>>> TARGET = EventTargetType.registryKey(Registries.ENTITY_TYPE, EntityType.class);

    TargetedEventHandler<ResourceKey<EntityType<?>>> ADDED = GROUP.common("added", () -> MobEffectAddedKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> APPLICABLE = GROUP.common("applicable", () -> MobEffectApplicableKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> EXPIRED = GROUP.common("expired", () -> MobEffectExpiredKubeEvent.class).supportsTarget(TARGET);
    TargetedEventHandler<ResourceKey<EntityType<?>>> REMOVE = GROUP.common("remove", () -> MobEffectRemoveKubeEvent.class).supportsTarget(TARGET);
}
