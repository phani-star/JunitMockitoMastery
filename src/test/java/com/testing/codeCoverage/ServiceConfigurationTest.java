package com.testing.codeCoverage;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(MockitoExtension.class)
public class ServiceConfigurationTest {
     
	@InjectMocks
	ServiceConfiguration config;
	@Mock
	ConnectionFactory factory;
	@Mock
	Connection connection;
	
	@Test
	public void testGetConnection1() {
		System.setProperty("service.endpoint", "http://App/user/1");
		when(factory.create("http://App/user/1")).thenReturn(connection);
		when(connection.getEndpoint()).thenReturn("http://App/user/1");
		
		Connection c= config.getConnection();
		assertEquals(c.getEndpoint(),"http://App/user/1");
		verify(factory).create("http://App/user/1");
	}
	
	@Test
	public void testGetConnection2() {
		System.clearProperty("service.endpoint");
		when(factory.create("http://localhost")).thenReturn(connection);
		when(connection.getEndpoint()).thenReturn("http://localhost");
		
		Connection c= config.getConnection();
		assertEquals(c.getEndpoint(),"http://localhost");
		verify(factory).create("http://localhost");
	}
}
