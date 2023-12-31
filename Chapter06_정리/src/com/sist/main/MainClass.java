package com.sist.main;
// => 패키지(관련된 클래스들을 모아서 관리)
// 다른 패키지인 경우 => import를 이용해서 클래스를 불러서 사용
/*
 * 	import 패키지명.클래스명;
 * 	import 패키지.*;
 * 	import static 패키지명.클래스명.메소드명;
 * 	import static 패키지명.클래스명.*;
 * 
 * 	사용자 정의 패키지도 import를 이용해야한다
 */
import static java.lang.Math.random;
// Math(static), String(valueOf())
// static 메소드에서만 가능
import static java.lang.System.out;
import static java.lang.String.valueOf;
public class MainClass {
	public static void main(String[] args) {
		int a=(int)(random()*100)+1;
		System.out.println(a);
		out.println(valueOf(a));
	}
}
