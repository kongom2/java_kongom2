package co.yedam.interfaces;

public class Example01 {
	public static void main(String[] args) {
//		int[][] intArr = new int[5][5];
//		int plus = 0;
//		for(int n = 0; n < 5; n++) {
//			for(int m = 0; m < 5; m++) {
//				plus = plus + 1;
//				intArr[m][n] = plus;
////				System.out.print(intArr[n][m] + "\t");
//				System.out.printf("%3d", intArr[n][m]);
//			}
//			System.out.println();
//		}
		
		int[][] intArr = new int[5][5];
		int no = 1;
		
		for(int r=0; r<5; r++) {
			for(int c=4; c>-1; c--) {
				intArr[r][c] = no++;
			}
		}
		
		for(int r=0; r<5; r++) {
			for(int c=0; c<5; c++) {
			System.out.printf("%3d", intArr[c][r]);
			}
			System.out.println();
		}
	}
}