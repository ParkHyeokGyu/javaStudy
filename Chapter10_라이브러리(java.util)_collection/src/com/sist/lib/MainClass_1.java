/*
 	컬레션 프레임워크
 	= 다수의 데이터를 쉽고 효율적으로 처리할 수 있게 만든 표준화된 클래스의 집합
 	  자바에서 지원하는 라이브러리 => 사용법
 	= 데이터 수정,삭제,추가,읽기 => CRUD(자료구조)
 	= 배열의 단점을 보완 => 고정적, 추가나 삭제가 어렵다
 	  => 동적 메모리 할당(가변)
 	     필요시마다 추가나 삭제가 편리하다
 	= 단점 : 모든 데이터형을 저장할 수 있다(Object)
 	= 기본적인 데이터 관리
 	  => 같은 데이터형을 모아서 처리
 	
 	제네릭 : 데이터형의 통일화
 	       기존에 만들어진 메소드의 리턴형이나 매개변수를 변경할 수 있다
 	       *데이터를 저장할 때 한가지 데이터형만 사용이 가능하게 만들어준다
 	       소스가 간결하다(형변환 없이 사용)
	       가독성이 좋다(어떤 데이터가 저장되어 있는지 확인 가능)
	       *컬렉션에서 사용
	       => 사용법 : 클래스뒤에 <>
	          <> => 클래스만 사용(기본형은 사용할 수 없다, Wrapper를 사용)
	          ArrayList<Integer>
	          ArrayList<Music>
	       => T,E,K,V
	          T => type => 클래스
	               MyBatis => type
	               Spring => class
	          E => elements => 클래스
	          K => key
	          V => value
	          ArrayList<E>
	          Set<E>
	          Map<K,V>
	       예)
	          class Box<T>{
	              T t;
	              public void setT(T t){
	                  this.t=t;
	              }
	              public T getT(){
	                  return t;
	              }
	          }
	          Box box=new Box(); => 제네릭을 사용하지 않고 생성 시 Object로 설정된다
	          Box<Integer> box=new Box<Integer>(); => T : Integer
	       
 	클래스의 종류
 	= List(인터페이스)
 	  순서가 존재(자동으로 인덱스 번호를 부여)
 	  데이터 중복 허용
 	  => 가장 많이 사용되는 컬렉션
 	  => 구현하는 클래스
 	     ArrayList,Vector,LinkedList
 	     
 	     ArrayList
 	     => 비동기 방식, 접근 속도가 빠르다 => 데이터베이스의 데이터 읽기
 	                 -------------------------- 웹의 핵심
 	        단점 : 추가나 삭제시 속도가 느리다
 	             --------- 직접 하지 않고 오라클에서 주로 수행한다
 	        읽기/데이터 모아서 전송
 	        MyBatis의 리턴형은 List
 	        Vector의 단점을 보완
 	        
 	     Vector
 	     => 동기 방식, 네트워크(접속자의 정보 저장)
 	     
 	     LinkedList
 	     => 접근 속도가 느리다, 추가나 삭제시 빠르다
 	        직접 수행한다(Application)
 	---------------------------------------- List라는 인터페이스를 구현했기때문에 모든 메소드가 동일하다
 */
package com.sist.lib;

import java.util.ArrayList;

public class MainClass_1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		// 가변 => 메모리 저장 크기를 지정하지 않아도 된다(저장된 데이터만큼만 메모리가 할당된다)
		// 배열 => 사용하지 않는 공간이 있는 경우 메모리 누수현상
		// => 추가 => add(Object) => add(String)
		list.add("사과"); 	// 0
		list.add("배"); 		// 1 => 삭제
		list.add("수박"); 	// 2 => 1
		list.add("바나나"); 	// 3 => 2
		list.add("메론"); 	// 4 => 3
		// 인덱스 번호가 자동으로 변경된다
		// 추가시에는 순차적으로 추가하는것이 효울적이다
		// 데이터 읽기 => 출력 => size(), get(index)
		for(int i=0;i<list.size();i++) {
			String f=list.get(i);
			System.out.println(i+":"+f);
		}
		
		// 삭제 remove(index) => index 대신 데이터를 넣어 삭제도 가능하지만, 중복을 허용하기에...
		System.out.println("=======삭제=======");
		list.remove(1);
		for(int i=0;i<list.size();i++) {
			String f=list.get(i);
			System.out.println(i+":"+f);
		}
		
		// 수정 set(index,데이터)
		System.out.println("=======수정=======");
		list.set(2, "연시");
		for(int i=0;i<list.size();i++) {
			String f=list.get(i);
			System.out.println(i+":"+f);
		}
		
		// size() => 장바구니
		System.out.println("=====저장 갯수=====");
		System.out.println("과일:"+list.size());
		
		// ArrayList 데이터 비우기 => clear()
		System.out.println("=====전체 삭제=====");
		list.clear();
		System.out.println("과일:"+list.size());
		
		// isEmpty()
		System.out.println("==데이터 존재 여부 확인==");
		if(list.isEmpty()) {
			System.out.println("장바구니가 비어있습니다");
		}else {
			System.out.println("장바구니에 선택된 데이터가 있습니다");
		}
	}
}
