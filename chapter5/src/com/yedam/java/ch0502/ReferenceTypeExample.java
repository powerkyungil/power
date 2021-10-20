package com.yedam.java.ch0502;

public class ReferenceTypeExample {

	public static void main(String[] args) {
		// 스택은 가변적?
		// []->'배열이다'라고 알림
		int[] scores = new int[3]; // | 0 | 0 | 0 | 
		int[] scores1 = {83, 90, 87}; // | 83 | 90 | 87 | ->힙영역에 객체생성이됨
		//score1[0] -> [0]접근하고자하는 영역선택?
		System.out.println("score[0] : " + scores1);
		System.out.println("score[1] : " + scores1);
		System.out.println("score[2] : " + scores1);
        
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum += scores[i];
		}
		System.out.println("총합 :" + sum);
		double avg = (double) sum / 3;
		System.out.println("평균 :" + avg);
		
		int[] scores2;
		scores2 = new int[]{ 83, 90, 87 };
		
		for(int i=0; i<3; i++) {
			System.out.println("scores2["+i+"]="+scores2[i]);
		}
		
		int result =add(new int[] {83, 90, 87});
		
		System.out.println("========================");
		int[] arr1 = new int[3];
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+i+"]="+arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2]	= 30;
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1["+i+"]="+arr1[i]);
		}
			
	    System.out.println("========================");
	    
	    String[] arr3 = new String[3];
	    // String str = new Sting(); -> 스트링객체생성
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"]="+arr3[i]);
		}
	    
	    arr3[0] = "1월";
	    arr3[1] = "2월";
	    arr3[2] = "3월";
		for(int i=0; i<3; i++) {
			System.out.println("arr3["+i+"]="+arr3[i]);
		}
		
		System.out.println("========================");
		int[] scores3 = {83, 90, 87};
		
		int sum3 = 0;
		for(int i=0; i<scores3.length; i++)
			sum3 += scores3[i];
		
		double avg3 = (double)sum3 / scores3.length;
		System.out.println("총합 :" + sum3);
		System.out.println("평균 :" + avg3);
		
		
		}
	
	public static int add(int[] scores) {
		int sum = 0;
		for(int i=0; i<3; i++) {
			sum+= scores[i];
		}
		return sum;
	}
	
	}


