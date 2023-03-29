package creatingPackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class arraydemo2 {
    public static void main(String[] args) {
        ArrayList als =new ArrayList();
        als.add("x");
        als.add("b");
        als.add("c");
        als.add("a");
        ArrayList al_m =new ArrayList();
        al_m.addAll(als);
        System.out.println("after adding c:"+al_m);
        al_m.removeAll(als);
        System.out.println( "after removeing :"+al_m);

       Collections.sort(als);
        System.out.println("after sorting"+als);
        Collections.reverse(als);
        System.out.println("reverse "+als);
        Collections.shuffle(als);
        System.out.println("after shuffling"+als);

    }

}


