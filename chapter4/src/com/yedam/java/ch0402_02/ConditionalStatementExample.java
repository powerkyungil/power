package com.yedam.java.ch0402_02;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		/*for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				System.out.println(i + "x" + j + " = " + i*j );
			}
		}*/
	//1부터 10까지 출력
	int m=1;
	while(m<=10) {
		System.out.println(m);
		m++;
	}
    //1부터 100까지 합
	int sum = 0;
	int i = 0;
	while(i<=100) {
		sum +=i;
		i++;
	}
	System.out.println(sum);
	
    
	int index = 1;
	
	while(index !=1) {
		System.out.println("while 반복문이 " + index + "번 실행됩니다.");
	} do {
		System.out.println("do~while 반복문이 " + index + "번 실행됩니다.");
	} while(index !=1);
	
	while(true) {
		int num = (int)(Math.random() * 6) + 1;
		System.out.println(num);
		if(num==6) {
			break;
	}
}
	ang:for(char upper = 'A'; upper<= 'Z'; upper++) {
		for(char lower = 'a'; lower<='z'; lower++) {
			System.out.println(upper + "-" + lower);
			if(lower=='g') {
				break ang;
			}
		}
    }
	
	for(int j=1; j<=10; j++) {
		if(j%2==0) { //짝수인 경우
			continue;
		}
		System.out.println(j);
	}
	
  }
}
