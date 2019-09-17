package ac.za.cput.adp3.xyzcongolmerate.util;

import java.util.ArrayList;
import java.util.UUID;

public class Helper {

    public static String generateRandomGivenSuffix(String suffix) {
        return suffix + "-" + UUID.randomUUID().toString();
    }

    public static String getClassName(Class<?>  aClass) {
        return aClass.getSimpleName();
    }

    public static String getSuffixFromClassName(Class<?> aClass) {
        String className = getClassName(aClass);
            for (int i = 0; i < className.length(); i++) {
            ArrayList <String> caps = new ArrayList<>();
            if (Character.isUpperCase(className.charAt(i))) {
                caps.add(className.substring(i));
            }
            StringBuilder sb = new StringBuilder();
            for (String s : caps)
            {
                sb.append(s);
            }
            className =  sb.toString();
            }
                return className;
    }
}
