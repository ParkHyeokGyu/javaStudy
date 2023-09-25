/*
	응용
	정수를 1개 입력 받아 이진법 출력(16bit)
	
	10
	0000 0000 0000 1010
 */
import java.util.Scanner;

public class 배열_2 {
	public static void main(String[] args) {
		int[] binary=new int[16];
		int index=binary.length-1; // 마지막 인덱스 번호
		
		// 역순으로 값을 배친
		Scanner sc=new Scanner(System.in);
		System.out.print("0~32767사이의 정수 입력:");
		int num=sc.nextInt();
		System.out.println("===== lib =====");
		System.out.println(Integer.toBinaryString(num));
		
		while(true) {
			binary[index]=num%2;
			num=num/2;
			if(num==0) break;
			index--;
		}
		
		// 출력
		for(int i=0;i<binary.length;i++) {
			if(i%4==0&&i!=0)
				System.out.print(" ");
			System.out.print(binary[i]);
		}
	}
}
