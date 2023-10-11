package pl.pingwit.homework_8.palindrom;

import java.util.Arrays;
import java.util.Scanner;

public class PalindromMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста слово: ");
        String word = scanner.nextLine();

        char[] myChar = word.toCharArray();
        System.out.println(Arrays.toString(myChar));

        Palindrom palindrom = new Palindrom();
        boolean checksPalindrome = palindrom.checksPalindrome(myChar);

        String messageIsPalindrom = checksPalindrome ? "Это слово палиндром" : "Это слово не является палиндромом";
        System.out.println(messageIsPalindrom);
    }
}
