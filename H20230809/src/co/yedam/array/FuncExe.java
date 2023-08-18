package co.yedam.array;

public class FuncExe {
	public static void main(String[] args) {
		printStar(3);
		printString(3, "a");
		int num = sum(5,2);
		int[] intAry = {1,2,3,4,5};
		System.out.println(num);
		System.out.println(sum(intAry));
		
		Friend f = getFriend("홍길동", "010-4533-4321", Gender.MEN);
		f.showInfo();
	}
	public static void printStar() { // 값 반환 안함
		System.out.println("*");
	}
	public static void printStar(int times) { // 값 반환 안함
		for (int i =0; i < times; i++)
		System.out.println("*");
	}
	public static void printString(int times, String str) { // 값 반환 안함
		for (int i =0; i < times; i++)
			System.out.println(str);
	}
	public static int sum(int n1, int n2) { // 값 반환 int 타입으로
		int result = n1 + n2;
		return result;
	}
	public static int sum(int[] arr) { // 값 반환 int 타입으로
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static Friend getFriend(String name, String phone, Gender gender) {
		Friend f = new Friend();
		f.name = name;
		f.phone = phone;
		f.gender = gender;
		return f;
	}
}
