import Strategy.DriveStartegy.NormalDrive;
import Strategy.DriveStartegy.SpecialDrive;

public class    Test {

// bahut jayda jaruri pattern hai yaad rakho kaab use karna hota hai
// jab jab within child sa kuch common property ati hai tab yeh use karna hota hai


    public static void main(String[] args) {
        // when we want to use speacial drive we can use that
        // when we want to use normal drive we can use that
        Veichle sc = new SportsCar(new SpecialDrive());
        Veichle  nc = new PassengerCar(new NormalDrive());
        sc.drive.drive();
        nc.drive.drive();
    }

}
