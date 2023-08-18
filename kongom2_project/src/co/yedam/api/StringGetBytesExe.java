package co.yedam.api;

import java.io.UnsupportedEncodingException;

public class StringGetBytesExe {
	public static void main(String[] args) {
		String str = "안녕하세요";
		
		byte[] byteArr = str.getBytes();
		System.out.println("byteArr.length: " + byteArr.length);
		String str1 = new String(byteArr);
		System.out.println("byteArr -> String: " + str1);
		
		try {
			byte[] byteArr2 = str.getBytes("EUC-KR");
			System.out.println("byteArr2.length: " + byteArr2.length);
			String str2 = new String(byteArr2, "EUC-KR");
			System.out.println("byteArr2 => String: " + str2);
			
			byte[] byteArr3 = str.getBytes("UTF-8");
			System.out.println("byteArr3.length: " + byteArr3.length);
			String str3 = new String(byteArr3, "UTF-8");
			System.out.println("byteArr3 => String: " + str3);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
