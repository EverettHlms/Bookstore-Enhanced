package bookstoreproject.sales;

public class SalesCounter {
    public static double totalSales = 0.0;
    public static int totalItems = 0;

    public static void updateTotalSales(double value) {
        totalSales += value;
    }

    public static void updateTotalUnits(int value) {
        totalItems += value;
    }
}

