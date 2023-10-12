/*
 		접근지정어 : 사용범위 지정
 					자신의 클래스에서만 사용		같은 폴더에서만 사용			같은 폴더			모든 클래스에서 접근 가능
 																(상속이 있는 경우
 																다른 폴더 접근 가능)
 		----------------------------------------------------------------------------------------------
 		private				O						X					X					X
 		default				O						O					X					X
 		protected			O						O					O					X
 		public				O						O					O					O
 		
 		사용처
 		클래스,멤버변수,멤버메소드 => 지역변수에는 접근지정어가 없다
 		
 		클래스
 		[접근지정어] class ClassName => 접근지정어 default값 : public
 		
 		멤버변수
 		[접근지정어] 데이터형 변수명 => 데이터 보호(은닉화) : private(시큐어 코딩)
 		
 		멤버메소드
 		[접근지정어] 리턴형 메소드명(매개변수목록) => 다른 클래스와 통신 : public
 		
 		생성자
 		[접근지정어] 클래스명() => public
 		----------------------------------------------------------
 		클래스 저장위치 설정 => 폴더안에 저장(패키지)
 		
 */
public class MainClass {
	public MainClass() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		
	}
}
