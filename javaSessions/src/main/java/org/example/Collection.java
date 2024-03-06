package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Collection {
    public static void main(String[] args){

        List list = new ArrayList();
        list.add("78");
        list.add("C");
        list.add("java");
        list.add(null);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.get(1);
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }





        




































  /*  List l = new ArrayList();
       l.add("0");
        l.add("M");
        l.add("A");
        l.add(null);
        System.out.println(l);
        l.remove("A");
        System.out.println(l);
        l.add(3,"java");
        System.out.println(l);
        System.out.println(l.get(1));
  Iterator itr = l.iterator();
  while(itr.hasNext()){
      System.out.println(itr.next());
  }
        List<Integer> list = new ArrayList<Integer>();
        list.add(1000);
        System.out.println(list);
*/























    }
}
