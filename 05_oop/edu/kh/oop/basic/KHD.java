package edu.kh.oop.basic;


// 클래스 : 객체가 되었을때 가지고 있을 속성, 기능을 정의(작성)한 문서
public class KHD {

	
	//객체가 가지고 있는 속성
	String name = "김효동";
	int age = 29;
	String birthday="1994-04-26";
	
	// 캡슐화 예시
	private String password = "1234";
	// private : 해당 클래스 내부에서 접근 가능하다라는 뜻
	
	//추상화의 형태 
/*	String name ;
	int age = 29;
	String birthday;
	prvate Srring;
*/	
	
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
	
	// public : 같은 프로젝트 내부 누구든, 어디서든 접근 가능
	public void showPassword() {
		System.out.println("비밀번호 : ***" + password + "***");
	}
		
	
}
