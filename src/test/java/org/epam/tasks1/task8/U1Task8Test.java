package org.epam.tasks1.task8;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class U1Task8Test {
    @Test
    void functionValue() throws Exception {
        //CASE 1
        double expectedResult = 9.0;
        double actualResult = U1Task8.functionValue(3.0);
        assertEquals(expectedResult, actualResult);

        //CASE 2
        expectedResult = 5.0;
        actualResult = U1Task8.functionValue(4.0);
        assertEquals(expectedResult, actualResult);

        //CASE 3
        expectedResult = -0.2;
        actualResult = U1Task8.functionValue(1.0);
        assertEquals(expectedResult, actualResult);
    }
}