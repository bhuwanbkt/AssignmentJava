package Assignment1;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        System.out.println("Enter a character");
        String ch = new Scanner(System.in).nextLine();

        if (ch.length() <= 1 && !Character.isDigit(ch.charAt(0))) {
            switch (ch) {
                case "a", "e", "i", "o", "u", "A", "E", "I", "O", "U" -> System.out.println(ch + " is vowel");
                default -> System.out.println(ch + " is consonant");
            }
        }
        else
        {
            System.out.println("Not Matched");
        }
    }
}
