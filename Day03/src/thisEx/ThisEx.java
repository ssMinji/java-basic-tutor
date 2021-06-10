package thisEx;

class Birthday{
	int day;
	int month;
	int year;
	
	public void setYear(int year) {
		this.year = year; // 자기 자신의 인스턴스인 year 에게 year를 넣어라 라는 의미
		
		// 만약 this 키워드 빠진다면?
		// 컴파일 에러는 나지 않음 
		// 하지만 year = year의 의미는 코드는 항상 자기와 가장 가까운애를 참조하게 되므로
		// 인풋파라미터로 들어오는 year에 다시 year를 넣은 셈 (Birthday 클래스의 멤버변수인 year에 넣어준게 아니라 지역변수에 assign 된 것)
		// 이 떄, 만약 인풋파라미터의 이름이 y라면 year = y는 제대로 멤버변수인 year에 값 대입한 것. 이때 year가 멤버변수를 나타내는 파란색으로 바뀌는 것만 봐도 제대로 동작함을 알 수 있음 
		// 하지만 통상적으로 인풋파라미터를 멤버변수의 이름과 동일한 변수명으로 설정함. 따라서 this  사용 
		
	}
	public void printThis() {
		System.out.println(this);
	}
}

public class ThisEx {

	public static void main(String[] args) {

		Birthday b1 = new Birthday();
		Birthday b2 = new Birthday();
		
		System.out.println(b1);
		b1.printThis();
		System.out.println(b2);
		
		// 즉, this는 현재 인스턴스의 주소값. 자기자신을 의미하는 것 
		// 코드는 똑같은 this이지만 의미는  그 떄의 인스턴스의 주소값이다. 
	}

}
