package com.testing.codeCoverage;

public class EnvironmentProcessor {
    public String analyze(Object input) {
        String mode = EnvProvider.getEnv();
        AuditLogger.log("Analyzing in mode: " + mode);
        return input.toString().toLowerCase();
    }
}

class AuditLogger {
    public static void log(String message) {
        System.out.println("AUDIT: " + message);
    }
}
