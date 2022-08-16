package edu.kh.array.ex;

import java.util.Scanner;

public class ArrayExample2 {
	
	//변수 : 값을 저장하기 위한 메모리상의 공간을 할당
	//(1개의 자료형, 1개의 데이터)
	
	//1차 배열 : 자료형이 같은 변수를 묶음으로 다루는 것
	//(1개의 자료형, n개의 데이터)
	
	//2차 배열 : 자료형이 같은 1차원 배열을 묶음으로 다루는 것
	//			 2차원 배열 == 1차원 배열 참조 변수의 묶음
	//(1개의 자료형, n개의 데이터)
	
	
	public void ex1() {
		
		// 2차원 배열 선언 및 할당
		int[][] arr = new int[2][3];
		
		// 인덱스를 이용한 초기화
		arr[0][0]= 7;
		arr[0][1]= 15;
		arr[0][2]= 20;
		
		arr[1][0]= 30;
		arr[1][1]= 41;
		arr[1][2]= 45;
		
		// for문을 이용한 순차 접근
		
		// * 2차원 배열 행의 길이
		System.out.println("행 : "+ arr.length);
		
		// * 2차원 배열 열의 길이
		System.out.println("열 : "+ arr[0].length);
		// arr[0] 인덱스가 참조하고 있는 1차원 배열의 길이
		
		
		for(int row=0; row<arr.length; row++) {
			
			for(int col=0; col<arr[row].length;col++) {
				
				System.out.printf("%d행 %d열 == % d \n", row, col, arr[row][col]);
			}
		}
	}
/*#############################################################################*/
		
		
		public void ex2() {
			
			// 2차원 배열 선언과 동시에 초기화
			
			char[][] arr = { {'a','b','c'},{'d','e','f'},{'g','h','i'} };
			
//			char[] arr1 = {'a','b','b'};
//			char[] arr2 = {'d','e','f'};
//			char[] arr3 = {'g','h','i'};
			
	
			// 1. char 입력 받기
			System.out.print("검색할 알파벳을 입력해주세요 : ");
			Scanner sc = new Scanner(System.in);		
			
//			char input = sc.nextchar();
//			sc.nextchar(); 는 존재하지 않음 -> Scanner는 char 자료형 입력을 지원하지 않음
			
			char input = sc.next().charAt(0);
			// sc.next() : 단어 입력(문자열 String)
			// 문자열.chatAt(0) : 문자열 중 0번째 인덱스 문자 하나를 얻어옴
			
			
			boolean flag = true; // true면 검색 결과 없음 / false면 검색 결과 존재
			
			
			// 2. 2차원 배열 내 검색
			for (int row = 0; row < arr.length; row++) {
				
				for (int col = 0; col < arr[row].length; col++) {
					
					//arr[row][col] 의 값과 입력 값이 같다면
					if(arr[row][col]==input) {
						System.out.printf("%c는 %d행 %d열에 존재합니다. \n",input,row,col);
						flag = false;
					 }
					
					}
				}
			
			if(flag) {
				System.out.println("일치하는 알파벳이 없습니다.");
			}
			
			}
		
		
			
			
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
