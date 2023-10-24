/*
 	1.java.util
 	  => 프로그램에서 많이 사용되는 유용한 클래스의 집합
 	  => 반드시 import를 사용한다
 	  1) 날짜
 	     Date,Calendar => Date에 없는 기능을 확장
 	          -------- 예약
 	  2) 문자열 분해
 	     StringTokenizer
 	  3) 자료구조 : 메모리에서 데이터를 쉽게 관리할 수 있게 만든 클래스
 	     ----- 컬렉션
 	           ---- 가변형(크기를 결정하지 않는다)
 	     표준화(모든 개발자가 동일하게 사용한다)
 	     => CRUD => 읽기/쓰기/수정/삭제
 	        Collection => interface구현 => 메소드가 동일하다
 	        	|
 	     ------------------------
 	     |			|			|
 	     List		Set			Map
 	     
 	     List
 	     0	aaa
 	     1	bbb
 	     2	aaa
 	     3	aaa
 	     4	bbb
 	     => 순서가 있고 데이터의 중복을 허용한다
 	     => 데이터베이스 사용시 주로 사용
 	     
 	     Set
 	     -	A
 	     -	B
 	     -	C
 	     -	D
 	     -	E
 	     => 순서가 없고 데이터의 중복을 허용하지 않는다
 	     
 	     Map
 	     A	aaa
 	     B	bbb
 	     C	ccc
 	     Z	zzz
 	     K	aaa
 	     => 순서가 없고 데이터의 중복을 허용한다
 	     => 키와 값으로 저장, 키는 중복할수 없다
 	     => 클래스 관리(스프링,웹)
 	     
	 	List
	 	|
	 	---------------------
	 	|			|		|
	 	*ArrayList	Vector	LinkedList
	 						|
	 						Queue
	 	
	 	ArrayList : 오라클에 있는 데이터를 저장해서 제어
	 				--------------------------
	 				 |
	 				브라우저로 전송
	 				=> 데이터베이스 관련 => 비동기 방식
	 				
	 	Vector : 동기 방식 => 네트워크(사용자의 정보(IP,PORT) 저장)
	 	*Vector의 단점을 보완 => ArrayList
	 	
	 	LinkedList : C호환 => 수정,삭제,추가가 빠르다
	 	             => 읽기의 경우는 ArrayList가 빠르다
	 						
	 	Set
	 	|
	 	-------------
	 	|			|
	 	*HashSet	TreeSet
	 	
	 	Map
	 	|
	 	-------------
	 	|			|
	 	*HashMap	HashTable
	 	
	   Random : 난수 발생
 */
package com.sist.lib;
import java.util.*;
public class MainClass_1 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("홍길동");
		list.add("심청이");
		list.add("박문수");
		for(String name:list) {
			System.out.println(name);
		}
	}
}
