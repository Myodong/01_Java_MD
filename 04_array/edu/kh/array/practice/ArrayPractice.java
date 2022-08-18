package edu.kh.array.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	
/*실습문제1
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
/*실습문제2
    길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
	순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
	홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
	[실행 화면]
	9 8 7 6 5 4 3 2 1
	홀수 번째 인덱스 합 : 20
*/
	public void ex2() {
		
		int[] arr = new int[9];
		int sum = 0;
		
		for (int i = arr.length; i > 0; i--) {
			int num = arr[i-1]+i; 
			
			System.out.print(num +" ");
			
			if (i%2==0) {
				sum+=i;
			} 
		}System.out.println("\n홀수 번째 인덱스 합 : "+sum);
			
	}
/*===============================[ 강사님 풀의 ]===============================*/
	
	
/*#############################################################################*/	
/*실습문제3
	사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
	1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.

	[실행 화면]
	양의 정수 : 5
	1 2 3 4 5	

	[실행 화면]
	양의 정수 : 8
	1 2 3 4 5 6 7 8
 */
	
	public void ex3() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 : ");
		int input= sc.nextInt();
		int[] arr = new int[input];
		
		for (int i = 0; i < input; i++) {
			int num=arr[i]+i+1;
			System.out.print(num +" ");
		}
	}

/*===============================[ 강사님 풀의 ]===============================*/	
	
	
/*#############################################################################*/
/*실습문제4
	정수 5개를 입력 받아 배열을 초기화 하고
	검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
	배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
	
	[실행 화면 1]
	입력 0 : 5
	입력 1 : 8
	입력 2 : 9
	입력 3 : 10
	입력 4 : 4
	검색할 값 : 8
	인덱스 : 1	
	
	[실행 화면 2]
	입력 0 : 5
	입력 1 : 8
	입력 2 : 9
	입력 3 : 10
	입력 4 : 4
	검색할 값 : 1
	일치하는 값이 존재하지 않습니다.
 */
	
	public void ex4() {
		
		
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];		
		
		for (int i = 0; i <=4; i++) {	//정수 입력 및 저장
			System.out.print("입력 " + i + " : ");
			int input= sc.nextInt();
			arr[i] = input;
		}	//저장 끝 검색 시작
		System.out.print("검색할 값 : ");
		int num =sc.nextInt();
		boolean flag=true;
	
		for (int x = 0; x < arr.length; x++) {			
			if(arr[x] == num) {
				System.out.println(x + "번째 인덱스에 존재합니다.");
				flag=false; //flag 값 변경 검색중지
				break;
			}	
			}
			if(flag) System.out.println("일치하는 값이 존재하지 않습니다.");
			}
		
		
	
/*===============================[ 강사님 풀의 ]===============================*/	


/*#############################################################################*/
/*실습문제5
	문자열을 입력 받아 문자 하나 하나를 char배열에 대입하고
	검색할 문자가 문자열에 몇 개 들어가 있는지, 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
	
	[실행 화면]
	문자열 : application
	문자 : i
	application에 i가 존재하는 위치(인덱스) : 4 8
	i 개수 : 2
--------------------------------------------------------------------/
/	* 문자열.length() : 문자열의 길이								/
/		ex) String str = “abcd”;									/
/		System.out.println(str.length()); // 4 출력					/
/																	/
/	* 문자열.charAt(인덱스번호) :									/
/	  문자열에서 해당 인덱스 번째 문자 하나를 얻어옴(char 자료형)	/
/		ex) String str = “abcd”;									/
/		char ch = str.charAt(3); // ‘d’								/
/		System.out.println(ch); // ‘d’ 출력 						/
--------------------------------------------------------------------/
 */
	
	public void ex5() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String str= sc.next();
		char[] arr = new char[str.length()];//문자 수만큼 인덱스수 생성
		
		
		for (int i = 0; i < arr.length; i++) {//인덱스에 문자 값 저장
			char ch = str.charAt(i);
			arr[i] = ch;
		}
		System.out.print("문자 : ");
		char message = sc.next().charAt(0);//문자열 중 0번째 인덱스 문자 하나를 얻어옴
		int sum=0;
		
		for (int x = 0; x < arr.length; x++) {
			
			if (arr[x]==message) {
			System.out.printf("%s에 %s가 존재하는 위치(인덱스) : ",str,message);	
			}
			
			
			
			
		}
		
		

//		char ch = str.charAt(0);//문자열 중 0인덱스 문자 출력
//		System.out.println(ch);
		

		
		
		
	
		
		
		System.out.println(Arrays.toString(arr)); //배열에 저장된 값 한줄 출력
		System.out.println(str.length()); //문자 수
		
		
	}
/*===============================[ 강사님 풀의 ]===============================*/	


/*#############################################################################*/

}
