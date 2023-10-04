import java.util.Arrays;

public class 문제3 {
	public static void main(String[] args) {
//		100 개의 난수(0~9)를 발생하여 빈도수를 구하는 프로그램을 작성하시오
		int[] arr=new int[100];
		int[] count=new int[10];
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10);
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i:arr) {
			count[i]++;
		}
		
		for(int i=0;i<count.length;i++) {
			System.out.printf("count[%d]=%d\n",i,count[i]);
		}
	}
}
