package co.yedam.classes.student;

public class Student {
	// 필드 / private => 클로저와 비슷?
	private int stdNo; // 0
	private String stdName; // null
	private int score; // 0
	
	// 생성자 / 필드의 값 초기화
	Student() {
	// 기본생성자
	}
	
	Student(int stdNo) {
		this.stdNo = stdNo;
	}
	// 정의한 생성자
	Student(int stdNo, String stdName, int score) {
		this.stdNo = stdNo;
		this.stdName = stdName;
		this.score = score;
	}
	
	// 메서드
	void stdInfo() {
		System.out.println("학번: " + stdNo + ", 학생이름: " + stdName + ", 점수: " + score);
	}
	
	void setStdNo(int stdNo) { // private 사용시 매개변수를 통해 전달
		this.stdNo = stdNo;
	}
	
	void setStdName(String stdName) {
		this.stdName = stdName;
	}
	
	void setScore(int score) {
		if(score < 0) {
			this.score = 0;
		} else {
			this.score = score;
		}
	}
	// getter
	public int getStdNo() {
		return stdNo;
	}

	public String getStdName() {
		return stdName;
	}

	public int getScore() {
		return score;
	}
//	source => Generate getter and setters

	
}
