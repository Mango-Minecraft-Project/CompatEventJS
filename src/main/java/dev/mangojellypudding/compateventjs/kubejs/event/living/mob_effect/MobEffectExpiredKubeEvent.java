package dev.mangojellypudding.compateventjs.kubejs.event.living.mob_effect;

import dev.latvian.mods.kubejs.typings.Info;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent.Expired;

@Info("Invoked when a mob effect expires on a LivingEntity.")
public class MobEffectExpiredKubeEvent extends KubeMobEffectEvent<Expired> {
    public MobEffectExpiredKubeEvent(Expired event) {
        super(event);
    }
}
