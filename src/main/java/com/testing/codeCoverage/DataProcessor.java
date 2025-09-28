package com.testing.codeCoverage;

public class DataProcessor {
    public String processData(Object input) {
        String env = EnvProvider.getEnv();
        Logger.log("Processing in env: " + env);
        return input.toString();
    }
}

class Logger {
    public static void log(String message) {
        System.out.println(message);
    }
}



