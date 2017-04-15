/**
 * Created by Jeff on 1/26/2017.
 */

import java.util.Scanner;

public class Interface_Console extends Interface {
    private Scanner sc;
    String alphaAllowed = "ABCDEFGHIJQ";
    String numAllowed = "0123456789";
    Interface_Console() {
        sc = new Scanner (System.in);
    }
    public void subUpdateBoard(GameBoard g){
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < 10; i++) {
            System.out.print((char)('A' + i));
            for (int j = 0; j < 10; j++) {
                System.out.print(" ");
                char temp;
                switch (g.getStatus(i,j)) {
                    case 0: temp = ' '; //Nothing
                        break;
                    case 1: temp = 'O'; //Miss
                        break;

                    case 2: temp = 'X'; //Hit
                        break;

                    case 3: temp = 'S'; //Ship
                        break;

                    default: temp = ' ';
                        break;

                }
                System.out.print("" + temp);
            }
            System.out.println();

        }
    }
    public void updateBoard(GameBoard[] g){
        System.out.println("      Your Ships");
        subUpdateBoard(g[0]);
        System.out.println("      Their Ships");
        subUpdateBoard(g[1]);

    }
    public boolean quitting(){
        do {
            System.out.print("Are you sure you want to quit? (Y/N): ");
            String response = sc.nextLine().toUpperCase();
            if (response.equals("Y")) {
                return true;
            } else if (response.equals("N")) {
                return false;
            } else {
                System.out.print("INVALID ENTRY: Please try Again");
            }
        }while(true);
    }
    public int[] getCommand(){
        do {
            System.out.print("Enter coordinates (i.e. A7) or 'Q' to quit: ");
            String inputString = sc.nextLine().toUpperCase();

            if (inputString.isEmpty() || inputString.length() > 2 || !alphaAllowed.contains(inputString.substring(0, 1)) || (inputString.length() == 2 && !numAllowed.contains(inputString.substring(1, 2)))) {
                System.out.println("INVALID ENTRY: Please try again.");
            } else if (inputString.charAt(0) == 'Q') {
                if (quitting() == true) {
                    System.out.println("YOU LOSE!!");
                    input[0] = -1;
                    return this.input;
                }
            } else {
                input[0] = inputString.charAt(0) - 'A';
                input[1] = inputString.charAt(1) - '0';
                return this.input;
            }
        }while(true);
    }


    public void attackResponse(int result){
                //System.out.print("" + a + b + " is a: ");
                switch (result) {
                    case -2:
                        System.out.println("MISS");
                        break;
                    case 0:
                        System.out.println("SINK!!");
                        break;
                    case -1:
                        System.out.println("(n) already attacked spot! pick again!");
                        break;
                    default:
                        System.out.println("HIT!");
                        break;
                }
    }

    public void startingGame() {
        /*System.out.println("Welcome to Battleship!");

                            while ((char) System.in.read() != '\n') ;
                            int result = g.attack(a - 'A', b - '0');
                            printBoard(g);

                            System.out.print("Enter coordinates (i.e. A7) or 'Q' to quit: ");
                            break;
                        default:
                            System.out.println("Invalid Input! try again!");
                            while ((char) System.in.read() != '\n') ;
                            break;

                    break;
                default:
                    System.out.println("Invalid Input! try again!");
                    while ((char) System.in.read() != '\n') ;
                    break;*/

    }

    public void quit (int i){
        System.out.println("Player " + i + " has quit!");
    }
}
