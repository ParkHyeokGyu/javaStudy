/*
	변수	=>	데이터형,식별자
			한개의 데이터를 저장하는 메모리 공간
			(저장된 영역은 변경해서 다시 저장이 가능)
			변수 기능(읽기(값 가지고 오기)/쓰기(메모리에 저장,수정))
			변수를 저장하기 위해서는 먼저 메모리 크기 결정
			---------------------------------
									ㅣ
								기본형(데이터형)
								참조형(사용자정의) : 배열,클래스
			기본형
				정수
					byte(1byte)
					int(4byte)
					long(8byte) => 100L(l)
					컴퓨터가 인식하는 모든 숫자는 int
				실수
					double(8byte) => 15자리
				문자
					char(2byte)
					----------- ASC(Single code,256까지) vs Unicode(Multi code,모든 국가의 언어 사용 가능)
				논리
					boolean(1byte) => true/false
			---------------------------------
			연산자
				단항연산자(++,--,!,(데이터형))
				이항연산자
					+,-,*,/,%
					==,!=,<,>,<=,>=
					&&,||
					=,+=,-=
				삼항연산자
					=?:
				자동형변환,강제형변환,+는 문자열결합
			---------------------------------
			프로그램 흐름 제어
				오류 발생 시 건너뛴다 => if
				반복수행 => for,while
				원하는 프로그램만 수행 => if,switch
				
				제어문
					조건문
						단일조건문
							if(조건문){ => 반드시 비교연산자,부정연산자,논리연산자만 사용 가능
								true일때 실행
							}
						선택조건문
							if(조건문){
								true일때 실행
							}else{
								false일때 실행
							}
						다중조건문 => 여러개의 조건문중에 한개만 수행
							if(조건문){
								true일때 실행 => 실행 후 종료
								false일때 다음 조건문 실행
							}else if(조건문){
								true일때 실행 => 실행 후 종료
								false일때 다음 조건문 실행
							}else if(조건문){
								true일때 실행 => 실행 후 종료
								false일때 다음 조건문 실행
							}else{ => 생략가능
								해당 조건이 없는 경우
							}
					선택문
						switch(정수,문자,문자열){
						case 값:
							처리문장
							break
						case 값:
							처리문장
							break
							...
						default:
							처리문장 => 생략가능,해당하는 값이 없을 경우
						}
					반복문
							 1	  2		4
						for(초기값;조건식;증감식){
							반복수행문장	3
						}
						1-2-3-4
						  2-3-4
						  false 종료
						 
						 초기값			1
						 while(조건문){	2
						 	반복수행문장	3
						 	증감식		4 => 2번 이동(false 종료)
						 }
 */
public class 제어문_반복문_3 {
	public static void main(String[] args) {
		
	}
}
