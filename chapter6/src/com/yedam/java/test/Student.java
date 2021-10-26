package com.yedam.java.test;

public class Student {
	int num;
	String name;
	int score;
	
	
	public Student(int num, String name, int score) {
		this.num = num;
		this.name = name;
		this.score = score;
		
	}
	
	
	public int getNum() {
		return this.num;
	}
	
	public int getScore() {
		return this.score;
	}

	public String getName() {
		return this.name;
	}
	
	
	
	public void setnum(int num) {
		this.num = num;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setscore(int score) {
		this.score = score;
	}

}
