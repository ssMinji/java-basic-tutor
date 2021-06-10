package cooperation;

public class Student {

	String studentName;
	int grade; //학년
	int money;
	
	//학생 인스턴스 생성할 때 이름과 돈을 필수로 받아와서 설정하기 
	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}
	
	// 버스를 타는 행위에 대한 메서드를 만들려고 할때, 어떤 버스를 타는지 그 버스에 대한 정보를 매개변수로 받아와야 함 
	public void takeBus(Bus bus){
		// 해당 버스에 대한 행위가 있을텐데 이건 일단 나중에하기로 하자.
		//bus.
	
		
		//버스 클래스 만들고 돌아와서!
		bus.take(1000); // 객체의 협업이 일어나는 부분 
		// Student라는 클래스에서 Bus의 메서드를 호출해서 해당 메서드가 호출되면 돈이 늘어나고 승객의 수가 증가하는 과정이 일어나게 됨 
		money -= 1000;
	}
	
	public void takeSubway(Subway subway){ // 생성된 인스턴스가 매개변수로 들어와야함
		subway.take(1500);
		money -= 1500;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은: " + money + "입니다. ");
	}
}
