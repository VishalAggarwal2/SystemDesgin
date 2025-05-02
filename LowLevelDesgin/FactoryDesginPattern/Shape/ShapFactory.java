package Shape;

public class ShapFactory {
    public Shape getShape(String inp){
        if(inp=="C"){
            return new Circle();
        }else {
            return new Rectangle();
        }
    }
}
