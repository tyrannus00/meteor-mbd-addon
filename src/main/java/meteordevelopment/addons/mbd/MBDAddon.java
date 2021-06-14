package meteordevelopment.addons.mbd;

import meteordevelopment.meteorclient.MeteorAddon;
import meteordevelopment.meteorclient.MeteorClient;
import meteordevelopment.meteorclient.systems.modules.Modules;

public class MBDAddon extends MeteorAddon {
    @Override
    public void onInitialize() {
        MeteorClient.LOG.info("Initializing MBD Addon");
        Modules.get().add(new AutoMountBypassDupe());
    }
}