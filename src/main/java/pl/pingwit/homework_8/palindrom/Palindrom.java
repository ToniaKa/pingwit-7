package pl.pingwit.homework_8.palindrom;

import java.util.Arrays;

public class Palindrom {

    public boolean checksPalindrome(char[] myChar) { // предлагаю изменить этот метод, чтобы он возвращал boolean,
        // а вывод в консоль System.out.println("Это слово палиндром!"); или System.out.println("Это слово не является палиндромом!"); производить в методе main()

        char[] myNewChar = new char[myChar.length];
        for (int i = myChar.length - 1; i >= 0; i--) {
            myNewChar[myChar.length - 1 - i] = myChar[i];
        }
        System.out.println(Arrays.toString(myNewChar));

        boolean isPalindrome;
        isPalindrome = Arrays.equals(myChar, myNewChar);

        return isPalindrome;
    }
}




