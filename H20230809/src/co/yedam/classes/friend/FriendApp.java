package co.yedam.classes.friend;

import java.util.Scanner;

public class FriendApp {

	Scanner scn = new Scanner(System.in);
	Friend[] friends = new Friend[10];

	FriendApp() {

	}

	void addFriend() {
		System.out.println("이름 연락처 생년월일");
		String[] data = scn.nextLine().split(" ");
//		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
//		Date birth = null; // String => Date

		Friend friend = new Friend(data[0], data[1], data[2]);

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
	} // addFriend 끝

	void list() {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				System.out.println(friends[i].toString());
			}
		}
	}

	void searchName() {
		String inputName = scn.nextLine();

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].getName().equals(inputName)) {
				System.out.printf("이름: %s, 연락처: %s, 생년월일: %s", friends[i].getName(), friends[i].getPhone(),
						friends[i].getBirth());
				System.out.println();
			}
		}
	}

	static void start() {

		FriendApp app = new FriendApp();
		Scanner scn = app.scn;
		boolean run = true;

		while (run) {
			System.out.println("┌─<Menu>──────────────────────────────────────┐");
			System.out.println("│ 1.등록 │ 2.목록 │ 3.조회 │ 4.수정 │ 5.삭제 │ 9.종료 │");
			System.out.println("└─────────────────────────────────────────────┘");
			System.out.println("선택 >>> ");

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case Menu.ADD:
				app.addFriend();
				break;
			case Menu.LIST:
				app.list();
				break;
			case Menu.SEARCH:
				app.searchName();
				break;
			case Menu.EDIT:
				break;
			case Menu.DEL:
				break;
			case Menu.EXIT:
				System.out.println("종료합니다.");
				run = false;
			} // switch 끝
		} // while 끝
	} // start() 끝
} // class 끝
