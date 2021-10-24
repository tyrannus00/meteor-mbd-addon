package meteordevelopment.addons.mbd;

import meteordevelopment.meteorclient.MeteorAddon;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.systems.modules.Modules;

import java.lang.invoke.MethodHandles;

public class MBDAddon extends MeteorAddon {
    @Override
    public void onInitialize() {
        MeteorClient.LOG.info("Initializing MBD Addon");
        MeteorClient.EVENT_BUS.registerLambdaFactory("meteordevelopment", (lookupInMethod, klass) -> (MethodHandles.Lookup) lookupInMethod.invoke(null, klass, MethodHandles.lookup()));

        Modules.get().add(new AutoMountBypassDupe());
    }
}
