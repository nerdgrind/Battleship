/**
 * Created by Jeff on 1/11/2017.
 */
public class GameBoard {

    ListShips ls = new ListShips();
    Coordinates board[][] = new Coordinates[10][];

    public GameBoard(){

        for (int i = 0; i<10; i++){
            board[i] = new Coordinates[10];
        }
        for (int i = 0; i<10; i++){
            for (int j = 0; j<10; j++)
                board[i][j] = new Coordinates();
        }

    }

    public int attack(int i, int j){
        int temp = board[i][j].attack();
        if (temp > -1) {
            return ls.hitShip(temp);
        }
        else
            return temp;
    }
}
