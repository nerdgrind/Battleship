//Created by Jeff Pack

import java.io.IOException;

public class Battleship {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Battleship!");
        GameBoard g = new GameBoard();
        System.out.println("Enter 'Q' to quit");
        System.out.print("Enter coordinates (i.e. A7): ");
        char a = '0';
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
            System.out.println("\nEnter 'Q' to quit");
            System.out.print("Enter coordinates (i.e. A7): ");
            a = '0';
            System.in.skip(1);
            i = System.in.read();
        }
    }
}