package com.testing.codeCoverage;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockStatic;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockedStatic;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class TextFileServiceTest {
	
	@InjectMocks
	TextFileService tfs;
	
	@Test
	public void testReadLastLine() throws IOException {
		try(MockedStatic<Files> ms= mockStatic(Files.class)){
			Path p= mock(Path.class);
			List<String> l= List.of("abc","cde");
			ms.when(()->Files.readAllLines(p)).thenReturn(l);
			String s= tfs.readLastLine(p);
			assertNotNull(s);
			assertEquals("cde",s);
		}
	}

}
