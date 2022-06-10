package ru.netology.stats;

import java.util.stream.IntStream;


public class StatsService {

    //Метод расчета номера месяца с минимальным числом продаж
    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // salesEveryMonth[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //Метод расчета номера месяца с максимальным числом продаж
    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (int sale : sales) {
            // salesEveryMonth[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    //Метод расчета суммы всех пролаж за период
    public int sumSales(int[] sales) {

        int sumSales = 0;

        for (int sale : sales) {
            sumSales += sale;
        }
        return sumSales;
    }

    //Метод расчета среднего числа всех продаж за период
    public double avgSales(int[] sales) {

        double sumSales = 0;

        for (int sale : sales) {
            sumSales += sale;
        }

        return sumSales / sales.length;
    }

    //Метод расчета числа месяцев, где продажи ниже среднего за период
    public int belowAvgSalesMonths(int[] sales) {

        int sumBelowMonths = 0;
        int avgSumSales = IntStream.of(sales).sum() / sales.length;

        for (int sale : sales) {
            if (sale < avgSumSales) {
                sumBelowMonths++;
            }
        }

        return sumBelowMonths;
    }

    //Метод расчета числа месяцев, где продажи выше среднего за период
    public int aboveAvgSalesMonths(int[] sales) {

        int sumAboveMonths = 0;
        int avgSumSales = IntStream.of(sales).sum() / sales.length;

        for (int sale : sales) {
            if (sale > avgSumSales) {
                sumAboveMonths++;
            }
        }

        return sumAboveMonths;
    }


}

