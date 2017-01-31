/**
 * Created by Jeff on 1/26/2017.
 */
public class Interface_Console extends Interface{
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
}
