package dev.mangojellypudding.compateventjs.kubejs.event.living.player;

import net.minecraft.world.entity.Entity;
import net.neoforged.neoforge.event.entity.player.AttackEntityEvent;

public class PlayerAttackEntityKubeEvent extends KubePlayerEvent<AttackEntityEvent> {
    public PlayerAttackEntityKubeEvent(AttackEntityEvent event) {
        super(event);
    }

    public Entity getTarget() {
        return event.getTarget();
    }
}
