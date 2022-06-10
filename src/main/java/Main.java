import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args) {

        int[] salesEveryMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        StatsService salesCalcService = new StatsService();


        int minMonthSales = salesCalcService.minSales(salesEveryMonth);
        System.out.println("Минимальные продажи были в " + minMonthSales + " месяце");

        int maxMonthSales = salesCalcService.maxSales(salesEveryMonth);
        System.out.println("Максимальные продажи были в " + maxMonthSales + " месяце");

        int sumSales = salesCalcService.sumSales(salesEveryMonth);
        System.out.println("Сумма продаж за период равна: " + sumSales);

        double avgSales = salesCalcService.avgSales(salesEveryMonth);
        System.out.println("Среднее число продаж за период равно: " + avgSales);

        int belowAvgSalesMonths = salesCalcService.belowAvgSalesMonths(salesEveryMonth);
        System.out.println("Число месяцев, где продажи ниже среднего за период: " + belowAvgSalesMonths);

        int aboveAvgSalesMonths = salesCalcService.aboveAvgSalesMonths(salesEveryMonth);
        System.out.println("Число месяцев, где продажи выше среднего за период: " + aboveAvgSalesMonths);




    }
}
