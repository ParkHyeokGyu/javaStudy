/*
	반복문 => 중복을 제거
			-------- 메소드
		데이터 저장
			변수(한개만 저장 가능) => 묶어서 사용
			국어,영어,수학,총점,평균
			------------------ 배열 => 클래스
		명령문 => 묶어서 사용
		---------------- 메소드
						 ----------------- 클래스
	
	반복문의 종류
		for : 횟수가 지정된 경우
			  화면 출력(리스트목록 출력)
			  일반 for(2차 for)/향상된 for(배열,컬렉션)
		while : 횟수가 없는 경우
				무한루프(파일읽기,데이터베이스)
		do~while : 반드시 한번 이상을 수행(사용 빈도가 거의 없다)
		
	제어(다시 시작,종료)
		break : 반복문 중단
		continue : 특정부분 제외
	
	형식,동작(순서),패턴
	
				  ㅣ false 종료
				  ㅣ
			 1    2	   4┌----┐
		for(초기값;조건식;증감식){ ㅣ
				3 ㅣ true	 ㅣ
			반복 수행문장 -------┘
		}
 */
import java.io.FileReader;

public class 제어문_반복문1 {
	public static void main(String[] args) throws Exception {
//		String s="ABCDEFGHIJKLMNOP";
//		String[] alpha=s.split("");
//		for(int i=0;i<alpha.length;i++)
//			System.out.print(alpha[i]);
//		System.out.println();
//		for(String ss:alpha)
//			System.out.print(ss);

		FileReader fr=new FileReader("C:\\Users\\parkh\\git\\java-study\\Chapter03_제어문(반복문)_1\\src\\제어문_반복문1.java");
		int i=0;
		while((i=fr.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
