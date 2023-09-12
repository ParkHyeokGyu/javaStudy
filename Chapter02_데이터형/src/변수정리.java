/*
 *	변수 => 한개의 데이터를 저장할 메모리 공간의 이름
 *
 *	변수 초기값
 *		자바에서 제공하는 데이터형(기본형)
 *		정수형
 *			byte(1byte) => -128~127 => 8bit(bit:0,1)
 *				파일읽기/파일쓰기/업로드/다운로드/네트워크 통신
 *			int(4byte) => 32bit => 정수의 default(가장 많이 사용)
 *			long(8byte) => 64bit => 빅데이터,금융권
 *				* int/long => 100L(l)
 *		실수형
 *			float(4byte) => 소수점이하 6자리 => 10.7F(f)
 *			double(8byte) => 소수점이하 15자리 => 10.5D(d)
 *				D는 생략 가능
 *		문자형
 *			char(2byte) => 0~65535(모든 나라의 언어 사용 가능)
 *				Unicode(한글은 한 글자당 2byte) => 문자 하나당 번호로 되어있다
 *				* char은 연산 처리가 되면 정수로 변경
 *					'A'+1 => 65+1=66
 *					10+10.5=20.5 => 자바에서는 항상 같은 데이터형만 연산이 가능
 *						10(int)이 10.0(double)으로 형변환 후 연산(큰 데이터형으로 변환)
 *					'A'+10.5 => 'A'=65 => 65.0+10.5=75.5
 *						'A'를 int로 변환 후 double로 변환
 *		논리형
 *			계산용(X) => true,false만 저장 가능
 *		참조형(사용자 정의) => 배열,클래스
 *
 *		데이터형 크기(boolean 제외)
 *			byte<char<int<long<float<double
 *			* 연산 처리 시, 결과값은 가장 큰 데이터형이다
 *				byte+int+long=long
 *				int+float+double=double
 *				byte+char=int
 *					* int이하 데이터형의 결과값은 int
 *
 *	식별자
 *		{같은 이름의 변수를 설정할 수 없다}
 *		문법사항
 *			알파벳이나 한글로 시작
 *			알파벳의 경우 대소문자를 구분
 *			숫자 사용 가능, 단 첫자에는 사용 불가
 *			변수의 글자수는 제한이 없다
 *			특수 문자 사용 가능(_, $)
 *			키워드 사용 불가
 *			공백 불가
 *
 *	변수 선언
 *		데이터형 변수명;
 *		
 *		문자형 변수 선언
 *			char 변수명
 *		정수형 변수 선언
 *			int(long) 변수명
 *		실수형 변수 선언
 *			double 변수명
 *		논리형 변수 선언
 *			boolean 변수명
 *
 *		같은 데이터형이 여러개일시
 *			int a,b,c,d
 *			double a,b,c,d
 *		
 *		변수는 사용전에 초기화
 *			int a=0;
 *			double d=0.0;
 *			char c=' ';
 *
 *	상수 선언
 *		한 번 지정한 값 => 변경할 수 없다
 *		상수의 구분
 *			변수명이 모두 대문자로 되어있다
 *			데이터형 앞에 final을 쓴다
 */
public class 변수정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		byte b1=10;
//		byte b2=20;
//		byte b3=b1+b2; 결과값은 int형
	}

}
