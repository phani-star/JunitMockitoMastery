package com.testing.codeCoverage;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;


@ExtendWith(MockitoExtension.class)
public class CryptoServiceTest {
     @InjectMocks
     CryptoService service;
     @Mock
     CryptoUtil util;
     
     @Test
     public void testEncrypt() {
    	 String s1="abc";
    	 String s2="encrypted:"+s1;
    	 when(util.encrypt(s1)).thenReturn(s2);
    	 String s=service.encrypt(s1);
    	 assertEquals(s,s2);
     }
}
