/**
 * Created by Jeff on 1/18/2017.
 */
public class ListShips {
    Ship s1[]= new Ship[]{new Ship(5),new Ship(4),new Ship(3),new Ship(2),new Ship(1)};

    public int hitShip(int h){
        return s1[h].hit();
    }
}
