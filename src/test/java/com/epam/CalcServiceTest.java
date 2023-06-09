package com.epam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalcServiceTest {
    private static CalcService calcService;

    @BeforeAll
    static void setUp() {
        calcService = new CalcServiceImpl();
    }

    @Test
    void addTest() {
        Assertions.assertEquals(4, calcService.add(1, 3));
    }

    @Test
    void multiplyTest() {
        Assertions.assertEquals(16, calcService.multiply(2, 8));
    }

    @Test
    void subtractTest() {
        Assertions.assertEquals(0, calcService.subtract(2, 2));
    }

    @Test
    void divideTest() {
        Assertions.assertEquals(3, calcService.divide(6, 2));
        Assertions.assertEquals(0, calcService.divide(5, 0));
    }
}
