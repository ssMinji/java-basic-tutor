package org.tutorials.javatutorials.interfaces;

class X {
	public String a() {return "X.a";}
}
	
class Y extends X{
    public String a(){return "Y.a";}
    public String b(){return "b";}
}
class Y2 extends X{
    public String a(){return "Y2.a";}
}
	
public class PolymorphismDemo2 {

	public static void main(String[] args) {
		X obj = new Y();
        X obj2 = new Y2();
        System.out.println(obj.a()); // Y.a
        System.out.println(obj2.a()); // Y2.a
        
        // 자식 클래스 Y, Y2를 인스턴스화 시켜서 obj, obj2만듬
        //결론
        // 부모의행세를 하고 있기 때문에 부모클래스에 있는 메소드만 호출이 가능함
        // 그러면서도 자식클래스에서 부모클래스에 존재하는 메소드를 오버라이딩했다면
        // 각각 자식클래스에서 오버라이딩한 메소드의 내용이 실행된다는 것 
        // 그리고 y는 실행되지 않음 
        // 동일한 데이터타입으로 존재하면서도 각각의 클래스에 소속되어있는 
        // 메소드의 동작방식대로 동작한다는게 다형성의 의의. 

	}

}
