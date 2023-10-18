package pl.pingwit.homework_10.Palindrom;

import java.util.Arrays;

public class PalindromArray { // это реализация проверки на палиндром через массив. ей бы подошло имя ArrayPalindromeChecker или подобное
    public boolean verifyPalindrom(String word) {  // название isPalindrome идеально отражало бы суть метода

        char[] myChar = word.toCharArray();  // хоть это и локальная переменная, ее имя должно нести больше смысла. в данном случае, мы раскладываем слово на буквы, поэтому подойдет wordChars
        char[] myNewChar = new char[myChar.length]; // а здесь мы храним развернутые символы из слова, поэтому подойдет reversedWordChars или reversedChars для краткости
        for (int i = myChar.length - 1; i >= 0; i--) {
            myNewChar[myChar.length - 1 - i] = myChar[i];
        }
        // System.out.println("Это слово палиндром!: " + Arrays.toString(myNewChar));  - этот вывод в консоль сделаем в main методе

        boolean isPalindrome = Arrays.equals(myChar, myNewChar); // в таких случаях создавать переменную необязательно,
        // лучше вернуть из метода результат: return Arrays.equals(myChar, myNewChar);

        return isPalindrome;
    }
}
