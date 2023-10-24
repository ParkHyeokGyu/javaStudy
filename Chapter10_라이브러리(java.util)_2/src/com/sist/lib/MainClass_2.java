package com.sist.lib;
import java.text.*;
import java.util.*;
// 날짜 변환
public class MainClass_2 {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date); // 데이터베이스 호환(오라클)
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		/*
		 	년도 : y
		 	월 : M => MM(01)
		 	    1~12
		 	일 : d => 01,02...
		 	시간 : h => hh
		 	분 : m => mm
		 	초 : s => ss
		 */
		System.out.println(sdf.format(date));
	}
}
