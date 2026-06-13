package com.github.ttickle.string;

public class StringQuestion3 {

    private static final int LOCAL_PHONE_EXPECTED_DIGIT_LENGTH = 10;

    public String maskPII(String s) {
        int separatorIndex = s.indexOf('@');
        if (separatorIndex != -1) {
            return maskEmail(s,  separatorIndex);
        } else {
           return  maskPhone(s);
        }
    }

    private static String maskPhone(String s) {
        StringBuilder output = new StringBuilder();
        int digitCount = 0;
        int groupCount = 0;
        int groups = 0;

        // We build the masked version in reverse as its easier to handle when a dash should be added.
        // We keep track of how many digits so we will know if we need a country code.
        // Finally, at the end, we reverse it before converting the builder to a string.
        for (int i = s.length() - 1; i >= 0; i--) {
            char charAt = s.charAt(i);

            if ('0' <= charAt && charAt <= '9') {
                if (groups == 0 && groupCount == 4) {
                    groupCount = 0;
                    groups++;
                    output.append('-');
                } else if (groups > 0 && groupCount == 3) {
                    groupCount = 0;
                    groups++;
                    output.append('-');
                }

                if (groups == 0) {
                    output.append(charAt);
                } else {
                    output.append('*');
                }
                groupCount++;
                digitCount++;
            }
        }
        if (digitCount > LOCAL_PHONE_EXPECTED_DIGIT_LENGTH) {
            output.append('+');
        }

        return output.reverse().toString();
    }

    private static String maskEmail(String s, int separatorIndex) {
        StringBuilder output = new StringBuilder();
        output.append(Character.toLowerCase(s.charAt(0)));
        output.repeat('*', 5);
        output.append(Character.toLowerCase(s.charAt(separatorIndex -1)));
        output.append(s.substring(separatorIndex).toLowerCase());
        return output.toString();
    }


}
