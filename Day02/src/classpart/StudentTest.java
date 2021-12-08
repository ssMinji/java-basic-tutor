package classpart;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student();
		studentLee.studentName = "홍길동";
		studentLee.address = "서울시";
		
		studentLee.showStudentInfo();
	}

}
