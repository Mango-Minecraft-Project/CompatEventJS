package dev.mangojellypudding.compateventjs.kubejs.event.living.player;

import net.minecraft.world.entity.Entity;
import net.neoforged.neoforge.event.entity.player.CriticalHitEvent;

public class PlayerCriticalHitKubeEvent extends KubePlayerEvent<CriticalHitEvent> {
    public PlayerCriticalHitKubeEvent(CriticalHitEvent event) {
        super(event);
    }

    public boolean getDisableSweep() {
        return event.disableSweep();
    }

    public void setDisableSweep(boolean disable) {
        event.setDisableSweep(disable);
    }

    public float getDamageMultiplier() {
        return event.getDamageMultiplier();
    }

    public void setDamageMultiplier(float multiplier) {
        event.setDamageMultiplier(multiplier);
    }

    public Entity getTarget() {
        return event.getTarget();
    }

    public float getVanillaMultiplier() {
        return event.getVanillaMultiplier();
    }

    public boolean isCriticalHit() {
        return event.isCriticalHit();
    }

    public void setCriticalHit(boolean criticalHit) {
        event.setCriticalHit(criticalHit);
    }

    public boolean isVanillaCritical() {
        return event.isVanillaCritical();
    }
}
