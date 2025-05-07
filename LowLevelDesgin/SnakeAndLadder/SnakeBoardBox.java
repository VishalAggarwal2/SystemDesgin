public class SnakeBoardBox extends BoardBox {

    int finalX;
    int finalY;
    SnakeBoardBox(int x,int y,int fx,int fy){
        super(x,y);
        this.type = BoardBoxType.SNAKE;
        finalX = fx;
        finalY=fy;
    }

}
