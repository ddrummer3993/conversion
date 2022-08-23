package com.tlglearning;

public class Conversion {

    public static int convertToDecimal(String binary) {
        int value = 0;
        for (char c : binary.toCharArray()) {
            value = (value << 1) + c - '0';
        }
        return value;
    }

    /**
     *
     * @param representation
     * @param radix
     * @return
     * @throws illegalArgumentException if {@code radix < 2 || radix > 10}
     */
    public static int parse(String representation, int radix) throws IllegalArgumentException {
        int value = 0;
        if (radix < 2 || radix > 10) {
            throw new IllegalArgumentException("Radix must be between 2 and 10");
        }
        if (representation.startsWith("-")){
            representation = representation.substring(1);
            for (char c: representation.toCharArray()) {
                value = (value * radix) + (c - '0');
            }
            return value*-1;
        }
        for (char c: representation.toCharArray()) {
            value = (value * radix) + (c - '0');
        }
        return value;
    }

}

//char[] digits = representation.toCharArray();
//char firstDigit = digits[0];
//boolean hasSign = firstDigit == '+' || firstDigit == '-';
//int sign = (hasSign && firstDigit == '-') ? -1: 1;
//int value = 0;
//for (int i = (hasSign ? 1 : 0); i < digits.length; i++) {
//    char digitValue = digits[i];
//    int digitValue = digitChar - DIGIT_CHAR_BASE;
//    value = value * radix + digitValue;
//}
//return value * sign;

