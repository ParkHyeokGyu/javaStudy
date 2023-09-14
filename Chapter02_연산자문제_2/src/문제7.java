import java.util.Scanner;

public class 문제7 {
	public static void main(String[] args) {
		// 대문자를 소뮨자로
		Scanner sc=new Scanner(System.in);
		System.out.print("문자 입력:");
		char ch=sc.next().charAt(0);
		char lowerCase=ch>='A'&&ch<='Z'?(char)(ch+32):(char)(ch-32);
		System.out.println("ch:"+ch);
		System.out.println("lowerCase:"+lowerCase);
	}
}
