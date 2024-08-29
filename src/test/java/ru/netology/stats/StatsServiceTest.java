package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void amountSalesTest() {
        StatsService service = new StatsService();

        int expectedAmount = 180;
        int actualAmount = service.amountSales(sales);

        Assertions.assertEquals(expectedAmount, actualAmount);
    }

    @Test
    public void averageSalesTest() {
        StatsService service = new StatsService();

        int expectedAverage = 15;
        int actualAverage = service.averageSales(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void maxMonthSalesTest() {
        StatsService service = new StatsService();

        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void minMonthSalesTest() {
        StatsService service = new StatsService();

        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void monthsSalesBelowAverageTest() {
        StatsService service = new StatsService();

        int expectedMonth = 5;
        int actualMonth = service.monthsSalesBelowAverage(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void monthsSalesAboveAverageTest() {
        StatsService service = new StatsService();

        int expectedMonth = 5;
        int actualMonth = service.monthsSalesAboveAverage(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }


}
