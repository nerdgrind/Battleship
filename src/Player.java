/**
 * Created by Jeff on 1/26/2017.
 */
class Player {
    private GameBoard g;
    protected Interface inter;

    public void setShip() {

    }
    public int[] getCommand(){
        return inter.getCommand();
    }
    public void setGameBoard(GameBoard g){
        this.g = g;
    }

    public GameBoard getGameBoard(){
        return g;
    }

    public void setGameBoard(){
        this.g = new GameBoard();
    }

    public void quit(int i){
        inter.quit(i);
    }
}
