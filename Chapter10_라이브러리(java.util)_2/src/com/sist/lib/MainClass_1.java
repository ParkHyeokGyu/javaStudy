// Format
/*
 	DecimalFormat : 숫자 포맷(천 단위 ,)
 	ChoiceFormat : switch
 	MessageFormat : 출력 형식
 	SimpleDateFormat : 날짜 출력 형식
 	------------------------------- java.text
 */
package com.sist.lib;
import java.text.*;
public class MainClass_1 {
	public static void main(String[] args) {
		int[] won= {1000,20300,350000,4500000,67000000};
		DecimalFormat df=new DecimalFormat("#,###");
		for(int i:won) {
			System.out.println(df.format(i)+"원");
		}
		
		double[] limit= {59,60,70,80,90};
		// ~59 60~69 70~79 80~89 90~
		String[] grade= {"F","D","C","B","A"};
		int[] score= {100,90,85,90,80,72,60,58};
		ChoiceFormat cf=new ChoiceFormat(limit, grade);
		for(int s:score) {
			System.out.println(s+":"+cf.format(s));
		}
	}
}
