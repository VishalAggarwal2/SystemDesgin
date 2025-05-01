

// This Class Voilets Open close principele
class Shape {
    public String type;
}

// every time when we want to add new shape we have to update this class
// which voilets this principle
class AreaCalculator {
    public double calculateArea(Shape shape) {
        if (shape.type.equals("circle")) {
            return 3.14 * 5 * 5;
        } else if (shape.type.equals("square")) {
            return 5 * 5;
        }
        return 0;
    }
}




// correct version of above code

abstract class ShapeCorrect {
    public abstract double calculateArea();
}

class Circle extends Shape {
    public double calculateArea() {
        return 3.14 * 5 * 5;
    }
}

class Square extends Shape {
    public double calculateArea() {
        return 5 * 5;
    }
}

class AreaCalculatorCorrect {
    public double calculateArea(ShapeCorrect shape) {
        return shape.calculateArea();
    }
}







public class OOpenClosePrinciple {
}
