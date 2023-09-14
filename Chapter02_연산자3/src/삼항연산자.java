// if~else
// (조건)?값1:값2
// 조건 true : 값1, false : 값2
public class 삼항연산자 {
	public static void main(String[] args) {
		int a=(int)(Math.random()*100)+1;
		// 1)(Math.random()*100) 2)(int) 3)+1
		// Random r=new Random(); r.next(100);과 동일
		// * Math를 클래스를 사용하는데 import없이 사욜할 수 있는 이유
		//   java.lang.*은 자동으로 import해준다(String,System,Math...)
		System.out.println(a%2==0?a+"는(은) 짝수":a+"는(은) 홀수");
		
		char ch='a';
		char c=(char)((Math.random()*26)+'A');
		int s=(int)(Math.random()*2);
		ch=s==0?c:(char)(c+('a'-'A'));
		System.out.println(ch>='A'&&ch<='Z'?ch+"는(은) 대문자":ch+"는(은) 소문자");
		
	}
}
