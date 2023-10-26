package com.sist.lib;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

// 출력이 어려운 경우
// 데이터를 모아서 한번에 처리 => Iterator
public class MainClass_10 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("홍길동");
		list.add("심청이");
		list.add("박문수");
		list.add("이순신");
		list.add("강감찬");
		System.out.println("=====일반 출력(웹)=====");
		for(String name:list) {
			System.out.println(name);
		}
		
		System.out.println("=====데이터를 한곳에 모아서 출력=====");
		Iterator<String> it=list.iterator();
		while(it.hasNext()) { // 갯수가 명확하지 않을때 => 실시간
			System.out.println(it.next());
		}
		
		// List에서만 사용
		System.out.println("=====ListIterator=====");
		ListIterator<String> it1=list.listIterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		System.out.println("=====거꾸로 출력=====");
		while(it1.hasPrevious()) {
			System.out.println(it1.previous());
		}
	}
}
