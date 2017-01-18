/**
 * Created by Jeff on 1/12/2017.
 */

public class Ship {
    int size;
    int remaining;

      public Ship (int size){
          this.size = size;
      }
      int hit(){
          return --remaining;
      }

      int getSize(){
          return size;
      }
}
