/**
 * Created by Jeff on 1/12/2017.
 */
public class Coordinates {

    // -2 = Not attacked
    // -1 = Attacked
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

    int getStatus(){
        if (alreadyAttacked){
            if (shipNum == -2){
                return 1; //Miss
            }
            return 2; //Hit
        }
        return 0; //Not yet attacked
    }
}
