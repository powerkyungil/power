package com.yedam.java.ch0603;

public class Car {
	//필드
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;
    int speed;
    
	//생성자
    Car() {
    	
    }
          //String model는 매개변수
	Car(String model) {
		//this.model = model;
		this(model, "은색", 250);
	}
	
	Car(String model, String color) {
		//this.model = model;
		//this.color = color;
		this(model, color, 250);
	}
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	//메소드

}
