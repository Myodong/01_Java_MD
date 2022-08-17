package edu.kh.oop.basic;

public class BasicRun {

	public static void main(String[] args) {

		KHD 김효동=new KHD();
		// heap 영역에 KHD 클래스에 정의된 내용으 이용하여
		// KHD 객체 생성(할당)
		
		// 객체가 가지고 있는 속성 출력
		System.out.println("이름 : "+김효동.name);
		System.out.println("나이 : "+김효동.age);
		System.out.println("생년월일 : "+김효동.birthday);
		
		
		
		// 비밀번호를 볼 수 있는 기능을 호출 == 간접 접근 방법
		김효동.showPassword();
		
		
		// 기능 수행
		김효동.eat();
		김효동.study();
		김효동.plus(50, 100);
	}

}
