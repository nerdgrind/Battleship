/**
 * Created by Jeff on 1/26/2017.
 */

abstract class Interface{
    protected int[] input;
    public int[][][] ships = new int[5][5][2];

    public abstract void updateBoard();

    public abstract void updateBoard(GameBoard[] g);

    public abstract int[] getCommand();

    public abstract void askPlayers();

    public abstract boolean quitting();

    public abstract int[][][] placeShips();

    public abstract void startingGame();

    public abstract void attackResponse();

    public abstract void quit(int i);

}
