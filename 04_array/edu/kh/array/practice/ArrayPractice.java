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
		int sum = 0;
	
		int[] arr = new int[9];
		for (int i = 0; i < arr.length; i++) {
			int num = arr[i] + i + 1;
			System.out.print(num);
	
			if (i % 2 == 0) {
				sum += num;
			}
		}
		System.out.println();
		System.out.println("짝수 번째 인덱스 합 : " + sum);
	}
/*===============================[ 강사님 풀의 ]===============================*/
	public void ex1_1() {
        int[] arr = new int[9];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");

            if (i % 2 == 0) {
                sum += arr[i];
            }
        }

        System.out.println("\n짝수 번째 인덱스 합 : " + sum);
	}
	
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
			int num = arr[i - 1] + i;

			System.out.print(num + " ");

			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.println("\n홀수 번째 인덱스 합 : " + sum);
			
	}
/*===============================[ 강사님 풀의 ]===============================*/
	
	public void ex2_1() {
		int[] arr = new int[9];

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr.length - i;
            System.out.print(arr[i] + " ");

            if (i % 2 == 1) {
                sum += arr[i];
            }
        }

        System.out.println("\n홀수 번째 인덱스 합 : " + sum);
	}
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
		int input = sc.nextInt();
		int[] arr = new int[input];

		for (int i = 0; i < input; i++) {
			int num = arr[i] + i + 1;
			System.out.print(num + " ");
		}
	}

/*===============================[ 강사님 풀의 ]===============================*/	
	public void ex3_1() {
		Scanner sc = new Scanner(System.in);

        System.out.print("양의 정수 : ");
        int[] arr = new int[sc.nextInt()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
	}
	
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
	
		for (int i = 0; i <= 4; i++) { // 정수 입력 및 저장
			System.out.print("입력 " + i + " : ");
			int input = sc.nextInt();
			arr[i] = input;
		} // 저장 끝 검색 시작
		System.out.print("검색할 값 : ");
		int num = sc.nextInt();
		boolean flag = true;
	
		for (int x = 0; x < arr.length; x++) {
			if (arr[x] == num) {
				System.out.println("인덱스" + x );
				flag = false; // flag 값 변경 검색중지
				break;
			}
		}
		if (flag)
			System.out.println("일치하는 값이 존재하지 않습니다.");
	}
			
		
	
/*===============================[ 강사님 풀의 ]===============================*/	
	public void ex4_1() {
		Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("입력 %d : ", i);
            arr[i] = sc.nextInt();
        }

        System.out.print("검색할 값 : ");
        int search = sc.nextInt();

        boolean flag = true;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                System.out.println("인덱스 : " + i);
                flag = false;
                break;
            }
        }

        if (flag) System.out.println("일치하는 값이 존재하지 않습니다.");
	}

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
		String str = sc.next();
		char[] arr = new char[str.length()];// 문자 수만큼 인덱스 생성
	
		for (int i = 0; i < arr.length; i++) {// 인덱스에 문자 값 저장
			char ch = str.charAt(i);
			arr[i] = ch;
		}
		System.out.print("문자 : ");
		char message = sc.next().charAt(0);// 문자열 중 0번째 인덱스 문자 하나를 얻어옴
		int sum = 0; // 검색 문자 합계
		System.out.print(str + "에 " + message + "가 존재하는 위치(인덱스) : ");
	
		for (int x = 0; x < arr.length; x++) {// 검색 문자 인덱스에서 찾기
			if (arr[x] == message) {
				System.out.print(x + " ");
				sum++;
			}
		}
		System.out.println();// 줄바꿈
		System.out.printf("%s 개수 : %d\n", message, sum);
	
	}
/*===============================[ 강사님 풀의 ]===============================*/	
	public void ex5_1() {
		 // 1. 사용자에게 문자열과 문자 입력받기
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열 : ");
        String str = sc.nextLine();


        // 2. 사용자가 입력한 문자열(str)을 문자 하나하나를 char배열에 넣기

        // 먼저 사용자가 입력한 문자열 길이만큼의 char배열을 할당
        char[] arr = new char[str.length()];

        // 반복문을 통해 str.charAt(i) 값을 arr[i] 에 담는 과정
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }

        System.out.print("문자 : ");
        char ch = sc.nextLine().charAt(0);

        // 3. 검색할 문자가 문자열에 몇개가 들어있는지와 어느 인덱스에 있는지 파악

        int count = 0;    // 검색할 문자가 문자열에 몇개가 들어있는지를 세어줄 변수
        // 문자열에서 동일한 문자가 발생할 때마다 1씩 증가

        // 반복문 수행전 문자열 출력
        System.out.print(str + "에 " + ch + "가 존재하는 위치(인덱스) : ");

        // 인덱스마다 접근하기 위해 반복문 사용
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) { // 해당 인덱스 값이 검색될 문자와 같을 경우
                System.out.print(i + " ");    // 해당 인덱스 이어서 출력

                count++;    // 그리고 count 1증가
            }
        }

        // 위에서 print()를 사용했기 때문에 개행이 되어있지 않음
        System.out.println();    // 줄바꿈

        System.out.println(ch + "개수 : " + count);
	}

