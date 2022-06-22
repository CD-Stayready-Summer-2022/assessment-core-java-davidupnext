package com.codedifferently.assessment01.part05;

public class Palindrome {
    public Integer countPalindromes(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i; j < input.length(); j++) {
                String sub = input.substring(i, j + 1);
                StringBuilder rsub = new StringBuilder(sub);
                if (sub.equals(rsub.reverse().toString())) {
                    count++;
                }
            }
        }
        return count;
    }
}