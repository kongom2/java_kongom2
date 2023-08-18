package co.yedam.array;

import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {
		Student[] students = new Student[10];
//		System.out.println(students[]);
		// 1.등록  2.조회  3.목록  
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		double maxHeight = 0;
		String maxHeightName = "";
		int idx = 0;
		
		Student s1 = new Student();
		s1.name = "kognom1";
		s1.score = 85;
		s1.height = 178.9;
		s1.gender = Gender.MEN;

		Student s2 = new Student();
		s1.name = "kognom2";
		s1.score = 56;
		s1.height = 169.9;
		s1.gender = Gender.WOMEN;
		
		Student s3 = new Student();
		s1.name = "kognom3";
		s1.score = 77;
		s1.height = 197.9;
		s1.gender = Gender.WOMEN;
		
		Student s4 = new Student();
		s1.name = "kognom4";
		s1.score = 74;
		s1.height = 159.9;
		s1.gender = Gender.MEN;
		
		while(run) {
			System.out.println("1.등록  2.조회  3.목록 4.키큰학생 4.종료");
			System.out.print("선택 >>>");
			
			int menu = Integer.parseInt(sc.nextLine());
			
			switch(menu) {
			case 1: // 등록 : 이름, 점수 입력
				for(int i = 0; i < students.length; i++) {
					System.out.println("이름을 입력하세요");
					Student s1 = new Student();
					s1.name = sc.nextLine();
					
					System.out.println("점수를 입력하세요");
					s1.score = Integer.parseInt(sc.nextLine());
					
					System.out.println("키를 입력하세요");
					s1.height = Double.parseDouble(sc.nextLine());
					students[idx] = s1;
					idx++;
					break;
				}
			case 2: // 조회 : 이름 입력, 점수 출력
				System.out.println("이름");
				String name = sc.nextLine();
				boolean isExist = false;
				
				for (int i = 0; i < students.length; i++) {
					if (students[i] != null
							&& students[i].name.equals(name)) {
						System.out.printf("%s의 점수: %d\n", students[i].name, students[i].score, students[i].height);
						isExist =true;
					}
				}
				if (!isExist) {
					System.out.println("찾는 이름이 없습니다.");
				}
				break;
			case 3: // 목록 : 이름, 점수 출력
				for (int i = 0; i < students.length; i++) {
					if(students[i] != null && students[i].gender == Gender.MEN)
					System.out.printf("이름: %s, 점수: %d, 키: %.1f", students[i].name, students[i].score, students[i].height);
				}
			case 4: // 키가 가장 큰 학생
				for (int i = 0; i < students.length; i++) {
					if(students[i] != null && students[i] > maxHeight ) {
						maxHeight = students[i].height;
						maxHeightName = students[i].name;
					}
				}
				System.out.printf("키 %.1f, 이름 %s", maxHeight, maxHeightName);
break;				
			case 5: // 종료
				System.out.println("프로그램 종료 합니다.");
				break;
			}
		}
		System.out.println("end of program");
		sc.close();
	}
}
