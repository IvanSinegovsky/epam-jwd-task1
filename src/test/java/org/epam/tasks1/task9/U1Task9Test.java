package org.epam.tasks1.task9;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class U1Task9Test {
    @Test
    void circleLength() throws Exception {
        //CASE 1
        double expectedResult = Math.PI;
        double actualResult = U1Task9.circleLength(0.5);
        assertEquals(expectedResult, actualResult);

        //CASE 2
        expectedResult = 0.0;
        actualResult = U1Task9.circleLength(0.0);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void circleSquare() throws Exception {
        //CASE 1
        double expectedResult = Math.PI;
        double actualResult = U1Task9.circleSquare(1.0);
        assertEquals(expectedResult, actualResult);

        //CASE 2
        expectedResult = 0.0;
        actualResult = U1Task9.circleSquare(0.0);
        assertEquals(expectedResult, actualResult);

        //CASE 2
        expectedResult = Math.PI * 4.0;
        actualResult = U1Task9.circleSquare(2.0);
        assertEquals(expectedResult, actualResult);
    }
}