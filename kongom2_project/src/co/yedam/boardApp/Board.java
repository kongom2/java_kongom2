package co.yedam.boardApp;

public class Board {
	String title;
	String contents;
	String writer;
	
	void menuSelectMsg() {
		System.out.println("┌─<Menu>──────────────────────────────────────┐");
		System.out.println("│ 1.등록 │ 2.목록 │ 3.조회 │ 4.수정 │ 5.삭제 │ 6.종료 │");
		System.out.println("└─────────────────────────────────────────────┘");
		System.out.println("번호를 선택하시오 >>> ");
	}
	
	void listInfo() {		
		System.out.println("글번호  제목  작성자");
		System.out.printf("%s  %s  %s", title, contents, writer);
		System.out.println();
		System.out.println();
	}
	
//	public String getTitle() {
//		return title;
//	}
//	public String getContents() {
//		return contents;
//	}
//	public String getWriter() {
//		return writer;
//	}
}