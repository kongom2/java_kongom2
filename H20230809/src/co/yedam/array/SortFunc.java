package co.yedam.array;

public class SortFunc {
	public static void sortSample() {
		int[] intArr = {45, 23, 90, 77, 12};
		
		for(int i=0; i < intArr.length; i++) {
			for(int j=i+1; j < intArr.length; j++) {
				if(intArr[i] > intArr[j]) {
					int tmp = intArr[i];
					intArr[i] = intArr[j];
					intArr[j] = tmp;
				}
			}
		}
		for(int i=0; i<intArr.length; i++) {
			System.out.print(intArr[i]);
			if(i+1 != intArr.length) {
				System.out.print(", ");
			}
		}
	}
}
