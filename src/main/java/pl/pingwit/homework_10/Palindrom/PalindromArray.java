package pl.pingwit.homework_10.Palindrom;

import java.util.Arrays;

public class PalindromArray {
    public boolean verifyPalindrom(String word) {

        char[] myChar = word.toCharArray();
        char[] myNewChar = new char[myChar.length];
        for (int i = myChar.length - 1; i >= 0; i--) {
            myNewChar[myChar.length - 1 - i] = myChar[i];
        }
        System.out.println("Это слово палиндром!: " + Arrays.toString(myNewChar));

        boolean isPalindrome = Arrays.equals(myChar, myNewChar);

        return isPalindrome;
    }
}
