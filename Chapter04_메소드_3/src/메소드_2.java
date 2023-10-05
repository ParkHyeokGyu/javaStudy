/*
 		정수 입력
 		0~32767 => 16bit
 		2진법을 출력하는 메소드
 		
 		입력,2진법,출력 => 조립
 */
import java.util.Scanner;

public class 메소드_2 {
	// 입력
	static int userIntput() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력(0~32767):");
		return sc.nextInt();
	}
	// 2진법
	static int[] binary(int n) {
		int[] binary=new int[16];
		int index=15;
		while(true) {
			binary[index]=n%2;
			n/=2;
			if(n==0) break;
			index--;
		}
		return binary;
	}
	// 출력
	static void print(int[] arr) {
//		boolean bCheck=false;
		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==0 && !bCheck) continue;
//			else bCheck=true;
			if(i%4==0&&i!=0)
				System.out.print(" ");
			System.out.print(arr[i]);
		}
//		for(int i:arr) {
//			if(i==0 && !bCheck) continue;
//			else bCheck=true;
//			System.out.print(i+" ");
//		}
	}
	static void process() {
		int n=userIntput();
		int[] binary=binary(n);
		print(binary);
	}
	public static void main(String[] args) {
		process();
	}
}
