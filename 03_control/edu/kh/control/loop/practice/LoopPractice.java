package edu.kh.control.loop.practice;

import java.util.Iterator;
import java.util.Scanner;

public class LoopPractice {

	
	public void Practice1() {	
/*
 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
단, 입력한 수는 1보다 크거나 같아야 합니다.
만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
 
ex.
1이상의 숫자를 입력하세요 : 4 
1 2 3 4 

1이상의 숫자를 입력하세요 : 0
1 이상의 숫자를 입력해주세요.
*/		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		
			if (num1 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}else {for (int i = 1; i <=num1; i++) {
				
				System.out.print(i+" ");
			}

		}
	}
	
/*##############################강사님 문제풀이##############################*/	
	
	public void practice1_1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if (input >= 1) {
			for (int i = 1; i <= input; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}

//////////////////////////////////////////////////////////////////////////
	public void Practice2() {	
/*
 용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
단, 입력한 수는 1보다 크거나 같아야 합니다
ex.
1이상의 숫자를 입력하세요 : 4 
4 3 2 1 

1이상의 숫자를 입력하세요 : 0
1 이상의 숫자를 입력해주세요.		
 */
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num1 = sc.nextInt();
		
			if (num1 < 1) {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}else {for (int i = num1; i >=1; i--) {
				
				System.out.print(i+" ");
			}
		}
	}
	
/*##############################강사님 문제풀이##############################*/
	public void practice2_1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();

		if (input >= 1) {
			for (int i = input; i >= 1; i--) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
	}
//////////////////////////////////////////////////////////////////////////

	public void Practice3() {	
/*
 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.

ex.
정수를 하나 입력하세요 : 8
1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36 		
 */
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요 : ");
		int num1 = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num1; i++) {
			if (i == num1) {
				System.out.print(i + " ");
			} else {
				System.out.print(i + " + ");
			}
			sum += i;
		}
		System.out.print("= " + sum);
		}
/*##############################강사님 문제풀이##############################*/
	public void practice3_() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요 : ");
		int num = sc.nextInt();

		int sum = 0;

		for(int i=1 ; i <= num ; i++) {
			sum += i;

			if(i < num) {
				System.out.print(i + " + ");
			} else {
				System.out.println(i + " = " + sum);
			}
		}
	}
