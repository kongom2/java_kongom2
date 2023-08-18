package co.yedam.classes.student;

public class StudentExe {
	public static void main(String[] args) {
		Student s1 = new Student();
//		s1.stdNo = 100;
		s1.setStdNo(100);
//		s1.stdName = "kongom2";
		s1.setStdName("kongom2");
//		s1.score = 70;
		s1.setScore(60);
		s1.stdInfo();
		
		System.out.println(s1.getStdName());
		
		Student s2 = new Student(101, "kongom1", 80);
		s2.stdInfo();
	}
}
