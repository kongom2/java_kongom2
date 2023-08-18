package co.yedam.api;

import java.io.UnsupportedEncodingException;

public class StringExe {
	public static void main(String[] args) {
		
		byte[] byteArr = {104, 101, 108, 108, 111};
		String str = null;
		
		try {
			str = new String(byteArr, 0, 3, "UTF-8");			
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		System.out.println(str);
	}
}
