package com.testing.codeCoverage;

import static org.mockito.Mockito.mockStatic;
import org.junit.jupiter.api.Test;
import org.mockito.MockedStatic;
import static org.junit.jupiter.api.Assertions.*;


public class StringTransformerTest {

	@Test
	public void validTestTransform() {
		try(MockedStatic<StringTransformer> mocked= mockStatic(StringTransformer.class)){
			mocked.when(()->StringTransformer.isValid("cba")).thenReturn(true);
			mocked.when(()->StringTransformer.transform("cba")).thenCallRealMethod();
			
			String s= StringTransformer.transform("cba");
			assertNotNull(s);
			assertEquals("abc",s);
		}
	}
	
	@Test
	public void inValidTestTransform() {
		try(MockedStatic<StringTransformer> mocked= mockStatic(StringTransformer.class)){
			mocked.when(()->StringTransformer.isValid(" ")).thenReturn(false);
			mocked.when(()->StringTransformer.transform(" ")).thenCallRealMethod();
			
			String s= StringTransformer.transform(" ");
			assertNotNull(s);
			assertEquals("INVALID",s);
		}
	}
	
}
