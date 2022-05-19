package social.northernside.ooptest.utils;

import social.northernside.ooptest.phones.IPhone;

public class FindMyNetwork {
    public static void sendStateToNetwork(Enum state, IPhone iPhone) {
        System.out.println(iPhone.modelDisplayName + ": Received status " + state);
    }
}
