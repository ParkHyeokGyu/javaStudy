import java.util.Scanner;

public class 문자열5 {
	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.print("정수 입력:");
//		int num=sc.nextInt();
//		System.out.println(Integer.toBinaryString(num));
		
		String s="AaaA";
		String answer="";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch>='A'&&ch<='Z') {
				answer+=String.valueOf(ch).toLowerCase();
			}else {
				answer+=String.valueOf(ch).toUpperCase();
			}
		}
		System.out.println(answer);
	}
}
