package pl.pingwit.homework_8;

import java.util.Arrays;
import java.util.Scanner;

public class Polindrom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите пожалуйста слово: ");
        String word = scanner.nextLine();

        char[] myChar = word.toCharArray();
        System.out.println(Arrays.toString(myChar));

        checksPalindrome(myChar);
    }

    private static void checksPalindrome(char[] myChar) {

        char[] myNewChar = new char[myChar.length];
        for (int i = myChar.length - 1; i >= 0; i--) {
            myNewChar[myChar.length - 1 - i] = myChar[i];
        }
        System.out.println(Arrays.toString(myNewChar));

        if (Arrays.equals(myChar, myNewChar)) {
            System.out.println("Это слово палиндром!");
        } else {
            System.out.println("Это слово не является палиндромом!");
        }
    }
}
