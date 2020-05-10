package org.tutorials.javatutorials.day06;

import java.util.ArrayList;

public class ArrayListDemo {
 
    public static void main(String[] args) {
        String[] arrayObj = new String[2]; // 배열의 문제점 
        arrayObj[0] = "one";
        arrayObj[1] = "two";
        // arrayObj[2] = "three"; 오류가 발생한다.
        for(int i=0; i<arrayObj.length; i++){
            System.out.println(arrayObj[i]);
        }
         
        // 따라서 사용했던 것이 ArrayList이고 
        // 이것이 컬렉션프레임워크의 어레이리스트타입이다 
        // 몇개의 값을 담을지 미리 지정하지 않는다 
        ArrayList al = new ArrayList();
        al.add("one"); // add메소드 사용 
        al.add("two");
        al.add("three");
        for(int i=0; i<al.size(); i++){
            System.out.println(al.get(i)); // 가져올때는 get메소드 사용
        }
        
        //step2
        for(int i=0; i<al.size(); i++){
            String val = al.get(i); // 컴파일 오류 발생 
            System.out.println(val);
        }
        
        // 에러 발생원인:
        // add라는 메소드는 어떤 데이터타입도 수용가능한 메소드 
        // 즉, Object 데이터타입을 받아오는 메소드
        // String이라는 "one"은 ArrayList내에 object데이터타입으로 저장되어있음 
        // 따라서 get(0)을 가져오게 되면 "one"의 데이터타입은 Object타입인것
        // 이를 현재 val에 담으려고 하는데 이것을 String으로 지정한 것 
        // Object를 String에 저장하려고 하고 있으므로 에러 발생 
        // 해결: 형변환 
        for(int i=0; i<al.size(); i++){
            String val = (String) al.get(i); 
            System.out.println(val);
        }
        
        // 하지만 위의 방식은 예전 방식이고, 컬렉션프레임워크는 제네릭이라는 문법적 형식을 채택했습니다
        // 이를 해결하기 위한것이 바로
        ArrayList<String> al = new ArrayList<String>();
        al.add("one");
        al.add("two");
        al.add("three");
        for(int i=0; i<al.size(); i++){
            String val = al.get(i);
            System.out.println(val);
        }
        // String데이터타입이라는 것을 제네릭을 이용해서 명시해준 것
        // 따라서 get으로 가져온 데이터를 형변환해줄 필요 없음 
        // 이유: 제네릭을 통해서 입력되는 데이터타입이 String이라는 사실 명시했기 때문
    }
 
}
