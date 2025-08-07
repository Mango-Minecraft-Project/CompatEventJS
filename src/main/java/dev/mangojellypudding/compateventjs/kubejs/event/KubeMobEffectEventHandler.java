package dev.mangojellypudding.compateventjs.kubejs.event;

import dev.mangojellypudding.compateventjs.CompatEventJS;
import dev.mangojellypudding.compateventjs.kubejs.event.living.mob_effect.MobEffectAddedKubeEvent;
import dev.mangojellypudding.compateventjs.kubejs.event.living.mob_effect.MobEffectApplicableKubeEvent;
import dev.mangojellypudding.compateventjs.kubejs.event.living.mob_effect.MobEffectExpiredKubeEvent;
import dev.mangojellypudding.compateventjs.kubejs.event.living.mob_effect.MobEffectRemoveKubeEvent;
import dev.mangojellypudding.compateventjs.kubejs.plugin.event.MobEffectEvents;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent.Added;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent.Applicable;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent.Expired;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent.Remove;

@EventBusSubscriber(modid = CompatEventJS.MODID)
public class KubeMobEffectEventHandler {
    public static ResourceKey<EntityType<?>> getKey(MobEffectEvent event) {
        return event.getEntity().getType().kjs$getKey();
    }

    @SubscribeEvent
    public static void added(Added event) {
        var key = getKey(event);

        if (MobEffectEvents.ADDED.hasListeners(key)) {
            MobEffectEvents.ADDED.post(event.getEntity(), key, new MobEffectAddedKubeEvent(event));
        }
    }

    @SubscribeEvent
    public static void removed(Remove event) {
        var key = getKey(event);

        if (MobEffectEvents.REMOVE.hasListeners(key)) {
            MobEffectEvents.REMOVE.post(event.getEntity(), key, new MobEffectRemoveKubeEvent(event));
        }
    }

    @SubscribeEvent
    public static void applicable(Applicable event) {
        var key = getKey(event);

        if (MobEffectEvents.APPLICABLE.hasListeners(key)) {
            MobEffectEvents.APPLICABLE.post(event.getEntity(), key, new MobEffectApplicableKubeEvent(event));
        }
    }

    @SubscribeEvent
    public static void expired(Expired event) {
        var key = getKey(event);

        if (MobEffectEvents.EXPIRED.hasListeners(key)) {
            MobEffectEvents.EXPIRED.post(event.getEntity(), key, new MobEffectExpiredKubeEvent(event));
        }
    }
}
