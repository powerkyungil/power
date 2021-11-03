package com.yedam.java.Example;

public interface Scheduler {
	//상담전화를 가져오는 메소스
	public void getNextcal();
	//상담원에게 전화를 배분하는 메소드
	public void sendCallToAgent();
}
