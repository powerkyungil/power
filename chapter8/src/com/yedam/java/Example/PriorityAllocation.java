package com.yedam.java.Example;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextcal() {
		System.out.println("고객 등급이 높은 고객의 전화를 먼저가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println();
		
	}
	

}
