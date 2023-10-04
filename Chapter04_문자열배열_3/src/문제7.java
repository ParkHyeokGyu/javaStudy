import java.util.Arrays;
import java.util.Scanner;

public class 문제7 {
	public static void main(String[] args) {
//		5개의 난수를 배열에 저장한 후에 인덱스번호 두개를 받아서 값을 교환하는 프로그램을 작성하시오
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		System.out.print("첫번째 인덱스 번호 입력:");
		int index1=sc.nextInt();
		System.out.print("두번째 인덱스 번호 입력:");
		int index2=sc.nextInt();
		int temp=arr[index1];
		arr[index1]=arr[index2];
		arr[index2]=temp;
		System.out.println(Arrays.toString(arr));
	}
}
