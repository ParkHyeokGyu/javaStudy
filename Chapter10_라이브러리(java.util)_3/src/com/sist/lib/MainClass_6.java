/*
 	ArrayList<클래스>
 	         ------
 	         기본형 => Integer,String
 	         사용자 정의 클래스
 	         ArrayList<Music>
 	         ArrayList<Movie>
 	         ArrayList<Food>
 	         ---------------- Object를 원하는 데이터형으로 변환 => 제네릭
 */
package com.sist.lib;
import java.util.*;
public class MainClass_6 {
	public static void main(String[] args) {
		ArrayList<String> names1=new ArrayList<String>();
		names1.add("홍길동");
		names1.add("박문수");
		names1.add("심청이");
		names1.add("이순신");
		names1.add("강감찬");
		
		for(String name:names1) {
			System.out.println(name);
		}
		System.out.println("====================");
		
		ArrayList<String> names2=new ArrayList<String>();
		names2.add("홍길수");
		names2.add("박문수");
		names2.add("심청이");
		names2.add("이순이");
		names2.add("성춘향");
		
		for(String name:names2) {
			System.out.println(name);
		}
		System.out.println("====================");
		
		ArrayList<String> temp=new ArrayList<String>();
		temp.addAll(names1); // 복사, 다른 컬렉션의 데이터를 추가
		// 원본을 바꾸지 않고 싶을때
		
		for(String name:temp) {
			System.out.println(name);
		}
		System.out.println("====================");
		
		temp.retainAll(names2); // 같은 데이터를 추가(교집합)
		// temp의 데이터와 names2의 데이터를 서로 비교하여 같은것만 추가
		// 오라클에서는 JOIN/INTERSECT
		
		for(String name:temp) {
			System.out.println(name);
		}
		System.out.println("====================");
	}
}