/*#############################################################################*/
/*실습문제6
	사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
	배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
	그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
	
	[실행 화면]
	정수 : 5
	배열 0번째 인덱스에 넣을 값 : 4
	배열 1번째 인덱스에 넣을 값 : -4
	배열 2번째 인덱스에 넣을 값 : 3
	배열 3번째 인덱스에 넣을 값 : -3
	배열 4번째 인덱스에 넣을 값 : 2
	4 -4 3 -3 2
	총 합 : 2
 */
	public void ex6() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int input = sc.nextInt();
		int[] arr = new int[input];
		int sum = 0;// 총 합

		for (int i = 0; i < input; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			int num = sc.nextInt();
			arr[i] = num;
			sum += num;
		}
		for (int x = 0; x < input; x++) {
			System.out.print(arr[x] + " ");
		}
		System.out.println();// 줄 바꿈
		System.out.println("총합 : " + sum);

	}
	

/*===============================[ 강사님 풀의 ]===============================*/	
	public void ex6_1() {
		 // 1. 사용자에게 값을 입력받고 그 값만큼의 배열 선언 및 할당
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 : ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        // 2. 그 배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화
        for (int i = 0; i < arr.length; i++) {
            System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
            arr[i] = sc.nextInt();
        }


        // 3. 전체 값 나열 및 총 합 출력
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            sum += arr[i];
        }

        System.out.println();
        System.out.println("총 합 : " + sum);
	}

/*#############################################################################*/
/*실습문제7
	주민등록번호를 입력 받아 char 배열에 저장한 후 출력하세요.
	단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.
	
	[실행 화면]
	주민등록번호(-포함) : 123456-1234567
	123456-1******
 */
	public void ex7() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");// 주민 14자리 입력 -포함
		String str = sc.next();
		char[] arr = new char[str.length()];// 문자 수만큼 인덱스 생성

		for (int i = 0; i < arr.length; i++) {// 인덱스에 문자 값 저장
			char ch = str.charAt(i);
			arr[i] = ch;
		}
		for (int x = 0; x < arr.length; x++) {
			if (x < 8) {
				System.out.print(arr[x]);
			} else {
				System.out.print("*");
			}
		}
	}

/*===============================[ 강사님 풀의 ]===============================*/	
	public void ex7_1() {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("주민등록번호(-포함) : ");
	        String input = sc.next();

	        char[] arr = new char[input.length()];

	        for (int i = 0; i < arr.length; i++) {

	            if (i <= 7) { // 7번 인덱스 이하(생년월일, - , 성별)
	                arr[i] = input.charAt(i);
	            } else { // 8번 인덱스 이상부터는 *
	                arr[i] = '*';
	            }
	            System.out.print(arr[i]);
	        }
	}

/*#############################################################################*/
/*실습문제8
	3 이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
	중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
	단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
	다시 정수를 받도록 하세요.
	
	[실행 화면]
	정수 : 4
	다시 입력하세요.
	정수 : -6
	다시 입력하세요.
	정수 : 5
	1, 2, 3, 2, 1
 */
	// 짝수 && 3미만  "다시 입력하세요" 출력 후 다시 정수받기
	// 홀수 && 3이상 입력가능 
	// 입력된 정수의 오름차순으로 출력 중간 이후 내림차순으로 출력 
	
	public void ex8() {
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("정수 : ");
			int input = sc.nextInt();

			if (input >= 3 && input % 2 != 0) {// 홀수 && 3이상일때
				int[] arr = new int[input]; // 입력받은 정수 만큼 인덱스 생성

				for (int i = 0; i <= input / 2; i++) {// 정수 오름차순/변수 저장,출력
					arr[i] = i + 1;// 인덱스에 변수 저장
					System.out.print(arr[i] + " ");// 변수 출력
				}
				for (int x = input / 2 + 1; x < input; x++) {// 정수 내림차순/변수 저장,출력
					arr[x] = input - x;// 인덱스에 변수 저장
					System.out.print(arr[x] + " ");// 변수 출력
				}
				break; // 홀수 && 3이상일때 정수 입력 x 멈춤
			} else {// 짝수 && 3미만 일시
				System.out.println("다시 입력하세요.");

			}
		}
	}
/*
 * 문제 점
 *  출력시 , 을 어떻게 출력해야할지 못함 
 *	
 */

/*===============================[ 강사님 풀의 ]===============================*/	

