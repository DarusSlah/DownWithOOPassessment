package job;

public class HourlyEmployee extends Employees implements Payable {

    // Properties, instances variable
    private double hourlyRate;
    private double hoursWorked;

    // Constructor
    public HourlyEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;


    }
    // Abstract Methods
    @Override
    public void calculatePay() {
        double profit = hourlyRate * hoursWorked;
        System.out.println( "Hourly Employee's Pay is : "+ profit);
    }

    @Override
    public void printBadge(){
        System.out.println("Hourly Employee: " + getName() + "\n" +"EmployeeID : " + getId() + "\n");
    }


}


