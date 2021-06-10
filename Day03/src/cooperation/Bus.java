package cooperation;

public class Bus {
	
	int busNumber;
	int passengerCnt;
	int money;
	
	// 무조건 버스번호가 있게 해보자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	// 승객이 탔을때의 행위
	public void take(int money) {
		// 승객의 수는 늘어날 것이고, 버스의 돈은 상승
		passengerCnt++;
		this.money += money;  
	}
	
	public void showInfo() {
		System.out.println("버스 " + busNumber + "번의 승객은 : " + passengerCnt + " 명이고, 수입은: " + money + "입니다.");
	}
}
