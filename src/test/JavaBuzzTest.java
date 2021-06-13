import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JavaBuzzTest {

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
}