//Created by Jeff Pack


import java.io.IOException;

public class Battleship {

    static void printBoard(GameBoard g) {
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

    static void run() throws IOException {
        GameBoard g = new GameBoard();
        printBoard(g);
        System.out.println("Welcome to Battleship!");
        System.out.print("Enter coordinates (i.e. A7) or 'Q' to quit: ");
        while(true) {
            char a = Character.toUpperCase((char)System.in.read());
            switch (a){
                case 'Q': return;
                case '\n': break;
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J': char b = (char)System.in.read();
                    switch (b) {
                        case '\n': break;
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9': while ((char)System.in.read() != '\n');
                            //System.out.println("You have entered " + a + b);
                            int result = g.attack(a - 'A',b - '0');
                            printBoard(g);
                            System.out.print("" + a + b + " is a: ");
                            switch (result){
                                case -2: System.out.println("MISS");
                                    break;
                                case 0: System.out.println("SINK!!");
                                    break;
                                case -1: System.out.println("(n) already attacked spot! pick again!");
                                    break;
                                default: System.out.println("HIT!");
                                    break;
                            }
                            System.out.print("Enter coordinates (i.e. A7) or 'Q' to quit: ");
                            /*if (result == -2)
                                System.out.println("MISS");
                            else if (result == 0)
                                System.out.println("SINK!!");
                            else if (result == -1)
                                System.out.println("(n) already attacked spot! pick again!");
                            else
                                System.out.println("HIT!");*/
                            break;
                        default: System.out.println("Invalid Input! try again!");
                            while ((char)System.in.read() != '\n');
                            break;
                    }
                    break;
                default: System.out.println("Invalid Input! try again!");
                    while ((char)System.in.read() != '\n');
                    break;

            }

        }// the end of the program

    }

    public static void main(String[] args) throws IOException {
        run();

        //int a[] = System.in.read();

        //for (int i = 0, a[i] = System.in.read(); a[i] = System.in.read())
        /*char a = '0';
        char b;
        int i = System.in.read();
        while ((char)i != 'Q'||(char)i != 'q'){
            if (i != -1) {
                a = (char) i;
            }
            b = '0';
            i = System.in.read();
            if (i != -1) {
                b = (char) i;
            }
            System.out.println("You have entered " + a + b);
            System.out.print("" + a + b + " is a: ");
            int result = g.attack(a - 'A',b - '0');
            if (result == -2)
                System.out.println("MISS");
            else if (result == 0)
                System.out.println("SINK!!");
            else if (result == -1)
                System.out.println("(n) already attacked spot! pick again!");
            else
                System.out.println("HIT!");

            printBoard(g);
            System.out.println("\nEnter 'Q' to quit");
            System.out.print("Enter coordinates (i.e. A7): ");
            a = '0';
            System.in.skip(1);
            i = System.in.read();

        }*/
    }
}