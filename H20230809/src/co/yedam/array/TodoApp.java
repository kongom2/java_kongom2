package co.yedam.array;

import java.util.Scanner;

public class TodoApp {
	static Todo[] todos = new Todo[10];
	static Scanner scn = new Scanner(System.in);
	static Todo todoClass = new Todo();
	static String todoName;
	
	public static void main(String[] args) {
		// 등록 / 완료 / 조회 / 미완료
		printMenu();
		boolean run = true;
		
		while (run) {
			int menuSelection = Integer.parseInt(scn.nextLine());
			
			switch(menuSelection) {
			case 1:
				todoAdd();
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			}
		}
		scn.close();
	}
	
	public static void todoAdd() {
		System.out.print("할일 등록하기 : ");
		todoName = scn.nextLine(); // 입력한 내용을 todoName에 담기
		todoClass.todo = todoName; // todoName을 todo클래스의 todo에 담기
		
		// 입력된 할일들을 배열에 담기
		for (int i = 0; i < todos.length; i++) {
			if (todos[i] == null) {
				todos[i] = todoClass;
				break;
			}
		}
		System.out.println(todoClass.todo);
	}
	
	public static void printMenu() {
		System.out.println("======================================");
		System.out.println("|| 1.등록 || 2.완료 || 3.조회 || 4.미완료 ||");
		System.out.println("======================================");
		System.out.println("선택 >>> ");
	}
	
//	public static void init() { // 초기값 
//		for (int i = 0; i < todos.length; i++) {
//			Todo todoClass = new Todo();
//			todoClass.no = i;
//			todoClass.todo = "test" + i;
//			todoClass.dueDate = "010-1234-123" + i;
//			todoClass.done = i % 2 == 0 ? Gender.MEN : Gender.WOMEN;
//
//			friends[i] = f;
//		}
//	}
}
