package dev.mangojellypudding.compateventjs.kubejs.event.living.player;

import dev.mangojellypudding.compateventjs.kubejs.event.living.KubeLivingEntityEvent;
import net.minecraft.world.entity.player.Player;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

public class KubePlayerEvent<T extends PlayerEvent> extends KubeLivingEntityEvent<T> {
    public KubePlayerEvent(T event) {
        super(event);
    }

    @Override
    public Player getEntity() {
        return event.getEntity();
    }
}
