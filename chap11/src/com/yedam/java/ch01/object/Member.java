package com.yedam.java.ch01.object;

public class Member {
	
	// 필드
	public String id;
	
	// 생성자
	public Member(String id) {
		this.id = id;
	}
	
	// 메서드
	@Override
	public boolean equals(Object obj) { // 매개변수로 모든 타입의 객체들이 올수있다. : Object이므로
		if(obj instanceof Member) { // 동등 객체를 찾으려면 같은 타입을 가져야하므로
			Member member = (Member) obj;
			if(id.equals(member.id)) { // 내부에 있는 필드값이 같은지
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}

	@Override
	public String toString() {
		return "Member [id=" + id + "]";
	}
	
	

}
