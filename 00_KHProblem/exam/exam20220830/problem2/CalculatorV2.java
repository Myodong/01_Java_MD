package exam.exam20220830.problem2;

public class CalculatorV2 extends Calculator{
	public double avg(int num1, int num2) {
		return (num1+num2)/(double)2;
	}
	public int bligNum(int num1, int num2) {
		if (num1>num2) {
			return num1;
		}else if (num1<num2) {
			return num2;
		}else {
			return 0;
		}
	}
//	@Override 문제 해결 방법 오버라이딩
//	public int minus(int num1, int num2) {
//		return 0;
//	}
	
	
}
