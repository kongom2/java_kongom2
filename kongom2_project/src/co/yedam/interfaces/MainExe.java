package co.yedam.interfaces;

import java.util.Scanner;

public class MainExe {
	public static void main(String[] args) {
		Dao dao = new OracleDao(); // new MysqlDao();
		
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		int menu = -1;
		
		while (run) {
			System.out.println("┌─<Menu>──────────────────────────────");
			System.out.println("│ 1.등록 │ 2.조회 │ 3.수정 │ 4.삭제 │ 5.종료 ");
			System.out.println("└─────────────────────────────────────");
			System.out.println("번호를 선택하시오 >>> ");
			menu = sc.nextInt();
			sc.nextLine();

			switch (menu) {
			case 1:
				dao.insert();
				break;
			case 2:
				dao.select();
				break;
			case 3:
				dao.update();
				break;
			case 4:
				dao.delete();
				break;
			case 5:
				System.out.println("종료합니다.");
				run = false; // while 종료
				break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}
	}
}
