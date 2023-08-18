package co.yedam.api;

import java.util.Objects;

class Member {
	private int memberId;
	private String memberName;
	public Member(int memberId, String memberName) {
		super();
		this.memberId = memberId;
		this.memberName = memberName;
	}


	
	@Override
	public String toString() {
//		return super.toString();
		return "Member [memberId=" + memberId + ", memberName=" + memberName + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(memberId);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Member other = (Member) obj;
		return memberId == other.memberId;
	}
}

public class EqualsExe {
	public static void main(String[] args) {
		String str1 = new String("kongom1");
		String str2 = new String("kongom1");
		
		Member mem1 = new Member(101, "kongom1");
		Member mem2 = new Member(101, "kongom1");
		
		System.out.println(mem1.equals(mem2));
//		System.out.println(str2);
	}
}
