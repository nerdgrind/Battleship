/**
 * Created by Jeff on 1/12/2017.
 */
public class Coordinates {

    //-1 = already tried
    // 0 = Nothing
    // 1 = Ship
    // 2 = Hit
    // 3 = Miss
    int shipNum;

    boolean alreadyAttacked = false;
    public Coordinates(int s){
        shipNum = s;
    }

    Coordinates(){
        shipNum = 0;
    }

    int attack() {
        if (alreadyAttacked)
            return -1;
        else{
            alreadyAttacked = true;
            if (shipNum == 1){
                shipNum = 2;
            }
            return shipNum;
        }
    }

    int getStatus(){
        return shipNum;
    }

    void setShip(){
        shipNum = 1;
    }
}
