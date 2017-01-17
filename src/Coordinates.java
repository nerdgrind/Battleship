/**
 * Created by Jeff on 1/12/2017.
 */
public class Coordinates {
    char column;
    int row;
    char status;
    public Coordinates (char c, int r){
        column = c;
        row = r;
        status = ' ';
    }
    public char getStatus(){
        return status;
    }

}
