package com.testing.codeCoverage;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;


@ExtendWith(MockitoExtension.class)
public class EncryptionManagerTest {
     @InjectMocks
     EncryptionManager manager;
     @Mock
     Encryptor encryptor;
     
     @Test
     public void testSecure() {
    	 String s1="normal text";
    	 String s2="encrypted text";
    	 when(encryptor.secure(s1)).thenReturn(s2);
    	 
    	 String s=manager.secure(s1);
    	 assertEquals(s,s2);
     }
}
