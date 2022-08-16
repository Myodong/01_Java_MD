package edu.kh.oop.basic;


// 클래스 : 객체가 되었을때 가지고 있을 속성, 기능을 정의(작성)한 문서
public class KHD {

	
	//객체가 가지고 있는 속성
	String name = "김효동";
	int age = 29;
	String birthday="1994-04-26";
	prvate Srring= "password";
			//prvatedf 해강칼ㅡㅁㄴ
	
	//객체가 가지고 있는 기능
	public void study() {
		System.out.println("자바 공부 열심히 할 수 있음");
	}
	public void eat() {
		System.out.println("밥을 맛있게 먹을 수 있음");
	}
	public void plus(int num1, int num2) {
		System.out.println("합 : "+(num1+num2));
	}
	
}
