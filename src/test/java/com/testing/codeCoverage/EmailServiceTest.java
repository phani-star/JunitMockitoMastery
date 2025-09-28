package com.testing.codeCoverage;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class EmailServiceTest {

    @Test
    void testSendEmail() {
        EmailService spyService = spy(new EmailService());

        // Stub the log method
        doNothing().when(spyService).log(anyString(), anyString());

        boolean result = spyService.sendEmail("test@example.com", "Hello");

        assertTrue(result);
        verify(spyService).log("test@example.com", "Hello");
    }
}
/** when should we use Spy?
 * A spy allows you to partially mock an object:
It uses the real object but lets you override specific methods.
You can still call real methods unless you explicitly stub them.
You want to test a class as-is, but override one or two methods.

 */
