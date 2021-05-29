package meteordevelopment.addons.mbd;

import minegame159.meteorclient.MeteorAddon;
import minegame159.meteorclient.MeteorClient;
import minegame159.meteorclient.systems.modules.Modules;

public class MBDAddon extends MeteorAddon {

    @Override
    public void onInitialize() {
        MeteorClient.LOG.info("Initializing MBD Addon");
        Modules.get().add(new AutoMountBypassDupe());
    }

}