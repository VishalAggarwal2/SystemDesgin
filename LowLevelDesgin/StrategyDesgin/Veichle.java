import Strategy.DriveStartegy.DriveStrategy;





public class Veichle {
 // Now When Ever we want to implement our drive we can chose normal or special
   DriveStrategy drive;
   Veichle(DriveStrategy ds){
       this.drive=ds;
   }
}
