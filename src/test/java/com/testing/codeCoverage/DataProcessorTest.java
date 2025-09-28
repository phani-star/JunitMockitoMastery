package com.testing.codeCoverage;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
public class DataProcessorTest {
	
      @Test
      public void testProcessData() {
    	  try(
    		  MockedStatic<EnvProvider> mockEnv = mockStatic(EnvProvider.class);
    	      MockedStatic<Logger> mockLogger = mockStatic(Logger.class);
    		)
    	  {
    	  
    	  mockEnv.when(()->EnvProvider.getEnv()).thenReturn("val");
    	  
    	  DataProcessor dp= new DataProcessor();
    	  String res=dp.processData("Sample");
    	  
    	  assertEquals("Sample",res);
    	  
    	  mockLogger.verify(()->Logger.log("Processing in env: val"));
    	  }
      }
}
