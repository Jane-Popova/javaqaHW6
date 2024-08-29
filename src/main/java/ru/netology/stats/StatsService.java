package ru.netology.stats;

import java.util.stream.IntStream;

public class StatsService {

    public int amountSales(long[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum += (int) sales[i];
        }
        int average = sum / sales.length;
        return sum;
    }

    public int averageSales(long[] sales) {
        int sum = amountSales(sales);
        int average = sum / sales.length;
        return average;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как максимальный
            }
        }

        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int monthsSalesBelowAverage(long[] sales) {
        int average = averageSales(sales);
        int monthsBelowAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                monthsBelowAverage = monthsBelowAverage + 1;
            }
        }
        return monthsBelowAverage;
    }

    public int monthsSalesAboveAverage(long[] sales) {
        int average = averageSales(sales);
        int monthsAboveAverage = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                monthsAboveAverage = monthsAboveAverage + 1;
            }
        }
        return monthsAboveAverage;
    }


}
