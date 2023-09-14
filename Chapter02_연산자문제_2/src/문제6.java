import java.util.Scanner;

public class 문제6 {
	public static void main(String[] args) {
		// 문자형 변수 ch가 영문자이거나 숫자일때 변수 b의 값이 true
		Scanner sc=new Scanner(System.in);
		System.out.print("문자 입력:");
		char ch=sc.next().charAt(0);
		System.out.println("ch:"+ch);
		boolean b=((ch>='A'&&ch<='Z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9')?true:false);
		System.out.println(b);
//		char ch='a';
//		boolean b=ch>='A'&&ch<='Z'?true:(ch>='a'&&ch<='z'?true:false);
//		System.out.println(b);
	}
}
