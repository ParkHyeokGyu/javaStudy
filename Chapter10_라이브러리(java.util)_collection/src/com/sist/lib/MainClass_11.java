package com.sist.lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainClass_11 {
	public static void main(String[] args) {
		int[] arr= {10,20,30,50,40,70,80,60,10,20,40};
		Set<Integer> set=new HashSet<Integer>();
		for(int a:arr) {
			set.add(a);
		}
		System.out.println(set);
		List<Integer> list=new ArrayList<Integer>();
		list.addAll(set);
		System.out.println(list);
		System.out.println("=====정렬(ASC)=====");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("=====정렬(DESC)=====");
		Collections.reverse(list);
		System.out.println(list);
		// ArrayList<?> list=new ArrayList<String>();
		// ArrayList list=new ArrayList(); => ?(와일드카드) : 모든 데이터형을 받는 경우
	}
}
