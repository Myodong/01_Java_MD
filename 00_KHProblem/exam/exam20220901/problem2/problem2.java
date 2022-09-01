package exam.exam20220901.problem2;

import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String[] memberArr =new String[] {"홍길동", "깅성훈","윤웅식","윤성우","남궁성"};
		System.out.print("검색할 회원 이름을 입력하세요 : ");
		String searchNave =sc.next();
		
		
		boolean result = false;
		for (int i = 0; i < memberArr.length; i++) {
			if (searchNave == memberArr[i] ) {
//			if (searchNave.equals(memberArr[i]) ) { 해결방법 ==는 연산자에 사용함
				result = true;
				break;
			}

		}
		if (result) { 
			System.out.println("11111111111회원이 존재합니다.");
			
			
		}else {
			System.out.println("2222222회원이 존재하지 않습니다.");
		}
	}

}
