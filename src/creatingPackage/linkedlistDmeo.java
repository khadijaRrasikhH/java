package creatingPackage;

import java.util.Collections;
import java.util.LinkedList;

public class linkedlistDmeo {
    public static void main(String[] args) {
        LinkedList am = new LinkedList();
        am.add("x");
        am.add("c");
        am.add("v");
        am.add("f");
        am.add("a");
        am.add("b");
        System.out.println(am);
        am.addFirst("d");
        am.addLast("z");
        System.out.println(am);
        System.out.println(am.getFirst());
        System.out.println(am.getLast());
        am.removeFirst();
        System.out.println(am );




    }
}
