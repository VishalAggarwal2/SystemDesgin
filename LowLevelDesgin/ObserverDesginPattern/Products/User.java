package Products;

public class User  implements Observer{
    public  String name;


    public  User(String name){
        this.name=name;
    }

    @Override
    public void update(Products products) {
        System.out.println("Name :- "+ name);
        System.out.println("Sock Updated For "+ products.getProductName());
    }
}
