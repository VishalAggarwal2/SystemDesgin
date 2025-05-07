public class Test {

    public static void main(String[] args) {
        // When We want to acces
        // one class then its goes to
        // another dummy object and it return the object of that class
        // There Can Be Multiple Proxy In the development


        // Agar Question mai acces restriction bola hai , caching bola hai ya fhir preprocessing bola ha to yeh use karo



        //// Use cases
        // Caching
        // Preprocessing and post processing (Logging)
        // hiding data


        // Spring Boot Create Proxy Bean of every class internaly


        EmployDao em= new EmployDaoProxy();
        em.create();
    }

}
