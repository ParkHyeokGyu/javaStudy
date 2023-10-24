/*
 	Random : 난수 발생
 	=> nextInt(int bound) => 0~bound-1
 	
 	326page
 	Arrays : 배열과 관련된 기능 제어
 	1)sort() => 정렬
 	  => ORDER BY no DESC(ASC) => 시간이 오래 걸린다
 	     => index를 이용하여 최적화한다
 	2)copyOf() => 다른 배열에서 복사
 	3)toString() => 배열값 출력
 	
 	328page
 	StringTokenizer
 	=> 문자열 분리
 	=> 네트워크/빅데이터/웹
 	=> 기능
 	   1)countTokens() : 분리된 데이터의 갯수
 	   2)nextToken() : 실제 분리된 데이터 읽기
 	   3)hasMoreTokens() : 분리된 수만큼 루프 수행
 */
package com.sist.lib;
import java.util.*;
public class MainClass_4 {
	public static void main(String[] args) {
		int[] arr=new int[7];
		Random r=new Random();
		for(int i=0;i<arr.length;i++) {
			arr[i]=r.nextInt(100)+1;
		}
		System.out.println("===== 정렬전 =====");
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr);
		System.out.println("===== 정렬후 =====");
		System.out.println(Arrays.toString(arr));
		
		// 가변배열
		// 작은 배열
		int[] subArr=Arrays.copyOf(arr, 3);
		System.out.println(Arrays.toString(subArr));
		// 큰 배열
		int[] subArr2=Arrays.copyOf(arr, 10);
		System.out.println(Arrays.toString(subArr2));
		// 배열의 나머지 영역은 초기값으로 설정
		/*
		 	int		0
		 	double	0.0
		 	class 	null
		 	boolean	false
		 */
	}
}
