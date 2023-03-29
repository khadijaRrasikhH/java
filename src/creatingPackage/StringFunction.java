package creatingPackage;

import com.sun.org.apache.xml.internal.security.utils.HelperNodeList;

import java.util.Locale;

public class StringFunction {
    public static void main(String[] args) {
        String text ="        Hello world ";
        String text2 ="hello world";
        String text3 ="hello world";
       // System.out.println(text.compareTo(text2));
        System.out.println(text.isEmpty());
        System.out.println(text.toUpperCase());
        System.out.println(text.contains("He"));
        System.out.println(text.indexOf("lo"));
        System.out.println(text.trim());
        System.out.println(text.concat(text2));
        System.out.println(text.replace("H", "P"));
        System.out.println(text2.startsWith("hel"));
        System.out.println(text.matches(text3));
        System.out.println(text2.compareToIgnoreCase(text3));
        System.out.println(text2.equalsIgnoreCase(text3));
    }
}
