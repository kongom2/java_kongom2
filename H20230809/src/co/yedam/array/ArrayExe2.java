package co.yedam.array;

public class ArrayExe2 {
	public static void main(String[] args) {
		
		int num1, num2, num3;
		num1 = 56;
		num2 = 72;
		num3 = 67;
		
//		제일 큰값을?

		max = 0;
		int[] intArr = {num1, num2, num3};
		for(int i = 0; i < intArr.length; i++) {
			if(max < intArr[i]) {
				max = intArr[i];
			}
		}
		
		
		int[] arr = new int[5];
		
		// 1 ~ 100 임의의 값
		
		int sum = 0;
		int avg = 0;
		
		for(int i = 0; i <= 4; i++) {
			int randomVal = (int)(Math.random()*100)+1;
			arr[i] = randomVal;
			sum += arr[i];
			avg = sum / 5;
			
			System.out.println(arr[i]);
		}
		System.out.printf("합 : %d",sum);
		System.out.println("");
		System.out.printf("평균 : %d",avg);
		
	}
}
