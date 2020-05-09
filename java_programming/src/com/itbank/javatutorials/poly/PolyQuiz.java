package com.itbank.javatutorials.poly;

public class PolyQuiz {

	public static void main(String[] args) {
		/*
		 * 인터페이스 Monster,  그것을 구현한 Zombie, Dracula 클래스 
		 * 실행을 위한 User 클래스
		 * 
		 *  Monster(인터페이스): health값 조회해 출력하는 함수(void)
		 *  		 evolve(진화)시키는 함수(void)
		 *           게임 승패여부(boolean)에 따라 health바뀌는 함수(int)
		 *  Zombie: 객체 생성시 health값 초기화 필수 
		 *  		외부에서 health값에 접근 불가
		 *          health값 조회하면 "좀비의 체력은? ????" 출력
		 *          진화하면 "좀비가 사람으로 진화했습니다" 메시지 출력 
		 *          게임 승리하면 health 1증가, 패배하면 1 감소
		 *          chase 기능 존재(void) "좀비가 쫓아갑니다" 메시지 출력
		 *  Dracula: 객체 생성시 health값 초기화 필수
		 *           외부에서 health값 접근 불가
		 *           health값 조회하면 "드라큘라의 남은 힘은? ?????" 출력
		 *           진화하면 "드라큘라가 사람으로 진화했습니다" 메시지 출력
		 *           게임 승리하면 health 2배 증가, 패배하면 1/2 감소
		 *           hunt 기능 존재(void) "드라큘라가 사냥을 시작합니다" 메시지 출력
		 *  User: 게임을 실행하는 클래스
		 *        몬스터의 공통적 기능만 수행
		 *        play메소드(void) 진화메소드 동작
		 *        fight메소드(void) 몬스터의 체력 바뀌는 메소드 동작, health조회하는 메소드 동작        
		 * 
		 * */

	}

}
