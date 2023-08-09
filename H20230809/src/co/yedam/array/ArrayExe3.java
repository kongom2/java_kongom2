package co.yedam.array;

class Student {
	String name;
	int score;
}

public class ArrayExe3 {
	public static void main(String[] args) {	
		
		Student[] students = new Student[4];
		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.score = 85;
		
		
		Student s2 = new Student();
		s2.name = "장길동";
		s2.score = 88;
		
		
		Student s3 = new Student();
		s3.name = "마길동";
		s3.score = 92;
		
		Student s4 = new Student();
		s4.name = "이길동";
		s4.score = 42;
		
		students[0]= s1;
		students[1]= s2;
		students[2]= s3;
		students[3]= s4;
		
//		String[] names = { "홍길동", "장길동", "마길동", "박길동", "이길동" };
//		int[] scores = { 85, 88, 92, 75, 60 };
		
		int max = 0;
		String name = "";
		
		for(int i = 0; i < students.length; i++) {
			if (max < students[i].score) {
				max = students[i].score;
				name = students[i].name;
			}
		}
		System.out.printf("최고점: %d, 이름: %s", max, name);
		
//		for(int i = 0; i < names.length; i++) {
//			System.out.println(names[i] + " " + scores[i]);
//		}
		
		// String: name
		
	}
}
