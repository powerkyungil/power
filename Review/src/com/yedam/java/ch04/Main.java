package com.yedam.java.ch04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 문제4) 로또 번호를 구하는 프로그램을 작성하세요.

		boolean run = true;
		Scanner scanner = new Scanner(System.in);
		int[] selectNum = new int[6]; // 선택숫자
		int[] luckyballs = null; // 당첨숫자
		int luckyball;
		int myNum = 0;

		luckyballs = new int[7];

		while (run) {
			System.out.println("| 1. 당첨번호 | 2. 번호입력 | 3. 당첨확인 | 4. 종료 |");
			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:

				int randomNum1 = (int) (Math.random() * 45) + 1;
				luckyballs[0] = randomNum1;
				luckyball = luckyballs[0];
				int randomNum2 = (int) (Math.random() * 45) + 1;
				if (luckyball != randomNum2) {
					luckyballs[1] = randomNum2;
					luckyball = luckyballs[1];
				}

				int randomNum3 = (int) (Math.random() * 45) + 1;
				if (luckyball != randomNum3) {
					luckyballs[2] = randomNum3;
					luckyball = luckyballs[2];
				}

				int randomNum4 = (int) (Math.random() * 45) + 1;
				if (luckyball != randomNum4) {
					luckyballs[3] = randomNum4;
					luckyball = luckyballs[3];
				}

				int randomNum5 = (int) (Math.random() * 45) + 1;
				if (luckyball != randomNum5) {
					luckyballs[4] = randomNum5;
					luckyball = luckyballs[4];
				}

				int randomNum6 = (int) (Math.random() * 45) + 1;
				if (luckyball != randomNum6) {
					luckyballs[5] = randomNum6;
					luckyball = luckyballs[5];
				}

				int randomNumBonus = (int) (Math.random() * 45) + 1;
				if (luckyball != randomNumBonus) {
					luckyballs[6] = randomNumBonus;
					luckyball = luckyballs[6];
				}

				System.out.println("이번 주 당첨번호는 " + randomNum1 + ", " + randomNum2 + ", " + randomNum3 + ", "
						+ randomNum4 + ", " + randomNum5 + ", " + randomNum6 + "입니다.");
				System.out.println("보너스 번호는 : " + randomNumBonus + "입니다.");

			case 2:
				for (int i = 0; i < 6; i++) {
					selectNum[i] = scanner.nextInt();

				}
				for (int i = 0; i < selectNum.length; i++) {
					System.out.println("선택한 번호는 " + selectNum[i] + "입니다.");

				}

			case 3:
				//if(luckyNum)

			}

		}
	}
}
