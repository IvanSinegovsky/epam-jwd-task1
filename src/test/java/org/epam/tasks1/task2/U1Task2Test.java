package org.epam.tasks1.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class U1Task2Test {
    @Test
    void isLeapYear() throws Exception {
        //CASE 1
        boolean expectedResult = true;
        boolean actualResult = U1Task2.isLeapYear(2020);
        assertEquals(expectedResult, actualResult);

        //CASE 2
        expectedResult = false;
        actualResult = U1Task2.isLeapYear(2021);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void daysInMonthQuantity() throws Exception {
        //CASE 1
        int expectedResult = 31;
        int actualResult = U1Task2.daysInMonthQuantity(2020, 3);
        assertEquals(expectedResult, actualResult);

        //CASE 2
        expectedResult = 31;
        expectedResult = U1Task2.daysInMonthQuantity(2021, 12);
        assertEquals(expectedResult, actualResult);
    }
}