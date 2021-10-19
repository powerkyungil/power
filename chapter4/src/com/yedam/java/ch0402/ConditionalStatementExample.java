package com.yedam.java.ch0402;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		for(int i=1; i<10; i++) {
			System.out.println(i);
		}
		
		int sum = 0;
		for(int i=1; i<=100; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);
		
		
		
		for(int i = 0, j = 100; i<=50 && j>=50 ; i++, j--) {
			
		
		}
		System.out.println("====================");
		for(int x=2; x<=9; x++) {
			// x = 2;
			System.out.println("*** " + x + "단 ***");
			//*** 2단 ***
			for(int y=1; y<=9; y++) {
				System.out.println(x + "X" + y + "=" + x*y);
			}
		}
		
		String tree ="";
		for(int i=1; i<=5; i++) {
			tree += "*";
			System.out.println(tree);
			
		}
		//i = 1;
		//실행문 실행
		//증감연산식 : i++ -> i = 2;
	    //i<=5 -> 2<=5 -> True
		//실행문실행
		//증감연산식 : i++ -> i = 3;
		//i <= 5 -> 3 <= 5 -> True
		//실행문 실행
		//반복후 i=6; 되면
		//i <= 5 -> 6 <= 5 -> False
		//for문 종료

	}

}
