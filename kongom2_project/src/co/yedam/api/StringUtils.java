package co.yedam.api;

public class StringUtils {
	static String checkGender(String ssn) {
		// 주민번호 구분해서 남자, 여자, 오류 케이스 판별
		
		
		String newSsn = ssn;
		String hyphen = "-";
		String space = " ";
		
		int ssnLength = ssn.length();
		if(ssnLength > 13) {
			if (ssn.substring(6,7).equals(hyphen)) {
				newSsn = ssn.replace("-", "");
				return newSsn;
			}else if (ssn.substring(6,7).equals(space)) {
				newSsn = ssn.replace(" ", "");
				return newSsn;
			}
		} else if (ssnLength == 13){
			System.out.println(newSsn);
		}

		
		
		
		
		return newSsn;

	}

	static String getFileName(String filePath) {
		// 전체 경로에서 파일명만 추출.
		return null;
	}
}
