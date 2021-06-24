package scheduler;

import java.io.IOException;
import java.sql.Connection;

public class SchedulerTest {

	public static void main(String[] args) throws IOException {
		
		

		// R, L, P 입력받기 
		System.out.println("전화상담 배분방식을 선택하세요. R, L, P");
		
		int ch = System.in.read(); // Stream 부분에서 설명하겠지만 int 타입으로 받아서 읽는다 정도로만 이해하고 넘어가기 
		Scheduler scheduler = null;
		
		if(ch == 'R' || ch == 'r') {
			scheduler = new RoundRobin();
		} else if(ch == 'L' || ch == 'l') {
			scheduler = new LeastJob();
		} else if(ch == 'P' || ch == 'p') {
			scheduler = new PriorityAllocation();
		} else {
			System.out.println("지원하지 않는 기능입니다.");
			return;
		}
		  
		/*
		 * 타입은 Scheduler로 하나인데 조건에 따라 그때그때 다른 인스턴스가 어사인될 수 있음 
		 * */
		
		// R, L, P에 해당하는 클래스가 어떤 기능을 하는 클래스인지는 알고 있음 
		// 그렇지만 그 클래스 안을 다 들여다보지는 않음 
		// 그러고나서 메서드를 호출 
		
		// 해야 할 일들은 Scheduler 인터페이스에서 정의 
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		// 같은 메서드를 불렀지만 해당 인스턴스가 무엇인지냐에 따라서 다르게 호출되어 다르게 동작하는 것 -> 다형성 
		
		
		// 인터페이스 예시 
		// 웹서버와 DB서버를 연결해주는 인터페이스 
		// 찾아가보면 메서드들이 선언만 되어있는 것 확인 가능 
		// Connection 
	}

}
