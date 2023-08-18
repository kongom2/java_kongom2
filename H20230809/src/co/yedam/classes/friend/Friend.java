package co.yedam.classes.friend;

import java.util.Date;

public class Friend {
	private String name;
	private String phone;
	// private Date birth;
	private String birth;
	
	public Friend(String name, String phone, String birth) {
		super();
		this.name = name;
		this.phone = phone;
		this.birth = birth;
	}
	
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public String getBirth() {
		return birth;
	}

	@Override // 부모가 가지고 있는 기능을 재정의 하겠습니다.
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + ", birth=" + birth + "]";
	}
	
}
