package co.yedam.variable;

import java.util.Scanner;

// 은행 앱

public class OperatorExe2 {
	public static void main(String[] args) {
	 	Scanner scn = new Scanner(System.in); //java.util.Scanner // ctrl shift o 패키지 임포트 하기
	 	int balance = 0; // 10만원 이상 불가, 대출 안됨.
	 	boolean run = true;
	 	
	 	System.out.println("1. 예금 2. 출금 3. 잔고 4. 종료");
	 	System.out.print("선택 >>>");
	 	while(run) {
	 		
	 	 	int menu = Integer.parseInt(scn.nextLine());
	 	 	int input = Integer.parseInt(scn.nextLine());
	 	 	if(menu == 1) {
	 	 		System.out.println("입금액 입력 >>> ");
	 	 		if (run ) {
	 	 			System.out.print("입금액 : " + input);
	 	 			
	 	 		int result = balance + input;
	 	 			System.out.print("예금총액 : " + result);	
	 	 		} else  {
	 	 			
	 	 		}
	 	 		// 코드 작성
	 	 	} else if(menu ==2) {
	 	 		System.out.print("출금액 입력 >>> ");
	 	 		// 코드 작성
	 	 	} else if(menu ==3) {
	 	 		System.out.print("잔고는" + balance);
	 	 		// 코드 작성
	 	 	} else if(menu ==4) {
	 	 		System.out.println("종료합니다.");
	 	 		break;
	 	 	} 
	 	}
	 	System.out.println("end of prog.");
	 	
	}
}
