package dev.mangojellypudding.compateventjs;

import com.mojang.logging.LogUtils;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(CompatEventJS.MODID)
public class CompatEventJS {
    public static final String MODID = "compateventjs";
    public static final Logger LOGGER = LogUtils.getLogger();

    public CompatEventJS(IEventBus modEventBus, ModContainer modContainer) {
    }
}
