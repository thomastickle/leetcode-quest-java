package com.github.ttickle.stringmatching;

public class StringMatchingQuestion3 {

    /**
     * My first solution was to set a lower bound on how many times a would
     * have to repeat in order for b to possibly exist in it, and then also
     * set an upper bound which is simply the minimum + 1 more copy.  I
     * tested using the indexOf feature of stringbuilder to find the match.
     *
     * However, I was not satisfied with the result, which made me dig into
     * other solutions where I came across KMP and made myself learn how it
     * works and how to implement it.  This results in a massive speedup.
     */
    public int repeatedStringMatch(String a, String b) {
        int minRepeats = (b.length() + a.length() - 1) / a.length();
        int maxRepeats = minRepeats + 1;
        int maxSearchLength = maxRepeats * a.length();

        int matchStart = kmpSearchRepeatedText(a, b, maxSearchLength);

        if (matchStart == -1) {
            return -1;
        }

        int matchEndExclusive = matchStart + b.length();

        return (matchEndExclusive + a.length() - 1) / a.length();
    }

    private int kmpSearchRepeatedText(String repeatedUnit, String pattern, int maxSearchLength) {
        int[] lps = buildLps(pattern);

        int patternIndex = 0;

        for (int textIndex = 0; textIndex < maxSearchLength; textIndex++) {
            char textChar = repeatedUnit.charAt(textIndex % repeatedUnit.length());

            while (patternIndex > 0 && textChar != pattern.charAt(patternIndex)) {
                patternIndex = lps[patternIndex - 1];
            }

            if (textChar == pattern.charAt(patternIndex)) {
                patternIndex++;
            }

            if (patternIndex == pattern.length()) {
                return textIndex - pattern.length() + 1;
            }
        }

        return -1;
    }

    private int[] buildLps(String pattern) {
        int[] lps = new int[pattern.length()];
        int prefixLength = 0;
        for (int i = 1; i < pattern.length(); i++) {
            while (prefixLength > 0 && pattern.charAt(i) != pattern.charAt(prefixLength)) {
                prefixLength = lps[prefixLength - 1];
            }
            if (pattern.charAt(i) == pattern.charAt(prefixLength)) {
                prefixLength++;
                lps[i] = prefixLength;
            }
        }
        return lps;
    }

//    public int repeatedStringMatch(String a, String b) {
//        int count = 1;
//        StringBuilder repeated = new StringBuilder(a);
//
//        while (repeated.length() < b.length()) {
//            repeated.append(a);
//            count++;
//        }
//
//        if (repeated.indexOf(b) != -1) {
//            return count;
//        }
//
//        repeated.append(a);
//        if (repeated.indexOf(b) != -1) {
//            return count + 1;
//        }
//
//        return -1;
//    }
}
