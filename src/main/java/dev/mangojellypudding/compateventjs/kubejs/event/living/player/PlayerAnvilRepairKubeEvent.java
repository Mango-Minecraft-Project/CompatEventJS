package dev.mangojellypudding.compateventjs.kubejs.event.living.player;

import dev.latvian.mods.kubejs.typings.Info;
import net.minecraft.world.item.ItemStack;
import net.neoforged.neoforge.event.entity.player.AnvilRepairEvent;

public class PlayerAnvilRepairKubeEvent extends KubePlayerEvent<AnvilRepairEvent> {
    public PlayerAnvilRepairKubeEvent(AnvilRepairEvent event) {
        super(event);
    }

    public float getBreakChance() {
        return event.getBreakChance();
    }

    @Info("Get the first item input into the anvil")
    public ItemStack getLeft() {
        return event.getLeft();
    }

    @Info("Get the second item input into the anvil")
    public ItemStack getRight() {
        return event.getRight();
    }

    @Info("Get the output result from the anvil")
    public ItemStack getOutput() {
        return event.getOutput();
    }

    public void setBreakChance(float chance) {
        event.setBreakChance(chance);
    }
}
