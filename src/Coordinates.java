/**
 * Created by Jeff on 1/12/2017.
 */
public class Coordinates {
    char status;

    public Coordinates (){
        status = ' ';
    }
    public char getStatus(){
        char returnStat;
        if (status == ' ') {
            returnStat = status;
            setStatus('O');
        }
        else if (status == '0' || status == 'X')
            returnStat = '0';
        else
            returnStat = 'R';
        return returnStat;
    }

    public void setStatus(char newStatus){
        status = newStatus;
    }

}
