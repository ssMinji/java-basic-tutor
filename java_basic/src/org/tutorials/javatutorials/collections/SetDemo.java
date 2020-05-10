package org.tutorials.javatutorials.collections;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
		System.out.println(A.containsAll(B)); // false
		System.out.println(A.containsAll(C)); // true
		// ppt로 같이살펴보기
		
		// step2
		// 하나씩 주석해제하면서 살펴보기 
		// ppt
		//A.addAll(B); // A와 B의 합집합(union) - 1, 2, 3, 4, 5
        //A.retainAll(B); // A와 B의 교집합(intersect) - 3
        //A.removeAll(B); //A와 B의 차집합(difference)- 1,2
         
        Iterator hi = A.iterator();
        while(hi.hasNext()){
            System.out.println(hi.next());
        }
		
		

	}

}
