package com.yedam.java.Example;

public class RoundRobin implements Scheduler {
	//상담원에게 한명씩 돌아가며 동일하게 상담업문 배분
	@Override
	public void getNextcal() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}

}
