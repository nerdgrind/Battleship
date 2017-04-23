/**
 * Created by Jeff on 1/26/2017.
 */
class GameEngine {
    GameEngine(){

    }
    private Player[] Players;

    void updateUI() {
        for (Player p: Players){
            p.updateBoard();
        }
    }

    private void placeShips(){
        for (Player p: Players){
            p.placeShips();
        }
    }

    private void createPlayers(Interface inter){
        //generateUserOrder();
        Players = new Player[]{new Human(inter, 0), new AI(1)};
        Players[0].setGameBoard(Players[1].getGameBoard());
        Players[1].setGameBoard(Players[0].getGameBoard());
    }

    //Will put the Players in a random turn order
    private void generateUserOrder(){

    }

    void run(/*String[] args*/){


        /*Only has a console interface for now but will let you choose
        between which interface to use based on commandline arguments
         */
        //int temp = args.length;
        //String[] c = {"-c"};
        //if (args.equals(c))
        Interface inter = new Interface_Console();

        //else
        //    inter = new Interface_GUI();

        createPlayers(inter);
        updateUI();
        placeShips();
        do {
            for (int i = 0; i < Players.length; i++) {
                int[] ret = Players[i].getCommand();
                if (ret[0] == -1) {
                    Players[(i + 1) % 2].quit(i + 1);
                    return;
                }
                Players[(i + 1) % 2].getGameBoard().attack(ret);
                updateUI();
            }
        } while(true);
    }// the end of the program
}
