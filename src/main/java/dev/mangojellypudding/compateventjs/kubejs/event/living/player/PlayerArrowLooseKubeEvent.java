package dev.mangojellypudding.compateventjs.kubejs.event.living.player;

import dev.latvian.mods.kubejs.typings.Info;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.event.entity.player.ArrowLooseEvent;

@Info("Invoke when player stop using bow in `releaseUsing()`")
public class PlayerArrowLooseKubeEvent extends KubePlayerEvent<ArrowLooseEvent> {
    public PlayerArrowLooseKubeEvent(ArrowLooseEvent event) {
        super(event);
    }

    public ItemStack getBow() {
        return event.getBow();
    }

    public int getCharge() {
        return event.getCharge();
    }

    public void setCharge(int charge) {
        event.setCharge(charge);
    }

    public boolean getHasAmmo() {
        return event.hasAmmo();
    }
}
