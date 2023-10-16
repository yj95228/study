package com.edu.child;

import com.edu.parent.Employee;
import com.edu.util.MyDate;

// Employee의 자식 클래스
// 클래스 선언부에 Employee로부터 확장된 클래스라는 것을 인식

/*
 * 상속 관계에서
 * 부모가 가진 기능을 자식에 물려받아서 사용할 때는
 * 부모가 물려준 기능을 자신에게 맞게 고쳐서 사용해야 한다 (구현부를 변경해서 사용) -> 메소드 Overriding
 */
public class Secretary extends Employee{
	private String bossOfName;

	public Secretary(String name, MyDate birthDate, double salary, String bossOfName) {
		super(name, birthDate, salary);	 // Employee 생성자 호출
		this.bossOfName = bossOfName;
	}
	
	@Override
	public String getDetails() {
		return super.getDetails()+" "+bossOfName;
	}
	
}
