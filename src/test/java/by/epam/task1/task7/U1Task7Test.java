package org.epam.tasks1.task7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class U1Task7Test {
    @Test
    void pointCloser() throws Exception {
        //CASE 1
        String expectedResult = " Points equidistant from origin.";
        String actualResult = U1Task7.pointCloser(-2.0, -2.0, 2.0, 2.0);
        assertEquals(expectedResult, actualResult);

        //CASE 2
        expectedResult = " First point is closer to origin than second.";
        actualResult = U1Task7.pointCloser(1.0,1.0,2.0,2.0);
        assertEquals(expectedResult, actualResult);

        //CASE 3
        expectedResult = " Second point is closer to origin than first.";
        actualResult = U1Task7.pointCloser(3.0,3.0,2.0,2.0);
        assertEquals(expectedResult, actualResult);
    }
}