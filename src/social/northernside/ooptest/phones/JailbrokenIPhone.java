package social.northernside.ooptest.phones;

public class JailbrokenIPhone extends IPhone {
    public JailbrokenIPhone(String platform, String modelDisplayName, String modelNumber, String softwareVersion, Enum colorName, int batteryHealth, int storageInGB) {
        super(platform, modelDisplayName, modelNumber, softwareVersion, colorName, batteryHealth, storageInGB);
    }

    @Override
    public void boot() {
        System.out.println(modelDisplayName + ": Error while booting!");

        /*
           Doesn't boot because it's on iOS 15 and Apple made the device not bootable since iOS 15
           if it detects unauthorized changes in the root dir (that's what Jailbreaks do)
        */
    }
}
