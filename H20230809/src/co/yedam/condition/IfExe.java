package co.yedam.condition;

public class IfExe {
	public static void main(String[] args) {
//		if는 범위를 넣을 수 있다
//		switch는 변수 갯수만큼만 된다.
		int score = 50;
		score = (int) (Math.random()*100) + 1;
		String grade = "";
		
//		if (score > 90) {
//			grade = "A";
//		} else if(score > 80) {
//			grade = "B";
//		} else if(score > 70) {
//			grade = "C";
//		}else if(score > 60) {
//			grade = "D";
//		}else if(score > 50) {
//			grade = "E";
//		}else {
//			grade = "F";
//		}
		int score1 = score / 10; // 95/10 => 9
		switch(score1) {
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		case 5:
			grade = "E";
			break;
		default:
			grade = "F";
		}
		System.out.printf("점수 %d는 %s 입니다.", score, grade);
	}
}
