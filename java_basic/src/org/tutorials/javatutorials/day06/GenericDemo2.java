package org.tutorials.javatutorials.day06;

class EmployeeInfo{
    public int rank;
    EmployeeInfo(int rank){ this.rank = rank; }
}
class Person<T, S>{
    public T info;
    public S id;
    Person(T info, S id){ 
        this.info = info; 
        this.id = id;
    }
    
    // step4
    public <U> void printInfo(U info){
        System.out.println(info);
    }
    
}

public class GenericDemo2 {

	public static void main(String[] args) {
		EmployeeInfo e = new EmployeeInfo(1);
		int id = 1;
		Person<EmployeeInfo, int> p1 = new Person<EmployeeInfo, int>(e, id);

		// step2
		// int에 대한 Wrapper클래스는 Integer
		EmployeeInfo e = new EmployeeInfo(1);
		Integer id = new Integer(1);
		Person<EmployeeInfo, Integer> p1 = 
				new Person<EmployeeInfo, Integer>(e, id);
		System.out.println(p1.id.intValue()); 
		// wrapper클래스가 담고있는 숫자를 기본데이터타입인 int로 돌려줌
		// 따라서 wrapper클래스 이용해 기본데이터타입을 제네릭에서 사용할 수 있음
		
		// step3
		// 제네릭의 생략
		Person p2 = new Person(e, i);
		
		// step4
		p1.<EmployeeInfo>printInfo(e);
		p1.printInfo(e); // 제네릭 생략가능

	}

}
