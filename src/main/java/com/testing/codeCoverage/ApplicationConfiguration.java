package com.testing.codeCoverage;
public class ApplicationConfiguration {
    private final DataSourceFactory factory;

    public ApplicationConfiguration(DataSourceFactory factory) {
        this.factory = factory;
    }

    public DataSource getDataSource() {
        String url = System.getProperty("db.url", "jdbc:h2:mem:test");
        return factory.create(url);
    }
}

class DataSourceFactory {
    public DataSource create(String url) {
        return new DataSource(url);
    }
}

class DataSource {
    private final String url;

    public DataSource(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
