package Assignment7;

/*
*
* Create an inheritance hierarchy of Rodent: Mouse, Gerbil, Hamster,etc. In the base class, provide methods that are common to all Rodents,
* and override these in the derived classes to perform different behaviors depending on the specific type of Rodent.
* Create an array of Rodent, fill it with different specific types of Rodents, and call your base-class methods to see what happens.
* Make the methods of Rodent abstract whenever possible and all classes should have default constructors that print a message about that class.
*
*/

abstract class Rodent {
    abstract void eat();
    void excavate(){
        System.out.println("Excavating soil in a Rodent style");
    }
}

class Gerbil extends Rodent {
    public Gerbil(){
        System.out.println(" This is a Gerbil Class");
    }
    void eat(){
        System.out.println(" Gerbil eating seeds of various grasses, bulbs and a range of leaves and herbs");
    }
}

class Hamster extends Rodent {
    public Hamster(){
        System.out.println(" This is a Hamster Class");
    }
    void eat(){
        System.out.println(" Hamster eating dry food, fresh fruits and vegetables");
    }
}

class Mouse extends Rodent {
    public Mouse(){
        System.out.println(" This is a Mouse Class");
    }
    void eat(){
        System.out.println("Mouse Eating grains, fruits and seeds");
    }
}


public class Assignment7_1 {

    public static void main(String[] args) {
        Rodent rodents[] = {new Mouse(), new Hamster(), new Gerbil()};
        rodents[0].eat();
        rodents[1].eat();
        rodents[2].eat();
    }
}
