import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CreateBoard {
    Scanner sc = new Scanner(System.in);
    void create(BoardBox[][] board,int n,int m){
        board = new BoardBox[n][m];

        int x=0,y=0;
       while(x!=-1&&y!=-1){
           System.out.println("Enter Coordinates Of Snake : x && y");
           x= sc.nextInt();
           y= sc.nextInt();
           if(x>=n||y>=m){
               System.out.println("Enter Correct Value of Coordinates");
               continue;
           }
           System.out.println("Enter  Final Coordinates Of Snake To POS: x && y");
          int finalx= sc.nextInt();
           int  finaly= sc.nextInt();
           board[x][y] = new SnakeBoardBox(x,y,finalx,finaly);
       }

         x=0;
         y=0;
        while(x!=-1&&y!=-1){
            System.out.println("Enter Coordinates Of Ladder : x && y");
            x= sc.nextInt();
            y= sc.nextInt();
            if(x>=n||y>=m){
                System.out.println("Enter Correct Value of Coordinates");
                continue;
            }
            System.out.println("Enter  Final Coordinates Of Ladder To POS: x && y");
            int finalx= sc.nextInt();
            int  finaly= sc.nextInt();
           board[x][y] = new LadderBox(x,y,finalx,finaly);
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==null){
                    board[i][j] = new NormalBoardBox(i,j);
                }
            }
        }

    }
}
