package org.tutorials.javatutorials.day04;

class A {
    public String y(){
        return "public void y()";
    }
    private String z(){
        return "public void z()";
    }
    public String x(){
        return z();
    }
}

public class AccessDemo1 {

	public static void main(String[] args) {
		A a = new A();
        System.out.println(a.y());
        // 아래 코드는 오류가 발생한다.
        //System.out.println(a.z());
        System.out.println(a.x());

        // 설명
        // y는 public, z는 private
        // 만약 변수 or 메소드가 
        // public: 누구든지 클래스의 메소드를 호출해서 사용 가능
        // private: 내부적으로는 사용할 수 있지만 외부클래스는 사용 불가. 
        // a.x()는 z()메소드 호출하고 있음. z메소드는 x메소드와 같은 클래스에 존재
        // 따라서 같은 메소드에서는 private메소드 호출 가능 
        // 즉, 클래스에서 직접적으로 메소드를 호출하는 것은 불가능하다 
	}

}
