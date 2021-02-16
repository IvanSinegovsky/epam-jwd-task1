package org.epam.tasks1.task3;

import org.epam.tasks1.task4.U1Task4;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class U1Task3Test {
    @Test
    void sLittleFoursquare() throws Exception {
        //CASE 1
        double expectedResult = 2.0;
        double actualResult =  U1Task3.sLittleFoursquare(4.0);
        assertEquals(expectedResult, actualResult);

        //CASE 2
        expectedResult = 0.0;
        actualResult = U1Task3.sLittleFoursquare(0.0);
        assertEquals(expectedResult, actualResult);
    }
}