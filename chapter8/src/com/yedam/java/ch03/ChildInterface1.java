package com.yedam.java.ch03;

public interface ChildInterface1 extends ParentInterface {
	
	@Override
	public void method1() {
		System.out.println("ChildInterface1-method1() 실행");
	}
	
	@Override
	public void method3() {
		System.out.println("ChildInterface1-method3() 실행");
	}

}