//////////////////////////////////////////////////////////////////////////

	public void Practice4() {	
/*
사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.

ex.
첫 번째 숫자 : 8
두 번째 숫자 : 4 	
4 5 6 7 8	

첫 번째 숫자 : 4
두 번째 숫자 : 8
4 5 6 7 8 

첫 번째 숫자 : 9
두 번째 숫자 : 0
1 이상의 숫자를 입력해주세요.
 */		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 =sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 =sc.nextInt();
		
		if (num1 < 1|| num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else if (num1>num2) {
			for (int i = num2; i <= num1; i++) {		
				System.out.print(i+" ");}
			}else {
				for (int i = num1; i <= num2; i++) {		
					System.out.print(i+" ");}
			}			
		}
/*##############################강사님 문제풀이##############################*/	
	public void Practice4_1(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자 : ");
		int num1 =sc.nextInt();
		
		System.out.print("두 번째 숫자 : ");
		int num2 =sc.nextInt();
		
//방법 1번		
		
//		if (num1 < 1|| num2 < 1) {// num1, num2 중에 1미만이 있는가?
//			System.out.println("1 이상의 숫자를 입력해주세요.");
//		}else {// 둘다 아니다.
//			int start = num1;
//			int end =num2;
//			
//			if(num1>num2) {//먼저 입력한 숫자가 크면 start/ end를 바꿈
//				start = num2;
//				end= num1;
//			}
//			for (int i = start; i <=end; i++) {
//			System.out.print(i+" ");}	
//			}

//방법 2번		
//		if(num1 < num2) {
//			for(int i=num1 ; i<=num2 ; i++) {
//				System.out.print(i + " ");
//			}
//		} else {
//			for(int i=num2 ; i<=num1 ; i++) {
//				System.out.print(i + " ");
//			}
//		}
		
		
	
//방법3번	
		
		if (num1 < 1|| num2 < 1) {// num1, num2 중에 1미만이 있는가?
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}else {//둘다 1 미만이 아니다
			
				//8  4
			if (num1>num2) {
				
				//두 변수의 값 교환
				int temp = num1;  //  temp : 8 / num1 : 8 / num2 : 4
				num1 = num2; //  temp : 8 / num1 : 4 / num2 : 4
				num2 = temp; //  temp : 8 / num1 : 4 / num2 : 8
			}
			for(int i=num1 ; i<=num2 ; i++) {
				System.out.print(i + " ");
			}
		}
	
	
	
}
//////////////////////////////////////////////////////////////////////////

	public void Practice5() {
/*
 사용자로부터 입력 받은 숫자의 단을 출력하세요.
 
ex.
숫자 : 4
===== 4단 =====
4 * 1 = 4
4 * 2 = 8
4 * 3 = 12
4 * 4 = 16
4 * 5 = 20
4 * 6 = 24
4 * 7 = 28
4 * 8 = 32
4 * 9 = 36
 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : : ");
		int dan =sc.nextInt();
		System.out.println("===== "+dan+"단 =====");
		
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%d x %d = %d \n",dan, i ,dan*1);
		
		}
	}
/*##############################강사님 문제풀이##############################*/
	
	public void practice5_1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num = sc.nextInt();

		System.out.printf("===== %d단 =====\n", num);
		for(int i = 1; i < 10; i++) {			
			System.out.printf("%d * %d = %d%n", num, i, (num * i));
		}
	}
	
	
//////////////////////////////////////////////////////////////////////////

	public void Practice6() {	
/*
사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.		
 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int dan =sc.nextInt();
		System.out.println("===== "+dan+"단 =====");
		
		
		if (dan<2 || dan >9 ) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}else {
			for (int i = 1; i <= 9; i++) {
				System.out.printf("%d x %d = %d \n",dan, i ,dan*1);
			}
		}
		
	}
//내문제점 : 문제 이해 잘못함 9단까지 출력해야함 
/*##############################강사님 문제풀이##############################*/
	public void Practice6_1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 : ");
		int num =sc.nextInt();
		
		if( num >= 2 && num <=9 ) {
			for(int dan = num ; dan <= 9 ; dan++) {
				System.out.println("===== " + dan + "단 =====");
				for(int i = 1 ; i<=9 ; i++) {
					System.out.printf("%d X %d = %2d \n" , dan , i , dan * i);
				}
				System.out.println(); // 단 사이 줄 바꿈
			}
		} else {
			System.out.println("2~9 사이 숫자만 입력해주세요");
		}
		
		
		
	}
	
	
//////////////////////////////////////////////////////////////////////////

	public void Practice7() {
/*
 다음과 같은 실행 예제를 구현하세요.

ex.
정수 입력 : 4
*
**
***
****		
*/
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		for (int x = 1; x <= num1; x++) {
			for (int i = 1; i <= x; i++) {
				System.out.print("*");
				
			}System.out.println();
			
		}
	}
/*##############################강사님 문제풀이##############################*/
	public void practice7_1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int row = 1; row <= num; row++) {
			for(int col = 1; col <= row; col++) {				
				System.out.print("*");
			}
			
			System.out.println(); // 줄바꿈
		}
	}	
	
//////////////////////////////////////////////////////////////////////////

	public void Practice8() {	
/*
다음과 같은 실행 예제를 구현하세요.

ex.
정수 입력 : 4
****
***
**
*
*/
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		
		for (int x = num1; x >= 1; x--) {
			for (int i = x; i >= 1; i--) {
				System.out.print("*");
				
			}System.out.println();
			
		}
	
	}
/*##############################강사님 문제풀이##############################*/
	
	public void practice8_1() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int row = num; row > 0; row--) {
			
			for(int col = row; col > 0; col--) {
				System.out.print("*");
			}
			
			System.out.println(); // 줄 바꿈
		}
	}

	
//////////////////////////////////////////////////////////////////////////

	public void Practice9() {	
/*
다음과 같은 실행 예제를 구현하세요.
ex.
정수 입력 : 4
   *
  **
 ***
**** 		
*/
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1= sc.nextInt();
		
		for (int x = 1; x <= num1; x++) {
			for (int t = 1; t <= num1-x; t++) {	
				System.out.print(" ");
			}
			for (int i = 1; i <= x; i++) {
				System.out.print("*");
			}System.out.println();
		}
				
	}
	
/*##############################강사님 문제풀이##############################*/
	
	public void Practice9_1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input= sc.nextInt();
		
		for (int row = 1; row <=input; row++) {
// [for] 문을 이용한 풀이		
			
//			for (int i = input-row; i >=1; i--) {
//			for (int i = input-1; i >=row; i--) {
//			위 둘다 사용 가능 	
//				System.out.print(" ");
//			}
//			for (int col = 1; col <=row; col++) {
//				System.out.print("*");
//			}
//		}	System.out.println(); // 줄바꿈

		
			
// [if] 문을 이용한 풀이
			
			for(int col = 1 ; col <= input ; col++) {
				if(col <= input - row) {
					System.out.print(" ");
				}else {
					System.out.print("*");
				}
			}
			System.out.println(); // 줄바꿈
		}		
	}
	
