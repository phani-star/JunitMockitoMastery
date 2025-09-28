package com.testing.codeCoverage;

import org.mockito.MockedStatic;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mockStatic;

import org.junit.jupiter.api.Test;


public class StaticHelperTest {
	
	@Test
	public void ValidConvertTest() {
		try(MockedStatic<StaticHelper> mockedstatic= mockStatic(StaticHelper.class)){
			mockedstatic.when(()->StaticHelper.validate("phani")).thenReturn(true);
			mockedstatic.when(()->StaticHelper.convert("phani")).thenCallRealMethod();
			
			String s= StaticHelper.convert("phani");
			assertNotNull(s);
			assertEquals("PHANI",s);
		}
	}
	
	@Test
	public void inValidConvertTest() {
		try(MockedStatic<StaticHelper> mockedstatic= mockStatic(StaticHelper.class)){
			mockedstatic.when(()->StaticHelper.validate(" ")).thenReturn(false);
			mockedstatic.when(()->StaticHelper.convert(" ")).thenCallRealMethod();
			
			String s= StaticHelper.convert(" ");
			assertEquals("INVALID",s);
			
		}
	}
   
      
}
