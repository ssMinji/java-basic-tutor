package org.tutorials.javatutorials.collections;

import java.util.ArrayList;
import java.util.HashSet;
 
import java.util.Iterator;
 
public class ListSetDemo {
 
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("two");
        al.add("three");
        al.add("three");
        al.add("five");
        System.out.println("array");
        
        Iterator ai = al.iterator();
        while(ai.hasNext()){
            System.out.println(ai.next());
        }
         
        HashSet<String> hs = new HashSet<String>();
        hs.add("one");
        hs.add("two");
        hs.add("two");
        hs.add("three");
        hs.add("three");
        hs.add("five");
        Iterator hi = hs.iterator();
        System.out.println("\nhashset");
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
        
        // 결론
        // List와 Set의 차이점
        // List: 중복 허용
        // Set: 중복 허용하지 않음 
    }
 
}
