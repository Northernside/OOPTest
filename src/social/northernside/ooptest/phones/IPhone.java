package social.northernside.ooptest.phones;

import social.northernside.ooptest.utils.FMState;
import social.northernside.ooptest.utils.FindMyNetwork;

public class IPhone {
    public boolean isBooted;

    // Member Fields
    public String platform;
    public String modelDisplayName;
    public String modelNumber;
    public String softwareVersion;
    public Enum colorName;
    public int batteryHealth;
    public int storageInGB;

    // iPhone Constructor
    public IPhone(String platform, String modelDisplayName, String modelNumber, String softwareVersion, Enum colorName, int batteryHealth, int storageInGB) {
        this.platform = platform;
        this.modelDisplayName = modelDisplayName;
        this.modelNumber = modelNumber;
        this.softwareVersion = softwareVersion;
        this.colorName = colorName;
        this.batteryHealth = batteryHealth;
        this.storageInGB = storageInGB;
    }

    public void boot() {
        System.out.println(modelDisplayName + ": booted!");
        FindMyNetwork.sendStateToNetwork(FMState.ONLINE, this);
        isBooted = true;
    }

    public void shutdown() {
        if (isBooted) {
            System.out.println(modelDisplayName + ": shutdown!");
            FindMyNetwork.sendStateToNetwork(FMState.OFFLINE, this);
        }
    }

    // Member Methods
    public void shrinkBatteryHealth() {
        this.batteryHealth -= 1;
    }
}