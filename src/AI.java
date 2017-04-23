/**
 * Created by Jeff on 1/26/2017.
 */
import java.util.concurrent.ThreadLocalRandom;



public class AI extends Player{


    AI(int p){
        playerNum = p;
    }

    public void placeShips() {

    }
    public int[] getCommand(){
        // nextInt is normally exclusive of the top value,
// so add 1 to make it inclusive
        int[] randomNum = {ThreadLocalRandom.current().nextInt(0, 9 + 1), ThreadLocalRandom.current().nextInt(0, 9 + 1)};
        while()
        return randomNum;
    }
    public void setGameBoard(GameBoard opponents){
        g[1] = opponents;
    }
    public GameBoard getGameBoard(){
        return g[0];
    }

    public void updateBoard(){
        inter.updateBoard(g);
    }

    public void quit(int i){
        inter.quit(i);
    }
}
