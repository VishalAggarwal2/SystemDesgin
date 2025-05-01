
// our interface should not contain un necessary function
interface Animal {
    void eat();
    void fly();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void fly() {
        // Dogs can't fly!
        throw new UnsupportedOperationException("Dogs can't fly!");
    }
}


interface Eater {
    void eat();
}

interface Flyer {
    void fly();
}

class Dogcorrect implements Eater {
    public void eat() {
        System.out.println("Dog is eating");
    }
}

class Birdcorrectt implements Eater, Flyer {
    public void eat() {
        System.out.println("Bird is eating");
    }

    public void fly() {
        System.out.println("Bird is flying");
    }
}


public class InterfaceSegrigation {
}
