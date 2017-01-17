/**
 * Created by Jeff on 1/11/2017.
 */
public class GameBoard {
    Coordinates[][] board = new Coordinates [10][10];
    public void printBoard(){
        System.out.println("   | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " |");
            for (int j = 0; j < 10; j++)
                System.out.println(board[i][j].getStatus() + " | ");
        }
    }
}
