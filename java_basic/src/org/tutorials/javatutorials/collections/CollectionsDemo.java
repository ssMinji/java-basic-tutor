package org.tutorials.javatutorials.collections;

import java.util.*;

class Computer implements Comparable{
    int serial;
    String owner;
    Computer(int serial, String owner){
        this.serial = serial;
        this.owner = owner;
    }
    
    // Comparable인터페이스: compareTo 메소드 정의하도록 강제함 
    public int compareTo(Object o) {
    	// 객체의 시리얼값과 인자로 전달된 객체의 시리얼 값 빼서 비교하고 있는 것 
    	// 그 결과가 양수이면 a의 시리얼이 큰거고, 음수면 작은거고, 0이면 같은거고 
        return this.serial - ((Computer)o).serial;
    }
    public String toString(){
        return serial+" "+owner;
    }
}
 
public class CollectionsDemo {
     
    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<Computer>();
        computers.add(new Computer(500, "Jack"));
        computers.add(new Computer(200, "Rachel"));
        computers.add(new Computer(3233, "Jenny"));
        Iterator i = computers.iterator();
        System.out.println("before");
        while(i.hasNext()){
            System.out.println(i.next());
        }
        // 정렬하기
        // Collections 클래스 이용 
        // sort를 실행하면 내부적으로 compareTo를 실행하게 됨 
        Collections.sort(computers); // 시리얼 값 기준으로 정렬
        System.out.println("\nafter");
        i = computers.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
 
}
