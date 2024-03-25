package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VacationServiceTest {
    @Test
    public void calculateForLowIncome() {
        VacationService service = new VacationService();

        int actual = service.calculate(10_000, 3000, 20_000);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void calculateForHighIncome() {
        VacationService service = new VacationService();

        int actual = service.calculate(100_000, 60_000, 150_000);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}