package co.yedam.array;

import java.util.Scanner;

public class FriendApp {
	static Friend[] friends = new Friend[10];
	static Scanner scn = new Scanner(System.in);
	static String name;
	static String phone;
	static Gender gender;
	public static boolean checkFriend(String name) { // boolean 리턴값을 가진다.
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].name.equals(name)) {
				return true;
			}
		}
		return false;
	} // friends 사용
	public static void init() {
		// 초기값
		for (int i = 0; i < friends.length; i++) {
			Friend f = new Friend();
			f.name = "test" + i;
			f.phone = "010-1234-123" + i;
			f.gender = i % 2 == 0 ? Gender.MEN : Gender.WOMEN;

			friends[i] = f;
		}
	}
	public static void printMenu() {
		System.out.println("1.추가 // 2.수정 // 3.삭제 // 4.조회 // 5.목록 // 6.종료");
		System.out.println("선택 >>> ");
	}
	public static void addInfo() {
		System.out.print("이름 : ");
		name = scn.nextLine();
		System.out.print("연락처 : ");
		phone = scn.nextLine();
		System.out.print("성별(1.남자 // 2.여자) : ");
		Gender gender;
		int choice = Integer.parseInt(scn.nextLine());
		if (choice == 1) {
			gender = Gender.MEN;
		} else {
			gender = Gender.WOMEN;
		}
		Friend friend = new Friend();
		friend.name = name;
		friend.phone = phone;
		friend.gender = gender;

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				friends[i] = friend;
				break;
			}
		}
		System.out.println("OK");
		scn.close();
	}
	public static void editInfo() {
		System.out.print("이름 : ");
		name = scn.nextLine();
		if (!checkFriend(name)) {
			System.out.println("찾는이름이 없습니다.");
			return; // 메서드의 실행을 중지 // 반복문은 break
		}
		System.out.print("연락처 : ");
		phone = scn.nextLine();

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null) {
				if (friends[i].name.equals(name)) {
					friends[i].phone = phone;
					break;
				}
			}
		}
	}
	public static void delInfo() {
		System.out.print("이름 : ");
		name = scn.nextLine();
		if (!checkFriend(name)) {
			System.out.println("찾는이름이 없습니다.");
			return;
		}

		for (int i = 0; i < friends.length; i++) {
			if (friends[i] == null && friends[i].name.equals(name)) {
				friends[i] = null;
				break;
			}
		}
}
	public static void searchInfo() {
		System.out.print("이름 : ");
		name = scn.nextLine();
		if (!checkFriend(name)) {
			System.out.println("찾는이름이 없습니다.");
			return;
		}
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null && friends[i].name.equals(name)) {
				friends[i].showInfo();
			}
		}
	}
	public static void listInfo() {
		for (int i = 0; i < friends.length; i++) {
			if (friends[i] != null) {
				friends[i].briefInfo();

			}
		}
	}
	public static void main(String[] args) { // friends 사용
		
		init();
		// 추가, 수정, 삭제, 조회, 목록
		boolean run = true;

		while (run) {
			printMenu();

			int menu = Integer.parseInt(scn.nextLine());

			switch (menu) {
			case 1:
				addInfo();
				break;
			case 2:
				editInfo();
				break;
			case 3:
				delInfo();
				break;
			case 4: // 조회. 이름 / 연락처 / 성별
				searchInfo();
				break;
			case 5: // 목록. 이름 / 연락처
				listInfo();
				break;
			case 6: // 종료.
				System.out.println("종료합니다.");
				run = false;
			default:
				System.out.println("메뉴를 다시 선택해 주세요");
			}
		}
		scn.close();
	}
}
