package social.northernside.ooptest;

import social.northernside.ooptest.utils.FMState;
import social.northernside.ooptest.utils.ModelColor;

public class OOPTest {
    public static class IPhone {
        // Member Fields
        String platform;
        String modelDisplayName;
        String modelNumber;
        String softwareVersion;
        Enum colorName;
        int batteryHealth;
        int storageInGB;

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
        }

        public void shutdown() {
            System.out.println(modelDisplayName + ": shutdown!");
        }

        public void pingFMMeshNetwork() {
            FindMyNetwork.sendStateToNetwork(FMState.ONLINE);
        }

        // Member Methods
        public void shrinkBatteryHealth() {
            this.batteryHealth -= 1;
        }
    }

    public static class FindMyNetwork {
        public static void sendStateToNetwork(Enum state) {
            System.out.println(state);
        }
    }

    public static class JailbrokenIPhone extends IPhone {
        public JailbrokenIPhone(String platform, String modelDisplayName, String modelNumber, String softwareVersion, Enum colorName, int batteryHealth, int storageInGB) {
            super(platform, modelDisplayName, modelNumber, softwareVersion, colorName, batteryHealth, storageInGB);
        }

        private boolean isBetter = true;

        @Override
        public void boot() {
            System.out.println(modelDisplayName + ": Error while booting!");

            /*
               Doesn't boot because it's on iOS 15 and Apple made the device not bootable since iOS 15
               if it detects unauthorized changes in the root dir (that's what Jailbreaks do)
            */
        }
    }

    public static class BetterIPhone extends IPhone {
        public BetterIPhone(String platform, String modelDisplayName, String modelNumber, String softwareVersion, Enum colorName, int batteryHealth, int storageInGB) {
            super(platform, modelDisplayName, modelNumber, softwareVersion, colorName, batteryHealth, storageInGB);
        }

        @Override
        public void boot() {
            System.out.println(modelDisplayName + ": Booted up (faster)!");
        }
    }

    public interface Superiority {
        String betterBrand = "Huawei";

        // Static method
        static boolean isSuperior(String phoneBrand) {
            if (phoneBrand.equals(betterBrand)) {
                return true;
            }

            return false;
        }
    }

    public static void main(String[] args) {
        IPhone iPhoneFromElias = new IPhone("iPhone13,2", "iPhone 12", "A2403",
                "15.3.1", ModelColor.BLACK, 92, 64);
        IPhone thePerfectiPhoneToEverExist = new IPhone("IPhone13,4", "iPhone 12 Pro Max",
                "A2411", "14.5", ModelColor.PURPLE, 100, 512);
        JailbrokenIPhone jailbrokenIPhone = new JailbrokenIPhone("IPhone13,2", "iPhone 12",
                "A2403", "15.1", ModelColor.GREEN, 100, 512);
        BetterIPhone betterIPhone = new BetterIPhone("IPhone15,5", "iPhone 14 Pro Max Ultra M2 MAX",
                "A2611", "16.3.1", ModelColor.RED, 420, 4096);
        iPhoneFromElias.boot();
        iPhoneFromElias.pingFMMeshNetwork();
        thePerfectiPhoneToEverExist.boot();
        jailbrokenIPhone.boot();
        betterIPhone.boot();
        System.out.println((Superiority.isSuperior("Samsung") ? "Samsung is superior than Huawei."
                : "Samsung is not superior than Huawei."));
        System.out.println("Elias\' iPhone:\n" + iPhoneFromElias.platform + "\n" + iPhoneFromElias.modelDisplayName
                + "\n" + iPhoneFromElias.modelNumber + "\n" + iPhoneFromElias.softwareVersion + "\n" +
                iPhoneFromElias.colorName + "\n" + iPhoneFromElias.batteryHealth + "\n" +
                iPhoneFromElias.storageInGB);
        System.out.println("Perfect iPhone:\n" + thePerfectiPhoneToEverExist.platform + "\n"
                + thePerfectiPhoneToEverExist.modelDisplayName + "\n" + thePerfectiPhoneToEverExist.modelNumber
                + "\n" + thePerfectiPhoneToEverExist.softwareVersion + "\n" + thePerfectiPhoneToEverExist.colorName
                + "\n" + thePerfectiPhoneToEverExist.batteryHealth + "\n" + thePerfectiPhoneToEverExist.storageInGB);
        System.out.println((Superiority.isSuperior("Samsung")) ? "Samsung is superior than Huawei" : "Samsung is not superior than Huawei.");
        iPhoneFromElias.shrinkBatteryHealth();
        System.out.println("Elias' iPhone lost 1% battery health.\nCurrent battery health: " + iPhoneFromElias.batteryHealth + "%");
        iPhoneFromElias.shutdown();
        thePerfectiPhoneToEverExist.shutdown();
        betterIPhone.shutdown();
    }
}