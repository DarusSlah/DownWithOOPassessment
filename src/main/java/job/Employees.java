package job;



public abstract class Employees extends People {


    private static int employeeId;

    public Employees(String name) {
        super(name);
     this.id = ;
    }

    public int getEmployeeId() {

        return employeeId;
    }
    public abstract double calculatePay();
    public void printBadge(){

        System.out.println(getName() + ":" + "\n"+ "EmployeeID: " + getEmployeeId());
    }

    public generateId(){

    }
}
