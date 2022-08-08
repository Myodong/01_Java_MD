package edu.kh.op.practice;
import java.util.Scanner;
public class OperatorPractice3 {
	public static void main(String[] args) {
/*
정수를 하나 입력 받아 양수/음수/0 을 구분하세요.
[실행화면]
정수 입력 : 3
양수 입니다.
정수 입력 : -5
음수 입니다.
정수 입력 : 0
0 입니다.		
*/
		Scanner sc = new Scanner(System.in);	
		System.out.print("정수 입력 :");
		int input1 = sc.nextInt();
		String result1 = (input1 > 0) ? "양수입니다." : (input1 == 0) ? "0입니다." : "음수입니다.";
		System.out.println(result1);
		
		System.out.print("정수 입력 :");
		int input2 = sc.nextInt();
		String result2 = (input2 > 0) ? "양수입니다." : (input2 == 0) ? "0입니다." : "음수입니다.";
		System.out.println(result2);
		
		System.out.print("정수 입력 :");
		int input3 = sc.nextInt();
		String result3 = (input3 > 0) ? "양수입니다." : (input3 == 0) ? "0입니다." : "음수입니다.";
		System.out.println(result3);		
	}

}
