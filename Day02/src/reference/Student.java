package reference;

public class Student {
	int studentId;
	String studentName;
	
//	int koreanScore;
//	int mathScore;
//	String koreanSubject;
//	String mathSubject;
//	
//	int engScore;
//	String engSubject;
	// 과목의 정보는 학생이 가지고 있는 정보이기도 하지만 따로 클래스로 분리를 했을 때 좀 더 간결

	// 과목 클래스 가져다쓰기 
	Subject korean;
	Subject math;
	// 주의: 선언한다고 클래스가 생기진않음. 따라서 student가 생성될 때 함께 만들어주는게 좋음
	
	public Student() {
		korean = new Subject();
		math = new Subject();
	}
	
	// 학생 객체 생성 시 id, name 설정 필수 
	public Student(int id, String name) {
		studentId = id;
		studentName = name;
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKorean(String name, int score) {
		//korean.subjectName = name; 
		korean.setSubjectName(name);
		korean.setScore(score);
	}
	
	public void setMath(String name, int score) {
		math.setSubjectName(name);
		math.setScore(score);
	}
	
	public void showStudentInfo() {
		// total????
		//int total = korean.score + math.score;
		int total = korean.getScore() + math.getScore();
		System.out.println(studentName + "학생의 총점은: " + total + "점 입니다");
	}
	
}











