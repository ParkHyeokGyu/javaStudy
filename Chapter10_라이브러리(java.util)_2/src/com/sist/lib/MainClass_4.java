/*
 	332page
 	Date/Calendar
 	
 	날짜 관련(시간 포함)
 	---------------
 	Date => 기능이 없다(단지 날짜를 저장할 목적)
 	        오라클과의 호환성이 좋다
 	Calendar => Date에 없는 기능을 보완
 	            요일,마지막날 읽기
 	            달력(예약)
 	            월 저장 => 0부터
 	            요일 저장 => 1부터
 	
 	Date : 일반 클래스
 	       Data date=new Date();
 	Calendar : 추상 클래스
 	           Calendar cal=Calendar.getInstance();
 	           => getInstance(),newInstance()
 	              ---------------------------
 	              => 싱글톤
 */
package com.sist.lib;
import java.util.*;
class A{
	static A a;
	public static A newInstance() {
		if(a==null) {
			a=new A();
		}
		return a;
	}
}
public class MainClass_4 {
	public static void main(String[] args) {
		/*A a=new A();
		System.out.println("a"+a);
		A b=new A();
		System.out.println("b"+b);*/
		
		/*A a=A.newInstance();
		A b=A.newInstance();
		A c=A.newInstance();
		
		System.out.println("a"+a);
		System.out.println("b"+b);
		System.out.println("c"+c);*/
		
		Scanner scan=new Scanner(System.in);
		System.out.print("년 월 일 입력(2023 10 24):");
		int year=scan.nextInt();
		int month=scan.nextInt();
		int day=scan.nextInt();
		
		Calendar cal=Calendar.getInstance();
		// 낢짜 지정
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, day);
		String[] strWeek= {"","일","월","화","수","목","금","토"};
		int week=cal.get(Calendar.DAY_OF_WEEK);
		int lastday=cal.getActualMaximum(Calendar.DATE);
		System.out.println(year+"년도 "+month+"월 "+day+"일은 "+strWeek[week]+"요일입니다");
		System.out.println(month+"월의 마지막날은 "+lastday);
	}
}
