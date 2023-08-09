package co.yedam.array;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Student[] students = new Student[10];
//		System.out.println(students[]);
		// 1.등록  2.조회  3.목록  
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int idx = 0;
		
		while(run) {
			System.out.println("1.등록  2.조회  3.목록 4.종료");
			System.out.print("선택 >>>");
			
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1: // 등록 : 이름, 점수 입력
				for(int i = 0; i < students.length; i++) {
					System.out.println("이름을 입력하세요");
					students[i].name = sc.next();
					
					System.out.println("숫자를 입력하세요");
					students[i].score = sc.nextInt();
				}
			case 2: // 조회 : 이름 입력, 점수 출력
			case 3: // 목록 : 이름, 점수 출력
			case 4: // 종료
				break;
			}
		}
		System.out.println("end of program");
		sc.close();
	}
}
