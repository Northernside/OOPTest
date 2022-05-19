package social.northernside.ooptest.phones;

import social.northernside.ooptest.utils.FMState;
import social.northernside.ooptest.utils.FindMyNetwork;

public class BetterIPhone extends IPhone {
    public BetterIPhone(String platform, String modelDisplayName, String modelNumber, String softwareVersion, Enum colorName, int batteryHealth, int storageInGB) {
        super(platform, modelDisplayName, modelNumber, softwareVersion, colorName, batteryHealth, storageInGB);
    }

    @Override
    public void boot() {
        System.out.println(modelDisplayName + ": Booted up (faster)!");
        FindMyNetwork.sendStateToNetwork(FMState.ONLINE, this);
        isBooted = true;
    }
}
