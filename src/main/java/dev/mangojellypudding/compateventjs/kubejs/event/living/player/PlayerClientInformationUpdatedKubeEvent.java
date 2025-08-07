package dev.mangojellypudding.compateventjs.kubejs.event.living.player;

import dev.latvian.mods.kubejs.typings.Info;
import net.minecraft.server.level.ClientInformation;
import net.neoforged.neoforge.event.entity.player.ClientInformationUpdatedEvent;

public class PlayerClientInformationUpdatedKubeEvent extends KubeServerPlayerEvent<ClientInformationUpdatedEvent> {
    public PlayerClientInformationUpdatedKubeEvent(ClientInformationUpdatedEvent event) {
        super(event);
    }

    @Info("""
            Returns the existing client info from to the player.
            May be blank or defaulted initial data on first event call for a player instance.""")
    public ClientInformation getOldInformation() {
        return event.getOldInformation();
    }

    @Info("""
            Returns the new client info to be applied to the player.
            Sometimes the client resends unchanged options, so if that matters for your use case, check equality with getOldInformation().""")
    public ClientInformation getUpdatedInformation() {
        return event.getUpdatedInformation();
    }
}
