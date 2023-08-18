package co.yedam.exceptions;

// 예외처리 하는 이유 : 프로그램이 정상적으로 종료시점까지 진행 하기 위함
public class NullPointExe {
	public static void main(String[] args) {
//		String msg = "hello";
		String msg = "123";
		
		try {
			System.out.println(msg.toString()); // 예외처리 함
			int val = Integer.parseInt(msg);
			System.out.println("결과는 " + val);
		} catch (NullPointerException nullE) {			
			System.out.println("msg 값이 null 참조합니다.");
			System.out.println("예외가 발생했습니다.");
		} catch (NumberFormatException numE) {
			System.out.println("msg값을 숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("예외의 발생과는 상관없이 실행할 코드 작성");
		}
		System.out.println("end of prog");
	}
}
