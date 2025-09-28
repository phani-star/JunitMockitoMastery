package com.testing.codeCoverage;

public class EncryptionManager {
    private final Encryptor encryptor;

    public EncryptionManager(Encryptor encryptor) {
        this.encryptor = encryptor;
    }

    public String secure(String data) {
        return encryptor.secure(data);
    }
}

class Encryptor {
    public String secure(String data) {
        return "secured:" + data;
    }
}
