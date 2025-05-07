public class BookingController {

     Person person;
     Events events;

    // find seat
    // we can implement our internal logic for seatr here
    Seats findSeat(){
     return  new Seats();
    }


    // create Ticket
    Ticket bookShow(Seats seat){

        int price = seat.seatPriceCalculationStrategy.calculatePrice(events,seat);
        seat.isField= true;
        return  new Ticket();
    }

}
