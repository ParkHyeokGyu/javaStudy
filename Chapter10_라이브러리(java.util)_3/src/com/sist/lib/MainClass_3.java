/*
 	338page
 	제네릭 : 데이터형을 통일화(기존에 설정된 데이터형을 변경)
 	       => 기본형은 사용할 수 없고 클래스형만 사용 가능
 	          Wrapper를 이용하여 기본형을 사용할 수 있게 만든다
 	       
 	       <클래스형> => 자바에서 컬렉션은 Object로 설정되어있다
 	                  Object를 지정된 클래스형으로 변경 시 사용
 	       <T> => type(클래스형)
 	       <E> => element(요소)
 	              List<E>,Vector<E>,Set<E>
 	       <K> => key
 	       <V> => value
 	              Map<K,V>
 	              
 	       장점 => 코드가 간결해진다 => 형변환이 필요없다
 	       단점 => 무조건 지정된 데이터형만 저장할 수 있다
 	       ArrayList => Object
 	       ArrayList<String> => String
 	       ArrayList<Integer> => int
 	       ArrayList<Music> => Music => 사용자 정의 클래스도 가능
 	       => 저장된 데이터는 같은 데이터형을 사용해야 편리하다
 	
 */
package com.sist.lib;
class Data<T>{
	private T t; // 제네릭을 지정하지 않을 경우 Object로 설정
	public void setT(T t) {
		this.t=t;
	}
	public T getT() {
		return t;
	}
}
public class MainClass_3 {
	public static void main(String[] args) {
		Data data=new Data(); // 제네릭을 설정하지 않아 Object로 설정
		Data<String> d=new Data<String>();
	}
}
