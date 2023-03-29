package creatingPackage;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedlistDemo {
    public static void main(String[] args) {
       LinkedList aln=new LinkedList();// any kind of data Heterogeneous

        LinkedList<String> a=new LinkedList<String>();
        aln.add("x");
        aln.add(100);
        aln.add(16.5);
        aln.add('A');
        System.out.println(aln);
       a.add("xx");
       a.add("dd");
       a.add("mm");
       a.add("uu");
       System.out.println(a);
       System.out.println(aln.size());
        aln.remove(02);
       System.out.println("after remove: "+aln);
       aln.add(2,"khaija");
        System.out.println(aln);
        System.out.println(aln.get(03));
        aln.set(02,"khadija");
        System.out.println(aln);
        System.out.println(aln.contains(100));
        System.out.println(aln.contains("java"));
        System.out.println(aln.isEmpty());
        for(int i=0;i<aln.size();i++) {
            System.out.println(i);
        }for (Object P:aln) {
            System.out.println(P);
        }Iterator it=aln.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
                }
            }
        }




