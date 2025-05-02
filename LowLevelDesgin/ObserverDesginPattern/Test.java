import Products.*;
import Products.User;

public class Test {

    // This Question Is Asked In Walmart Interview where we have to implement
    // the Amazon Notify All Feature
    public static void main(String[] args) {


        User user1  = new User("Vishal");
        User user2  = new User("Ronak");
        User user3  = new User("Govind");


        Products p = new SamsungPhone();
        p.addObserver(user1);
        p.addObserver(user2);

        p.updateStock();


    }
    }

