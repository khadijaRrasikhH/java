package creatingPackage;

import java.util.ArrayList;
import java.util.Arrays;

public class Arraylistdem3 {
    public static void main(String[] args) {
        String arr[]={"dog", "pig","mouse"};
       for (String  value:arr){
           System.out.println(value);
       }
        ArrayList al=new ArrayList(Arrays.asList(arr));
        System.out.println(al);
    }
}
