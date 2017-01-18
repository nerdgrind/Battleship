/**
 * Created by Jeff on 1/11/2017.
 */
public class GameBoard {

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

    public void printBoard(){
        System.out.println("  | 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 |");
        System.out.println("------------------------------------------");
        char j = 'A';
        for (int i = 0; i < 10; i++, j++) {
            System.out.print(j + " | ");
            for (int k = 0; k < 10; k++)
                System.out.print(this.board[i][k].getStatus() + " | ");
            System.out.println("");
            System.out.println("------------------------------------------");

        }
    }
    public char checkCoordinates(char a, char b){
        return this.board[a][b].getStatus();
    }

}
