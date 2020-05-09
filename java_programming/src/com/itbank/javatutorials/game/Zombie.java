package com.itbank.javatutorials.game;

/*Zombie: 객체 생성시 health값 초기화 필수 
*  		외부에서 health값에 접근 불가
*          health값 조회하면 "좀비의 체력은? ????" 출력
*          진화하면 "좀비가 사람으로 진화했습니다" 메시지 출력 
*          게임 승리하면 health 1증가, 패배하면 1 감소
*          chase 기능 존재(void) "좀비가 쫓아갑니다" 메시지 출력*/

class Zombie implements Monster{
	private int health;
	
	public Zombie(int health) {
		this.health = health;
	}
	
	public void getHealth() {
		System.out.println("좀비의 체력은? "+ health);
	}
	
	public void doEvolve() {
		System.out.println("좀비가 사람으로 진화했습니다.");
	}
	
	public int changeHealth(boolean isWin) {
		if (isWin) {
			health++;
		} else {
			health--;
		}
		return health;
	}
	
	public void chase() {
		System.out.println("좀비가 쫓아갑니다");
	}
	
}
