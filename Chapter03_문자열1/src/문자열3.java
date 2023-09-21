import java.util.Scanner;
// 문자열 입력을 받아서 A,a가 몇 개인지 확인
public class 문자열3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 입력:");
		String data=sc.next();
		
		int count=0; // A||a
		for(int i=0;i<data.length();i++) {
			if(data.charAt(i)=='a'||data.charAt(i)=='A') {
				count++;
			}
		}
		System.out.println(count);
	}
}
