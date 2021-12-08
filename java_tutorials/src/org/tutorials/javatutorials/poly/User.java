package org.tutorials.javatutorials.poly;

interface Monster{
	public void doEvolve();
	public void getHealth();
	public int healthChange(boolean isWin);
}

class Zombie implements Monster{
	private int health;
	
	public void getHealth() {
		System.out.println("좀비의 체력은" + health);
	}
	
	public Zombie(int health) {
		this.health = health;
	}
	
	public void doEvolve() {
		System.out.println("좀비가 사람으로 진화했습니다");
	}
	public int healthChange(boolean isWin) {
		if (isWin) {
			health++;
		}else {
			health--;
		}
		return health;
	}
	public void chase() {
		System.out.println("좀비가 쫓아갑니다");
	}
}
class Dracula implements Monster{
	private int health;
	
	public void getHealth() {
		System.out.println("드라큘라는 남은 힘이 이만큼" + health);
	}
	
	public Dracula(int health) {
		this.health = health;
	}
	
	public void doEvolve() {
		System.out.println("드라큘라가 박쥐로 진화했습니다");
	}
	public int healthChange(boolean isWin) {
		if (isWin) {
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

public class User {
	public static void play(Monster mon) {
		mon.doEvolve();
	}
	public static void fight(Monster mon, boolean isWin) {
		mon.healthChange(isWin);
		mon.getHealth();
	}

	public static void main(String[] args) {
		/*
		 * 인터페이스 Monster, 그것을 구현한 Zombie, Dracula 클래스. 
		 * 실행을 위한 User 클래스
		 * Monster : health값 조회해 출력하는 함수(void), evolve(진화)시키는 함수(void), 게임 승패 여부에 따라 health바뀌는 함수 필요(int)
		 * Zombie : 객체 생성시 health값 초기화 필수. 
		 * 			외부에서 health값 접근 불가
		 *          health 조회하면 "좀비의 체력은 ???" 출력. 
		 *          진화하면 "좀비가 사람으로 진화했습니다" 메시지 출력
		 *          게임 승리하면 health 1증가, 패배하면 1 감소 
		 *          chase 기능 존재. 이를 실행하면 "좀비가 쫓아갑니다" 메시지 출력
		 * Dracula: 객체 생성시 health값 초기화 필수. 
		 *          외부에서 health값 접근 불가
		 *          health 조회하면 "드라큘라는 남은힘이 이만큼 ???" 출력. 
		 *          진화하면 "드라큘라가 사람으로 진화했습니다" 메시지 출력
		 *          게임 승리하면 health 2배 증가, 패배하면 1/2 감소
		 *          hunt 기능 존재. 이를 실행하면 "드라큘라가 사냥을 시작합니다" 메시지 출력
		 * User: 게임을 실행하는 User 클래스
		 *       몬스터의 공통적 기능만 수행
		 *       play 메소드 실행 시 진화메소드 동작
		 *       fight 메소드 실행 시 몬스터의 health바뀌는 메소드 동작, health조회하는 메소드 동작
		 *          
		 * */
	
		Monster zombie = new Zombie(150);
		Monster dracula = new Dracula(200);
		
		fight(zombie, true); // 좀비의 체력은151
		play(zombie); // 좀비가 사람으로 진화했습니다
		
		fight(dracula, false); // 드라큘라는 남은 힘이 이만큼100
		play(dracula); // 드라큘라가 박쥐로 진화했습니다
		
		Zombie zombie2 = new Zombie(150);
		zombie2.chase(); // 좀비가 쫓아갑니다
		
		Dracula dracula2 = new Dracula(100);
		dracula2.hunt(); // 드라큘라가 사냥을 시작합니다
		

	}

}
