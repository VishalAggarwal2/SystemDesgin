import java.util.LinkedList;
import java.util.List;
public class Elevator {
    public List<ElevatorCar> elevatorCars;

    Elevator(){
        elevatorCars = new LinkedList<>();
    }

    // add elevator car

    public void addElevatorCar(ElevatorCar ec){
     elevatorCars.add(ec);
    }

    public void getElevatorCars(ElevatorCar ec){
       for (ElevatorCar e:elevatorCars){
           System.out.print(e.elevatorNumber+"  ");
       }
    }
}