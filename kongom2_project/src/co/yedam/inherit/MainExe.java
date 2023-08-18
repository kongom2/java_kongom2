package co.yedam.inherit;

public class MainExe {
	public static void main(String[] args) {
		CellPhone cell = new CellPhone(); // 부모 기능
		cell.setModel("SM1100");
		cell.setColor("black");
		cell.turnOn();
		cell.turnOff();
		
		DmbCellPhone dmb = new DmbCellPhone(); // 자식 기능
		dmb.setModel("DMB1100"); // 부모 것
		dmb.setColor("white"); // 부모 것
		dmb.turnOn(); //부모 것
		dmb.turnOnDmb(); // 자식이 가지고 있는 메서드, 나머지는 부모 것
		dmb.turnOff(); // 부모 것
		
		CellPhone cell2 = new DmbCellPhone(); // 형변환 promotion
		cell2.turnOn(); // 자식 인스턴스를 불러와서 부모 변수에 담으면, 자식 기능을 사용하지 못한다.
//		cell2.turnOnDmb(); //에러?
		
		if(cell2 instanceof DmbCellPhone) {
			DmbCellPhone dmb2 = (DmbCellPhone) cell2; // casting
			dmb2.turnOnDmb(); // 자식 클래스에 정의된 기능 사용 가능			
		}
		
		if(cell instanceof DmbCellPhone) { // 예외처리
			DmbCellPhone dmb3 = (DmbCellPhone) cell; //컴파일 이상 무 실행하는 시점에 에러, 예외처리 필요
			dmb3.turnOnDmb();			
		}
		
		// 
		CellPhone[] phoneArr = new CellPhone[5];
		phoneArr[0] = cell;
		phoneArr[1] = dmb;
		// 다형성 : 똑같은 호출형태 but 다른 결과
		phoneArr[0].turnOn(); // CellPhone 인스턴스
		phoneArr[1].turnOn(); // DmbCellPhone 인스턴스
	}
}
