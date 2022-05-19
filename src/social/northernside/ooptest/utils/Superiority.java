package social.northernside.ooptest.utils;

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
