package co.yedam.variable;

public class VariableExe3 {
	
	int num = 120;
	
	public void showInfo() {
		int num = 100 + this.num;
		System.out.println("num: " + num);
		int num1 = 200; // 로컬 변수는 선언된 실행블럭안에서만 유효한 값을 가진다.
	}
	
	public void printNum() {
		System.out.println("num: " + num1); // num1 이 안되는 이유
	}
	
	public void helloMsg() {
		int num = 200 + this.num;
		System.out.println("num: " + num);
		
	}
}
