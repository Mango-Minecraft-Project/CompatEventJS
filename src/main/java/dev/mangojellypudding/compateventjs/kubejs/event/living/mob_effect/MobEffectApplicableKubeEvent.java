package dev.mangojellypudding.compateventjs.kubejs.event.living.mob_effect;

import dev.latvian.mods.kubejs.typings.Info;
import net.minecraft.world.effect.MobEffectInstance;
import net.neoforged.neoforge.event.entity.living.MobEffectEvent.Applicable;

@Info("""
        Invoked when a mob effect is being applied to a LivingEntity.
        "This event allows you to control whether the effect will be applied or not.""")
public class MobEffectApplicableKubeEvent extends KubeMobEffectEvent<Applicable> {
    public MobEffectApplicableKubeEvent(Applicable event) {
        super(event);
    }

    public MobEffectInstance getEffect() {
        return event.getEffectInstance();
    }

    @Info("Returns the result of this event, which controls if the mob effect will be applied.")
    public Applicable.Result getResult() {
        return event.getResult();
    }

    @Info("Returns If the mob effect should be applied or not, based on the current event result.")
    public boolean getApplicationResult() {
        return event.getApplicationResult();
    }

    @Info("Changes the result of this event.")
    public void setResult(Applicable.Result result) {
        event.setResult(result);
    }
}
