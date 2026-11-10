// parent class
class Animal {
    void eat() {
        System.out.println("eating...Animal class...eat method");
    }
}

// child class
class Lion extends Animal {
    void roar() {
        System.out.println("Roar...Lion class...roar method");
    }
}

// child of child (multilevel inheritance)
class BabyLion extends Lion {
    void weep() {
        System.out.println("weeping...BabyLion class...weep method");
    }
}

class memeemaa {
    public static void main(String args[]){
        BabyLion obj=new BabyLion();
        obj.weep();
        obj.roar();
        obj.eat();
    }
}