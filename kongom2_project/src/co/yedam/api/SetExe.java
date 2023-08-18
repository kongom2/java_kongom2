package co.yedam.api;

import java.util.HashSet;
import java.util.Set;

public class SetExe {
	public static void main(String[] args) {
//		ArrayList, HashSet : 중복된 값 저장 불가.
		Set<String> set = new HashSet<>();
		set.add("kongom1");
		set.add("kongom2");
		set.add("kongom3");
		set.add("kongom4");
		
		for(String str : set) {
			System.out.println(str);
		}
		
		Set<Member> memberSet = new HashSet<>();
		memberSet.add(new Member(101, "kongom1"));
		memberSet.add(new Member(102, "kongom2"));
		memberSet.add(new Member(103, "kongom3"));
		memberSet.add(new Member(101, "kongom1"));
	
		for(Member str : memberSet) {
			System.out.println(str);
		}
		
	} 
}
