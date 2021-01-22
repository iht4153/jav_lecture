package com.urdomain.ch11;

public class Member1 {
	public String id;
	
	public Member1(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member1) {
			Member1 member1 = (Member1) obj;
			if(id.equals(member1.id)) {
				return true;
			}
		}
		return false;
	}
}
