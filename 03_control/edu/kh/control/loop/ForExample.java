package edu.kh.control.loop;

import java.util.Scanner;

public class ForExample {

/*  for문
	  -끝이 정해져 있는 경우 사용하는 반복문이다.
	   (반복 횟수가 지정되어 있는경우-운동장 10바퀴 돌기)
	   
	   [작성법]
	    for(초기식; 조건식; 증감식){}
	   	   조건식이 true일 때 반복 수행할 코드
	   
	    초기식 : for문을 제어하는 용도의 변수 선언
	
		조건식 : for문의 반복 여부를 지정하는 식
    			 조건식이 true인 경우에 반복을 수행함
    			 보통 초기식에 사용된 변수를 이용해서 조건식을 작성함.

		증감식 : for문이 끝날 때 마다 특정 값을 변화 시키는 식
    			 보통 초기식에 사용된 변수를 증가/감소 시켜
    			 조건식의 결과를 변화게 만듦.
*/
///////////////////////////////////////////////////////////////////////	
	
	//for문 기초 사용법 1
	public void ex1() {
	//1~10 까지 반복 출력
		
		for(int i = 1 ; i <= 10 ; i++ ) {         
		//  1)초기식  ; 2,5)조건식; 4,7)증감식  
		//  3,6)반복 수행할 코드
		System.out.println(i+"출력");
		
		//1,2,3,4 수행 후 5 → 6 → 7 반복		

		}	
	}
///////////////////////////////////////////////////////////////////////	
	
	//for문 기초 사용법 2
	public void ex2() {
		
//예제 1
//5부터 12까지 1씩 증가하면서 출력
		for(int i = 5; i<=12; i++ ) {
			
			System.out.println(i+"출력");
		}
		System.out.println("==================");
		
		
//예제 2		
// 1부터 100까지의 모든 정수의 합
		
		int sum = 0; //합계 저장용 변수
					 // 왜 0으로 초기화 하는가?
					 // - 0이라는 값은 더하거나 뺄 때 아무런 영향이 없어
					 //   누적이 필요한 상황에서 기준점으로 사용하기 적합하다.
		for (int i = 1; i <=100 ; i++) {
			 
			//i 값이 1~100 1씩 증가
			// - 이 i 값을 sum 변수에 계속 누적
			
			sum +=i;
		}
		System.out.println("1~ 100 까지의 합 : "+sum);
	}
	
///////////////////////////////////////////////////////////////////////	

	//for 기초 사용법 3	
	public void ex3() {
		
	//두 정수를 입력 받아
	//두 정수 사이의 모든정수 합을 출력
	//(num1 부터 num2까지
	//단, 첫 번째 입력이 두번째 입력 보다 작아야 한다.
		
	Scanner sc = new Scanner(System.in);
	System.out.println("정수1 입력 : ");
	int num1 =sc.nextInt();
	
	System.out.println("정수2 입력 : ");
	int num2 =sc.nextInt();
		
	int sum = 0;// 합계 저장용 변수
	
	for (int i = num1; i <= num2; i++) {
		sum += i;//누적
	}
	System.out.printf("%d부터 %d까지의 합 : %d\n", num1, num2, sum);
	}
	
///////////////////////////////////////////////////////////////////////	
	
	//for 기초 사용버 4
	public void ex4() {
		
	//1부터 100까지 3씩 증가하며 출력
	// 1 4 7 10 13 16 19 22 25 28 31 .....
		
	for (int i = 1; i <= 100; i += 3) {
		  					 // 1씩 증가 : i++ == i=i+1
							 // 3씩 증가 : i+=3 == i=i+3
		System.out.print(i+" ");
	}	
		System.out.println("\n==================================================");
		// 10부터 20까지 0.5씩 증가
		
		for (double i = 10; i <= 20; i += 0.5) {
//				10+ 0.5
//				10.0 + 0.5 (자동 형변환)
//				10.5 (double)
//				(int)10.5 →10
			
			System.out.print(i+" ");
      }	
	}
	
///////////////////////////////////////////////////////////////////////	
	
