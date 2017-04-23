/**
 * Created by Jeff on 2/3/2017.
 */
public class Human extends Player{
   Human(Interface inter, int p){
        this.inter = inter;
        playerNum = p;
    }
    public void placeShips() {
        g[0].placeShips(inter.placeShips());
    }
    public int[] getCommand(){
        return inter.getCommand();
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
