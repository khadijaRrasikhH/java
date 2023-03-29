package creatingPackage;

import java.util.ArrayList;
import java.util.Iterator;


public class arryDemo {
    public static void main(String[] args) {
        ArrayList al=new ArrayList(); //when we use different data not specify the data in array

        al.add(100);
        al.add("welcome");
        al.add(1.5);
        al.add(true);
        al.add('A');
        System.out.println(al);
        System.out.println("arry list number:"+ al.size());
        System.out.println(al.remove(2));
        al.remove("welcome");//remove
        System.out.println(al);
        al.add(3,"khadija");//add
        System.out.println(al);
        System.out.println(al.get(3));//retrieve
        al.set(3,"Masoud");//replace
        System.out.println(al);
        System.out.println(al.contains("Masoud"));//search returns true false chek whether the element is in or not
        System.out.println(al.contains("java"));//this false
        System.out.println(al.isEmpty());// show is that array is empty or not
        //for loop using
        /*for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));*/
           /* for(Object e:al){
            System.out.println(e);// when we want print different data we use object in array*/
            // anther way for looping throw java build
              Iterator it=al.iterator();
              while(it.hasNext()){
                  System.out.println(it.next());
              }

        }

}
