package com.yedam.java.test;

import java.util.Scanner;

import com.yedam.java.feedback.Product;

public class Test {

	public static void main(String[] args) {
		
		boolean run = true;
		int x = 0;
		Student[] students = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("| 1. 학생수 | 2. 학생정보 | 3. 학생정보 전체조회 | 4. 학생정보 분석 | 5. 종료 |");
			int selectNo = scanner.nextInt();
			
			switch(selectNo) {
			case 1:
				System.out.println("학생 수 > ");
				x = scanner.nextInt();
				students = new Student[x];
				
				break;
				
			case 2:
				for(int i=0; i<students.length; i++) {
					System.out.println("학번 >");
					int num = scanner.nextInt();
					System.out.println("이름 > ");
					String name = scanner.next();
					System.out.println("점수 > ");
					int score = scanner.nextInt();
					
					Student student = new Student(num, name, score);
					students[i] = student;
				}
			break;
			case 3:
				for(int i=0; i<students.length; i++) {
					Student student = students[i];
					System.out.printf("%s학번의 점수는 %d\n입니다.", student.getNum(), student.getScore());
				}
				break;
			/*case 4:
				int max = 0;
				int index = 0;
				for(int i=0; i<students.length; i++) {
					Student student = students[i];
					if(student.getScore() > max) {
						max = student.getScore();
						index = i;
			}
		}
				int sum = 0;
				for(Student Student : Students) {
					if(Student.getScore() == max) {
						continue;
					}
					sum += Student.getScore();
					System.out.println("최고 점수 : " + Student.getScore()"점, 학번 : " + Student.getNum);
				}
			}*/
		}
	}
	}
}
