package com.testing.codeCoverage;

public class StaticHelper {
    public static String convert(String input) {
        if (validate(input)) {
            return input.toUpperCase();
        }
        return "INVALID";
    }

    public static boolean validate(String input) {
        return input != null && !input.isEmpty();
    }
}
