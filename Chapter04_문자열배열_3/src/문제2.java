import java.util.Arrays;

public class 문제2 {
	public static void main(String[] args) {
//		10개의 임의의 정수를 받아서 최대값,최소값(난수)  구하는 프로그램 작성
		int[] arr=new int[10];
		int max=0;
		int min=100;
		
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i:arr) {
			if(i>max) max=i;
			if(i<min) min=i;
		}
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}
}
