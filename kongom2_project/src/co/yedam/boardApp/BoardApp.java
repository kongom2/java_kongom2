package co.yedam.boardApp;

import java.util.Scanner;

public class BoardApp {
	private Board[] boardArr = new Board[10];
	private Scanner scn = new Scanner(System.in);
	
//	public static void init() {
//		for 
//	}
	
	void addNotice() {
		System.out.println("제목 >> ");
		String inputTitle = scn.nextLine();
		System.out.println("내용 >> ");
		String inputContents = scn.nextLine();
		System.out.println("작성자 >> ");
		String inputWriter = scn.nextLine();
		
		Board board = new Board();
		board.title = inputTitle;
		board.contents = inputContents;
		board.writer = inputWriter;
		
		for(int i = 0; i < boardArr.length; i++) {
			if(boardArr[i] == null) {
				boardArr[i] = board;
				return;
			}
		}
	}
	
	void listNotice() {
		for(int i = 0; i < boardArr.length; i++) {
			if(boardArr[i] != null) {
				boardArr[i].listInfo();
			}
		}
	}
	
	public void start() {
		BoardApp app = new BoardApp();
		Scanner scn = app.scn;
		boolean run = true;
		
		while (run) {
			System.out.println("┌─<Menu>──────────────────────────────────────┐");
			System.out.println("│ 1.등록 │ 2.목록 │ 3.조회 │ 4.수정 │ 5.삭제 │ 6.종료 │");
			System.out.println("└─────────────────────────────────────────────┘");
			System.out.println("번호를 선택하시오 >>> ");
			int menu = Integer.parseInt(scn.nextLine());
			
			switch (menu) {
			case BoardMenu.ADD:
				app.addNotice();
				break;
			case BoardMenu.LIST:
				app.listNotice();
				break;
			case BoardMenu.DETAIL:
				
				break;
			case BoardMenu.EDIT:
				
				break;
			case BoardMenu.DEL:
				
				break;
			case BoardMenu.EXIT:
				System.out.println("종료합니다.");
				run = false;
			}
		}	
	}
}