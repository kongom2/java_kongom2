package co.yedam.api;

import java.io.IOException;

public class KeyboardToStringExe {
	public static void main(String[] args) throws IOException {
		byte[] byteArr = new byte[100];
		
		System.out.println("입력: ");
		int readByteNo = System.in.read(byteArr);
		
		String str = new String(byteArr, 0, readByteNo-2);
		System.out.println(str);
	}
}
