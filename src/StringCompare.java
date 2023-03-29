import java.util.Scanner;

public class StringCompare {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a string: ");
            String original = sc.nextLine();
            String reverse = "";

            // Reverse the string
            for (int i = original.length() - 1; i >= 0; i--) {
                reverse += original.charAt(i);
            }

            // Compare the original and reverse strings
            if (original.equals(reverse)) {
                System.out.println("The string is a palindrome.");
            } else {
                System.out.println("The string is not a palindrome.");
            }
        }
    }
