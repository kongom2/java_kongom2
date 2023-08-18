package co.yedam.friendApp;

public class FriendExe {
	public static void main(String[] args) {
		// 1. 배열 선언 하기
		// 2. 인스턴스 3명 만들기
		
		Friend[] friendArr = new Friend[5];
		
		friendArr[0] = new Friend("kongom0","010-1234-4321");
		friendArr[1] = new Friend("kongom1","011-1234-4321");
		friendArr[2] = new Friend("kongom2","012-1234-4321");
		
		for(int i = 0; i < friendArr.length; i++) {
			if(friendArr[i] != null) {
				String name = friendArr[i].getName();
				String phone = friendArr[i].getPhone();
				System.out.printf("%s, %s",name, phone);
				System.out.println();				
			}
		}
	}
}
