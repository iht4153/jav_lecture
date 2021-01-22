package com.urdomain.ch11;

public class Member2 {
	public String id;
	
	public Member2(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member2) {
			Member2 member2 = (Member2) obj;
			if(id.equals(member2.id )) {
				return true;
			}
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		return id.hashCode();
	}
}
