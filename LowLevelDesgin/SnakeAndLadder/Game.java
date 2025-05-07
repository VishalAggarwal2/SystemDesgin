import java.util.LinkedList;
import java.util.Queue;

public class Game {
    Queue<Person> personPlaying;
    Move move;
    Dice dice;
    Board board;
    Game(){
        personPlaying= new LinkedList<>();
        move = new Move();
    }

    void addPlayer(Person p){
        personPlaying.add(p);
    }

    void start(){
     while (!personPlaying.isEmpty()){
         Person top = personPlaying.poll();
         move.move(top,dice,board);

         if(top.x==board.n-1&&top==board.m-1){
             System.out.println("Person id:- "+ top.id);
             System.out.println("Person Reached Final Pos");
             continue;
         }
         personPlaying.offer(top);
     }
    }


}
