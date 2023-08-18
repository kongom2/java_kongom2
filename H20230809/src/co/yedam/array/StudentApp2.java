package co.yedam.array;

import java.util.Scanner;

public class StudentApp2 {
	public static void main(String[] args) {
		Student[] students = new Student[10]; // 학생 클래스를 가져와서 10개가 들어갈 배열을 선언한다.
		Scanner sc = new Scanner(System.in); // java.util에 있는 Scanner 클래스를 불러와서 클래스 객체를 선언한다.
	
		for(int i = 0; i < students.length; i++) {
			System.out.print("이름을 입력하세요");
		}
		
	}
}
