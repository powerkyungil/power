package com.yedam.java.ch04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//문제4) 로또 번호를 구하는 프로그램을 작성하세요.
				
				boolean run = true;
		        Scanner scanner = new Scanner(System.in);
		        int selectNum = 0; //선택숫자
		        int[] luckyballs = null; //당첨숫자
		        int randomNum = 0;
		        luckyballs = new int[randomNum];
	        	
		        while(run) {
		        	System.out.println("| 1. 당첨번호 | 2. 번호입력 | 3. 당첨확인 | 4. 종료 |" );
		        	int selectNo = scanner.nextInt();
		        
		        switch(selectNo) {
		        case 1:
		        					
		        	int randomNum1 = (int)(Math.random() * 45) +1;
				    	luckyballs[randomNum1] = randomNum1;
					
				    int randomNum2 = (int)(Math.random() * 45) +1;
						if(luckyballs[randomNum2] != randomNum2) {
							luckyballs[randomNum2] = randomNum2;
				}
					
					int randomNum3 = (int)(Math.random() * 45) +1; 
						if(luckyballs[randomNum3] != randomNum3) {
							luckyballs[randomNum3] = randomNum3;
				}
					
					int randomNum4 = (int)(Math.random() * 45) +1; 
						if(luckyballs[randomNum4] != randomNum4) {
							luckyballs[randomNum4] = randomNum4;
				}
					
					int randomNum5 = (int)(Math.random() * 45) +1; 
						if(luckyballs[randomNum5] != randomNum5) {
							luckyballs[randomNum5] = randomNum5;
				}
					
					int randomNum6 = (int)(Math.random() * 45) +1; 
						if(luckyballs[randomNum6] != randomNum6) {
							luckyballs[randomNum6] = randomNum6;
				}
					
					int randomNumBonus = (int)(Math.random() * 45) +1; 
						if(luckyballs[randomNumBonus] != randomNumBonus) {
							luckyballs[randomNumBonus] = randomNumBonus;
				}
				
						System.out.println("이번 주 당첨번호는 " + randomNum1 + ", " + randomNum2 + ", " + randomNum3 + ", " + randomNum4 + ", " + randomNum5 + ", " + randomNum6 + "입니다." );
						System.out.println("보너스 번호는 : " + randomNumBonus + "입니다.");
						
		        case 2:
		        	selectNum = scanner.nextInt();
		        	System.out.println(selectNum);
		        	
		        	
		        	
		        	
		        	
				
		        
		        
		        }

		        }
		        
		        
	}

}
