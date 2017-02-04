/**
 * Created by Jeff on 1/26/2017.
 */

import java.util.Scanner;

public class Interface_Console extends Interface {
    private Scanner sc;

    Interface_Console() {
        sc = new Scanner (System.in);
    }

    public void updateBoard(GameBoard g){
        System.out.println("  0 1 2 3 4 5 6 7 8 9");
        for (int i = 0; i < 10; i++) {
            System.out.print((char)('A' + i));
            for (int j = 0; j < 10; j++) {
                System.out.print(" ");
                char temp;
                switch (g.getStatus(i,j)) {
                    case 0: temp = ' ';
                        break;
                    case 1: temp = 'O';
                        break;

                    case 2: temp = 'X';
                        break;

                    default: temp = ' ';
                        break;

                }
                System.out.print("" + temp);
            }
            System.out.println();

        }
    }
    public int[] getCommand(){
        System.out.print("Enter coordinates (i.e. A7) or 'QQ' to quit: ");
        String inputString = sc.nextLine();
        /*while (true) {
            try {
                Character.toUpperCase((char) System.in.read());
            } catch (IOException e)

            }
            char a =
            switch (a) {
                case 'Q':
                    return;
                case '\n':
                    break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                    char b = (char) System.in.read();
                    switch (b) {
                        case '\n':
                            break;
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                    }
            }*/
            return this.input;
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
