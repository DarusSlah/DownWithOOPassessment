package job;

public class Entrepreneurs extends People implements Payable{
    // properties, instance variables
    private double revenue;
    private double expenses;

    // Constructor
    public Entrepreneurs(String name, double revenue, double expenses) {
        super(name);
        this.revenue = revenue;
        this.expenses = expenses;

    }

    // Abstract Methods
    @Override
    public String toString() {
        return "Entrepreneurs: " + getName() + "\n" +
                "revenue: " + revenue +
                ", expenses: " + expenses;
    }



    @Override
    public void calculatePay() {
       double profit = revenue - expenses;
        System.out.println("Entrepreneur's Pay is  : " + profit);
    }


}
