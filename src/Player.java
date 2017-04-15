/**
 * Created by Jeff on 1/26/2017.
 */
class Player {
    private GameBoard[] g = {new GameBoard(), new GameBoard()};;
    protected Interface inter;

    public Interface getInterface(){ return inter;}
    public void placeShips() {
        inter.placeShips();
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
