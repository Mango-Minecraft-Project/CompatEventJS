package dev.mangojellypudding.compateventjs.kubejs.event.living;

import dev.latvian.mods.kubejs.typings.Info;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.neoforged.neoforge.event.entity.player.CanContinueSleepingEvent;

import javax.annotation.Nullable;
import java.lang.reflect.Field;
import java.util.Optional;

public class CanContinueSleepingKubeEvent extends KubeLivingEntityEvent<CanContinueSleepingEvent> {
    @Nullable
    BlockPos sleepingPos;

    public CanContinueSleepingKubeEvent(CanContinueSleepingEvent event) throws Throwable {
        super(event);

        Field posField = event.getClass().getDeclaredField("sleepingPos");
        posField.setAccessible(true);

        @SuppressWarnings("unchecked")
        var posFieldValue = (Optional<BlockPos>) posField.get(event);
        this.sleepingPos = posFieldValue.orElse(null);

    }

    @Info("""
            Returns the current sleeping problem, if any. By default, this event is fired with the following problems:
            - `Player.BedSleepingProblem.NOT_POSSIBLE_HERE` if the sleeper is missing a bed.
            - `Player.BedSleepingProblem.NOT_POSSIBLE_NOW` if it is daytime.
            Mods may fire this event with other problems if they impose additional sleeping conditions.
            """)
    public Player.BedSleepingProblem getProblem() {
        return event.getProblem();
    }

    @Nullable
    @Info("Returns the sleeping position of the sleeping entity. May be empty.")
    public BlockPos getSleepingPos() {
        return sleepingPos;
    }

    @Info("Returns if the sleeping entity may continue sleeping.")
    public boolean getMayContinueSleeping() {
        return event.mayContinueSleeping();
    }

    @Info("Sets if the sleeping entity may continue sleeping. By default, the entity may continue sleeping if there was not a problem detected.")
    public void setContinueSleeping(boolean mayContinue) {
        event.setContinueSleeping(mayContinue);
    }
}
