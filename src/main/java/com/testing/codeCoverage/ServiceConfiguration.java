package com.testing.codeCoverage;

public class ServiceConfiguration {
    private final ConnectionFactory factory;

    public ServiceConfiguration(ConnectionFactory factory) {
        this.factory = factory;
    }

    public Connection getConnection() {
        String endpoint = System.getProperty("service.endpoint", "http://localhost");
        return factory.create(endpoint);
    }
}

class ConnectionFactory {
    public Connection create(String endpoint) {
        return new Connection(endpoint);
    }
}

class Connection {
    private final String endpoint;

    public Connection(String endpoint) {
        this.endpoint = endpoint;
    }

    public String getEndpoint() {
        return endpoint;
    }
}
