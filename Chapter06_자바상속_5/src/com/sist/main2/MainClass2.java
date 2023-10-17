package com.sist.main2;

import java.util.ArrayList;
import java.util.List;

public class MainClass2 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("홍길동");
//		list.add('A');
		
		String name=list.get(0);
		// 상위 클래스를 리턴하기에 형변환을 해야한다
	}
}
