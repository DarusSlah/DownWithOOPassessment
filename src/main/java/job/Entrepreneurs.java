package job;

public class Entrepreneurs extends People{
    private double revenue;
    private double expenses;
    public Entrepreneurs(String name, double revenue, double expenses) {
        super(name);
        this.revenue = revenue;
        this.expenses = expenses;

    }
    public double calculatePay() {

        return revenue - expenses;
    }

    @Override
    public String toString() {
        return "Entrepreneurs: " + getName() + "\n" +
                "revenue: " + revenue +
                ", expenses: " + expenses +
                '}';
    }
}
