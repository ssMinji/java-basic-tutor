package cooperation;

public class Subway {
	
	int lineNumber;
	int passengerCnt;
	int money;
	
	// 무조건 호선번호가 있게 해보자
	public Subway(int lineNumber) {
		this.lineNumber = lineNumber;
	}

	// 승객이 탔을때의 행위
	public void take(int money) {
		passengerCnt++;
		this.money += money;  
	}
	
	public void showInfo() {
		System.out.println("지하철 " + lineNumber + "호선의 승객은 : " + passengerCnt + " 명이고, 수입은: " + money + "입니다.");
	}

}
