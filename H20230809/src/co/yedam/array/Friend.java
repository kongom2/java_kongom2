package co.yedam.array;

public class Friend {
	String name;
	String phone;
	Gender gender;
	
	// 메서드
	void showInfo() { // void : 값을 반환하지 않고 싶을 때 
		System.out.printf("이름:%s, 연락처:%s, 성별:%s\n", name, phone, gender == Gender.MEN ? "남" : "여");
	}
	
	void briefInfo() {
		System.out.printf("이름:%s, 연락처:%s\n", name, phone);
	}
}
