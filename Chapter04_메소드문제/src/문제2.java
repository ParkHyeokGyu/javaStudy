/*
 		메소드 사용시에 => 호출
 		main()은 컴파일러에 의해 자동 호출 => Callback
 		
 		메소드
 			Callback => main => 자동호출되는 메소드
 			사용자 정의 : 프로그래모가 직접 제작
 			라이브러리 : 이미 제작된 메소드 => 만들지 못하는 프로그램
 				자바에서 제공
 				외부업체에서 지원 (Jsoup,Spring) => mvnrepository.com
 				CBD => 조립식 프로그램
 				
 			조립할때,재사용,유지보수가 편리하게 만든다
 			재사용
 				메소드를 불러온다
 				------------
 				int aaa()		=> int a=aaa();
 				double bbb()	=> double b=bbb();
 				void ccc()		=> ccc();
 				boolean ddd()	=> boolean d=ddd();
 				-----------------------------------
 				class A{
 					int aaa(){
 						
 					}
 				}
 				class B{
 					main(){
 						aaa(); => 호출불가
 						A.aaa();
 					}
 				}
 */
public class 문제2 {
//	1~10까지 출력하는 메소드 구현
	static void a() {
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
	}
//	1~10까지 합을 구하는 메소드 구현
	static int b() {
		int sum=0;
		for(int i=1;i<=10;i++) {
			sum+=i;
		}
		return sum;
	}
//	1~n까지 합을 구하는 메소드 구현
	static int c(int n) {
		int sum=0;
		for(int i=1;i<=n;i++) {
			sum+=i;
		}
		return sum;
	}
//	두 정수를 나눗셈 결과를 구해주는 메소드 구현
	static String d(int a,int b) {
		String result="";
		if(b==0) {
			result="0으로 나눌 수 없습니다";
		}else {
			result+=a/(double)b;
		}
		return result;
	}
//	문자열의 소문자를 대문자로 바꿔주는 메소드 구현
	static String e(String msg) {
		String result=msg.toUpperCase();
		return result;
	}
//	문자열을 거꾸로 출력하는 메소드 구현
	static void f(String msg) {
		for(int i=msg.length()-1;i>=0;i--) {
			System.out.print(msg.charAt(i));
		}
	}
	public static void main(String[] args) {
		a();
		System.out.println();
		
		int b=b();
		System.out.println(b);
		
		int c=c(10);
		System.out.println(c);
		
		String d=d(10, 8);
		System.out.println(d);
		
		String msg=e("AbCDeeee");
		System.out.println(msg);
		
		f(msg);
	}
}
