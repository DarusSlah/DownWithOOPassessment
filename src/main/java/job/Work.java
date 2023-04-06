package job;

public class Work {



    public static void main(String[] args) {

        // HourlyEmployee Object
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Darus", 80,70 );
        hourlyEmployee.printBadge();


        // SalariedEmployee Object
        SalariedEmployee salariedEmployee = new SalariedEmployee("Chris", 75000);
        salariedEmployee.printBadge();

        //  Entrepreneurs Object
        Entrepreneurs entrepreneurs = new Entrepreneurs("Bob",100000, 5000);
        System.out.println(entrepreneurs.toString() + "\n");

        // Array of people that are payable
        Payable[] payablePeople = {hourlyEmployee, salariedEmployee,entrepreneurs};
        People.printPay(payablePeople);













    }

}