public void ex8_1() {
	  Scanner sc = new Scanner(System.in);

      while (true) { // 3 이상의 수가 입력 될 때 까지 무한 반봅
          // -> 3 이상이 입력되면 break문으로 종료

          System.out.print("정수 : ");
          int input = sc.nextInt();

          if (input < 3 || input % 2 == 0) { // 3 미만 또는 짝수인 경우 -> 반복
              System.out.println("다시 입력하세요.");

          } else {
              // 입력 받은 정수 만큼의 크기를 가지는 배열 생성
              int[] arr = new int[input];

              int num = 0; // arr 배열에 대입될 값

              for (int i = 0; i < arr.length; i++) {
                  if (i <= arr.length / 2) { // 중간 이전 까지 -> 증가
                      arr[i] = ++num;

                  } else { // 중간 이후 -> 감소
                      arr[i] = --num;
                  }

                  // 출력 시 , 추가 (단, 마지막 제외)
                  if (i == arr.length - 1) { // 마지막 바퀴
                      System.out.print(arr[i]);

                  } else {
                      System.out.print(arr[i] + ", ");
                  }

              }
              break; // while 반복 멈춤
          }
      }
}
/*#############################################################################*/	
/*실습문제9
	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
	1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
	
	[실행 화면]
	발생한 난수 : 9 7 6 2 5 10 7 2 9 6 	
 */  
	public void ex9() {
	
		int[] arr = new int[10];// 인덱스 0~9 생성
		
		
		for (int i = 0; i < arr.length; i++) {
			int ran=(int)(Math.random()*10+1);//1~10 사이 난수
			arr[i]=ran;
			System.out.print(arr[i]+" ");
		}
	}
	

/*===============================[ 강사님 풀의 ]===============================*/	
 public void ex9_1() {
	 int[] arr = new int[10];

     for(int i=0 ; i<arr.length ; i++){
         arr[i] = (int)(Math.random() * 10 + 1);
     }

     System.out.print("발생한 난수 : ");
     for(int i=0 ; i<arr.length ; i++){
         System.out.print(arr[i] + " ");
     }
}

/*#############################################################################*/	
/*실습문제10
	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
	1~10 사이의 난수를 발생시켜 배열에 초기화 후
	배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
	
	[실행 화면]
	발생한 난수 : 5 3 2 7 4 8 6 10 9 10 
	최대값 : 10
	최소값 : 2
 */
	public void ex10() {
	
		int[] arr = new int[10]; // 인덱스 0~9 생성
		int max = 0;
		int min = 10;
	
		System.out.print("발생 난수 : ");
		for (int i = 0; i < arr.length; i++) {
			int ran = (int) (Math.random() * 10 + 1);// 1~10 사이 난수
			arr[i] = ran;
			if (ran > max) {// 최대값
				max = ran;
			}
	
			if (ran < min) {// 최소값
				min = ran;
			}
			System.out.print(arr[i] + " ");
		}
	
		System.out.println();// 줄 바꿈
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
	
	
	
	
/*===============================[ 강사님 풀의 ]===============================*/	
public void ex10_1() {
	// 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
    int[] arr = new int[10];

    // 2. 각 인덱스에 1부터 10 사이의 난수를 발생시켜 초기화 후 출력
    for(int i=0; i<arr.length; i++) {
        arr[i] = (int)(Math.random() * 10 + 1);

        System.out.print(arr[i] + " ");
    }

    System.out.println(); // 개행

    // 3. 반복문을 통해 최대값 최소값 알아내기
    int max = 1;  // 최소값을 담아줄 변수
    int min = 10; // 최대값을 담아줄 변수

    for(int i=0; i<arr.length; i++) {

        if(arr[i] > max) { // 해당 인덱스의 값이 max 보다 큰 경우
            max = arr[i]; // 해당 값을 max 변수에 담아줌
        }

        if(arr[i] < min) { // 해당 인덱스의  값이 min 보다 작은 경우
            min = arr[i]; // 해당 값을 min 변수에 담아줌
        }
    }

    System.out.println("최대값 : " + max);
    System.out.println("최소값 : " + min);
}

/*#############################################################################*/	
/* 실습문제11
	10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
	1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
	
	[실행 화면]
	4 1 3 6 9 5 8 10 7 2
 */
	
	public void ex11() {
		int[] arr = new int[10];// 인덱스 0~9 생성
	
		for (int i = 0; i < arr.length; i++) {
			int ran = (int) (Math.random() * 10 + 1);// 1~10 사이 난수
			arr[i] = ran;
			for (int x = 0; x < i; x++) {
				if (arr[x] == ran) {// 중복확인
					i--;
					break;
				}
			}
		}
		System.out.printf("%d %d %d %d %d %d %d %d %d %d",arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]);
	}
	
	
	
	
	
	
/*===============================[ 강사님 풀의 ]===============================*/	

