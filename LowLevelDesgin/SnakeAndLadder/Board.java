public class Board {

    BoardBox[][] board;
    int n;
    int m;
    Board(int n,int m){
        this.n=n;
        this.m=m;
        board = new BoardBox[n][m];
    }
    CreateBoard createBoard;

    void  create(){
        createBoard.create(board,n,m);
    }
}
