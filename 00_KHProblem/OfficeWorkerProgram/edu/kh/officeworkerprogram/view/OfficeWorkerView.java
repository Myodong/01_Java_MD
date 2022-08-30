package OfficeWorkerProgram.edu.kh.officeworkerprogram.view;

import java.util.List;
import java.util.Scanner;

import OfficeWorkerProgram.edu.kh.officeworkerprogram.model.service.OfficeWorkerService;
import OfficeWorkerProgram.edu.kh.officeworkerprogram.model.vo.OfficeWorker;

public class OfficeWorkerView {

	private Scanner sc = new Scanner(System.in);
	private OfficeWorkerService service = new OfficeWorkerService();
	
	public void displayMenu() {
		int input = 0;
		
		do {
			System.out.println();// 줄바꿈
			System.out.println("================ 사원 관리 프로그램 ================ ");
			System.out.println("1. 새로운 사원 정보 추가");
			System.out.println("2. 전체 사원 정보 조회");
			System.out.println("3. 사번이 일치하는 사원 정보 조회");
			System.out.println("4. 사번이 일치하는 사원 정보 수정");
			System.out.println("5. 사번이 일치하는 사원 정보 삭제");
			System.out.println("6. 입력 받은 부서와 일치 모든 사원 정보 조회");
			System.out.println("7. 입력 받은 급여 이상을 받는 모든 사원 정보 조회");
			System.out.println("8. 부서별 급여 합 전체 조회");
			System.out.println("==================================================== ");
			System.out.println("0. 프로그램 종료");
			
			try {
			System.out.print("메뉴 선택 : ");
			input = sc.nextInt();
			sc.nextLine();
			System.out.println();// 줄바꿈
			
			switch (input) {
			case 1:addEmployee(); break;
			case 2: selectAll();break;
			case 3: selectOfficeWorker1(); break;
			case 4: selectOfficeWorker2();break;
			case 5: break;
			case 6: break;
			case 7: break;
			case 8: break;
			case 0: System.out.println("[system] 프로그램을 종료 합니다.");break;
			default: System.out.println("[system] "+input+ "번 메뉴는 존재하지않습니다. ");

			}
			} catch (Exception e) {
				System.out.println();//줄바꿈
				System.out.println("[system] 입력 형식이 맞지않습니다. ");
				sc.nextLine();
				input = -1;
			}
		} while (input != 0);
	
	}
	
	public void addEmployee() { //사원 정보 추가
		System.out.println("=========== [+] 새로운 사원 정보 추가 [+] ===========");
		System.out.print("1) 사원번호(사번) : ");
		int empId = sc.nextInt();
		System.out.print("2) 사  원  이  름 : ");
		String empName = sc.next();
		System.out.print("3) 주민 등록 번호 : ");
		String empNo = sc.next();
		System.out.print("4) 이    메    일 : ");
		String email = sc.next();
		System.out.print("5) 전  화  번  호 : ");
		String phone = sc.next();
		System.out.print("6) 부    서    명 : ");
		String departmentTitle = sc.next();
		System.out.print("7) 직    급    명 : ");
		String jobName = sc.next();
		System.out.print("8) 급          여 : ");
		int salary = sc.nextInt();
		sc.nextLine();
		System.out.println("\n======================================================");
		
		if (service.addEmployee(empId,empName, empNo, email, phone, departmentTitle, jobName, salary)) {
			System.out.println();
			System.out.println("[system] 신규 추가 완료"); 
		}else {
			System.out.println("[system] 사원 정보 추가 실패");
		}
		
	}
	
	public void selectAll() {// 전체 사원 정보 조회
		List<OfficeWorker> owList =service.getOfficeWorkerList();
		
		for (OfficeWorker o : owList) {
		System.out.println(o);
			
		}
	}
	
	public void selectOfficeWorker1() {//사번이 일치하는 사원 정보 조회
		System.out.println("======사번이 일치하는 사원정보 조회=====");
		System.out.print("검색할 사번 : ");
		int empId =sc.nextInt();
		
		List<OfficeWorker> resultList =service.selectOfficeWorker1(empId);
		
		if (resultList.isEmpty()) {
			System.out.println("[system] 검색결과가 없습니다.");
		}else {
			for (OfficeWorker o : resultList) {
				System.out.println(o);
			}
		}
		
		
	}
	
	public void selectOfficeWorker2() {//사번이 일치하는 사원 정보 수정
		System.out.println("===사번이 일치하는 사원 정보 수정=====");
		System.out.print("검색할 사번 : ");
		int empId =sc.nextInt();
		List<OfficeWorker> resultList =service.selectOfficeWorker1(empId);

		if (resultList.isEmpty()) {
			System.out.println("[system] 검색결과가 없습니다.");
		}else {
			System.out.print("수정할 이름 : ");
			String empName = sc.next();
			System.out.print("수정할 급여 : ");
			int salary = sc. nextInt();

		}
		
		
		
	}
	
	
///////////////////////////////////////////////////////////////////////////		
	
}
