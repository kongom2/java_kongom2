package co.yedam.interfaces;

public interface Dao {// Data Access Object
	// 규칙선언.
	static final double pi = 3.14; // 값이 반드시 선언
	
	void insert(); //abstract 없어도 기본으로 추상메서드 / 4가지 기능을 반드시 구현
	void update();
	void delete();
	void select();	
}
