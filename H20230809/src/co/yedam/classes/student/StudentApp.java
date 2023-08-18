package co.yedam.classes.student;

import java.util.Arrays;

public class StudentApp {
	public static void main(String[] args) {
		Student[] students = new Student[10];
		
		Student s1 = new Student();
		s1.setStdNo(1003);
		s1.setStdName("kongom2");
		s1.setScore(80);
		students[0] = s1;
		
		students[1] = new Student(101, "kongom1", 70);
		students[2] = new Student(102, "kongom2", 80);
		students[3] = new Student(103, "kongom3", 90);
		
		String searchName = "kongom2";
//		System.out.println(Arrays.toString(students));
		
		for (int i = 0; i < 10; i++) {
			if (students[i] != null && students[i].getStdName().equals(searchName)) {
				System.out.println(students[i].getStdNo() + students[i].getScore());
			}
		}
	}
}
