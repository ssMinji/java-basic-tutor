package classpart;

public class Student {
	// 클래스의 풀네임: classpart.Student 
	
	// 학생이 가지는 속성 
	// 속성 -> 클래스의 멤버변수라고도 함 
	int studentId;
	String studentName;
	int grade;
	String address;
	
	// 디폴트 생성자: constructor 
	// 사용자 정의 생성자가 있으면 디폴트 생성자는 만들어지지 않음 
	public Student() {
		
	}
	
	// 학생 객체 생성 시 무조건 이름을 가지고 생성해야 한다는 요구조건이 있을 시 
	// 사용자 정의 생성자 
	public Student(String name) {
		// 멤버 변수에 넣어줌 
		studentName = name;
	}
	
	/*
	 * 생성자 오버로딩(Overloading) 
	 * 이름이 동일해도, 입력받는 파라미터의 개수나 타입이 다르면 다른 메서드로 인식함 
	 * 생성자는 반환 타입이 없고 new 키워드를 통해서만 호출 됨 
	 * */
	
	// 행위 -> 메서드 
	// void : 리턴타입 없음 
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name;
	}

	public static void main(String[] args) {

		// Student: 참조형 데이터 타입 
		// studentLee: 참조변수 -> 메모리에 생성된 인스턴스를 가리키는 변수 
//		Student studentLee = new Student();
//		studentLee.studentName = "홍길동";
//		studentLee.address = "서울시";
//		
//		studentLee.showStudentInfo();
//		
//		Student studentKim = new Student();
//		studentKim.studentName = "김철수";
//		studentKim.address = "경기도";
//		
//		studentKim.showStudentInfo();
//		
//		System.out.println(studentLee);
//		System.out.println(studentKim);
		
		Student studentLee = new Student("홍길동");
		// 객체 생성 시점에 이름 설정 강제 
		
		Student studentKim = new Student();
		// 디폴트생성자를 직접 명시해주면 객체 생성 가능 
	}

}


