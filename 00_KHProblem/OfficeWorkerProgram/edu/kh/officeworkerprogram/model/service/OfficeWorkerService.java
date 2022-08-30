package OfficeWorkerProgram.edu.kh.officeworkerprogram.model.service;

import java.util.ArrayList;
import java.util.List;

import OfficeWorkerProgram.edu.kh.officeworkerprogram.model.vo.OfficeWorker;

public class OfficeWorkerService {

	private List<OfficeWorker> owList = new ArrayList<OfficeWorker>();
	
	
	
	
	public OfficeWorkerService() {//기본생성자
		
		owList.add(new OfficeWorker(1, "노성찬", "94", "잇다", "010-1234-1234", "대외협력사업부", "대리", 300));
		
		
		
	}
	
	 public boolean addEmployee(int empId, String empName,String empNo,String email,String phone,String departmentTitle,String jobName,int salary) {
		
		 
		 OfficeWorker ow =new OfficeWorker(empId,empName, empNo, email, phone, departmentTitle, jobName, salary);
		 
		 return owList.add(ow);
		 
	}

	public List<OfficeWorker> getOfficeWorkerList() {
		return owList;
	}
	
	
	public List<OfficeWorker> selectOfficeWorker1(int empId) {
		
		List<OfficeWorker> resultList =new ArrayList<OfficeWorker>();
		for (OfficeWorker o : owList) {
			if (o.getEmpId()== empId) {
				resultList.add(o);
			}
			
		}
		return resultList;
	}
	 
	public List<OfficeWorker> selectOfficeWorker2(String empName, int empId) {
		
		List<OfficeWorker> resultList =new ArrayList<OfficeWorker>();
		for (OfficeWorker o : owList) {
			if (o.getEmpId()== empId) {
				resultList.add(o);
			}
			
		}
		return resultList;
	}	
	
	
	
	
	
	
	
	

	 
	 
///////////////////////////////////////////	 
}
