import java.util.Scanner;

public class ProblemExample {

/*#############################################################################*/	
/*[요구사항]
1. 사용자로 부터 가위 바위 보 중 하나의 문자열을 입력 받고, 난수를 발생시켜 랜덤하게 가위 바위 보 를 지정한다.
2. 랜덤한 컴퓨터의 가위 바위 보 문자열과 입력한 문자열이 같으면 아래 실행 결과처럼 비겼다고 출력하고 가위 바위 보 게임을 반복한다.
3 입력한 가위 바위 보 문자열이 컴퓨터의 랜덤한 가위 바위 보 문자열과 비교하여 가위 바위 보 게임의 룰 대로 이긴 경우 이겼다고 출력, 진 경우 졌다고 출력 후 종료
정상 실행 결과 예시

----------- 컴퓨터에게 지는 경우 -------------
가위 바위 보 게임을 시작합니다.
가위 바위 보 중 한 개를 입력하세요 : 가위
당신은 가위를 냈습니다.
컴퓨터는 바위를 냈습니다.
당신이 졌습니다!
-----------컴퓨터에게 이기는 경우 --------------
가위 바위 보 게임을 시작합니다.
가위 바위 보 중 한 개를 입력하세요 : 보
당신은 보를 냈습니다.
컴퓨터는 바위를 냈습니다.
당신이 이겼습니다!
-------- 컴퓨터와 비기는 경우 ------------
가위 바위 보 게임을 시작합니다.
가위 바위 보 중 한 개를 입력하세요 : 가위
당신은 가위를 냈습니다.
컴퓨터는 가위를 냈습니다.
비겼습니다. 다시 시작합니다.
가위 바위 보 중 한 개를 입력하세요 : <-- 출력하며 반복됨
*/	
	
	
////////////////////
//내가 코딩한 문제//
////////////////////
	public void ex1() {
	
		Scanner sc = new Scanner(System.in);
		int ran = (int) (Math.random() * 3);
		/***
		 * 문제의부분 : 
		 * - 컴퓨터의 가위, 바위, 보를 지정하는 난수 생성 구문이 반복문 전에 위치하고 있어 컴퓨터의 가위, 바위, 보가 항상
		 * 일정한 문제가 발생함.
		 ***/
		int draw = 0;// 무승부
	
		System.out.println("가위 바위 보 게임을 시작합니다.");
		String com = null;
	
		switch (ran) {// 랜덤의 정수를 문자로 변환
		case 0:
			com = "가위";
			break;
		case 1:
			com = "바위";
			break;
		case 2:
			com = "보";
			break;
		default:
		}
	
		for (int i = 0; i == draw; i++) {
	
			System.out.print("가위 바위 보 중 한 개를 입력하세요 : ");
			String ply = sc.next();
	
			// 이길때
			boolean win1 = ply.equals("가위") && com.equals("보");
			boolean win2 = ply.equals("바위") && com.equals("가위");
			boolean win3 = ply.equals("보") && com.equals("바위");
			// 패배할때
			boolean lose1 = ply.equals("가위") && com.equals("바위");
			boolean lose2 = ply.equals("바위") && com.equals("보");
			boolean lose3 = ply.equals("보") && com.equals("가위");
	
			if (lose1 || lose2 || lose3) {// 패배
				System.out.println("당신은 " + ply + "를 냈습니다.");// 문제는 아니지만 구문 줄일 수 있음
				System.out.println("컴퓨터는 " + com + "를 냈습니다.");
				System.out.println("당신이 졌습니다!");
				break;
	
			}
			if (win1 || win2 || win3) {// 승리
				System.out.println("당신은 " + ply + "를 냈습니다.");
				System.out.println("컴퓨터는 " + com + "를 냈습니다.");
				System.out.println("당신이 이겼습니다!");
				break;
	
			} else {// 무승부 다시시작
				System.out.println("당신은 " + ply + "를 냈습니다.");
				System.out.println("컴퓨터는 " + com + "를 냈습니다.");
				System.out.println("비겼습니다. 다시 시작합니다."); // 문제는 아니지만 \n 넣어서 가독성증가
				draw++;
	
			}
		}
	}
/*#############################################################################*/	
////////////////////////
//내가 코딩한 문제해결//
////////////////////////	
	public void ex1_1() {
	
		Scanner sc = new Scanner(System.in);
		int draw = 0;// 무승부
	
		System.out.println("가위 바위 보 게임을 시작합니다.");
		String com = null;
	
		for (int i = 0; i == draw; i++) {
	
			int ran = (int) (Math.random() * 3);
			/*** 문제 부분 해결 ***/
			switch (ran) {// 랜덤의 정수를 문자로 변환
			case 0:
				com = "가위";
				break;
			case 1:
				com = "바위";
				break;
			case 2:
				com = "보";
				break;
			default:
			}
	
			System.out.print("가위 바위 보 중 한 개를 입력하세요 : ");
			String ply = sc.next();
	
			// 이길때
			boolean win1 = ply.equals("가위") && com.equals("보");
			boolean win2 = ply.equals("바위") && com.equals("가위");
			boolean win3 = ply.equals("보") && com.equals("바위");
			// 패배할때
			boolean lose1 = ply.equals("가위") && com.equals("바위");
			boolean lose2 = ply.equals("바위") && com.equals("보");
			boolean lose3 = ply.equals("보") && com.equals("가위");
	
			System.out.println("당신은 " + ply + "를 냈습니다.");// 문제는 아니지만 불필요한구문 줄임
			System.out.println("컴퓨터는 " + com + "를 냈습니다.");
	
			if (lose1 || lose2 || lose3) {// 패배
				System.out.println("당신이 졌습니다!");
				break;
			}
			if (win1 || win2 || win3) {// 승리
				System.out.println("당신이 이겼습니다!");
				break;
			} else {// 무승부 다시시작
				System.out.println("비겼습니다. 다시 시작합니다.\n");// 문제는 아니지만 가독성 추가
				draw++;
	
			}
		}
	}
/*===============================[ 강사님 풀의 ]===============================*/
	public void ex1_2() {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 게임을 시작합니다.");
	
		while (true) {
			System.out.print("가위 바위 보 중 한 개를 입력하세요 : ");
			String input = sc.next();
			int random = (int) (Math.random() * 3);
			String com = null;
	
			switch (random) {
			case 0:
				com = "가위";
				break;
			case 1:
				com = "바위";
				break;
			case 2:
				com = "보";
				break;
			}
	
			System.out.println("당신은 " + input + "를 냈습니다.");
			System.out.println("컴퓨터는 " + com + "를 냈습니다.");
	
			if (input.equals(com)) {
				System.out.println("비겼습니다. 다시 시작합니다.\n");
			} else {
				boolean win1 = input.equals("가위") && com.equals("보");
				boolean win2 = input.equals("바위") && com.equals("가위");
				boolean win3 = input.equals("보") && com.equals("바위");
				if (win1 || win2 || win3) {
					System.out.println("당신이 이겼습니다.");
				} else {
					System.out.println("당신이 졌습니다.");
				}
				break;
			}
		}
	}
/*#############################################################################*/		
//////////////////////////
//혼자 연습하기 별 응용 문제풀기///
//////////////////////////
	
	
/*
	다음과 같은 실행 예제를 구현하세요.

	ex.
	정수 입력 : 4
	   *
	  ***
	 *****
	*******
	 *****
	  ***
	   *
*/	

	public void ex2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("(별)정수 입력 : ");
		int num = sc.nextInt();
	
	//위 부분
		for (int i = 0; i <= num; i++) {
			for (int j = 1; j <= num - i; j++) {
				System.out.print(" ");
			}
			for (int x = 1; x <= i * 2 - 1; x++) {
				System.out.print("*");
			}
			System.out.println();// 줄바꾸기
		}
	//아래 부분	
		for (int i1 = num - 1; i1 >= 1; i1--) {
			for (int j1 = num - i1; j1 >= 1; j1--) {
				System.out.print(" ");
			}
			for (int x1 = i1 * 2; x1 > 1; x1--) {
				System.out.print("*");
			}
			System.out.println();// 줄바꾸기
		}
	
	}
/*#############################################################################*/		
	}
	
	

	
	
	