public void ex11_1() {
	 // 1. 10개의 값을 저장할 수 있는 정수형 배열 선언 및 할당
    int[] arr = new int[10];

    // 2. 각 인덱스 값에 1부터 10 사이의 난수를 발생시키는데 이때 중복이 없도록
    for(int i=0; i<arr.length; i++) {

        arr[i] = (int)(Math.random() * 10 + 1);

        for(int j=0; j<i; j++) { // 중복 제거
            if(arr[i] == arr[j]) {
                i--;
                break;
            }
        }
    }

    // 3. 출력
    for(int i=0; i<arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
/*#############################################################################*/	
/*실습문제12
	로또 번호 자동 생성기 프로그램을 만들기.
	(중복 값 없이 오름차순으로 정렬하여 출력하세요.)
	
	[실행 화면]
	3 4 15 17 28 40 
 */
	public void ex12() {
		int[] arr = new int[6];
	
		for (int i = 0; i < arr.length; i++) {
			int ran = (int) (Math.random()*45+1);
			arr[i] = ran;
	
			for (int x = 0; x < i; x++) {
				if (arr[x] == ran) {
					i--;
					break;
				}
			}
		}
	
		Arrays.sort(arr); // 오름차순
	
		System.out.printf("%d %d %d %d %d %d\n",arr[0], arr[1], arr[2], arr[3], arr[4], arr[5]);
	}
	
	
	
	
	
	
/*===============================[ 강사님 풀의 ]===============================*/	
public void ex12_1() {
	 // 1. 크기가 6인 정수형 배열 선언 및 할당
    int[] lotto = new int[6];

    // 2. 배열에 중복값없이 1부터 45사이의 난수 초기화
    for(int i=0; i<lotto.length; i++) {
        lotto[i] = (int)(Math.random() * 45 + 1);

        for(int j=0; j<i; j++) { // 중복 제거
            if(lotto[i] == lotto[j]) {
                i--;
                break;
            }
        }
    }

    // 3. 오름차순 정렬(선택정렬)
    for(int i=0; i<lotto.length-1; i++) { // 비교 주체
        for(int j=i+1; j<lotto.length; j++) { // 비교 대상
            if(lotto[i] > lotto[j]) { // 비교 주체가 비교 대상보다 큰 경우 값을 바꿔줘야됨

                int temp = lotto[i];
                lotto[i] = lotto[j];
                lotto[j] = temp;
            }
        }
    }

    // 4. 출력
    for(int i=0; i<lotto.length; i++) {
        System.out.print(lotto[i] + " ");
    }
}

/*#############################################################################*/	
/*실습문제13
	문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
	문자의 개수와 함께 출력하세요. (중복 제거)
	
	[실행 화면]
	문자열 : application
	문자열에 있는 문자 : a, p, l, i, c, t, o, n
	문자 개수 : 8
 */
	public void ex13() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String input = sc.next();
		char[] arr = new char[input.length()]; //입력받은 문자 개수만큼 인덱스 생성
		int sum=0;
		
		System.out.print("문자열에 있는 문자 :");
		for (int i = 0; i < arr.length; i++) {
			char ch = input.charAt(i);
			arr[i] = ch;
			sum++;
			
			/*중복 검사 문제 있음*/
			for (int x = 0; x < i; x++) {
				if (arr[x] == ch) {// 중복확인
//					i--;
					break;
				}else {
					System.out.print(arr[i]+" ");
					
				}
			
			}
			
			
		}
		System.out.println();//줄바꿈 테스트
		System.out.println(Arrays.toString(arr));// 임시 테스트
		System.out.println("문자 개수 : "+sum);

	}
	
	
/*===============================[ 강사님 풀의 ]===============================*/	

public void ex13_1() {
	   // 1. 사용자에게 문자열 입력받기
    Scanner sc = new Scanner(System.in);

    System.out.print("문자열 : ");
    String str = sc.nextLine();

    // 2. 해당 문자열의 문자들을 char[]에 담기
    char[] arr = new char[str.length()];

    for(int i=0; i<arr.length; i++) {
        arr[i] = str.charAt(i);
    }

    // 3. char배열에서 중복값 존재할 경우 출력X,
    int count = 0; // 문자 개수 카운트

    System.out.print("문자열에 있는 문자 : ");

    for(int i=0; i<arr.length; i++) {

        boolean flag = true; // 중복 체크용 flag

        for(int j=0; j<i; j++) {
            if(arr[i] == arr[j]) {
                flag = false; // 중복이발생했을 때
                break;
            }
        }

        if(flag) { // 중복이 발생하지 않았을 경우

            if(i == 0) {
                System.out.print(arr[i]);
            }else {
                System.out.print(", " + arr[i]);
            }

            count++;
        }
    }

    System.out.println();
    System.out.println("문자 개수 : " + count);
}
/*#############################################################################*/	

	
}
