package com.aeronaut;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        List<Character> letterList = new LinkedList<>();
        List<Character> tempLetterList = new LinkedList<>();
        List<Character> backwardList = new LinkedList<>();


        for (Character letter : word.toCharArray()) {
            tempLetterList.add(letter);
        }
        letterList = tempLetterList;
        for (int i = 0; i < word.length(); i++) {
            ((LinkedList<Character>) backwardList).addFirst(((LinkedList<Character>) tempLetterList).removeLast());
        }

        for (Character letter : letterList) {
            for (Character backwardLetter : backwardList) {
                if (letter != backwardLetter) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(Palindrome.isPalindrome("Delevasaed"));
    }
}