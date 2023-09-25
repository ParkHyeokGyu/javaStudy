// 1~100 => 10개 저장
// 1. 총합
// 2. 평균
// 3. 최대값
// 4. 최소값
// 5. 최대값의 위치
// 6. 최소값의 위치

import java.util.Arrays;

public class 배열_6 {
	public static void main(String[] args) {
//		int[] arr=new int[10];
		int[] arr= {10,20,10,30,40,50,30,10,30,50};
		
//		for(int i=0;i<arr.length;i++) {
//			arr[i]=(int)(Math.random()*100)+1;
//		}
		System.out.println("===== 저장된 값 =====");
		System.out.println(Arrays.toString(arr));
		
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println("총합:"+sum);
		System.out.printf("평균:%.2f\n",(sum/(double)arr.length));
		
		int max=0,min=100;
		for(int i:arr) {
			if(max<i) max=i;
			if(min>i) min=i;
		}
		System.out.println("최대값:"+max);
		System.out.println("최소값:"+min);
		
		int index=0;
		for(int i=0;i<arr.length;i++) {
			if(max==arr[i]) {
//				index=i;
//				break;
				System.out.println("max값 위치=>"+(i+1)+"번째 위치합니다");
			}
		}
//		System.out.println("max값 위치=>"+(index+1)+"번째 위치합니다");
		
		for(int i=0;i<arr.length;i++) {
			if(min==arr[i]) {
//				index=i;
//				break;
				System.out.println("min값 위치=>"+(i+1)+"번째 위치합니다");
			}
		}
//		System.out.println("min값 위치=>"+(index+1)+"번째 위치합니다");
	}
}
