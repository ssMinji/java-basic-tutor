package object;


class Student {
	int studentId;
	String studentName;
	
	Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

	// equals 결과 확인 후 재정의 하기 
	@Override
	public boolean equals(Object obj) { // 매개변수 Object로 넘어옴
		if(obj instanceof Student){
			Student std = (Student) obj; // 다운캐스팅
			if(studentId == std.studentId) { // id가 같은지 비교 
				return true;
			} else{
				return false;
			}
		}
		return false; // Student객체가 아니라면 볼 필요도 없이 false 
	}
	// 다시 run해보면 true로 나오는 것 확인 
	
	
	// hashcode 재정의해보기 
	public int hashCode() {
		return studentId; // 가장 간단하게 생각해보자면, studentID가 같을 때 같은 hashcode값 뱉어주면 됨 
		// 로직은 어렵게 생각할 것 없이 보통
		// equals 메서드를 재정의할 때 사용된 멤버변수를 이용해 구현함 
	}
	
	// 상식적으로 생각해봤을 때 
	// equals의 결과가 같다면 hashcode값도 같아야 하는 것 
	// 따라서 equals가 재정의되었다면 hashcode도 재정의되어야 함 
}

public class EqualsEx {

	public static void main(String[] args) {

		String str1 = new String("test");
		String str2 = new String("test");
		
		System.out.println(str1 == str2); // 같은 주소인가를 체크 -> false -> 힙 메모리 주소값이 다르기 때문 -> 물리적동일성   
		System.out.println(str1.equals(str2)); // 두 문자열이 같은지를 체크 -> true -> 논리적동일성
		
		// equals 의 원형은 == 논리연산자와 동일한 로직을 가짐(즉 같은 주소인가를 체크) 
		// String 클래스에서 이미 재정의 되어있기 때문에 true 라는 결과 나오는 것 
		
		
		Student std1 = new Student(100, "Tomas");
		Student std2 = new Student(100, "Tomas");
		
		System.out.println(std1 == std2 ); // false 
		System.out.println(std1.equals(std2)); // 얘도 false -> 이유: equals의 원형은 ==과 똑같음 -> 따라서 재정의 필요 
		
		// 해시코드할 때 설명 
		System.out.println(std1);
		System.out.println(std1.hashCode());
		System.out.println(std2.hashCode());
		// 10진수 정수로 반환
		// 결과가 다름 -> 인스턴스가 어디로 저장될지를 계산한 값 
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		// 이 두개의 결과는 같음
		// 힙 주소값이 다른데 같은 이유 -> String 클래스 내에서 hashCode 가 재정의 되어있기 때문
		// 그 이유는: equals()메서드가 재정의 되었기 때문에 hashCode도 재정의된 것 - PPT
		
		//hashCode가 재정의 되어있을 때 진짜 hashcode를 알고 싶다면 이 메서드 사용해야 함 
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		// 결과 다름 
		
		
				
 	}

}
