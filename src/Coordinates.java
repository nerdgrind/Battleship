/**
 * Created by Jeff on 1/12/2017.
 */
public class Coordinates {
    int shipNum;
    boolean alreadyAttacked = false;

    public Coordinates(int s){
        shipNum = s;
    }

    Coordinates(){
        shipNum = -2;
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
