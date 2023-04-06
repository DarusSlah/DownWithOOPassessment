package job;

public class SalariedEmployee extends Employees implements Payable {
    // instance, Properties
 private  double salary;
    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    // Abstract Methods
    @Override
    public void calculatePay() {
        System.out.println("Salaried  Employee's Pay is : "+ salary);
    }

    @Override
    public void printBadge() {
        System.out.println("Salaried Employee: "+ getName()  + "\n" + "EmployeeID : " + getId() + "\n" );
    }




}
