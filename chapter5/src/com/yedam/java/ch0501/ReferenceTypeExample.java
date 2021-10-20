package com.yedam.java.ch0501;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		String strVar1 = "김경일"; // 김경일이라는 값을 가지는 String객체가 힙영역에 생성.
		String strVar2 = "김경일"; // 김경일이라는 값을 가지는 Stirng객체를 참조.
		
		if(strVar1 == strVar2) {
			System.out.println("strVar1 과 2는 참조가 같음.");
		} else {
			System.out.println("1과 2는 참조가 다름.");
		}
        if(strVar1.equals(strVar2)) {
        	System.out.println("strVar1과 2는 문자열이 같음.");
        }
        
        String strVar3 = new String("김경일");
        // 참조타입 타입명 = new 참조타입()
        String strVar4 = new String("김경일");
        
        if(strVar3 == strVar4) {
			System.out.println("strVar3 과 4는 참조가 같음.");
		} else {
			System.out.println("3과 4는 참조가 다름.");
		}
        if(strVar3.equals(strVar3)) {
        	System.out.println("strVar3과 4는 문자열이 같음.");
        }
        
	}

}
