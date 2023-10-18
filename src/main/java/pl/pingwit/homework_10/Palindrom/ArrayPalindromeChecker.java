package pl.pingwit.homework_10.Palindrom;

import java.util.Arrays;

public class ArrayPalindromeChecker { // это реализация проверки на палиндром через массив. ей бы подошло имя ArrayPalindromeChecker или подобное
    public boolean isPalindrom(String word) {  // название isPalindrome идеально отражало бы суть метода

        char[] wordChars = word.toCharArray();  // хоть это и локальная переменная, ее имя должно нести больше смысла. в данном случае, мы раскладываем слово на буквы, поэтому подойдет wordChars
        char[] reversedChars = new char[wordChars.length]; // а здесь мы храним развернутые символы из слова, поэтому подойдет reversedWordChars или reversedChars для краткости
        for (int i = wordChars.length - 1; i >= 0; i--) {
            reversedChars[wordChars.length - 1 - i] = wordChars[i];
        }
        // System.out.println("Это слово палиндром!: " + Arrays.toString(myNewChar));  - этот вывод в консоль сделаем в main методе
        // в таких случаях создавать переменную необязательно,
        // лучше вернуть из метода результат: return Arrays.equals(myChar, myNewChar);

        return Arrays.equals(wordChars, reversedChars);
    }
}
