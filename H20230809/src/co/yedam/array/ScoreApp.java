package co.yedam.array;

import java.util.Scanner;

public class ScoreApp {
	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("==============================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("==============================================");
			System.out.println("선택 >>> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				System.out.println("학생수를 입력하세요.");
				studentNum = Integer.parseInt(scanner.nextLine());
				System.out.println(studentNum);
				scores = new int[studentNum];
			} else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("score["+i+"]>");
					scores[i] = Integer.parseInt(scanner.nextLine());
					System.out.println(scores[i]);
				}
			} else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println(scores[i]);
				}
				
			} else if(selectNo == 4) {
//				for(int i = 0; i < scores.length; i++) {
//					int max = 0;
//					int avg = 0;
////					if (scores[i] != null && scores[i] > max) {
////						
////					}
//					System.out.println(scores[i]);
//				}
				
			} else if(selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
	}
}
