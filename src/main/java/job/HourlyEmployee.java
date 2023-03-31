package job;

public class HourlyEmployee extends Employees{
    private double hourlyRate;
    private double hoursWorked;
    public HourlyEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;

    }
}
