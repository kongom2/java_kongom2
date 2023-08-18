package co.yedam.array;

public class CalendarExe {
	public static void main(String[] args) {
		int month = 3;
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fri", "Sat" };

		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		
		// 달력. 31까지.
		int space = getFirstDay(month);
		for (int i = 1; i <= space; i++) {
			System.out.printf("%4s", " ");
		}

		for (int i = 1; i <= getLastDate(month); i++) {
			System.out.printf("%4d", i);
			if ((i + space) % 7 == 0) {

				System.out.println();
			}
		}
	}
	public static int getFirstDay(int month) {
		int day = 0;
		int totalDays = 0;
		for (int i = 2; i <= month; i++) {
			totalDays += getLastDate(i);
		}
		day = day +totalDays % 7;
		return day;
	}
	
	public static int getLastDate(int month) {
		int lastDate = 31;
		
		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			lastDate = 30;
			break;
		case 2:
			lastDate = 28;
		}
		return lastDate;
	}
}
