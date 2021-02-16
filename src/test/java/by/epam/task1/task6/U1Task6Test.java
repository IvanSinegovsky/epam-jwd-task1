package by.epam.task1.task6;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class U1Task6Test {
    @Test
    void secondsToDate() throws Exception {
        //CASE 1
        String expectedResult = "0h0m1s";
        String actualResult = U1Task6.secondsToDate(1);
        assertEquals(expectedResult, actualResult);

        //CASE 2
        expectedResult = "0h1m1s";
        actualResult = U1Task6.secondsToDate(61);
        assertEquals(expectedResult, actualResult);

        //CASE 2
        expectedResult = "0h1m1s";
        actualResult = U1Task6.secondsToDate(61);
        assertEquals(expectedResult, actualResult);

        //CASE 2
        expectedResult = "9h29m1s";
        actualResult = U1Task6.secondsToDate(34141);
        assertEquals(expectedResult, actualResult);
    }
}