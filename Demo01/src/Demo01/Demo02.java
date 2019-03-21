package Demo01;

import java.util.ArrayList;

public class Demo02 {
    public static void main(String[] args){
        int[] src = new int[]{1,2,3,4,5};
        int[] dest = new int[]{6,7,8,9,10};
        System.arraycopy( src , 0 , dest , 0 , 3);
        for (int i : src) {

            System.out.println(i);
        }

        for (int i : dest) {
           System.out.println(i);
        }

    }

}
