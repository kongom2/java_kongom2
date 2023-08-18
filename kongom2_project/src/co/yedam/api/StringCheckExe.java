package co.yedam.api;

public class StringCheckExe {
	public static void main(String[] args) {
		String ssn = "880428-1234567";
		ssn = StringUtils.checkGender(ssn);
//		String newSsn = ssn.replace("-", "");
		
		System.out.println(ssn);
	}
}