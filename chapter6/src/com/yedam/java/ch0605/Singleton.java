package com.yedam.java.ch0605;

public class Singleton {
	//필드
	private static Singleton singleton = new Singleton(); // 본인자신을 타입으로 가짐
	//생성자
	private Singleton() {
	}
	//메소드
	static Singleton getInstance() {
		return singleton;
	}	
	// 여기까지가 싱글톤 기본 골격

}
