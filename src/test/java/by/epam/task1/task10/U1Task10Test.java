package by.epam.task1.task10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class U1Task10Test {
    @Test
    void functionValue() throws Exception {
        double expectedValue = 0.0;
        double actualValue = U1Task10.functionValue(0.0);
        assertEquals(expectedValue, actualValue);
    }
}