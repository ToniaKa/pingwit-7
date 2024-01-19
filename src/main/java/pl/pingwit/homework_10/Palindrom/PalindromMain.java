package pl.pingwit.homework_10.Palindrom;

import java.util.Scanner;

public class PalindromMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста слово: ");
        String word = scanner.nextLine();

        //StringUtilsPalindromeChecker palindrom = new StringUtilsPalindromeChecker();
        ArrayPalindromeChecker arrayPalindromeChecker=new ArrayPalindromeChecker();

        boolean isPalindrom1 = arrayPalindromeChecker.isPalindrom(word);
        System.out.println(isPalindrom1 ? "Это слово палиндром!" : "Это слово не палиндром!");

        /*boolean isPalindrom = palindrom.isPalindrome(word);  // достаточно названия isPalindrome
        // выведем сообщения:
        System.out.println(isPalindrom ? "Это слово палиндром!" : "Это слово не палиндром!");*/
    }
}

