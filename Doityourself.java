// this activity is mainly to explain Hierarchical Inheritance
// parent class
class Mammals {
    void mam() {
        System.out.println("Inside Mammals Class");
    }
}

// child class 1
class Lion extends Mammals {
    void roar() {
        System.out.println("Inside Lion class");
    }
}

// child class 2
class Human extends Mammals {
    void hum() {
        System.out.println("Inside Human class");
    }
}

public class Doityourself {
    public static void main(String[] args) {
        // Testing Lion object inheriting from Mammals
        Lion lionObj = new Lion();
        lionObj.mam();  // Inherited from Mammals
        lionObj.roar(); // Defined in Lion

        System.out.println("-------------------");

        // Testing Human object inheriting from Mammals
        Human humanObj = new Human();
        humanObj.mam();  // Inherited from Mammals
        humanObj.hum();  // Defined in Human
    }
}