package Assignment7;

/*
* Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle. Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle.
* Create instances of all three types and upcast them to an array of Cycle. Try to call balance( ) on each element of the array and observe the results.
* Downcast and call balance( ) and observe what happens.
*/

class Cycle {
    void balance() {
        System.out.println("Balancing Cycle");
    }
}

class Unicycle extends Cycle {
    @Override
    void balance() {
        System.out.println("Balancing Unicycle");
    }
}

class Bicycle extends Cycle {
    @Override
    void balance() {
        System.out.println("Balancing Bicycle");
    }
}

class Tricycle extends Cycle {

}

public class Assignment7_2 {
    public static void main(String []args) {
        Cycle unicycle = new Unicycle();
        Cycle bicycle = new Bicycle();
        Cycle tricycle = new Tricycle();
        unicycle.balance();
        bicycle.balance();
        tricycle.balance();

        Unicycle unicycle1 = (Unicycle) unicycle;
        Bicycle bicycle1 = (Bicycle) bicycle;
        Tricycle tricycle1 = (Tricycle) tricycle;
        unicycle1.balance();
        bicycle1.balance();
        tricycle1.balance();
    }

}
