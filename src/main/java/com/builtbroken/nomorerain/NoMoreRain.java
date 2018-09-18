package com.builtbroken.nomorerain;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.TickEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @see <a href="https://github.com/BuiltBrokenModding/VoltzEngine/blob/development/license.md">License</a> for what you can and can't do with the code.
 * Created by Dark(DarkGuardsman, Robert) on 3/1/2017.
 */
@Mod(modid = "nomorerain", name = "No More Rain", version = NoMoreRain.VERSION)
@Mod.EventBusSubscriber
public class NoMoreRain
{
    private static final String MAJOR_VERSION = "1";
    private static final String MINOR_VERSION = "0";
    private static final String REVISION_VERSION = "0";
    private static final String BUILD_VERSION = "0";
    static final String VERSION = MAJOR_VERSION + "." + MINOR_VERSION + "." + REVISION_VERSION + "." + BUILD_VERSION;

    /** Information output thing */
    public static final Logger logger = LogManager.getLogger("SBM-NoMoreRain");

    @SubscribeEvent
    public static void onWorldTick(TickEvent.WorldTickEvent event)
    {
        if(!event.world.isRemote && event.world.isRaining())
        {
            event.world.getWorldInfo().setRaining(false);
        }
    }
}
