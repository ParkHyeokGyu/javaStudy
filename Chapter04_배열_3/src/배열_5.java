/*
 	선택 정렬 / 버블 정렬
 	-------
 	
 	30	10	50	40	20		ASC(올림차순:10 20 30 40 50) / DESC(내림차순:50 40 30 20 10)
 	--	--
 	10	30	50	40	20
 	--		--
 	10	30	50	40	20
 	--			--
 	10	30	50	40	20
 	--				--
 	------------------ 1round
 	10	30	50	40	20
 		--	--
 		30	50	40	20
 		--		--
 		30	50	40	20
 		--			--
 		20	50	40	30
 	------------------ 2round
 	10	20	50	40	30
 			--	--
 			40	50	30
 			--		--
 			30	50	40
 	------------------ 3round
 	10	20	30	50	40
 				--	--
 				40	50
 	------------------ 4round
 	10	20	30	40	50
 					-- => arr.length-1(마지막은 자신끼리 비교)
 	
 	i	j	=> i+j=4 => j=4-i
 	0	4
 	1	3
 	2	2
 	3	1
 	4
 */
import java.util.*;

public class 배열_5 {
	public static void main(String[] args) {
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println("===== 정렬전 =====");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("===== 정렬후(ASC) =====");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("===== 정렬후(DESC) =====");
		System.out.println(Arrays.toString(arr));
		
		System.out.println("===== API =====");
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
}
