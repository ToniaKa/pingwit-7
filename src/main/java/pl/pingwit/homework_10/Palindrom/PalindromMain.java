package pl.pingwit.homework_10.Palindrom;

import java.util.Scanner;

public class PalindromMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста слово: ");
        String word = scanner.nextLine();

        StringUtilsPalindromeChecker palindrom = new StringUtilsPalindromeChecker();

        boolean isPalindrom = palindrom.isPalindrome(word);  // достаточно названия isPalindrome
        // выведем сообщения:

        System.out.println(isPalindrom ? "Это слово палиндром!" : "Это слово не палиндром!");
    }
}

