package com.yedam.java.ch02.set;

public class Member {

	public int id;
	public String name;
	
	public Member(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		// String은 문자열 리터럴이 같으면 동일한 객체번지를 가지므로
		// String 클래스에서 hashCode는 메소드 오버라이딩 되어있음
		return id + name.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member) obj;
			return (id == member.id) && (name.equals(member.name));
		}
		return false;
	}
}
