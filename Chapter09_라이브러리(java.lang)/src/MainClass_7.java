/*
 	Math : 수학
 	=> Math.random() => java.util.Random()
 			|			Random r=new Random()
 			|			r.nextInt(100) => 0~99
 			| Math => final 클래스 => 변경이 불가능
 					  모든 개발자가 있는 그대로 사용
 					  모든 메소드가 static이다
 					  => Math는 객체 생성을 하지 않는다
 	=> Math.ceil() : 웹에서 가장 많이 사용
 					 ---------------
 					  | 페이징 => 무한 스크롤
 					    ---- 총페이지 구할때
 	   => 올림 메소드
 	      172/10.0 => 17.2 => 18(총페이지) => 2(마지막 출력 갯수)
 	      => 배열보다는 컬렉션
 	   => Math의 리턴형은 대부분 double형
 	   
 	System
 	=> System.out.println() => 웹 => 확인
 	   정상적으로 사용자의 값이 전송되었는지
 	   순서 => 동작
 	   에러 => 처리
 	=> System.gc() : 메모리 해제 요청,웹서버(톰캣)
 	=> System.exit() : 프로그램 종료 => 윈도우
 	
 	***String/StringBuffer/Wrapper(Integer,Long,Double,Byte,Boolean...)
 	데이터형 => 문자열로 변환
 	문자열 => 다른 데이터형으로 변환
 	------------------------
 	=> 2진법,8진법,16진법
 	   -------------- 10진법 => Wrapper
 	
 	
 */
import java.util.*;
public class MainClass_7 {
	public static void main(String[] args) {
		/*Scanner scan=new Scanner(System.in);
		System.out.print("총 갯수:");
		int total=scan.nextInt();
		
		// 10개씩 나눠서 출력 => 총페이지
		// 이전 1/10 다음
		int page=(int)Math.ceil(total/10.0);
		// SELECT CEIL(COUNT(*)/10.0) FROM recipe;
		System.out.println("총 페이지:"+page);*/
		
		int a=10;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toOctalString(a));
		System.out.println(Integer.toHexString(a));
	}
}
