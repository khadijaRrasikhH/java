package creatingPackage;

import sun.nio.cs.CharsetMapping;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hasMap {
    public static void main(String[] args) {
        //HashMap m=new HashMap();
        HashMap<Integer, String> m = new HashMap<Integer, String>();
        m.put(102, "David");
        m.put(103, "Azaad");
        m.put(104, "David");
        m.put(105, "Naween");
        m.put(106, "khadija");
        m.put(107, "Massoud");
        System.out.println(m);
//        System.out.println(m.keySet());
//        System.out.println(m.values());
//        System.out.println(m.size());
//        System.out.println( m.isEmpty());
//        System.out.println( m.containsKey(102));
//        System.out.println(m.containsValue("khadija"));
        for (Object e : m.keySet()) {
            System.out.println(e + " " + m.get(e));
        }
        for (Map.Entry entry : m.entrySet()) {
            System.out.println(entry.getKey() + "" + entry.getValue());
        }
        Set s = m.entrySet();
        Iterator itr= s.iterator();
        while (itr.hasNext()){
            Map.Entry entry=(Map.Entry) itr.next();
            System.out.println(entry.getKey()+"  "+ entry.getValue());
        }
    }
}