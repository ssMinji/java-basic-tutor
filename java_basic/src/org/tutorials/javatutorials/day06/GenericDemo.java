package org.tutorials.javatutorials.day06;

class Person<T>{
    public T info;
}
 
public class GenericDemo {
 
    public static void main(String[] args) {
        Person<String> p1 = new Person<String>();
        Person<StringBuilder> p2 = new Person<StringBuilder>();
        
        // 결과
        // 데이터타입
        // p1.info: String
        // p2.info: StringBuilder
        // 즉, 클래스를 정의할때는 데이터타입을 확정하지 않고 인스턴스를 생성할 때 
        // 데이터타입 지정하는 기능 
    }
 
}
