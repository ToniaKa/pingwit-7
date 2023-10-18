package pl.pingwit.homework_10.Palindrom;

import org.apache.commons.lang3.StringUtils;

public class PalindromReverse {  // по аналогии с ArrayPalindromeChecker -> StringUtilsPalindromeChecker
    public boolean checkPalindrom(String word) { // название isPalindrome идеально отражало бы суть метода

        String reverseWord = StringUtils.reverse(word);

        /*
        предложу вариант для упрощения кода:

        return reverseWord.equals(word);
        if (isPalindrome) {
            System.out.println(String.format("Это слово палиндром!: %s", word));
        } else {
            System.out.println(String.format("Это слово не палиндром!: %s", word));
        }
        return  isPalindrome;

        а если мы не выводим здесь в консоль, то и вовсе достаточно:

        return reversedWord.equals(word);
         */

        if (word.matches(reverseWord)) {
            String reverse = String.format("Это слово палиндром!: %s", reverseWord); // message - более подходящее название для переменной
            System.out.println(reverse);  // вывод в консоль сделаем в main методе
        } else {
            String notPalindrom = String.format("Это слово не палиндром!: %s", word); // message - более подходящее название для переменной
            System.out.println(notPalindrom); // вывод в консоль сделаем в main методе
        }
        boolean isPalindrom = word.matches(reverseWord);
        return isPalindrom;
    }
}
