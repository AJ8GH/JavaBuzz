import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JavaBuzzTest {
    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    @DisplayName("Number is returned as string if neither divisible by 3 or 5")
    void regularNumbers() {
        assertEquals(JavaBuzz.javaBuzz(2), "2");
    }

    @Test
    @DisplayName("Java is returned if number is divisible by 3")
    void divisibleBy3() {
        assertEquals(JavaBuzz.javaBuzz(3), "Java");
    }

    @Test
    @DisplayName("Buzz is returned if number is divisible by 5")
    void divisibleBy5() {
        assertEquals(JavaBuzz.javaBuzz(5), "Buzz");
    }

    @Test
    @DisplayName("JavaBuzz is returned if number is divisible by 15")
    void divisibleBy15() {
        assertEquals(JavaBuzz.javaBuzz(15), "JavaBuzz");
    }

    @Test
    @DisplayName("Test output is as expected")
    void main() {
        String outputStart = "1\n2\nJava\n4\nBuzz\nJava\n7\n8\nJava\nBuzz\n11\nJava\n13\n14\nJavaBuzz";
        String outputEnd = "86\nJava\n88\n89\nJavaBuzz\n91\n92\nJava\n94\nBuzz\nJava\n97\n98\nJava\nBuzz";

        JavaBuzz.main();
        assertTrue(outputStreamCaptor.toString().trim().contains(outputStart));
        assertTrue(outputStreamCaptor.toString().trim().contains(outputEnd));
    }
}