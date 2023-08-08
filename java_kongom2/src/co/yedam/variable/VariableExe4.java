package co.yedam.variable;

import java.io.IOException;

public class VariableExe4 {
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 20;
		double weight = 67.8;
		
		System.out.println("이름은 " + name + ", 나이는 " + age + "살 입니다.");
		System.out.printf("이름은 %s,\t나이는 %d살,\t몸무게는 %.2f 입니다.\n", name, age, weight);
		System.out.printf("이름은 %s,\n나이는 %d살,\n몸무게는 %.2f 입니다.", name, age, weight);
		
		try {
			System.out.println("값을 입력 >>>");
			while(true) {
				int result = System.in.read(); // 키보드 값 반환
			
				if(result == 113) { //q: 113
					break;
				} else if (result == 10 || result == 13) {
					// enter 값(cr: 13, lf: 10)
				} else {
					System.out.println("키코드: " + result);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}
		System.out.println("end of prog.");
	} // 메인 메서드 끝
} // 클래스 끝
