package com.itbank.javatutorials.interfaces;

public interface Meter {
	// Meter(택시 미터기) 인터페이스는 start와 stop이라는 추상메소드를 가지고 있음
	public abstract void start();
	public abstract int stop(int distance);
}
