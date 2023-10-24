/*
 	Random => 임의의 수를 추출할때 사용
 			  ------- JVM에서 동작
 			  => Math.random() => double
 	=> int nextInt(int bound)
 				   ---------
 				   100 => 0~99
 		   nextInt(100)+1 => 1~100
 */
package com.sist.lib;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class MainClass_3 {
	public static void main(String[] args) {
		// A~Z 알파벳을 임의로 10개 출력
		Random r=new Random();
		/*for(int i=1;i<=10;i++) {
			char c=(char)(r.nextInt(26)+'A');
			System.out.print(c+" ");
		}*/
		/*for(int i=1;i<=6;i++) {
			int lotto=r.nextInt(45)+1;
			System.out.print(lotto+" ");
		}*/
		int day=r.nextInt(7)+7;
		Set set=new HashSet();
		for(int i=1;i<=day;i++) {
			int rr=r.nextInt(31)+1;
			System.out.print(rr+" ");
			set.add(rr); // 중복 데이터 제거
		}
		
		System.out.println("\n===== 최종 결과 =====");
		for(Object obj:set) {
			System.out.print(obj+" ");
		}
	}
}
