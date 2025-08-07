package dev.mangojellypudding.compateventjs.kubejs.event.living.mob_effect;

import dev.latvian.mods.kubejs.typings.Info;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent.Added;

import javax.annotation.Nullable;

@Info("Invoked when a mob effect is added to a LivingEntity.")
public class MobEffectAddedKubeEvent extends KubeMobEffectEvent<Added> {
    public MobEffectAddedKubeEvent(Added event) {
        super(event);
    }

    public MobEffectInstance getEffect() {
        return event.getEffectInstance();
    }

    @Nullable
    public Entity getSource() {
        return event.getEffectSource();
    }

    @Nullable
    public MobEffectInstance getOldEffect() {
        return event.getOldEffectInstance();
    }
}
