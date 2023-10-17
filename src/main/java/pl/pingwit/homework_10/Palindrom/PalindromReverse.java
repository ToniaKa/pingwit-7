package pl.pingwit.homework_10.Palindrom;

import org.apache.commons.lang3.StringUtils;

public class PalindromReverse {
    public boolean checkPalindrom(String word) {

        String reverseWord = StringUtils.reverse(word);
        if (word.matches(reverseWord)) {
            String reverse = String.format("Это слово палиндром!: %s", reverseWord);
            System.out.println(reverse);
        } else {
            String notPalindrom = String.format("Это слово не палиндром!: %s", word);
            System.out.println(notPalindrom);

        }
        boolean isPalindrom = word.matches(reverseWord);
        return isPalindrom;
    }
}
