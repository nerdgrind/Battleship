/**
 * Created by Jeff on 1/12/2017.
 */
public class Coordinates {
    int shipNum = -2;
    boolean alreadyAttacked = false;

    public Coordinates(int s){
        shipNum = s;
    }

    public Coordinates(){
        shipNum = -1;
    }

    int attack() {
        if (alreadyAttacked)
            return -1;
        else{
            alreadyAttacked = true;
            return shipNum;
        }
    }
}
