package com.github.ttickle.stringmatching;

public class StringMatchingQuestion1 {
    public boolean repeatedSubstringPattern(String s) {
        int inputLength = s.length();
        for (int substringLength = 1; substringLength <= inputLength / 2; substringLength++) {
            if (inputLength % substringLength != 0) {
                continue;
            }

            String pattern = s.substring(0, substringLength);
            boolean matches = true;

            for (int i = 0; i < inputLength; i += substringLength) {
                if (!s.substring(i, i + substringLength).equals(pattern)) {
                    matches = false;
                    break;
                }
            }

            if (matches) {
                return true;
            }
        }
        return false;
    }
}
