/*
 *	변수 : 저장공간
 *		자바 저장 공간을 설정(자료형,데이터형)
 *		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *		정수
 *			byte(8bit) => 0,1을 8개 채워 숫자 하나를 저장(-128~127)
 *			int(32bit) => default, 컴퓨터에서 모든 숫자는 int로 인식(-21억4천~21억4천)
 *			long(64bit) => 금융권,빅데이터
 *		실수
 *			double(64bit) => 소수점 15자리 이상
 *		문자
 *			char(16bit) => 0~65535(각 문자의 번호)
 *						   'A'를 저장 시 => 65로 변환하여 저장
 *		논리
 *			boolean(8bit) => true,false
 *	ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
 *	데이터 저장 => 사용자 요청에 맞게 가공 => 사용자 화면에 출력
 *	
 *	데이터형의 크기
 *	byte < char < int < long < float < double
 *	
 *	자바에서 제공하는 연산자
 *		단항연산자
			증감연산자(++,--) : 한개 증가,감소
				++a : a값을 1증가 후 다른 연산을 수행
					int a=10;
					int b=++a;
					      ---(1)증가
					    -----(2)대입 => b=11
				a++ : 먼저 다른 연산 후 1증가
					int a=10;
					int b=a++;
					    -----(1)대입
					      ---(2)증가 => b=10
				--a : a값을 1감소 후 다른 연산을 수행
					int a=10;
					int b=--a;
					      ---(1)감소
					    -----(2)대입 => b=9
				a-- : 먼저 다른 연산 후 1감소
					int a=10;
					int b=a++;
					    -----(1)대입
					      ---(2)감소 => b=10
					      
			부정연산자(!) : boolean에서만 사용가능
				true => false, false => true
				
				boolean bCheck=false;
				bCheck=!bCheck; => bCheck=true;
				
			형변환연산자(type) : 강제형변환
				객체지향 형변환(클래스)
				숫자관련만(정수,실수,문자)
				
				UpCasting : 데이터형을 크게
					int => double
					char => int
					
					자동형변환(자바 내부적으로 변환)
						연산은 같은 데이터형끼리만 가능
							int+double(X) => (double)int+double
							int+char+double => (double)int+(double)char+double
						
						int이하의 데이터형은 연산 시 int형으로 변경
							char+byte=int
							char+char=int
							byte+byte=int
							
						int='A'; => 65
						double d=100; => 100.0
				DownCasting : 데이터형을 작게
					char c=(char)65; => 'A'
					int i=(int)100.0 => 100
		
 *		이항연산자
 *			산술연산자(+,-,*,/,%)
				+ : 두개 값의 합(1+2=3), 문자열은 결합("7"+"5"="75")
				/ : 정수/정수=정수, 정수/실수=실수, 0으로 나눌 수 없다
				% : 연산 시 왼쪽 피연산자의 부호를 가진다
					윤년구하기,숫자 자르기,배수 구하기
					
			비교연산자(==,!=,<,>,<=,>=) : 결과값은 true,false
				자바는 Unicode를 사용(모근 국가의 언어 사용이 가능)
				'A',"A",'홍'(한글은 1글자당 2byte)
				왼쪽 피연산자를 기준으로 한다
				== : 같다
				!= : 같지 않다
				< : 작다
				> : 크다
				<= : 작거나 같다
				>= : 크거나 같다
				날짜,문자열은 비교할 수 없다(자체 메소드로 가능)
				
			논리연산자(&&,||)
				&& : 직렬연산자(조건2개가 true일 경우 true)
				|| : 병렬연산자(조건 2개중에 1개 이상이 true일 경우 true)
				
			대입연산자(=,+=,-=)
				일반대입
				+= : a+=1 => a=a+1
				-= : a-=1 => a=a-1
 *		삼항연산자
			(조건)?값1:값2
			true : 값1, false : 값2
 */
// 정수 3개 입력을 받아서 총점,평균을 구하라

import java.util.Scanner; // Scanner클래스를 가지고 온다

public class 자바연산자 {
	public static void main(String[] args) {
		// 선언(메모리에 값을 저장할 수 있는 공간만 만듦)
		int kor,eng,math;
		int total;
		double avg;
		// 메모리 공간에 값을 저장 => 변수의 초기화
		Scanner scan=new Scanner(System.in); // new => 메모리에 클래스를 저장할 때
		//						----------- 키보드 입력값
		System.out.print("국어,영어,수학 점수 입력(90 90 90):");
		kor=scan.nextInt();
		eng=scan.nextInt();
		math=scan.nextInt();
		// 연산처리
		total=kor+eng+math;
		avg=total/3.0;
		// 결과출력
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
		System.out.print(avg>=90&&avg<=100?"A학점":"");
		System.out.print(avg>=80&&avg<90?"B학점":"");
		System.out.print(avg>=70&&avg<80?"C학점":"");
		System.out.print(avg>=60&&avg<70?"D학점":"");
		System.out.print(avg<60?"F학점":"");
	}
}
