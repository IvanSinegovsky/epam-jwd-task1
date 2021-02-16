package org.epam.tasks1.task1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class U1Task1Test {
    @Test
    void findSquareLastDigit() throws Exception {
        //CASE 1
        int expectedResult = 9;
        int actualResult = U1Task1.findSquareLastDigit(23);
        assertEquals(expectedResult, actualResult);

        //CASE 2
        expectedResult = 0;
        actualResult = U1Task1.findSquareLastDigit(20);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void lastDigit() throws Exception {
        //CASE 1
        int expectedResult = 8;
        int actualResult = U1Task1.lastDigit(38);
        assertEquals(expectedResult, actualResult);

        //CASE 2
        expectedResult = 0;
        actualResult = U1Task1.lastDigit(20);
        assertEquals(expectedResult, actualResult);
    }
}