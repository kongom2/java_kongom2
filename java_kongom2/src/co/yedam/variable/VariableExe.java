package co.yedam.variable;

public class VariableExe {
	public static void main(String[] args) {
		// 변수 선언
		// 정수형 변수의 유형 : byte, short, int, long
		// byte : -128 ~ 127
		// shot : -32768 ~ 32767
		// int : -2147483648 ~ 2147483647
		// long : 
		int num1 = 0; // 초기화
		int num2 = 2147483647;
		
//		num1 = 10;
//		num2 = 20; // 초기화
		
		int result = num1 + num2; // 자료형 타입이 같아야 함.
		System.out.println(Short.MIN_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println("result "+ result);
		
		byte b1 = 10;
		byte b2 = 20;
		
		int b3 = b1 + b2; //Type mismatch: cannot convert from int to byte
		// 오른쪽 왼쪽 항이 무조건 같아야 한다
		
		int i1 = 100;
		byte b4 = 10;
		b3 = i1 + (int)b4; // 자동 형변환해서 연산.
		
		// 실수 타입.
		// float, double 별도 표시가 없으면 더블
		double dbl1 = 10.23223;
		double dbl2 = 20;
		double dbl3 = dbl1 + dbl2;
		System.out.println(dbl3);
		
		float f1 = 10.1F;
		float f2 = 10.001f;
		float f3 = f1 + f2;
		System.out.println("f3: " + f3);
	}
}
