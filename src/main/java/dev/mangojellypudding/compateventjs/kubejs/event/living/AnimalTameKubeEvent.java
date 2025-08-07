package dev.mangojellypudding.compateventjs.kubejs.event.living;

import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.neoforged.neoforge.event.entity.living.AnimalTameEvent;

public class AnimalTameKubeEvent extends KubeLivingEntityEvent<AnimalTameEvent> {
    public AnimalTameKubeEvent(AnimalTameEvent event) {
        super(event);
    }

    @Override
    public Animal getEntity() {
        return event.getAnimal();
    }

    public Player getTamer() {
        return event.getTamer();
    }
}
