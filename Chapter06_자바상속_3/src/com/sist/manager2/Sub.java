package com.sist.manager2;

import com.sist.manager.Super;

public class Sub extends Super{
	// 변수 / 메소드
	/*
	 	private int a; // 자신의 클래스안에서만 접근 가능
		protected int b; // default와 동일하지만, 상속을 내릴 시 패키지와 관계없이 접근 가능
		int c; // 같은 패키지 안에서 접근
		public int d; // 모든 클래스에서 접근 가능
	 */
	public Sub() {
		this.b=0;
		this.d=0;
	}
}
