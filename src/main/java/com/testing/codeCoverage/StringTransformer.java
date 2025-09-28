package com.testing.codeCoverage;

public class StringTransformer {
    public static String transform(String input) {
        if (isValid(input)) {
            return new StringBuilder(input).reverse().toString();
        }
        return "INVALID";
    }

    public static boolean isValid(String input) {
        return input != null && input.length() > 3;
    }
}
