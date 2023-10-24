/*
 	Wrapper : 기본데이터형을 클래스화
 	=> 기본데이터형에 기능을 부여해서 쉽게 사용이 가능하게 만든 클래스
 	   int		Integer
 	   long		Long
 	   double	Double
 	   boolean	Boolean
 	   ----------------- 웹에서 주로 사용
 	=> 웹/윈도우 => 모든 데이터값 문자열
 	             ---------------
 	             문자열을 정수,실수,논리형으로 변환
 	=> Double.parseDouble("4.5") => 4.5
 	   Integer.parseInt("10") => 10
 	   Boolean.parseBoolean("true") => true
 	          ---------------------
 	          HTML => checkbox
 	=> 제네릭 사용시 => 데이터형을 통일
 	   ---- 메소드 => 리턴형,매개변수
 	                ----------- Object
 	   <Integer> => 제네릭스를 사용하기위함
 	   배열 => 저장(클래스) => Object
 	   class Box<T> => T(Object)
 	   {
 	       T t=new T();
 	       void setT(T t){}
 	       T getT(){
 	           return T;
 	       }
 	   }
 	   
 	   Box<String>
 	   -------------------------------
 	   *오토박싱/언박싱
 	   Integer i=10; => int와 같이 사용이 가능
 	   int j=i;
 	   
 */
package com.sist.lib;
import java.util.ArrayList;
import java.util.List;
public class MainClass_1 {
	static void aaa(Integer i) {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		/*List list=new ArrayList();
		list.add("a");
		list.add(10.5);
		list.add(10);
		list.add('A');
		list.add(new MainClass_1());*/
		
		/*List<Integer> list=new ArrayList<Integer>();
		list.add(10);*/
		
		/*Integer i=10;
		int j=new Integer(100);
		System.out.println(i);*/
		
		aaa(10);
	}
}
