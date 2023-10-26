/*
 	List계열의 클래스
 	= 순서가 있다(인덱스)
 	= 데이터를 중복해서 저장할 수 있다
 	
 	ArrayList
 	= 단반향 포인터(인덱스)를 가지고 있다
 	  => 조회하기 편리하다(성능이 좋다)
 	= 검색이 빠르다, 데이터 추가시에 순차적으로 추가하면 속도가 빠르다
 	= 중간에 수정을 하거나 추가,삭제를 할 시 속도가 느려지는 단점이 있다 => 웹에서는 사용하지 않는다
 	= 수정,삭제가 없는 프로그램에서 주로 사용
 	  => 데이터베이스에서 수행한다
 	= 데이터를 모아서 전송(브라우저,윈도우)
 	  
 	Vector
 	= 단방향(ArrayList와 동일)
 	= 동기 방식 => 채팅,서버연결,사용자 정보 저장
 	  => 비동기 방식 => ArrayList(Vector를 보완)
 	
 	LinkedList
 	= 양방향 포인터를 가지고 있다
 	= 수정,삭제,추가가 많은 경우에 주로 사용
 	  => 윈도우(애플리케이션 프로그램)
 	= 단점 : 검색속도가 느리다
 */
package com.sist.lib;

import java.util.Vector;

public class MainClass_2 {
	public static void main(String[] args) {
		Vector<Integer> vec=new Vector<Integer>();
		/*
		 	List<String> list=new Vector<String>();
		 	List<String> list=new ArrayList<String>();
		 	List<String> list=new LinkedList<String>();
		 */
		// 데이터 추가 => add(Object) => add(Integer)
		// Wrapper => 기본형과 동일하게 사용이 된다
		// int i=10;, Integer i=10; => 오토박싱
		vec.add(10); // 0
		vec.add(20); // 1
		vec.add(30); // 2
		vec.add(40); // 3
		vec.add(50); // 4
		// vec.addElement(60);
		
		for(int i=0;i<vec.size();i++) {
			int k=vec.get(i); // 언박싱
			// vec.elementAt(i)
			System.out.println(i+"=>"+k);
		}
		
		// remove(int index) => 자동으로 인덱스 변경
		System.out.println("=====삭제=====");
		vec.remove(3);
		// vec.removeElementAt(3);
		for(int i=0;i<vec.size();i++) {
			int k=vec.get(i); // 언박싱
			System.out.println(i+"=>"+k);
		}
		
		// set(index,데이터)
		System.out.println("=====수정=====");
		vec.set(2, 1000);
		for(int i=0;i<vec.size();i++) {
			int k=vec.get(i); // 언박싱
			System.out.println(i+"=>"+k);
		}
		
		System.out.println("=====데이터 갯수 확인=====");
		System.out.println("총갯수:"+vec.size());
		System.out.println("=====전체 삭제=====");
		vec.clear();
		System.out.println("총갯수:"+vec.size());
		if(vec.isEmpty()) {
			System.out.println("접속자가 없다");
		}else {
			System.out.println("접속자가 존재한다");
		}
	}
}
