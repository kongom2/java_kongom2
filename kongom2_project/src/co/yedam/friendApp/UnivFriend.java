package co.yedam.friendApp;

public class UnivFriend extends Friend {
	private String univ;
	private String major;
	
	// 기본 생성자 생성
	public UnivFriend(String name, String phone, String univ, String major) {
		super(name, phone); // 부모클래스 것을 super로 가져옴.
		this.univ = univ;
		this.major = major;	
	}
	
	public String getUniv() {
		return univ;
	}
	public String getMajor() {
		return major;
	}
	public void setUniv(String univ) {
		this.univ = univ;
	}
	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String showInfo() {
		return super.showInfo() + " 학교 " + univ + ", 전공 " + major;
	}
	
	
}
