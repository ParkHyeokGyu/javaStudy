package com.sist.lib;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

// 검색
public class MainClass_7 {
	public static void main(String[] args) {
		Set<Integer> set=new HashSet<Integer>();
		Random r=new Random();
		
		for(int i=0;i<10;i++) {
			int k=r.nextInt(100)+1;
			set.add(k);
		}
		System.out.println(set);
		
		// 50보다 작은 수
		for(int i:set) {
			if(i<50) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		// 50보다 큰 수
		for(int i:set) {
			if(i>50) {
				System.out.print(i+" ");
			}
		}
		System.out.println();
		
		// 정렬,검색이 빠르다 => 오라클 : 인덱스
		TreeSet<Integer> tSet=new TreeSet<Integer>();
		tSet.addAll(set); // 자동 정렬
		System.out.println("==========tSet==========");
		System.out.println(tSet);
		System.out.println("50보다 작은 수:"+tSet.headSet(50));
		System.out.println("50보다 큰 수:"+tSet.tailSet(50));
	}
}
