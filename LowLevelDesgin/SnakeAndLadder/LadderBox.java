public class LadderBox extends BoardBox {

    int finalX;
    int finalY;
    LadderBox(int x,int y,int fx,int fy){
        super(x,y);
        this.type = BoardBoxType.LADDER;
        finalX =fx;
        finalY=fy;
    }
}
