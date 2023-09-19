// 식별자 적용 범위 => 변수/상수/메소드/클래스/인터페이스
/*
	자바에서 제공하는 제어문
		조건문
			선택문
				값이 1개 => 키보드,서버프로그램 => Application
				switch(정수,문자,문자열){
				case 값:
					실행문장
					break; => 실행문장 실행 후 switch문 종료(생략 가능)
				case 값:
				.....
				.....
				default:
					해당하는 값이 없는 경우
				}
			단일조건문
				if(조건문){ => true/false => 비교연산자/논리연산자/부정연산자만 사용 가능
					조건문이 true일 시 수행하는 문장
				}
				=> 웹)상세보기,로그인,ID찾기
				=> 독립적이다(if문마다 따로 수행)
				=> 조건에 해당되는 모든 내용을 출력하고 싶을때
			다중조건문
				if(조건문){
					조건문이 true일 시 수행하는 문장 => 문장 수행 후 if문 종료
					조건문이 false일 시 다음 조건문 수행
				}else if(조건문){
					조건문이 true일 시 수행하는 문장 => 문장 수행 후 if문 종료
					조건문이 false일 시 다음 조건문 수행
				}else if(조건문){
					조건문이 true일 시 수행하는 문장 => 문장 수행 후 if문 종료
					조건문이 false일 시 다음 조건문 수행
				}else{
					해당되는 조건이 없는 경우
				}
			선택조건문
				if(조건문){
					조건문이 true일 시 수행하는 문장
				}else{
					조건문이 false일 시 수행하는 문장
				}
		반복문
			for
				반복횟수가 있는 경우
				웹)목록출력,쿠키출력
				출력용(javascript)
				
					 ① →  ②	  ← ④
				for(초기값;조건식;증감식){
						 ----
						 true
						  ↓
						③	↗
					반복 실행문장
				}
				
				for(int i=1;i<=10;i++){
					반복 수행문장
				} => i=1~10
				
				초기값 : 조건식에 사용할 변수 선언 => 초기값은 한번만 사용 가능
				조건식 : 반복횟수 => 반복문을 중단할 지 여부 확인
					   false => 종료, true => 반복 수행
				증가식 : 조건식이 false가 되는 조건을 만든다
					   한개 증가 ++, 여러개 증가 +=
				
			while
				반복횟수가 없는 경우
				서버프로그램,게임,데이터베이스프로그램,파일읽기
				데이터관리용(java)
				while(조건문){
					반복 실행문장
				}
			do~while
				반복횟수가 없는 경우
				한번은 반드시 실행한다
				do{
					반복 실행문장
				}while(조건문)
		반복제어문
 */
public class 제어문_반복문1 {
	public static void main(String[] args) {
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("Hello For문");
		System.out.println("-------------------------");
		for(int i=0;i<10;i++)
			System.out.println("Hello For문");
		System.out.println("-------------------------");
		for(int i=1;i<=10;i++)
			System.out.println("Hello For문");
		System.out.println("-------------------------");
		for(int i=10;i>0;i--)
			System.out.println("Hello For문");
	}
}
