package by.epam.task1.task4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class U1Task4Test {
    @Test
    void twoOrMoreEvenNumbers() throws Exception {
        //CASE 1
        boolean expectedResult = false;
        boolean actualResult = U1Task4.twoOrMoreEvenNumbers(new int[]{1, 3, 5, 7});
        assertEquals(expectedResult, actualResult);

        //CASE 2
        expectedResult = false;
        actualResult = U1Task4.twoOrMoreEvenNumbers(new int[]{1, 4, 0, 7});
        assertEquals(expectedResult, actualResult);
        //CASE 3
        expectedResult = true;
        actualResult = U1Task4.twoOrMoreEvenNumbers(new int[]{1, 4, 0, 6});
        assertEquals(expectedResult, actualResult);

        //CASE 4
        expectedResult = true;
        actualResult = U1Task4.twoOrMoreEvenNumbers(new int[]{1, 4, 8, 6});
        assertEquals(expectedResult, actualResult);

        //CASE 5
        expectedResult = true;
        actualResult = U1Task4.twoOrMoreEvenNumbers(new int[]{10, 4, 8, 6});
        assertEquals(expectedResult, actualResult);

        //CASE 6
        expectedResult = false;
        actualResult = U1Task4.twoOrMoreEvenNumbers(new int[]{1, 4, 8, 6, 20});
        assertEquals(expectedResult, actualResult);
    }
}