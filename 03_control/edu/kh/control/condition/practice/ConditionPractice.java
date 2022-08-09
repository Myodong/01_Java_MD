package edu.kh.control.condition.practice;

import java.util.Scanner;

public class ConditionPractice {
/////////////////////////////////////////////////////////////////////////////////
	public void practice1(){
/*키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
짝수가 아니면 “홀수입니다.“를 출력하세요.
양수가 아니면 “양수만 입력해주세요.”를 출력하세요.

[실행 화면 1]
숫자를 한 개 입력하세요 : 8
짝수입니다.

[실행 화면 2]
숫자를 한 개 입력하세요 : 17
홀수입니다.

[실행 화면 3]
숫자를 한 개 입력하세요 : -3
양수만 입력해주세요.
*/	
/***내가 푼 문제***/	
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 한 개 입력하세요 : ");
		int input = sc.nextInt();
		String result;
		
		if (input%2 <= 0) {
			result ="양수만 입력해 주세요";
		}else if (input%2 == 0) {
			result ="짝수입니다.";
		}else {
			result ="홀수입니다.";
		}
			System.out.println(result);
		}

		
/***강사님 예시1***/	
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("숫자를 한 개 입력하세요 : ");
//		int input = sc.nextInt();
//
//		if(input > 0) { // 양수
//			
//			if(input % 2 == 0) { // 짝수
//				System.out.println("짝수 입니다.");
//			}else { // 홀수
//				System.out.println("홀수 입니다.");
//			}
//			
//		} else {
//			System.out.println("양수만 입력해주세요.");
//		}

/***강사님 예시2***/	
//		Scanner sc = new Scanner(System.in);
//
//		System.out.print("숫자를 한 개 입력하세요 : ");
//		int input = sc.nextInt();
//		String result;
//
//		if(input <= 0) {
//			result = "양수만 입력해주세요.";
//		} else if (input % 2 == 0) {
//			result = "짝수 입니다.";
//		} else {
//			result = "홀수 입니다.";
//		}
//
//		System.out.println(result);
//	}

/////////////////////////////////////////////////////////////////////////////////
	public void practice2(){
/*국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우
 
 합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
불합격인 경우에는 “불합격입니다.”를 출력하세요.
 
 [실행화면 1] 
국어점수 : 88 
수학점수 : 50 
영어점수 : 40 
불합격입니다. 

[실행화면 2]
국어점수 : 88
수학점수 : 50
영어점수 : 45
국어 : 88
수학 : 50
영어 : 45
합계 : 183
평균 : 61.0
축하합니다, 합격입니다!*/
		
/***내가 푼 문제***/	
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("국어점수 : ");
//		int input1 = sc.nextInt();
//		System.out.print("수학점수 : ");
//		int input2 = sc.nextInt();
//		System.out.print("영어점수 : ");
//		int input3 = sc.nextInt();
//		
//		String result;
//		int sum = input1 + input2 + input3;
//		double avg =sum /3.0;
//		
//		if (input1>=40 && input2>=40 && input3>=40 && avg>=60) {
//			result="축하합니다, 합격입니다!.";
//		}else {
//			result="불합격입니다.";
//		}
//		System.out.println(result);

/*내 문제점: 합격시 추가로 나와야 하는 것들이 표기안됨*/		
		
/***강사님 예시1***/
		Scanner sc = new Scanner(System.in);
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + math + eng;
		double avg = sum / 3.0;
		
		if(kor >= 40 && math >= 40 && eng >= 40 && avg >= 60 ) { // 합격
			System.out.println("국어 : " + kor);
			System.out.println("수학 : " + math);
			System.out.println("영어 : " + eng);
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);

			System.out.println("축하합니다. 합격입니다.");
		} else { // 불합격

			System.out.println("불합격입니다.");
		}
	}
	
/////////////////////////////////////////////////////////////////////////////////
	public void practice3(){
/*1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)

[실행화면 1]
1~12 사이의 정수 입력 : 8
8월은 31일까지 있습니다.

[실행화면 2]
1~12 사이의 정수 입력 : 99
99월은 잘못 입력된 달입니다.
*/		
/***내가 푼 문제***/	
//		Scanner sc = new Scanner(System.in);
//		System.out.print("1~12 사이의 정수 입력 : ");
//		int input1 = sc.nextInt();
//		String result;
//		
//		switch (input1) {
//		case 1: result = "1월은 31까지 있습니다.";break;
//		case 2: result = "2월은 30까지 있습니다.";break;
//		case 3: result = "3월은 31까지 있습니다.";break;
//		case 4: result = "4월은 30까지 있습니다.";break;
//		case 5: result = "5월은 30까지 있습니다.";break;
//		case 6: result = "6월은 31까지 있습니다.";break;
//		case 7: result = "7월은 30까지 있습니다.";break;
//		case 8: result = "8월은 31까지 있습니다.";break;
//		case 9: result = "9월은 30까지 있습니다.";break;
//		case 10: result = "10월은 31까지 있습니다.";break;
//		case 11: result = "11월은 30까지 있습니다.";break;
//		case 12: result = "12월은 31까지 있습니다.";break;
//		default: System.out.printf("%d월은 잘못 입력된 달입니다. \n", input1);
//		}
//		System.out.println(result);

/*내 문제점: 너무 어렵개 생각해서printf를 사용하려고함 /result값이 초기화 안됨 */		
	
/***강사님 예시1***/	
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이 정수 입력 : ");
		int month = sc.nextInt();
		
		// 30일 : 4 6 9 11
		// 31일 : 1 3 5 7 8 10 12
		// 28일 : 2
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 31일 까지 있습니다.");
			break;
			
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은 30일 까지 있습니다.");
			break;
		
		case 2:
			System.out.println(month + "월은 28일 까지 있습니다.");
			break;
			
		default: System.out.println(month + "월은 잘못 입력된 달입니다.");
		}

	}
