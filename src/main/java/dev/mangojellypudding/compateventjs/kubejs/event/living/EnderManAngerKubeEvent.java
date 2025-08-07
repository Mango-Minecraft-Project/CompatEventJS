package dev.mangojellypudding.compateventjs.kubejs.event.living;

import dev.latvian.mods.kubejs.typings.Info;
import net.minecraft.world.entity.player.Player;
import net.neoforged.neoforge.event.entity.living.EnderManAngerEvent;

public class EnderManAngerKubeEvent extends KubeLivingEntityEvent<EnderManAngerEvent> {
    public EnderManAngerKubeEvent(EnderManAngerEvent event) {
        super(event);
    }

    @Override
    @Info("The player that is being checked.")
    public Player getPlayer() {
        return event.getPlayer();
    }
}
