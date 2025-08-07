package dev.mangojellypudding.compateventjs.kubejs.event.living.player;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.event.entity.player.ArrowNockEvent;

public class PlayerArrowNockKubeEvent extends KubePlayerEvent<ArrowNockEvent> {
    public PlayerArrowNockKubeEvent(ArrowNockEvent event) {
        super(event);
    }

    public InteractionResultHolder<ItemStack> getAction() {
        return event.getAction();
    }

    public void setAction(InteractionResultHolder<ItemStack> action) {
        event.setAction(action);
    }

    public void setAction(InteractionResult result, ItemStack stack) {
        event.setAction(new InteractionResultHolder<>(result, stack));
    }

    public ItemStack getBow() {
        return event.getBow();
    }

    public net.minecraft.world.InteractionHand getHand() {
        return event.getHand();
    }

    public boolean getHasAmmo() {
        return event.hasAmmo();
    }
}
