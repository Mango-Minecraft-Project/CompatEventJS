package dev.mangojellypudding.compateventjs.kubejs.event.living.player;

import net.minecraft.server.level.ServerPlayer;
import net.neoforged.neoforge.event.entity.player.PlayerEvent;

public class KubeServerPlayerEvent<T extends PlayerEvent> extends KubePlayerEvent<T>{
    public KubeServerPlayerEvent(T event) {
        super(event);
    }

    @Override
    public ServerPlayer getEntity() {
        return (ServerPlayer) event.getEntity();
    }
}
