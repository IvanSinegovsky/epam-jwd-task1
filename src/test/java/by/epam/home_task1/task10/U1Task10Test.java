package by.epam.home_task1.task10;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class U1Task10Test {
    @Test
    void functionValue() throws Exception {
        //CASE 1
        double expectedValue = 0.0;
        double actualValue = U1Task10.functionValue(0.0);
        assertEquals(expectedValue, actualValue);

        //CASE 2
        expectedValue = 1;
        actualValue = U1Task10.functionValue(Math.PI / 4.0);
        assertEquals(expectedValue ,actualValue, 0.01);
    }
}