package org.epam.tasks1.task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class U1Task5Test {
    @Test
    void isPerfectNumber() throws Exception {
        //CASE 1
        boolean expectedResult = true;
        boolean actualResult = U1Task5.isPerfectNumber(28);
        assertEquals(expectedResult, actualResult);

        //CASE 2
        expectedResult = false;
        actualResult = U1Task5.isPerfectNumber(8129);
        assertEquals(expectedResult, actualResult);
    }
}