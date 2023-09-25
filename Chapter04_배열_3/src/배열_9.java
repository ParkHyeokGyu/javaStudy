/*
 	정수 10개 저장 => 3의 배수
 */

public class 배열_9 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		// 초기화
		// 배열에 값 저장,수정 => 일반 for
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		// 저장된 값 출력 => 실제 값만 읽어올때
		// 향상된 for => JDK1.5이상
		// 베열이나 컬렉션
		for(int i:arr) {
			System.out.print(i+" ");
		}
		System.out.println("\n==== 결과값 ====");
		for(int i:arr) {
			if(i%3==0)
				System.out.print(i+" ");
		}
	}
}
