
public class 단항연산자_2 {
	public static void main(String[] args) {
		int a=65;
		double d=(double)a; // UpCasting => 자동형변환(데이터형 생략 가능) => double d=a;
		char c=(char)a; // DownCasting => 특수한 경우에는 생략 가능(변수가 아닌 실제값을 대입할 경우)
		
		int i=10;
		int j=55;
//		char c1=i; // 변수를 대입할 시에는 생략할 수 없다
//		char c1=i+j; // 연산 시 생략 불가
//		char c1=65; // 실제값을 대입할 경우 생략 가능
		
		System.out.println(a);
		System.out.println(d);
		System.out.println(c);
		
		c='0';
		System.out.println((int)c);
	}
}
