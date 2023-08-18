package co.yedam.inherit;
// 상속받는 class
public class DmbCellPhone extends CellPhone {
	private int channel;
	
	public void changeChannel(int channel) {
		this.channel = channel;
	}
	
	public void turnOnDmb() {
		System.out.println("DMB 폰을 켭니다.");
	}
	
	// 메서드 재정의, Overriding
	@Override
	public void turnOn() {
//		super.turnOn(); // super는 부모를 가리킴
		System.out.println(getModel() + "의 전원을 켭니다.");
	}
}
