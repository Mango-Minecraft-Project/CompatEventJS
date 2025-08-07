package dev.mangojellypudding.compateventjs.kubejs.event.living;

import net.minecraft.core.particles.ParticleOptions;
import net.minecraft.world.effect.MobEffectInstance;
import net.neoforged.neoforge.event.entity.living.EffectParticleModificationEvent;

public class EffectParticleModificationKubeEvent extends KubeLivingEntityEvent<EffectParticleModificationEvent> {
    public EffectParticleModificationKubeEvent(EffectParticleModificationEvent event) {
        super(event);
    }

    public MobEffectInstance getEffect() {
        return event.getEffect();
    }

    public ParticleOptions getOriginalParticleOptions() {
        return event.getOriginalParticleOptions();
    }

    public ParticleOptions getParticleOptions() {
        return event.getParticleOptions();
    }

    public void setParticleOptions(ParticleOptions particleOptions) {
        event.setParticleOptions(particleOptions);
    }

    public boolean isVisible() {
        return event.isVisible();
    }

    public void setVisible(boolean visible) {
        event.setVisible(visible);
    }
}
