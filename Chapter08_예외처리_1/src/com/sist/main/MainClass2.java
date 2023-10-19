/*
 	인터페이스의 다형성
 			 ----
 			 한개의 매소드로 서로 다른 내용 구현 => 오버라이딩
 			 => 화면 출력
 			    => 영화,음악,맛집...
 */
package com.sist.main;
interface II{
	void print();
}
class Music implements II{
	@Override
	public void print() {
		System.out.println("음악 목록 출력...");
	}
}
class Movie implements II{
	@Override
	public void print() {
		System.out.println("영화 목록 출력...");
	}
}
class Food implements II{
	@Override
	public void print() {
		System.out.println("맛집 목록 출력...");
	}
}
public class MainClass2 {
	public static void main(String[] args) {
		II i=new Music();
		i.print();
		i=new Movie();
		i.print();
		i=new Food();
		i.print();
	}
}
