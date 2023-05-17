package ru.netology.stats;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class StatisticServiceTest {

    @Test
    void findMax() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxSecond() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {113, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 113;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxNull() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {0, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void findMaxLongNumber() {
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {111111111, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 111111111;


        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
}