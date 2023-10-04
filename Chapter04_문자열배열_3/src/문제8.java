import java.util.Arrays;

public class 문제8 {
	public static void main(String[] args) {
//		char 배열을 생성하여, 알파벳 A~Z까지 대입 후, 출력하시오
		char[] alpha=new char[26];
		for(int i=0;i<alpha.length;i++) {
			alpha[i]=(char)('A'+i);
		}
		System.out.println(Arrays.toString(alpha));
		
//		위문제를 역순으로 출력하시오
		for(int i=alpha.length-1;i>=0;i--) {
			System.out.print(alpha[i]+"  ");
		}
	}
}
