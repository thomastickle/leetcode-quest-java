package com.github.ttickle.string;

public class StringQuestion1 {
    public boolean detectCapitalUse(String word) {
        int capCount = 0;
        for (int i = 0; i < word.length(); i++) {
            char c = word.charAt(i);

            if ('A' <= c && c <= 'Z') {
                capCount++;
            }
        }

        return capCount == 0 || capCount == word.length() || (capCount == 1 && word.charAt(0) >= 'A' && word.charAt(0) <= 'Z');
    }
}