//////////////////////////////////////////////////////////////////////////

	public void Practice10() {
/*
 다음과 같은 실행 예제를 구현하세요.
ex.
정수 입력 : 3
*
**
***
**
* 		
*/
	Scanner sc = new Scanner(System.in);
	System.out.print("정수 입력 : ");
	int num1 = sc.nextInt();
	
	for (int x = 1; x <=num1; x++) {
		for (int t = 1; t <=x; t++) {
			System.out.print("*");
		}System.out.println();
	}
	for (int x = num1-1; x >=1; x--) {
		for (int i = x; i >=1; i--) {
			System.out.print("*");
		}System.out.println();
	}	
	}
	
/*##############################강사님 문제풀이##############################*/	
	public void Practice10_1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int  input = sc.nextInt();		

//방법 1 (위아래 삼각형 쪼개기)	
		
		//위쪽 삼각형
		for (int row = 1; row <=input; row++) {
			for (int col = 1; col <=row; col++) {
				System.out.print("*");
			}System.out.println();//줄바꿈
			}

		//아랫쪽 삼각형
		for (int row = input-1; row >=1; row--) {
			for (int col = 1; col <=row; col++) {
				System.out.print("*");
			}System.out.println();//줄바꿈
			}
	
		System.out.println("====================");
//방법 2 (if문 사용하기)			
		
		for(int row=1; row<= input*2-1; row++) {      
    	  if(row < input) {
             for(int col=1; col <= row; col++) {
                System.out.print("*");
             } 
          } else {
             for(int col=input ; col > row-input; col--) {
                System.out.print("*");
             }
          } 
          System.out.println();
       }
		
	}
		
//////////////////////////////////////////////////////////////////////////

	public void Practice11() {	
/*
다음과 같은 실행 예제를 구현하세요.

ex.
정수 입력 : 4
   *
  ***
 *****
******* 		
*/
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int num1=sc.nextInt();
				
				for (int x = 0; x <=num1; x++) {
					for (int t = 1; t <=num1-x; t++) {
						System.out.print(" ");
					}
					for (int i = 1; i <=x*2-1; i++) {
						System.out.print("*");
					}System.out.println();
				}
				}
	
/*##############################강사님 문제풀이##############################*/	
	
	public void Practice11_1() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input= sc.nextInt();
		
		for (int row = 1; row <=input; row++) {

// [for] 문을 이용한 풀이		
			
//			for (int i = input-row; i >=1; i--) {
			for (int i = input-1; i >=row; i--) {
			//위둘다사용가능
				System.out.print(" ");
			}
			for (int col = 1; col <=row*2-1; col++) {
				System.out.print("*");
			}	System.out.println();
			}			System.out.println(); // 줄바꿈
			
			}
	
				
			
// [if] 문을 이용한 풀이
			
//			for(int col = 1 ; col <= input*2-1 ; col++) {
//				if(col <= input - row|| input+row<=col) {
//					System.out.print(" ");
//				}else {
//					System.out.print("*");
//				}
//			}
//			System.out.println(); // 줄바꿈
//	
//	}
//	}
		

//////////////////////////////////////////////////////////////////////////

	public void Practice12() {	
/*
다음과 같은 실행 예제를 구현하세요.

ex.
정수 입력 : 5
*****
*   *
*   *
*   *
*****		
 */
		
		
/*##############################강사님 문제풀이##############################*/	
		
		Scanner sc = new Scanner(System.in);
		System.out.print("12정수 입력 : ");
		int input = sc.nextInt();
		
		for (int row = 1; row <=input; row++) {
			for (int col = 1; col <= input; col++) {
				//첫번째,마지막 줄, 칸일 때만 *출력
				if (row ==1 ||row == input || col ==1 || col == input) {
					System.out.print("*");

				}else {
				System.out.print(" ");
				}	
			}
			System.out.println();
		}
		
	}
//////////////////////////////////////////////////////////////////////////

	public void Practice13() {	
/*
1부터 사용자에게 입력 받은 수까지 중에서
	1) 2와 3의 배수를 모두 출력하고
	2) 2와 3의 공배수의 개수를 출력하세요.
* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
   모두 나머지가 0이 나오는 수

ex.
자연수 하나를 입력하세요 : 15
2 3 4 6 8 9 10 12 14 15
count : 2		
 */
		
/*##############################강사님 문제풀이##############################*/			
		
		Scanner sc = new Scanner(System.in);
		System.out.print("자연수 하나를 입력하세여 : ");
		int input = sc.nextInt();
		int count = 0;
		
		
		for (int i = 1; i <=input; i++) {
			// 2의 배수 또는 3의 배수인 경우 출력
			if (i%2==0||i%3==0) {
				System.out.print(i+" ");
				
				// 2와 3의 공배수== 2로도 나누어 떨어지고, 3으로도 나누어 떨어진다
				if (i%2==0&&i%3==0) {
					count++;// count증가
				}
			}
		}
		System.out.println("\ncount : "+ count);
	}

}
