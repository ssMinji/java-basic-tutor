package com.itbank.javatutorials.game;

/*Dracula: 객체 생성시 health값 초기화 필수
*           외부에서 health값 접근 불가
*           health값 조회하면 "드라큘라의 남은 힘은? ?????" 출력
*           진화하면 "드라큘라가 사람으로 진화했습니다" 메시지 출력
*           게임 승리하면 health 2배 증가, 패배하면 1/2 감소
*           hunt 기능 존재(void) "드라큘라가 사냥을 시작합니다" 메시지 출력*/

class Dracula implements Monster {
	private int health;
	
	public Dracula(int health) {
		this.health = health;
	}

	public void getHealth() {
		System.out.println("드라큘라의 남은 힘은? "+ health);
	}
	
	public void doEvolve() {
		System.out.println("드라큘라가 사람으로 진화했습니다");
	}
	
	public int changeHealth(boolean isWin) {
		if(isWin) {
			health *= 2;
		}else {
			health /= 2;
		}
		return health;
	}
	public void hunt() {
		System.out.println("드라큘라가 사냥을 시작합니다");
	}
}
