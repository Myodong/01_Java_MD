package edu.kh.variable.ex1;

public class VariableExamplel5 {

	public static void main(String[] args) {
	
/*		출력 메서드
 		System.out.print("내용");
 		 - () 안의 내용 출력 (줄바꿈 안됨)
 		System.out.println("내용");
 		 - () 안의 내용 출력 (줄바꿈)
 		System.out.printf("내용 + 패턴", 패턴 값);
 
*/
		System.out.print("A"); 
		System.out.print("A");
		System.out.println("B");
		System.out.println("C");
		
		String name = "김효동";
		int age =29;
		char gender = '남';
		double height = 172.6;
		boolean tf = true;
		
//		김효동님은 29세 남성, 키는 172.6cm 입니다. (true)		
		System.out.println(name +"님은 "+ age +"세 "+gender+"성, 키는"+height+"cm 입니다. ("+tf+")");
		System.out.printf("%s님은 %d세 %c성, 키는 %.1fcm 입니다. (%b)\n", name, age, gender, height, tf);
//							1		2	3			4		     5  , 1     2     3       4      5
//												 %.1fcm	:.1 까지의 소수점만 표기
		System.out.println("printf 때문에 줄안바뀜 ");              //\n : 줄바꿈(개행)을 나타내는 탈출 문자 
	
	}

}
