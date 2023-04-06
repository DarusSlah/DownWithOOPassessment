package job;



public abstract class Employees extends People {

    // properties, instance variable
    private int id;
    private static int employeeId = 0;

    // Constructor
    public Employees(String name) {
        super(name);
        this.id = ++employeeId;
    }
// getter & setter
    public int getId() {
        return id;
    }


// abstract method
    public abstract void printBadge();
    }




