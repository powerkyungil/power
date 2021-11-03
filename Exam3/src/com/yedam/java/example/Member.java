package com.yedam.java.example;


public abstract class Member {
	int record;		//전월실적
	String grade;	//회원등급
	//등급을 나누는 기준을 정적 상수 필드로 선언
	public static Member getMemberShip(int record) {
		return null;
	}
	
	//전월실적을 넘겨받아 초기화하는 생성자
	public Member(int record, String grade) {
		this.record = record;
		this.grade = grade;
		
		
	}
	//현재 실적 및 회원등급을 출력하는 메소드 : 출력 예시) 현재 실적은 1100000이며, 회원등급은 GOLD입니다.
		public void showMemberInfo() {
		if(record>1000000) {
			System.out.println("현재 실적은 " + record + ", 이며 회원등급은 GOLD입니다.");
		} else { 
			System.out.println("현재 실적은 " + record + ", 이며 회원등급은 SILVER입니다.");
		}
		
	
	
	
	

	
	
	
	//해당 추상클래스를 상속하는 실체클래스 두 개(Silver, Gold) 클래스를 선언하고
	//전월 실적에 따라 해당하는 인스턴스를 반환하는 메소드

	
}
