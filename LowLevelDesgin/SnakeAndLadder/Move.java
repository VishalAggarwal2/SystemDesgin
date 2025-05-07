public class Move {

    //
    void move(Person person ,Dice dice ,Board board){
        System.out.println("Person id :-"+person.id +" Turn");
        int number = dice.gerRandmNumber();
        System.out.println("Dice gives :-"+number);

        // just for test
        int newPersonPosX = 8;
        int newPersonPosY = 1;

        System.out.println(" Person Goes To + "+ newPersonPosX +" , "+ newPersonPosY);
        person.x=newPersonPosX;
        person.y=newPersonPosY;
        if(board.board[newPersonPosX][newPersonPosY].type==BoardBoxType.SNAKE){
            System.out.println("Snake Present At This Position ");
            System.out.println("Fianl Pos becomes Position " +board.board[newPersonPosX][newPersonPosY].x+" ,"+board.board[newPersonPosX][newPersonPosY].y);
            person.x=board.board[newPersonPosX][newPersonPosY].x;
            person.y=board.board[newPersonPosX][newPersonPosY].y;
        }

        if(board.board[newPersonPosX][newPersonPosY].type==BoardBoxType.LADDER){
            System.out.println("Ladder Present At This Position ");
            System.out.println("Fianl Pos becomes Position " +board.board[newPersonPosX][newPersonPosY].x+" ,"+board.board[newPersonPosX][newPersonPosY].y);
            person.x=board.board[newPersonPosX][newPersonPosY].x;
            person.y=board.board[newPersonPosX][newPersonPosY].y;
        }

    }

}
