package com.testing.codeCoverage;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
@ExtendWith(MockitoExtension.class)
public class ApplicationConfigurationTest {

	@InjectMocks
	ApplicationConfiguration config;
	@Mock
	DataSourceFactory factory;
	@Mock
	DataSource mockDataSource;

    @Test
    void testGetDataSource_withSystemProperty() {

            System.setProperty("db.url", "jdbc:mysql://localhost:3306/testdb");
            when(factory.create("jdbc:mysql://localhost:3306/testdb")).thenReturn(mockDataSource);
            when(mockDataSource.getUrl()).thenReturn("jdbc:mysql://localhost:3306/testdb");

            DataSource ds = config.getDataSource();

            assertEquals("jdbc:mysql://localhost:3306/testdb", ds.getUrl());
            verify(factory).create("jdbc:mysql://localhost:3306/testdb");
    }

    @Test
    void testGetDataSource_withoutSystemProperty() {
           
    	    System.clearProperty("db.url"); // Ensure it's not set

            when(factory.create("jdbc:h2:mem:test")).thenReturn(mockDataSource);
            when(mockDataSource.getUrl()).thenReturn("jdbc:h2:mem:test");

            DataSource ds = config.getDataSource();

            assertEquals("jdbc:h2:mem:test", ds.getUrl());
            verify(factory).create("jdbc:h2:mem:test");
        
    }
}
