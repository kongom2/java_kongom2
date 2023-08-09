package co.yedam.condition;

public class ConditionExe {
	public static void main(String[] args) {
		// 임의의 수
//		int randomVal = (int) (Math.random()*3)+1;
//		String str = "";
//		
//		switch(randomVal) {
//		case 3: str = "가위"; break;
//		case 2: str = "바위"; break;
//		case 1: str = "보"; break;
//		}
//		
//		int num = 97;
//		char chr = 65;
//		System.out.println(chr);
//		
//		System.out.println(randomVal);
//		System.out.printf("가위 바위 보 : %s", str);
		char randomVal = (char) ((Math.random()*4) + 65);
		System.out.println(randomVal);
		System.out.println("어떤 혜택을 원하세요?");
		char grade = randomVal;
		switch(grade) {
		case 'A': System.out.println("VVIP 혜택을 받으실 수 있습니다.");
		case 'B': System.out.println("VIP 혜택을 받으실 수 있습니다.");
		case 'C': System.out.println("우수 혜택을 받으실 수 있습니다.");
		case 'D': System.out.println("일반 회원 혜택을 받으실 수 있습니다.");
		default: System.out.println("혜택이 없습니다.");
		}
	}
}
