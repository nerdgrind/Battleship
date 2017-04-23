/**
 * Created by Jeff on 1/26/2017.
 */
abstract class Player {
    int playerNum;
    protected GameBoard[] g;
    protected Interface inter;

    public abstract void placeShips();
    public abstract int[] getCommand();
    public abstract void setGameBoard(GameBoard opponents);
    public abstract GameBoard getGameBoard();

    public abstract void updateBoard();

    public abstract void quit(int i);
}
