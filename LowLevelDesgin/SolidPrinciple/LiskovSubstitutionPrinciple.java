// Liskov Principle Basicly means we cant downgrade our parent class
// our parent class should contain only generic methods which is commpn among all classes

class Bird {
    public void fly() {
        System.out.println("Bird can fly");
    }
}

class Ostrich extends Bird {
    // Ostrich can't fly, but we're forced to override fly()
    public void fly() {
        throw new UnsupportedOperationException("Ostrich can't fly!");
    }
}


class Birdcorrect {
    public void layEgg() {
        System.out.println("Bird lays eggs");
    }
}

interface Flyable {
    void fly();
}

class Sparrow extends Bird implements Flyable {
    public void fly() {
        System.out.println("Sparrow can fly");
    }
}

class Ostrichcorrect extends Birdcorrect {
    // Does not implement Flyable
}




public class LiskovSubstitutionPrinciple {
}
