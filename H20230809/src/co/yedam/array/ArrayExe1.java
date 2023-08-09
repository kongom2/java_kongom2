package co.yedam.array;

public class ArrayExe1 {
	public static void main(String[] args) {
		// 배열선언
		int[] intArr = null; //
		intArr = new int[10]; // 공간 10개 만듬
		intArr = new int[] {12, 25, 67, 23};

		int[] intArr2 = {55, 47, 90};
		
		System.out.println(intArr[0]);
		intArr[0] = 22;
		System.out.println(intArr[0]);
		intArr = intArr2;
		System.out.println(intArr[0]);

		int sum = 0;
//		sum += intArr[0];
//		sum += intArr[1];
//		sum += intArr[2];
//		sum += intArr[3];
		
		for(int i = 0; i < 3; i++) {
			sum += intArr[i];
		}
		System.out.println(sum);
		
		
	}
}
