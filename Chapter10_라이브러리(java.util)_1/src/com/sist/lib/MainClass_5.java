/*
 	StringTokenizer
 */
package com.sist.lib;

import java.util.StringTokenizer;

public class MainClass_5 {
	public static void main(String[] args) {
		String data="red|green|blue|black|white|yellow|pink|cyan|magenta";
		StringTokenizer st=new StringTokenizer(data, "|");
		/*System.out.println("컬러 갯수:"+st.countTokens());
		String color1=st.nextToken();
		String color2=st.nextToken();
		String color3=st.nextToken();
		System.out.println(color1);
		System.out.println(color2);
		System.out.println(color3);*/
		// st.nextToken() => 갯수를 벗어나면 오류 발생
		while(st.hasMoreElements()) {
			System.out.println(st.nextToken());
		}
		/*
		 	hasMoreTokens
		 	1)cursor
		 	---------------
		 	-> before First
		 	---------------
		 	red => st.nextToken() => true
		 	---------------
		 	blue => st.nextToken() => true
		 	---------------
		 	green => st.nextToken() => true
		 	---------------
		 	-> after Last => st.nextToken() => false
		 	---------------
		 */
	}
}
