package edu.kh.op.practice;
import java.util.Scanner;
public class OperatorPractice2 {
	public static void main(String[] args) {		
/*키보드로 입력 받은 값들을 변수에 기록하고 저장된 변수 값을 화면에 출력하여 확인하세요.
[실행화면]
이름 : 홍길동
학년(정수) : 3
반(정수) : 4
번호(정수) : 15
성별(남/녀) : 남
성적(소수점 아래 둘째자리까지) : 85.75
3학년 4반 15번 홍길동 남학생의 성적은 85.75 입니다.*/		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 :");
		String a = sc.next();
		System.out.print("학년(정수) :");
		int b = sc.nextInt();
		System.out.print("반(정수) :");
		int c = sc.nextInt();
		System.out.print("번호(정수) :");
		int d= sc.nextInt();
		System.out.print("성별(남학생/여학생) :");
		String e = sc.next();			
		System.out.print("성적(소수점 아래 둘째 자리까지) :");
		double f = sc.nextDouble();
		
	//System.out.println(b+"학년 "+ c +"반 "+ d +"번호 "+ a  + e +"의 성적은 " + f+" 입니다.");//소수점2쨰자리까지구하는거안됨
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.", b, c, d, a, e, f);		
		
		
		
		
		
		
		
		
		
	}

}
