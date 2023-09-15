
public class 문제6 {
	public static void main(String[] args) {
		// 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성
		char c=' ';
		int a=(int)(Math.random()*2);
		if(a==0)
			c=(char)((Math.random()*26)+'A');
		if(a==1)
			c=(char)((Math.random()*26)+'a');
		
		System.out.println(c);
		
		if(c>='A'&&c<='Z')
			System.out.println("대문자");
		if(c>='a'&&c<='z')
			System.out.println("소문자");
	}
}
