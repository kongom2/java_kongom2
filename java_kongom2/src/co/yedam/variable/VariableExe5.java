package co.yedam.variable;

import java.util.Scanner;


//
//Scanner 클래스 활용.
//

public class VariableExe5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // 스캐너 (키보드 입력)
		
		String numStr = "123"; // 에러발생 For input string: "123a"
		int num = Integer.parseInt(numStr); // "123"을 숫자 123으로 변경
		System.out.println(num);
		
		int sum = 0;
		
		while (true) {
			System.out.println("정수값을 입력: 종료하려면 quit >>>");
			String result = scan.nextLine(); // 입력값을 문자열로 반환.
			System.out.printf("입력값은 %s 입니다. \n", result);
			
			if(result.equals("quit") ) { // 문자 비교시 메서드 사용
				break;
			}
			int numInt = Integer.parseInt(result);
			if(numInt > 100 || numInt < 0) {
				continue;
			} else {
				
				// 입력값이 100보다 크거나 0보다 작으면 합계 안하고 합하도록.
				sum = sum + numInt;
			}
		}
		System.out.println("입력값의 합계는 " + sum);
		System.out.println("end of prog.");
	}
}
