/*
	단일조건문은 true일 경우 처리,false일 경우 건너뛴다
	선택조건문은 true일 경우 처리,false일 경우 처리를 나눠 작업
		ID중복체크
			중복일 경우 => 이미 사용중인 ID
			중복이 아닐 경우 => 사용이 가능한 ID
			
	형식
		if(조건문){
			조건문이 true일 경우
		}else{
			조건문이 false일 경우
		}
		=> 삼항연산자
		
		짝수/홀수, 대문자/소문자, 웹(페이지처리)
 */
public class 제어문_조건문2 {
	public static void main(String[] args) {
		char c='a';
		// 대문자/소문자
//		if(c>='A'&&c<='Z')
//			System.out.println(c+"는(은) 대문자입니다");
//		if(c>='a'&&c<='z')
//			System.out.println(c+"는(은) 소문자입니다");
		if(c>='A'&&c<='Z')
			System.out.println(c+"는(은) 대문자입니다");
		else
			System.out.println(c+"는(은) 소문자입니다");
		// else 문장은 독립적으로 사용 할 수 없다 => if문에 종속
		// else 문장은 바로 위에 있는 if문만 지원한다
		/*
		 	if(){
		 	
		 	}
		 	--------------
		 	if(){
		 	
		 	}
		 	--------------
		 	if(){
		 	
		 	}
		 	else{
		 	
		 	}
		 	--------------
		 */
		int a=10;
		if(a%2==0)
			System.out.println(a+"는(은) 짝수입니다");
		else
			System.out.println(a+"는(은) 홀수입니다");
	}
}
