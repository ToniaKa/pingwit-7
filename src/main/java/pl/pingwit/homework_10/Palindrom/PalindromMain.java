package pl.pingwit.homework_10.Palindrom;

import java.util.Scanner;

public class PalindromMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста слово: ");
        String word = scanner.nextLine();

        PalindromReverse palindrom = new PalindromReverse();
        boolean isPalindromRevers = palindrom.checkPalindrom(word);
        System.out.println(isPalindromRevers);

        PalindromArray palindromChar = new PalindromArray();
        boolean isPalindromArray = palindromChar.verifyPalindrom(word);
        System.out.println(isPalindromArray);
    }
}

