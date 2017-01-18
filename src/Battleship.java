import java.io.IOException;

public class Battleship {
    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to Battleship!");
        GameBoard g = new GameBoard();
        g.printBoard();
        System.out.println("Enter 'Q' to quit");
        System.out.print("Enter coordinates (i.e. A7): ");
        char a = '0';
        int i = System.in.read();
        while ((char)i != 'Q'||(char)i != 'q'){
            if (i != -1) {
                a = (char) i;
            }
            char b = '0';
            i = System.in.read();
            if (i != -1) {
                b = (char) i;
            }
            System.out.println("You have entered " + a + b);

            if (g.checkC+oordinates(a, b) == ' ')
                System.out.println(a + b + " is a MISS");
            else if (g.checkCoordinates(a, b) == 'O' || g.checkCoordinates(a, b) == 'X')
                System.out.println(a + b + " has already been chosen");
            else if (g.checkCoordinates(a, b) == 'S')
                System.out.println(a + b + " is a HIT");
            else
                System.out.println("OOPS ERROR:42");
            g.printBoard();
        }


    }
}