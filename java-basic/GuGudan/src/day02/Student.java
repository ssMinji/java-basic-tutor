package day02;

public class Student {
	
	int studentId;  //멤버변수 = 파란색으로 나타남
	String studentName;
	int grade;
	String address;
 	
	/*
	 * 클래스는 대부분 대문자로 시작
	 * 하나의 java 파일에 하나의 클래스를 두는 것이 원칙이나, 여러개의 크래스가 같이 있는 경우
	 * public 클래스는 단 하나이며 public클래스와 자바 파일의 이름은 동일해야함 
	 * 
	 * 자바의 모든 코드는 클래스 내부에 작성해야 함 
	 * */
	public void showStudentInfo() {
		System.out.println(studentName + ", " + address);
	}
	
	// 메인 메서드가 실행
	public static void main(String[] args){
		Student studentLee = new Student();
		studentLee.studentName = "홍길동";
		studentLee.address = "서울시";
		
		studentLee.showStudentInfo();
	}
	
	/*
	 * 패키지 - 소스의 묶음 
	 * 패키지가 단순히  클래스 묶음이 아닌 프로젝트 전체 소스 코드를 구성하는 계층 구조가 됨. 따라서 패키지의 계층 구조 만드는 작업은 소스 코드를 어떠한 계층 구조로 관리할 지 구성하는 것
	 * */
	
	
	// 메서드 생성해보기 
	public String getStudentName() {
		return studentName;
	}
	
	public void setStudentName(String name) {
		studentName = name; 
	}

}
