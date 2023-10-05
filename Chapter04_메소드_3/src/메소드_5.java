// 5개 정수를 받아서 max,min

import java.util.Arrays;

public class 메소드_5 {
	static int[] userInput() {
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		return arr;
	}
	static int max(int[] arr) {
		int m=arr[0];
		for(int i:arr) {
			if(i>m)
				m=i;
		}
		return m;
	}
	static int min(int[] arr) {
		int m=arr[0];
		for(int i:arr) {
			if(i<m)
				m=i;
		}
		return m;
	}
	static void print(int max,int min) {
		System.out.println("max:"+max);
		System.out.println("min:"+min);
	}
	static void process() {
		int[] arr=userInput();
		System.out.println(Arrays.toString(arr));
		int max=max(arr);
		int min=min(arr);
		print(max, min);
	}
	public static void main(String[] args) {
		process();
	}
}
