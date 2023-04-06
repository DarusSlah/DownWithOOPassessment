package job;

public abstract class People {

    // properties, instance variable
 private String name;

    // Constructor
 public People(String name){

     this.name = name;

 }


 // Getter & Setter
    public String getName(){

     return name;


    }


    // method
    public static void printPay (Payable[] payablePeople){
        for (Payable people: payablePeople) {
            people.calculatePay();

        }

    }





}
