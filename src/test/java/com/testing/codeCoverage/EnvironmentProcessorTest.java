package com.testing.codeCoverage;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;

public class EnvironmentProcessorTest {

	@Test
	public void testAnalyze() {
		try(
				 MockedStatic<EnvProvider> mockEnv = mockStatic(EnvProvider.class);
				 MockedStatic<AuditLogger> mockLog= mockStatic(AuditLogger.class);
				){
			mockEnv.when(()->EnvProvider.getEnv()).thenReturn("env");
			
			EnvironmentProcessor ep= new EnvironmentProcessor();
			String res=ep.analyze("Sample");
			
			assertEquals("sample",res);
			mockLog.verify(()->AuditLogger.log("Analyzing in mode: env"));
		}
	}
	
}
