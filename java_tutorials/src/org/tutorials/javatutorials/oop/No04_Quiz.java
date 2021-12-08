package org.tutorials.javatutorials.oop;


class Monster {
	int health;
	String name;
	int level = 0;
	static String food = "human";
	
	public void setInfo(String name, int health) {
		this.name = name;
		this.health = health;
	}
	
	public void levelChange(boolean isWin) {
		if (isWin) {
			health *= 2;
			level++;
		}else {
			health /= 2;
			level--;
		}
		System.out.println("현재 체력: " + health + " 레벨: " + level);
	}
	
	public int getPower() {
		return health + level;
	}
	
	public static void foodChange(String newfood) {
		food = newfood;
		System.out.println("몬스터의 주식은 : " + food + "입니다.");
	}
	
	
}
public class No04_Quiz {

	public static void main(String[] args) {
		// Monster 클래스 만들어보기
		// 1) 몬스터는 체력(health), 이름(name), 레벨(level), 주식(food) 속성을 가지고 있다
		// 2) 체력과 이름은 몬스터마다 다르지만, 초기레벨은 0으로 설정, 모든 몬스터의 주식은 동일하다. 
		//    주식이 달라지면, 모든 종류의 몬스터의 주식도 달라진다. 
		// 3) 몬스터의 이름과 health를 세팅해주는 메소드 생성하기
		// 4) 몬스터의 파워는 레벨+체력으로 계산된다. 파워값을 얻는 메소드 생성하기
		// 5) 레벨과 체력을 변화시켜주는 메소드 만들기. 만약 게임에서 이겼다면, level 1 상승, 체력 2배 증가
		// 										   졌다면, level 1 하락, 체력 2배 감소
		// 								 변경 후 현재 레벨 및 체력 출력해주어야 함 
		// 6) 몬스터의 주식을 변경하는 메소드 만들기 
		Monster zombie = new Monster();
		zombie.setInfo("좀비", 100);
		System.out.println(zombie.name); // 좀비
		System.out.println(zombie.health); // 100
		boolean zombieWin = true;
		zombie.levelChange(zombieWin); // 현재 체력: 200 레벨: 1
		System.out.println(zombie.getPower()); // 201
		
		Monster dracula = new Monster();
		dracula.setInfo("드라큘라", 150); 
		boolean draculaWin = false;
		dracula.levelChange(draculaWin); // 현재 체력: 75 레벨: -1
		System.out.println(dracula.getPower()); // 74
		
		
		Monster.foodChange("Vegetable");
		System.out.println(zombie.food); // Vegetable
		System.out.println(dracula.food); // Vegetable
		
		// 개선점: 레벨이 0보다 작아질 경우에 대한 처리 

	}

}
