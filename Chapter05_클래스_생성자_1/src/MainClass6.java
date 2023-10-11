class B{
	int a=10;
	// 생성자는 리턴형이 없다
	// 리턴형이 붙으면 메소드이다
	void B(){
		System.out.println("B() 디폴트 생성자 호출");
	}
	/*
	 		생성자 => 초기화가 필요(명시적인 초기화가 불가능할때)
	 				제어문이나 파일읽기같은 구현이 필요할때
	 				시작과 동시에 처리 => 생성자는 가장 먼저 호출된다
	 					자동 로그인
						윈도우 화면 설정
						서버 연결
						데이터베이스 연결
	 */
}
public class MainClass6 {
	public static void main(String[] args) {
//		new B();
//		new B().a=100;
//		System.out.println(new B().a);
		B b=new B();
		b.B();
//		b.a=100;
//		System.out.println(b.a);
	}
}
