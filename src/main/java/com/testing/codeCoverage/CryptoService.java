package com.testing.codeCoverage;

public class CryptoService {
    private final CryptoUtil util;

    public CryptoService(CryptoUtil util) {
        this.util = util;
    }

    public String encrypt(String data) {
        return util.encrypt(data);
    }
}

class CryptoUtil {
    public String encrypt(String data) {
        return "encrypted:" + data;
    }
}
