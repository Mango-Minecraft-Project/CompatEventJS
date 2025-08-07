package dev.mangojellypudding.compateventjs.kubejs.plugin;

import dev.latvian.mods.kubejs.event.EventGroupRegistry;
import dev.latvian.mods.kubejs.plugin.KubeJSPlugin;
import dev.mangojellypudding.compateventjs.kubejs.plugin.event.LivingEvents;
import dev.mangojellypudding.compateventjs.kubejs.plugin.event.MobEffectEvents;

public class CompatEventJSPlugin implements KubeJSPlugin {
    @Override
    public void registerEvents(EventGroupRegistry registry) {
        registry.register(LivingEvents.GROUP);
        registry.register(MobEffectEvents.GROUP);
    }
}
