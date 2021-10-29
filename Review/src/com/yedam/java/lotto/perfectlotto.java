package com.yedam.java.lotto;

public class perfectlotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int lottoNum[] = new int[6];
	      boolean flag = true;
	      for (int i = 0; i < 6; i++) {
	         lottoNum[i] = (int) ((Math.random() * 45) + 1);
	         for (int j = 0; j < 6; j++) {
	            while(flag) {
	               if ((lottoNum[i] == lottoNum[j]) && i > 0) {
	                  lottoNum[i] = (int) ((Math.random() + 1) * 45);
	               } else
	                  flag = false;   
	            }
	         }
	         System.out.println(lottoNum[i]);
	      }

	   }
	}


