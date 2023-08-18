package co.yedam.friendApp;
// 친구 연락처 정보 저장 앱
public class Friend {
	private String name;
	private String phone;
	
	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	// private 시 getter, setter 생성
	public void setName(String name) {
		this.name = name; // 인자로 받은 name을 자기 자신에게 넣는다.
	}
	public String getName() {
		return name; // 자기 자신의 name을 리턴 한다.
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhone() {
		return phone;
	}
	
	public String showInfo() {
		return "이름은 " + name + " 연락처는 " + phone;
	}
}
