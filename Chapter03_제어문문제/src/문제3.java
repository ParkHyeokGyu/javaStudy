import java.util.Scanner;

public class 문제3 {
	public static void main(String[] args) {
//		3) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 입력:");
//		int num=sc.nextInt();
//		if(num<0)
//			num=-num;
//		System.out.println(num);
		System.out.println(Math.abs(sc.nextInt()));
	}
}
