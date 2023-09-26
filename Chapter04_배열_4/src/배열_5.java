/*
 	40	30	10	50	20
 	--	--
 	30	40
 		--	--
 		10	40
 			--	--
 			40	50
 				--	--
 				20	50
 	------------------
 	40	30	10	20	50
 	--	--
 	30	40
 		--	--
 		10	40
 			--	--
 			20	40
 	------------------
 	30	10	20	40	50
 	--	--
 	10	30
 		--	--
 		20	30
 	------------------
 	10	20	30	40	50
 	--	--
 	10	20
 	------------------
 	10	20	30	40	50
 			.
 			.
 			.
 	
 	i	j	=>	i+j=4	=>	j=4(4=length-1)-i
 	0	4	
 	1	3
 	2	2
 	3	1
 	
 	
 */

import java.util.Arrays;

public class 배열_5 {
	public static void main(String[] args) {
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
}
