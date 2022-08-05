package edu.kh.variable.ex1;

public class VariableExamplel4 {

	public static void main(String[] args) {

/*		형변환(Casting) : 값의 자료형을 변환하는 것
		형변환은 왜 필요한가?
		 - 컴퓨터의 값 처리 원칙을 위배하는 경우 이를 해결하기 위해
		 
		 자동형변환
		  - 자료형의 [값의 범위]가 서로 다른 두 값의 연산 시
		    [컴파일러(번역기)]가 자동으로 
		    [값의 범위]가 작은 값을 큰 값으로 변환
*/		 

//		자동 형변환 확인 1)
		int num1 = 10;
		long num2 = 100L;
		System.out.println("num1+num2="+(num1+num2));

		
//		자동 형변환 확인 2)
		int num3 = 300;
		double num4 = 1.1;
		
		double result = num3+num4;
/* 					 300 + 1.1
 					 300.0(double) +1.1(double)
 					 301.1(double) 
 					 
  		int result = num3+num4;
  		 Type mismatch: cannot convert from double to int
		 더블형을 인트형을로 바꿀수 없다
*/ 
		System.out.println(result);
		
		
/*		자동 형변환 확인 3)
		chr → int 자동 형변
*/
		int num5 = 'a'; //대입도 연산이다!.
		System.out.println(num5);
		
		char ch =97; // 형변환 예외 상황 (큰 → 작은 쪽으로 자동 형변환)
		System.out.println("ch :"+ch);
		
		char ch2 = '김';
		int result2 = ch2;
		System.out.println(ch2+ "\"Unicode Number\" : " + result2);
		
		
		System.out.println("---------------------------------------------------------");
		System.out.println("***강제 형변환***");
		double temp = 3.14;
//		int result3 = temp;//값의 범위가 큰 double → int 형변환 (큰걸 작은걸로바꾼다 = 불가능)
		int result3 = (int)temp;
		System.out.println("result3 : " + result3);// 3.(소수점 버림 처리)
		
		int temp2 = 290;
		byte resurlt4 = (byte)temp2; //int를 → byte 로 강제 형변환
		System.out.println("resurlt4 : " + resurlt4); // 34
		
/*		강제 형변환의 다른 사용 예시
		**강제 형변환은 값의 범위 관계 없이 원하는 자료형으로 변환 가능**
*/		
		int inum1 = 1;
		int inum2 = 2;
		System.out.println(inum1/inum2);
/*							1	/	2	= 0 (소수점 버림 처리)
							int / int	= int(정수)
*/
		System.out.println((double)inum1/inum2);//(double)inum1 강제 형변환 /inum2(double)자동 형변환
/*									1.0 / 2.0 = 0.5
								double  / int = double
										  → double
*/							
		System.out.println((char)65); // int → char 강제 형변환 
		System.out.println((int)'A'); // char → int 강제 형변환
		
		
		
	}

}
