package com.testing.codeCoverage;
public class EmailService {
    public boolean sendEmail(String to, String message) {
        log(to, message);
        return true;
    }

    protected void log(String to, String message) {
        System.out.println("Sending email to " + to);
    }
}
