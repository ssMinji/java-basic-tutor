package com.itbank.javatutorials.game;

/*Monster(인터페이스): health값 조회해 출력하는 함수(void)
*  		 evolve(진화)시키는 함수(void)
*           게임 승패여부(boolean)에 따라 health바뀌는 함수(int)*/

interface Monster {
	public void getHealth();
	public void doEvolve();
	public int changeHealth(boolean isWin);
}
