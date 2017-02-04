/**
 * Created by Jeff on 1/26/2017.
 */
class GameEngine {
    GameEngine(){

    }
    private Player[] Players;
    private Interface[] inter;

    void updateUI(Interface g) {
        for (Player p: Players){
            g.updateBoard(p.getGameBoard());
        }
    }

    private void createPlayers(Interface inter){
        //generateUserOrder();
        Players = new Player[]{new Human(inter), new AI(inter)};

        //initialize gameboard for each player
        for (Player j : Players) {
            j.setGameBoard();
        }
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
        for (int i = 0; i < Players.length; i++){
            int[] ret = Players[i].getCommand();
            if (ret[0] == -1){
                Players[(i+1)%2].quit(i + 1);
                return;
            }
            Players[(i+1)%2].getGameBoard().attack(ret);
        }
    }// the end of the program
}
