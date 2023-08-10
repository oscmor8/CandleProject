

class Candle {
    private String name;
    private int quantity;
    private double burnTime; // in hours
    private double dollarPerBurnTime; // dollars per hour
    private double price;

    public Candle(String name, int quantity, double burnTime, double dollarPerBurnTime, double price) {
        this.name = name;
        this.quantity = quantity;
        this.burnTime = burnTime;
        this.dollarPerBurnTime = dollarPerBurnTime;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getBurnTime() {
        return burnTime;
    }

    public double getDollarPerBurnTime() {
        return dollarPerBurnTime;
    }

    public double getPrice() {
        return price;
    }

    public double calculateTotalCost() {
        return quantity * price;
    }

    public double calculateTotalBurnTime() {
        return quantity * burnTime;
    }

    public double calculateTotalDollarPerBurnTime() {
        return quantity * dollarPerBurnTime;
    }
}

public class CandleShop {
    public static void main(String[] args) {
        Candle candle1 = new Candle("Lavender", 2, 5.5, 0.5, 10.99);
        Candle candle2 = new Candle("Florals", 3, 4.0, 0.4, 8.49);
        Candle candle3 = new Candle("N' Dicey", 1, 6.75, 0.6, 12.99);

        Candle[] candles = {candle1, candle2, candle3};

        double totalCost = 0;
        double totalBurnTime = 0;
        double totalDollarPerBurnTime = 0;

        System.out.println("Receipt:");
        System.out.println("-------------------------------------");
        for (Candle candle : candles) {
            System.out.println("Candle: " + candle.getName());
            System.out.println("Quantity: " + candle.getQuantity());
            System.out.println("Burn Time: " + candle.getBurnTime() + " hours");
            System.out.println("Dollar per Burn Time: $" + candle.getDollarPerBurnTime() + " per hour");
            System.out.println("Price: $" + candle.getPrice());
            System.out.println("Subtotal: $" + candle.calculateTotalCost());
            System.out.println("-------------------------------------");

            totalCost += candle.calculateTotalCost();
            totalBurnTime += candle.calculateTotalBurnTime();
            totalDollarPerBurnTime += candle.calculateTotalDollarPerBurnTime();
        }

        System.out.println("Total Amount Due: $" + totalCost);
        System.out.println("Total Burn Time: " + totalBurnTime + " hours");
        System.out.println("Total Dollar per Burn Time: $" + totalDollarPerBurnTime);
    }
}
