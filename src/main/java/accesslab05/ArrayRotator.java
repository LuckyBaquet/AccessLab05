package accesslab05;

import java.util.ArrayList;

/**
 * Created by lucky on 1/26/16.
 */
public class ArrayRotator<T> extends ArrayList<T> {

    public void rotate(int i){

        if(this.size() <= 1 || i <= 0)
            return;

        for (int j = 0; j < i; j++) {
             this.add(this.remove(0));
        }
    }

}
