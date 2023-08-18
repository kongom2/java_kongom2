package co.yedam.friendApp;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FriendApp {
	// 배열 >> 컬랙션 >> 파일 >> DB
	static Friend[] friendArr = new Friend[10];
	static Scanner sc = new Scanner(System.in);
	
	// 컨트롤
	public void start() {
		boolean run = true;
		int menu = -1;
		while (run) {
			System.out.println("┌─<Menu>──────────────────────────────");
			System.out.println("│ 1.등록 │ 2.조회 │ 3.수정 │ 4.삭제 │ 5.종료 ");
			System.out.println("└─────────────────────────────────────");
			System.out.println("번호를 선택하시오 >>> ");
			
			try {
				menu = sc.nextInt();				
			} catch(InputMismatchException e) {
				System.out.println("메뉴를 다시 선택하세요.");
				continue;
			} finally {
				sc.nextLine();		
			}
//			sc.nextLine();

			switch (menu) {
			case 1:
				add(); // 추가
				break;
			case 2:
				search(); // 조회
				break;
			case 3:
				modify(); // 수정
				break;
			case 4:
				remove(); // 삭제
				break;
			case 5:
				System.out.println("종료합니다.");
				run = false; // while 종료
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}
	}

	//
	private String printString(String msg) {
		System.out.print(msg + ">> ");
		return sc.nextLine();
	}

	// 등록
	private void add() {
		boolean run = true;
		int subMenu = -1;
		while (run) {
			System.out.println("┌─<Menu>────────────────");
			System.out.println("│ 1.학교 │ 2.회사 │ 3.기타 ");
			System.out.println("└───────────────────────");
			System.out.println("번호를 선택하시오 >>> ");
			subMenu = -1;
			try {
				subMenu = sc.nextInt();
				
			} catch(InputMismatchException e) {
				System.out.println("1, 2, 3 중에 선택");
				continue;
			} finally {
				sc.nextLine();
			}
			break;
		}
		
		

		Friend friend = null;
		String name = printString("이름입력");
		String phone = printString("연락처입력");

		if (subMenu == 1) {
			String univ = printString("학교입력");
			String major = printString("전공입력");

			friend = new UnivFriend(name, phone, univ, major);

		} else if (subMenu == 2) {
			String comp = printString("회사입력");
			String dept = printString("부서입력");

			friend = new CompFriend(name, phone, comp, dept);

		} else {
			friend = new Friend(name, phone);
		}

		for (int i = 0; i < friendArr.length; i++) {
			if (friendArr[i] == null) {
				friendArr[i] = friend;
				break;
			}
		}
	}

	// 조회
	private void search() {
//		System.out.println("찾는 이름 입력 >> ");
//		String name = sc.nextLine();
		String name = printString("이름입력");
		for (int i = 0; i < friendArr.length; i++) {
			if (friendArr[i] != null && name.equals("")) {
				System.out.println(friendArr[i].showInfo());
			}else if (friendArr[i] != null && friendArr[i].getName().equals(name)) {
				System.out.println(friendArr[i].showInfo());
				break;
			}
		}
	}

	//Update : 이름 넣으면 연락처 수정.
		private void modify() {
			System.out.println("이름 : ");
			String name = sc.nextLine();
			System.out.println("수정 할 연락처 : ");
			String phone = sc.nextLine();
			
			for(int i=0; i<friendArr.length;i++) {
				if(friendArr[i] != null && friendArr[i].getName().equals(name)) {
					friendArr[i].setPhone(phone);
					break;
				}
			}
		}
		
		//Delete  : 이름
		private void remove() {
			System.out.println("삭제할 이름: ");
			String name = sc.nextLine();
			for(int i=0; i<friendArr.length;i++) {
				if(friendArr[i] != null && friendArr[i].getName().equals(name)) {
					friendArr[i] = null;
					break;
				}
			}
		}
}
