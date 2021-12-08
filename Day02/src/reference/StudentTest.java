package reference;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100, "Lee");
		// Lee 학생의 국어과목이름: 비문학, 점수: 80
		//          수학과목이름: 기하와벡터, 점수: 92
		studentLee.setKorean("비문학", 80);
		studentLee.setMath("기하와벡터", 92);
		
		studentLee.showStudentInfo();
		
		Student studentKim = new Student(110, "Kim");
		studentKim.setKorean("고전문학", 88);
		studentKim.setMath("방정식", 72);
		
		studentKim.showStudentInfo();
	}

}
