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
				System.out.println(" ");
			}
			for (int i = 1; i <= x; i++) {
				System.out.print("*");
			}System.out.println();
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
		
		
		
		
		
		
	}
//////////////////////////////////////////////////////////////////////////

	public void Practice12() {	
	}
//////////////////////////////////////////////////////////////////////////

	public void Practice13() {	
	}

}
