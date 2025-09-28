package com.testing.codeCoverage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class SalesReportGeneratorTest {
    @InjectMocks
	SalesReportGenerator g;
    
    @Test
    public void testGenerateReport() {
    	assertNotNull(g.generateReport());
    }
    
    /** If we want to have control over the objects created inside that method then use MockedConstruction
     * try (
    MockedConstruction<DatabaseConnection> dbMock = 
        mockConstruction(DatabaseConnection.class,
            (mock, context) -> when(mock.fetchData()).thenReturn("Mocked Data"));

    MockedConstruction<PdfWriter> writerMock = 
        mockConstruction(PdfWriter.class,
            (mock, context) -> when(mock.write("Mocked Data")).thenReturn("PDF: Mocked Data"))
       ) 
   {
       SalesReportGenerator generator = new SalesReportGenerator();
       String result = generator.generateReport();

       assertEquals("PDF: Mocked Data", result);
   }
   ==================================================
   ✅ Are mock and context mandatory in MockedConstruction?
   Yes, they are required parameters in the lambda used with mockConstruction, but here's what they mean and why they're needed:
   
   Parameters:

   mock: The actual mock instance of the class being constructed.
   context: Metadata about the construction (e.g., constructor arguments, number of times constructed).
     */
}
