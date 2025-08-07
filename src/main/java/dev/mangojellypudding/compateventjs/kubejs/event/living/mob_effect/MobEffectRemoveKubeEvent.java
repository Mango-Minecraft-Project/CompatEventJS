package dev.mangojellypudding.compateventjs.kubejs.event.living.mob_effect;

import dev.latvian.mods.kubejs.typings.Info;
import net.minecraft.core.Holder;
import net.minecraft.world.effect.MobEffect;
import net.neoforged.neoforge.common.EffectCure;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent.Remove;

import javax.annotation.Nullable;

@Info("Invoked when a mob effect is removed from a LivingEntity.")
public class MobEffectRemoveKubeEvent extends KubeMobEffectEvent<Remove> {
    public MobEffectRemoveKubeEvent(Remove event) {
        super(event);
    }

    @Nullable
    public EffectCure getCure() {
        return event.getCure();
    }

    public Holder<MobEffect> getRemoved() {
        return event.getEffect();
    }
}
