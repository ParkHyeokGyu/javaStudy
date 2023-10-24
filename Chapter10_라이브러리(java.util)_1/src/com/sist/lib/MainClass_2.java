/*
 	라이브러리 : 클래스명
 	          => 기능(메소드)
 	             --------- 리턴형/매개변수
 	                       신뢰성이 뛰어나다 => 에러가 없다
 	                       표준화
 	                       자바의 80%는 라이브러리,20%는 조립                       
 	자바
 	java.lang	Object,String,StringBuffer,Wrapper,Math,System
 	java.util	Random
 				------ 예약일,예약시간
 				Date/Calendar
 				StringTokenizer
 				List/Set/Map
 	java.text	SimpleDataFormat : 날짜 포맷
 				DecimalFormat : 숫자 포맷
 				MessageFormat
 				ChoiceFormat
 	java.io
 	java.net
 	java.sql
 	
 	웹
 	javax.xml
 	javax.http.servlet
 	
 	데이터베이스
 	org.springframework
 	org.mybatis
 	org.jpa
 	
 */
package com.sist.lib;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainClass_2 {
	public static void main(String[] args) {
		Date date=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		System.out.println(date); // Tue Oct 24 12:23:00 KST 2023
		System.out.println(sdf.format(date)); // 2023-10-24
		
		int price=1000000;
		DecimalFormat df=new DecimalFormat("##,###");
		System.out.println(price); // 1000000
		System.out.println(df.format(price)); // 1,000,000
		
		String name="홍길동";
		String sex="남자";
		int age=20;
		String addr="서울";
		String tel="010-1111-1111";
		// 오라클 전송
		String sql="INSERT INTO member VALUES('"
				+name+"','"+sex+"',"+age+",'"+addr+"','"+tel+"')";
		System.out.println(sql); // INSERT INTO member VALUES('홍길동','남자',20,'서울','010-1111-1111')
		// INSERT INTO member VALUES(?,?,?,?,?) => MessageFormat
	}
}
