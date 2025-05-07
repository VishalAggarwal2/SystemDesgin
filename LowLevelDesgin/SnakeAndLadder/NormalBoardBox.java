public class NormalBoardBox extends  BoardBox {
    NormalBoardBox(int x,int y){
        super(x,y);
        this.type = BoardBoxType.LADDER;
    }
}
