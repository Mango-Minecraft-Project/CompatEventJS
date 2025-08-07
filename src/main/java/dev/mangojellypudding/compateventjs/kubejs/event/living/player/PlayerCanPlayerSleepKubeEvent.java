package dev.mangojellypudding.compateventjs.kubejs.event.living.player;

import dev.latvian.mods.kubejs.typings.Info;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.BlockState;
import net.neoforged.neoforge.event.entity.player.CanPlayerSleepEvent;

import javax.annotation.Nullable;

public class PlayerCanPlayerSleepKubeEvent extends KubePlayerEvent<CanPlayerSleepEvent> {
    public PlayerCanPlayerSleepKubeEvent(CanPlayerSleepEvent event) {
        super(event);
    }

    @Override
    public ServerPlayer getEntity() {
        return event.getEntity();
    }

    public BlockPos getPos() {
        return event.getPos();
    }

    @Nullable
    @Info("Returns the current sleeping problem.")
    public Player.BedSleepingProblem getProblem() {
        return event.getProblem();
    }

    @Info("Sets a new sleeping problem. If the new problem is null, the player is allowed to sleep here.")
    public void setProblem(@Nullable Player.BedSleepingProblem problem) {
        event.setProblem(problem);
    }

    public BlockState getState() {
        return event.getState();
    }

    @Nullable
    @Info("Returns the default sleeping problem based on the vanilla checks.")
    public Player.BedSleepingProblem getVanillaProblem() {
        return event.getVanillaProblem();
    }
}
