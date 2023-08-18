package co.yedam.inherit;

public class CellPhone extends Object {
	// 속성
	private String model; // private 선언했기 때문에 get,set, 메서드 사용해야 다른 클래스에 전달 할 수 있다.
	private String color;
	
	// 생성자
	CellPhone() {
		
	}
	
	// 기능
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	


	public void setModel(String model) {
		this.model = model;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return color + ", " + model;
	}
}
