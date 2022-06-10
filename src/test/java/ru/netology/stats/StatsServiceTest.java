package ru.netology.stats;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    StatsService salesCalcService = new StatsService();
    int[] salesEveryMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};


    //Тест номера месяца с минимальными продажами
    @Test
    public void testMinSales() {
        int actual = salesCalcService.minSales(salesEveryMonth);
        int expected = 9;
        assertEquals(expected, actual);
    }

    //Тест номера месяца с максимальными продажами
    @Test
    public void testMaxSales() {
        int actual = salesCalcService.maxSales(salesEveryMonth);
        int expected = 8;
        assertEquals(expected, actual);
    }

    //Тест расчета суммы продаж за период
    @Test
    public void testSumSales() {
        int actual = salesCalcService.sumSales(salesEveryMonth);
        int expected = 180;
        assertEquals(expected, actual);
    }

    //Тест расчета среднего числа продаж за период
    @Test
    public void testAvgSales() {
        double actual = salesCalcService.avgSales(salesEveryMonth);
        int expected = 15;
        assertEquals(expected, actual);
    }

    //Тест расчета числа месяцев, где продажи ниже среднего за период
    @Test
    public void testBelowAvgSalesMonths() {
        int actual = salesCalcService.belowAvgSalesMonths(salesEveryMonth);
        int expected = 5;
        assertEquals(expected, actual);
    }

    //Тест расчета числа месяцев, где продажи выше среднего за период
    @Test
    public void testAboveAvgSalesMonths() {
        int actual = salesCalcService.aboveAvgSalesMonths(salesEveryMonth);
        int expected = 5;
        assertEquals(expected, actual);
    }


}
