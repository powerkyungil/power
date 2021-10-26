package com.yedam.java.ch01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//문제1) 세 수를 입력받아 차례대로 두 수와 사칙연산을 이용하여 나머지 수를 구한다고 했을 때 어떤 연산식이 되는 지 구현하세요.
		//		예를 들어, 2, 3, 5를 입력받았을 경우 2 + 3 = 5 를 출력하세요.
		
		//세수를 입력받아
		Scanner scanner = new Scanner(System.in);
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		//차례대로 두 수와 사칙연산을 이용하여 나머지 수를 구한다.
		// x + y = z
		// x - y = z
		// x * y = z
		// x / y = z
		// 기타(사칙연산을 제외한 경우의 수를 생각)
		if(x+y == z) {
			System.out.printf("%d + %d = %d\n", x, y, z); 
		
		} else if(x-y == z) {
		    System.out.printf("%d + %d = %d\n", x, y, z); 
		
		} else if(x*y == z) {
			System.out.printf("%d + %d = %d\n", x, y, z);
		
		} else if(x/y == z) {
			System.out.printf("%d + %d = %d\n", x, y, z);
		
		} else {
			System.out.println("사칙연산으로 연산식을 만들 수 없습니다.");
		}
		
		
		
		
		
		
		
	}
}
