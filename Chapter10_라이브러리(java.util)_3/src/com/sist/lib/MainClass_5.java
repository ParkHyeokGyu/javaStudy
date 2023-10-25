// 340page
// 검색
package com.sist.lib;

import java.util.ArrayList;

public class MainClass_5 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		// 정수만 메모리에 저장해서 관리
		/*
		 	Wrapper => 기본형을 클래스형으로 만들어 기능을 부여
		 	           제네릭에서 사용
		 	=> 장점은 Wrapper클래스와 기본형이 호환이 된다
		 	Integer => 10,20,30... => 오토박싱
		 	Integer i=10; => int j=i; int형으로 받을 수 있다 => 언박싱
		 */
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		for(int i=0;i<list.size();i++) {
			int val=list.get(i); // 형변환 없이 받을 수 있다
			System.out.println(i+":"+val);
		}
		System.out.println("=============================");
		
		list.add(3,60);
		for(int i=0;i<list.size();i++) {
			int val=list.get(i); // 형변환 없이 받을 수 있다
			System.out.println(i+":"+val);
		}
		System.out.println("=============================");
		
		list.remove(3);
		for(int i=0;i<list.size();i++) {
			int val=list.get(i); // 형변환 없이 받을 수 있다
			System.out.println(i+":"+val);
		}
		System.out.println("=============================");
		// 인덱스 번호는 0번부터 시작
		// size()는 데이터의 갯수
		// => i<list.size() => 인덱스를 초과하면 Exception 발생
		// for문 보다는 for-each
		for(int i:list) {
			System.out.println(i);
		}
		System.out.println("=============================");
		System.out.println("데이터 저장 갯수:"+list.size());
		// isEmpty() : 데이터가 없을시 true
		// size() : 0일시 데이터가 없다
		/*
		 	라이브러리 메소드중 isXxx() => 리턴형은 boolean
		 	              setXxx() => void
		 	              getXxx() => 해당 데이터형
		 	              remove => 삭제
		 	              delete => 삭제
		 */
		System.out.println("데이터 존재 여부:"+list.isEmpty());
		System.out.println("=============================");
		list.clear();
		System.out.println("데이터 저장 갯수:"+list.size());
		System.out.println("데이터 존재 여부:"+list.isEmpty());
	}
}
