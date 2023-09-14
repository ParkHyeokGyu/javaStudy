
public class 문제7 {
	public static void main(String[] args) {
		// 대문자를 소뮨자로
		char ch='a';
		char lowerCase=ch>='A'&&ch<='Z'?(char)(ch+32):(char)(ch-32);
		System.out.println("ch:"+ch);
		System.out.println("lowerCase:"+lowerCase);
	}
}
