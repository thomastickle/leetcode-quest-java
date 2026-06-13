package com.github.ttickle.string;

public class StringQuestion2 {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int groupCount = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c == '-') {
                continue;
            }

            if (groupCount == k) {
                sb.append('-');
                groupCount = 0;
            }

            sb.append(Character.toUpperCase(c));
            groupCount++;
        }
        return sb.reverse().toString();
    }
}