/////////////////////////////////////////////////////////////////////////////////
	public void practice4(){
/*키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
		저체중/정상체중/과체중/비만을 출력하세요.
		BMI = 몸무게 / (키(m) * 키(m))
		BMI가 18.5미만일 경우 저체중 / 18.5이상 23미만일 경우 정상체중
		BMI가 23이상 25미만일 경우 과체중 / 25이상 30미만일 경우 비만
		BMI가 30이상일 경우 고도 비만
		
		[실행 화면]
		키(m)를 입력해 주세요 : 1.65
		몸무게(kg)를 입력해 주세요 : 58.4
		BMI 지수 : 21.45087235996327
		정상체중	
*/		
		
/***강사님 예시***/
		Scanner sc = new Scanner(System.in);

		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();

		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();

		// BMI = 몸무게 / (키(m) * 키(m))
		double bmi = weight / (height * height);
		System.out.println("BMI 지수 : " + bmi);

//		18.5미만일 경우 저체중  
//		18.5이상 23미만일 경우 정상체중
//		23이상 25미만일 경우 과체중 
//		25이상 30미만일 경우 비만
//		30이상일 경우 고도 비만

		String result ;

		if(bmi < 18.5) {
			result = "저체중";
		} else if(bmi < 23) {
			result = "정상체중";
		} else if(bmi < 25) {
			result = "과체중";
		} else if(bmi < 30) {
			result = "비만";
		} else {
			result = "고도비만";
		}
		System.out.println(result);
	}
/////////////////////////////////////////////////////////////////////////////////
	public void practice5(){
/*중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.

[실행 화면 1]
중간 고사 점수 : 80
기말 고사 점수 : 30
과제 점수 : 60
출석 횟수 : 18
================= 결과 =================
중간 고사 점수(20) : 16.0
기말 고사 점수(30) : 9.0
과제 점수 (30) : 18.0
출석 점수 (20) : 18.0
총점 : 61.0
Fail [점수 미달]
  
  	[실행 화면 2]
중간 고사 점수 : 80
기말 고사 점수 : 90
과제 점수 : 50
출석 횟수 : 15
================= 결과 =================
중간 고사 점수(20) : 16.0
기말 고사 점수(30) : 27.0
과제 점수 (30) : 15.0
출석 점수 (20) : 15.0
총점 : 73.0
PASS

[실행 화면 3]
중간 고사 점수 : 100
기말 고사 점수 : 80
과제 점수 : 40
출석 횟수 : 10
================= 결과 =================
Fail [출석 횟수 부족 (10/20)]
 */

/***강사님 예시***/	
	
	Scanner sc = new Scanner(System.in);

	// 변수의 장점 : 재사용성

	System.out.print("중간 고사 점수 : ");
	double midTerm = sc.nextInt(); // int로 입력 받아도 대입 연산 시 double 자동 형변환

	System.out.print("기말 고사 점수 : ");
	double finalTerm = sc.nextInt();

	System.out.print("과제 점수 : ");
	double report = sc.nextInt();

	System.out.print("출석 횟수 : ");
	double attendance = sc.nextInt();

	// 각각의 점수를 비율에 맞게 변경
	midTerm   *= 0.2;   // midTerm = midTerm * 0.2;
	finalTerm *= 0.3;   
	report    *= 0.3;   
	//attendance *= 1; // attendance = attendance * 5 * 0.2;

	System.out.println("================= 결과 =================");


	if(attendance <= 20 * (1 - 0.3)  ) { // 14번 이하 출석 했을 경우
		System.out.println("Fail [출석 횟수 부족] (" + (int)attendance + "/20)");
												// 소수점 버림 처리

	}else { // 출석 만족
		System.out.printf("중간 고사 점수(20) : %.1f \n" , midTerm);
		System.out.printf("기말 고사 점수(30) : %.1f \n" , finalTerm);
		System.out.printf("과제 점수     (30) : %.1f \n" , report);
		System.out.printf("출석 점수     (20) : %.1f \n" , attendance);

		double sum =  midTerm + finalTerm + report + attendance;

		System.out.printf("총점 : %.1f \n" , sum);

		if(sum >= 70.0) {
			System.out.println("PASS");
		}else {
			System.out.println("Fail [점수 미달]");
		}
	}

}

}
