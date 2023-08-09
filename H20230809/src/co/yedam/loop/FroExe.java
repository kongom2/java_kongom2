package co.yedam.loop;

import java.util.Scanner;

public class FroExe {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
	        int score = sc.nextInt();
	        System.out.println(score);
	        
	        if(score >= 90) {
	        	
	        }
	        
	        sc.close();
////밖에서 4번
////안에서 1,2,3,4
//		for (int i = 1; i <= 4; i++) { // i = 1,2,3,4
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println("");
//		}
//		for (int i = 1; i <= 4; i++) { // i가 3보다 작을땐 공백 // 3보다 크면 *
//			for (int j = 1; j <= 4; j++) {
//				if (i + j < 5) { // 가변적인 값 1-4 2-3 3-2 4-1
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println("");
//		}
//
//		for (int i = 1; i < 5; i++) {
//			for (int j = 1; j < 5; j++) {
//				if(i+j<5) {
//					System.out.print(" ");
//				}else {					
//					System.out.print("-");
//				}
//			}
//			for (int j = 4; j > 0; j--) {
//				if(j+i<5) {
//					System.out.print(" ");
//				}else {					
//					System.out.print("=");
//				}
//			}
//			System.out.println("");
//		}
	}
}
