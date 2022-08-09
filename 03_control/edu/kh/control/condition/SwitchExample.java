package edu.kh.control.condition;

import java.util.Scanner;

public class SwitchExample {
/*Switch문
 * -식 하나의 결과로 많은 경우의 수를 처리할 떄 사용하는 조건문
 * → 식의 결과로 얻은 값과 같은 case 구문의 수행된다.
 * 
 * [작성법]
 * switch문의 식은 결과가 true/false가 아닌 식
 * switch(일반식){
 * 
 * case 결과값1 : 수행코드1; break;
 * case 결과값2 : 수행코드2; break;
 * case 결과값3 : 수행코드3; break;
 * 		.
 * 		.		
 * 		.	
 * default : case가 만족하지 않을 경우 수행하는 코드;
 * }
 */
//////////////////////////////////////////////////////////////////////////////////	
	public void ex1() {
/*		키보드로 정수를 입력 받아
		1 이면 "빨강색"
		2 이면 "주황색"
		3 이면 "노란색"
		4 이면 "초록색"
		1~4가 아니면 "흰색" 을 출력
*/		
		Scanner sc= new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int input =sc.nextInt();
		String result;
		
//***if문으로 만든 예제***		
//		if (input == 1) {
//			result = "빨강색";
//		}else if (input == 2) {
//			result = "주황색";
//		}else if (input == 3) {
//			result = "노란색";
//		}else if (input == 4) {
//			result = "초록색";
//		}else {
//			result = "흰색";
//		}
//		System.out.println(result);
		
//***switch문으로 만든 예제***
				//식= 여러 값이 나오는 경우
		switch(input) {
		case 1 : result = "빨강색"; break;
		case 2 : result = "주황색"; break;
		case 3 : result = "노란색"; break;
		case 4 : result = "초록색"; break;
		default : result = "흰색"; 
		}
		System.out.println(result);
}

//////////////////////////////////////////////////////////////////////////////////	
	public void ex2() {
/*		정수를 입력 받아
		나머지가 1이면 "백팀"
		나머지가 2이면 "청팀"
		나머지가 3이면 "홍팀"
		나머지가 1~3이아니면 "깍두기"
		
		Scanner sc= new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int input =sc.nextInt();
		String result;	
		
		switch (input) {
		case 1: result="백팀"; break;
		case 2: result="청팀"; break;
		case 3: result="홍팀"; break;
		default : result = "깍두기"; 
		}
		System.out.println(result);
		
		나머지 값을 구해야 합으로 아래와 같이 switch (input)자리 %으로 해야함 
*/		
		Scanner sc= new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int input =sc.nextInt();
		String result;	
		
		switch (input % 4) {
		case 1: result="백팀"; break;
		case 2: result="청팀"; break;
		case 3: result="홍팀"; break;
		default : result = "깍두기"; 
		}
		System.out.println(result + "입니다.");
	}
	
//////////////////////////////////////////////////////////////////////////////////	
	public void ex3() {
		//switch문의 식 결과가 double형인 경우 사용 불가능
		//switch문의 식 결과가 String형인 경우 사용 

/* 		double형 사용안됨
		Scanner sc = new Scanner(System.in);
		System.out.println("실수 입력 : ");
		double input = sc.nextDouble();
		String result;
		switch (input) {
		case 0.5: result = "김밥"; break;
		default: break;
*/		
		Scanner sc = new Scanner(System.in);
		System.out.println("김밥(3,000) / 라면(4,000) / 샌드위치(5,000) / 짬뽕(10000) : ");
		System.out.print("메뉴 입력 : ");
		String input=sc.next();
		int result;
		
		switch (input) {//switch은 식은 int, string만 가능
		case "김밥": result = 3000; break;
		case "라면": result = 4000; break;
		case "샌드위치": result = 5000; break;
		case "짬뽕": result = 10000; break;
		default: result = -1;//잘못입력하면 -1 이라는 의미 부여
		}
		
		if (result == -1) {
			System.out.println("잘못입력하셨습니다.");
		}else {
			System.out.printf("%s은 %d원 입니다. \n", input, result);
		}
	
	}
//////////////////////////////////////////////////////////////////////////////////	
	public void ex4() {
/*		산술연산 계산기
		두 정수와 1개의 연산자(+ - * / %(string))를 입력받아서
		연산 결과를 출력하시오
		단, 나누기(/) 연산 시 0으로는 나눌 수 없도록 한다.
		
		 [실행화면]
		정수1 입력 : 5
		연산자 입력 : +
		정수 2 입력 : 4
		5 + 4 = 9
		
		[실행화면]
		정수1 입력 : 5
		연산자 입력 : /
		정수 2 입력 : 0
		0으로는 나눌 수 없습니다.
		
		[실행화면]
		정수1 입력 : 5
		연산자 입력 : 0
		정수 2 입력 : 3
		존재하지 않는 연산자 입니다.
*/		
		Scanner sc =new Scanner(System.in);
		System.out.println("정수1 입력 : ");
		int num1=sc.nextInt();
		
		System.out.println("연산자 입력");
		String op =sc.next();
		
		System.out.println("정수2 입력 : ");
		int num2=sc.nextInt();
		
		switch (op) {
		case "+":System.out.printf("%d %s %d = %d \n", num1, op,num2, num1+num2);break;
//		case "+":System.out.println(num1 +"+" + num2 + "=" + (num1+num2));break;
		case "-":System.out.printf("%d %s %d = %d \n", num1, op,num2, num1-num2);break;
		case "*":System.out.printf("%d %s %d = %d \n", num1, op,num2, num1*num2);break;
		case "/":
			if (num2 == 0) {
				System.out.println("0으로는 나눌 수 없습니다.");
			}else {
				System.out.printf("%d %s %d = %d \n", num1, op,num2, num1/num2);				
			}break;
		case "%":System.out.printf("%d %s %d = %d \n", num1, op,num2, num1%num2);break;
		default: System.out.println("존재하지 않는 연산자입니다.");
		}
	}
//////////////////////////////////////////////////////////////////////////////////	
	public void ex5() {
		//switch문의 break 역할
		//계절 판별 (switch버전)
		Scanner sc =new Scanner(System.in);
		System.out.println("달 입력 : ");
		int month = sc.nextInt();
		
		String season;
		
		//switch문 에서 break는
		//"해당 case를 수행한 후 멈춰라" 라는 뜻
		//break가 없을 경우
		//- 다음 case가 연달아서 수행된다.
		switch (month) {
/*	1번	case 3: season ="봄";break;
		case 4: season ="봄";break;
		case 5: season ="봄";break;

	2번	case 3: 
		case 4: 
		case 5: season ="봄";break;
	
	3번*/case 3:	case 4:	case 5: season ="봄";break;
		//위 3가지 모두 정상 작동한다
		
		case 6: season ="여름";break;
		case 7: season ="여름";break;
		case 8: season ="여름";break;
		
		case 9: season ="가을";break;
		case 10: season ="가을";break;
		case 11: season ="가을";break;
		
		case 12: season ="겨울";break;
		case 1: season ="겨울";break;
		case 2: season ="겨울";break;

		default: season = "잘못 입력 하셨습니다.";
		}
		System.out.println(season);
	}
	
	
	
	
}