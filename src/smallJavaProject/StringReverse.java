package smallJavaProject;

import java.util.Scanner;

public class StringReverse {
        public static String reverse(String s) {
            return new StringBuilder(s).reverse().toString();
        }

        public static void main(String[] args) {
            String originalString = "Hello, World!";
            String reversedString = reverse(originalString);
            System.out.println(reversedString);
        }


}