	//for문 응용
	//for문 + char + 자동/강제 형변환 응용
	public void ex5() {
		
	//A ~ Z 까지 출력	
//방법1		
//		for (int i = 'A'; i <= 'Z'; i++) {
//		   //int   = char
//			System.out.println((char)i);
//		}
	
//방법2		
		for (char i = 'A'; i <= 'Z'; i++) {
			//i로 다시 돌아올때 차로 강제 변환
			
			System.out.println(i);
		
		}
		
	}
///////////////////////////////////////////////////////////////////////	

	//for문 응용
	public void ex6() {
		
		//10부터 1까지 1씩 감소하면서 출력
		
		for (int i = 10; i>=1; i--) {
			
			//조건식이 true인 경우에 수행될 코드
			System.out.println(i);
		}
	}
	
///////////////////////////////////////////////////////////////////////	

	//for문 응용
	// 입력, sum for 응용
	public void ex7() {
		
		// 정수 5개를 입력 받아서 합계 구하기
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 1; i <=5; i++) {
			
//			System.out.print("입력 i : "); i이가 고대로나옴
			System.out.print("입력 " + i + " : ");
			sum += sc.nextInt();
			//입력 버퍼에서 다음 정수를 얻어와
			//sum 변수에 누적
		}	
			System.out.println("합계 : "+ sum);
		
		
	}
///////////////////////////////////////////////////////////////////////	

	//for문 응용
	public void ex8() {
		 // 정수를 몇 번 입력 받을지 먼저 입력 받고
	      // 입력된 정수의 합계를 출력
	      
	      // ex)
	      // 입력 받을 정수의 개수 : 3
	      // 입력 1 : 10
	      // 입력 2 : 20
	      // 입력 3 : 30
	      // 합계 : 60
	      
	      // ex)
	      // 입력 받을 정수의 개수 : 2
	      // 입력 1 : 10
	      // 입력 2 : 20
	      // 합계 : 30
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력 받을 정수의 개수 : ");
		int num1 =sc.nextInt();

		
		int sum = 0;
		for (int i = 1; i <=num1; i++) {
			System.out.print("입력 " + i + " : ");
			sum += sc.nextInt();
		}
			System.out.println("합계 : "+ sum);
	}
///////////////////////////////////////////////////////////////////////	

	//for문 기초
	public void ex9() {
		
		// for, %(나머지), if-else
		// 1부터 20까지 1씩 증가하며 출력하면서
		// 단, 5의 배수에는 ()를 붙여서 출력
		
		for (int i = 1; i <=20; i++) {
			if (i %5 == 0) {
				System.out.println("("+i+")");
			}else {//5의 배수가 아닌경우
				
				System.out.print(i+" ");
			}
			
		
		}
 }
	
///////////////////////////////////////////////////////////////////////	

	public void ex10() {
		//for, if-else, Scanner, 논리연산자, print메서드
		//구구단 출력
		
		//2~9사이 수를 하나 입력받아
		// 해당 하는 수의 단을 출력
		//단, 입력받은 수가 2~9사이가 아니라면 
		//"잘못 입력하셨습니다." 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.print("단(2~9) 입력 : ");
		int dan =sc.nextInt();
		
		
		if (dan<2 || dan >9 ) {
		// !(dan>=2 && dan<=9) 으로도 사용가능
			System.out.println("잘못 입력하셨습니다.");
		}else {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d \n",dan, i ,dan*1);
			}
		}

		System.out.println("=========================");
		//구구단 역순 출력
		if (dan<2 || dan >9 ) {
		// !(dan>=2 && dan<=9) 으로도 사용가능
			System.out.println("잘못 입력하셨습니다.");
		}else {
			for (int i = 9; i >= 1; i--) {
				System.out.printf("%d x %d = %d \n",dan, i ,dan*1);
			}
	}
	
	}
///////////////////////////////////////////////////////////////////////	
///////////////////////////////////////////////////////////////////////	

	//[중첩 반복문]
	//기초
	public void ex11() {
		for (int x = 1; x <= 4; x++) {

			for (int i = 1; i <= 5; i++) {
				System.out.print(i);
			}
			System.out.println();// 괄호내용을 출력
									// 아무것도없음 줄바꿈
		}
	}
