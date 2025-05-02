import Shape.*;

public class test {
    public static void main(String[] args) {
        ShapFactory sp = new ShapFactory();
        Shape c=sp.getShape('C'+"");

        c.draw();
    }
}
