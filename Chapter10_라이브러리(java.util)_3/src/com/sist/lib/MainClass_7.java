/*
 	List가 여러개 있는 경우(JOIN)
 	=> containsAll : 서로 다른 list의 중복된 데이터를 모아서 관리
 	   retrainAll : 서로 다른 list의 중복된 데이터만 추가
 	   *addAll : 데이터 전체 복사
 	   subList : 부분적 데이터 복사
 */
package com.sist.lib;
import java.util.*;
public class MainClass_7 {
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		Random r=new Random();
		for(int i=0;i<10;i++) {
			list.add(r.nextInt(100)+1);
		}
		
		for(int i:list) {
			System.out.print(i+" ");
		}
		System.out.println("\n===============================");
		
		// 부부적으로 데이터 추출
		// subList(int b,int e) => b~e-1
		ArrayList<Integer> list2=new ArrayList<Integer>(list.subList(0, 4));
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		list2.add(r.nextInt(100)+1);
		
		for(int i:list2) {
			System.out.print(i+" ");
		}
		System.out.println("\n===============================");
		
		// 리스트 정렬
		Collections.sort(list);
		
		for(int i:list) {
			System.out.print(i+" ");
		}
		System.out.println("\n===============================");
		
		// 같은 데이터 추출
//		System.out.println(list.containsAll(list2)); // list의 모든 데이터가 비교하는 list와 동일하다면 true
		System.out.println(list.retainAll(list2)); // 같은 데이터가 존재한다면 추가한다
		for(int i:list) {
			System.out.print(i+" ");
		}
		System.out.println("\n===============================");
		
		// 전체 복사
		ArrayList<Integer> list3=new ArrayList<Integer>();
		list3.addAll(list);
		
		for(int i:list3) {
			System.out.print(i+" ");
		}
		System.out.println("\n===============================");
	}
}
