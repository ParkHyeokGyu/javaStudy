// 시저스 암호화 => AES
import java.util.Scanner;
public class 메소드_3 {
	// 매개변수 전송법
	// 입력값 => 리턴형(O), 매개변수(X)
	static String userInput() {
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열 입력:");
		return sc.nextLine();
//		return 메소드_2.userInput();
	}
	// 암호화 => 리턴형(O), 매개변수(O)
	static String encode(String msg) {
		String result="";
		for(int i=0;i<msg.length();i++) {
			result+=(char)(msg.charAt(i)+3);
		}
		return result;
	}
	// 복호화 => 리턴형(X), 매개변수(O)
	static void decode(String en) {
		for(int i=0;i<en.length();i++) {
			char c=en.charAt(i);
			System.out.print((char)(c-3));
		}
	}
	public static void main(String[] args) {
		String msg=userInput();
		System.out.println("msg:"+msg);
		String en=encode(msg);
		System.out.println("암호화된 문자:"+en);
		decode(en);
	}
}
