package org.tutorials.javatutorials.day06;

class StudentInfo{
	public int grade;
	StudentInfo(int grade){ this.grade = grade; }
}
class StudentPerson{
	public StudentInfo info;
	StudentPerson(StudentInfo info){ this.info = info; }
}
class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){ this.rank = rank; }
}
class EmployeePerson{
	public EmployeeInfo info;
	EmployeePerson(EmployeeInfo info){ this.info = info; }
}

// step2
// StudentPerson과 EmployeePerson클래스 지워버리고
class Person{
	// 공통의 데이터타입으로 정의해야 하는데 현재는 마땅치 않으니 
	// 모든클래스의 공통의 조상인 Object로 선언 
	public Object info; 
	Person(Object info){ this.info = info; }
}


// step3
class Person<T>{
    public T info;
    Person(T info){ this.info = info; }
}

public class GenericDemo1 {

	public static void main(String[] args) {
		StudentInfo si = new StudentInfo(2);
		StudentPerson sp = new StudentPerson(si);
		System.out.println(sp.info.grade); // 2
		EmployeeInfo ei = new EmployeeInfo(1);
		EmployeePerson ep = new EmployeePerson(ei);
		System.out.println(ep.info.rank); // 1

		// 한줄씩따라가면서 코드 흐름 같이 보기 

		// step2
		// grade나 rank값을 넣어야하는데 코드에 대한 기억이 가물가물하거나 혹은 실수로
		// 사람에 대한 정보니까...하면서 "부장"이라고 넣어버림 -> 의도와 벗어나는 상황
		// 하지만 오류발생하지 않음
		// 문법적으로는 문제없으나 코드가 설계된 목적성에 부합하지 않음 
		// 나중에 치명적인 문제를 야기할 수 있는 문제 
		Person p1 = new Person("부장");
		// p1의 info는 Object라는 타입인데 ei은 EmployeeInfo라는 데이터타입이기때문에
		// 형변환 해줘야함 

		EmployeeInfo ei = (EmployeeInfo)p1.info;
		System.out.println(ei.rank);

		// 컴파일당시에는 에러발생안하다가 실행할때 에러발생함
		
		// step3
		Person<EmployeeInfo> p1 = new Person<EmployeeInfo>(new EmployeeInfo(1));
        EmployeeInfo ei1 = p1.info;
        System.out.println(ei1.rank); // 성공
         
        Person<String> p2 = new Person<String>("부장");
        String ei2 = p2.info;
        System.out.println(ei2.rank); // 컴파일 실패
        // p2.info가 String이고 String은 rank 필드가 없는데 이를 호출하고 있기 때문 



	}

}
