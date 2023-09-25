/*
 	문자 10개 저장
 	저장된 문자 출력
 	저장된 문자 거꾸로 출력
 */

import java.util.Arrays;

public class 배열_10 {
	public static void main(String[] args) {
		char[] alpha=new char[10];
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=(char)((Math.random()*26)+'A');
		}
		System.out.println("===== 정상 출력 =====");
//		System.out.println(Arrays.toString(alpha));
		for(char c:alpha) {
			System.out.print(c+" ");
		}
		System.out.println("\n===== 거꾸로 출력 =====");
		for(int i=alpha.length-1;i>=0;i--) {
			System.out.print(alpha[i]+" ");
		}
	}
}
