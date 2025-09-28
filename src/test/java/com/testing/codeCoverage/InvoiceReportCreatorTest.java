package com.testing.codeCoverage;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mockConstruction;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.MockedConstruction;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class InvoiceReportCreatorTest {

	@InjectMocks
	private InvoiceReportCreator ic;
	
	//using normal way 
	@Test
	public void testCreateReport1() {
		String s=ic.createReport();
		assertNotNull(s);
	}
	
	//using mocked construction
	@Test
	public void testCreateReport2() {
		try(
				MockedConstruction<ApiClient> ac=
				mockConstruction(ApiClient.class,
						(mock,context)->when(mock.getData()).thenReturn("API Client")
						);
				MockedConstruction<HtmlWriter> hw=
				mockConstruction(HtmlWriter.class, 
						(mock,context)->when(mock.write("API Client")).thenReturn("HTML WRITER: API Client")
						);
			)
		{
			String s=ic.createReport();
			assertNotNull(s); 
			assertEquals("HTML WRITER: API Client", s);
		}
	}
}
