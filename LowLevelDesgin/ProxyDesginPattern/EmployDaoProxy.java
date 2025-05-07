public class EmployDaoProxy implements EmployDao{
    EmployDao emp;
    EmployDaoProxy(){
        emp  = new EmployDaoImpl();

    }


    @Override
    public void create() {
        System.out.println("Creating from Proxy");
        emp.create();
    }

    @Override
    public void add() {
        System.out.println("adding from Proxy");
        emp.add();
    }

    @Override
    public void update() {
        System.out.println("Updating from Proxy");
        emp.update();
    }
}
