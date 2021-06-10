package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		
		Student james = new Student("James", 5000);
		Student tomas = new Student("Tomas", 10000);
		
		Bus bus100 = new Bus(100);
		
		// 학생 제임스가 100번 버스를 탔다
		james.takeBus(bus100); // 생성된 버스 객체가 파라미터로 들어가야함
		// 이렇게 되면 학생 클래스의 테잌버스 메서드가 호출되고 그 안에서 버스 클래스가 호출되어서 승객의 수가 늘고 수입이 증가하는 작업이 일어나게 됨 
		james.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		
		// 학생 토마스가 2호선을 탔다 
		tomas.takeSubway(subwayGreen);

		tomas.showInfo();
		subwayGreen.showInfo();

		// 정리
		// 인스턴스 4개를 만들었음 
		
		// 상속개념 잠깐 소개 
		// 운송수단 trans 클래스로 만들어서 
		// 공통된 take 메서드를 가져다 쓸 수 있음 
	}

}
