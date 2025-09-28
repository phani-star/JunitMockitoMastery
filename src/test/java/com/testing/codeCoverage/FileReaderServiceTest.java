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
public class FileReaderServiceTest {
	
	@InjectMocks
	FileReaderService fs;

	@Test
	public void readFirstLineTest() throws IOException {
		try(MockedStatic<Files> mockedstatic= mockStatic(Files.class)){
			Path p= mock(Path.class);
			List<String> al= List.of("abc","def");
			mockedstatic.when(()->Files.readAllLines(p)).thenReturn(al);
			String s= fs.readFirstLine(p);
			assertNotNull(s);
			assertEquals("abc",s);
		}
	}
}
