package social.northernside.ooptest;

import social.northernside.ooptest.phones.BetterIPhone;
import social.northernside.ooptest.phones.IPhone;
import social.northernside.ooptest.phones.JailbrokenIPhone;
import social.northernside.ooptest.utils.FMState;
import social.northernside.ooptest.utils.ModelColor;
import social.northernside.ooptest.utils.Superiority;

public class OOPTest {
    public static void main(String[] args) {
        IPhone iPhoneFromElias = new IPhone("iPhone13,2", "iPhone 12", "A2403",
                "15.3.1", ModelColor.BLACK, 92, 64);
        IPhone thePerfectiPhoneToEverExist = new IPhone("IPhone13,4", "iPhone 12 Pro Max",
                "A2411", "14.5", ModelColor.PURPLE, 100, 512);
        JailbrokenIPhone jailbrokenIPhone = new JailbrokenIPhone("IPhone13,2", "iPhone 12 (JB)",
                "A2403", "15.1", ModelColor.GREEN, 100, 512);
        BetterIPhone betterIPhone = new BetterIPhone("IPhone15,5", "iPhone 14 Pro Max Ultra M2 MAX",
                "A2611", "16.3.1", ModelColor.RED, 420, 4096);
        iPhoneFromElias.boot();
        thePerfectiPhoneToEverExist.boot();
        jailbrokenIPhone.boot();
        betterIPhone.boot();
        System.out.println((Superiority.isSuperior("Samsung") ? "Samsung is better than Huawei."
                : "Samsung is not better than Huawei."));
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