///////////////////////////////////////////////////////////////////////	
	
	//응용
	public void ex12() {
		// 구구단 2단부터 9단까지 모두 출력

		// 2x1=2 2x2=4 2x3=6
		// 3x1=3 3x2=6 3x3=9
		// 4x1=4
		// .
		// .
		// .
		// 9x1=9
		for (int dan = 2; dan <= 9; dan++) {

			for (int i = 1; i <= 9; i++) {
				System.out.printf("%dx%d=%2d ", dan, i, dan*i);
				//%2d : 정수가 출력될 칸을 2칸 확보하고 오른쪽 정렬하여 출력
			}System.out.println();//줄바꿈
		} 

	}
	
///////////////////////////////////////////////////////////////////////	

	public void ex13() {
		//2중 for문을 이용하여 다음 모양을 출력하세요
		
		//1
		//12
		//123
		//1234
		
		for (int x = 1; x <= 4; x++) {

		//1234
		// for (int i = 1; i <=4; i++) {
			for (int i = 1; i <=x; i++) {
				//4대신 x 값을 넣음으로써 바꿀수있음
			System.out.print(i);
			
		 }System.out.println();//줄바꿈
		}
	}
///////////////////////////////////////////////////////////////////////	

	public void ex14() {
		//2중 for문을 이용하여 다음 모양을 출력하세요

		//4
		//43
		//432
		//4321
		for (int x = 4; x >= 1; x--) {

			for (int i = 4; i>=x; i--) {
			System.out.print(i);
			
		 }System.out.println();
		}
	
// 또다른 방법	 for (int i = 4; i>=5-x; i--)  i>=5-x; 변경
//	for (int x = 1; x <= 4; x++) {
//
//		for (int i = 4; i>=5-x; i--) {
//		System.out.print(i);
//		
//	 }System.out.println();
//	}
}
	
///////////////////////////////////////////////////////////////////////	

	public void ex15() {
		//2중 for문을 이용하여 다음 모양을 출력하세요

		//입력된 정수 4
		//4321
		//321
		//32
		//1
		
		//입력된 정수 5
		//54321
		//4321
		//321
		//32
		//1
		
		Scanner sc = new Scanner(System.in);
		System.out.print("입력된 정수 : ");
		int num1 = sc.nextInt();
		
		for (int x = num1; x >=1; x--) {
			
			for (int i = x; i>=1; i--) {
				System.out.print(i);
			} System.out.println();
		}		
	}
///////////////////////////////////////////////////////////////////////	

	
	public void ex16() {
		//2중 for문을 이용하여 다음 모양을 출력하세요

//		*
//		**
//		***
//		****
//		*****
		
		// row = 행(한줄), column == 열(한칸)
		for (int row = 1; row <=5; row++) {
			
			for (int col = 1; col <=row; col++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
///////////////////////////////////////////////////////////////////////	

	public void ex17() {
/*		합계 : sum
		개수 : count
		 * count, %(나머지), for 문을 이용한 검색
		
		1부터 20 사이의 3의 배수의 개수 출력
		
		ex) 3 6 9 12 15 18
		   count : 6
		   sum : 
*/	
		
		int sum = 0;
		int count =0; //수를 셀 때는 0부터 1씩 증가시키면서 세는 것이 보통
		for (int i = 1; i <=20; i++) {
			
			//3의 배수만 출력
			if (i%3==0) {
				System.out.print(i+" ");
				sum +=i;		
				count++;//1증가하는 코드
			}
		}System.out.println("\nsum : " + sum);
		System.out.println("\ncount : " + count);

	}
///////////////////////////////////////////////////////////////////////	

	
	public void ex18() {
/*		
		2중 for문과 count를 이용해서 아래 모양 출력하기
		1 2 3 4
		5 6 7 8
		9 10 11 12 
*/
		int count =1;
		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <=4; col++) {
/*				System.out.print(count+ " ");
				count++;	1번 방법
				
				System.out.printf("%3d",count );
				count++;	2번 방법
				
*/				System.out.printf("%3d",count++ );
/*							3번 방법
 * 
				후위 증감 연상을 이용하여
				출력 후 count 값을 1증가 시킨다
*/
			}System.out.println();
			
		}
	
	}
	
}
