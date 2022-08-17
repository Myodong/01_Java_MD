package edu.kh.array.practice;

public class ArrayPractice {

	
/*
길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
[실행 화면]
1 2 3 4 5 6 7 8 9
짝수 번째 인덱스 합 : 25		
*/
	public void ex1() {
		int sum= 0;
		
		int[] arr = new int[9];	
		for (int i = 0; i <arr.length; i++) {
			int num=arr[i]+i+1;
			System.out.print(num);

			if (i % 2 == 0) {
				sum +=num;
			}
		}System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " +sum);	
	}
/*===============================[ 강사님 풀의 ]===============================*/
	
	
/*#############################################################################*/
/*	길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
	홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
	[실행 화면]
	9 8 7 6 5 4 3 2 1
	홀수 번째 인덱스 합 : 20
*/
	public void ex2() {
		
		int[] arr = new int[9];
		
		System.out.print(arr[0]);
		System.out.print(arr[1]);
		System.out.print(arr[2]);
		System.out.print(arr[3]);
		System.out.print(arr[4]);
		System.out.print(arr[5]);
		System.out.print(arr[6]);
		System.out.print(arr[7]);
		System.out.print(arr[8]);

		
		
		
		for (int i = arr.length; i > 0; i--) {
			int num = arr[i-1]+i; 
			
			System.out.print(num);
		}
		
		
		
		
		
		
		
		
		
	}
/*===============================[ 강사님 풀의 ]===============================*/
	
	
/*#############################################################################*/	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*#############################################################################*/

}
