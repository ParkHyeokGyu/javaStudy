import java.io.*;
import java.util.*;
/*
  	라이브러리
  		java.lang : Object,String,StringBuffer,Math,Wrapper
  		java.util : List,Set,Map
  		java.io
  		java.net
  		java.text
 */
public class 문자열_5 {
	// main전에 실행
	static String movie;
	static {
		try {
			// 파일 읽기
			FileReader fr=new FileReader("C:\\javaDev\\movie.txt");
			// 한글자씩 읽어온다 => 정수
			int i=0;
//			String data="";
			StringBuffer data=new StringBuffer();
			while((i=fr.read())!=-1) { // -1 : EOF(EndOfFile)
//				data+=(char)i;
				data.append((char)i);
			}
			movie=data.toString();
		}catch (Exception e) {
			
		}
	}
	public static void main(String[] args) throws Exception{
//		System.out.println(movie);
		String[] movieData=movie.split("\n");
//		System.out.println("영화 갯수:"+movieData.length);
		System.out.println("===== 영화 목록 =====");
		// 검색
		Scanner sc=new Scanner(System.in);
		// 송강호가 출연한 영화를 출력하시오
		// 1990에 개봉한 영화
		// 12세 이상 관람가
		System.out.print("등급 입력:");
//		String str=sc.next();
		int grade=sc.nextInt();
		for(String movie:movieData) {
			String[] detail=movie.split("\\|");
			if(detail[6].startsWith(String.valueOf(grade))) {
				System.out.println("순위:"+detail[0]);
				System.out.println("영화명:"+detail[1]);
				System.out.println("장르:"+detail[2]);
				System.out.println("출연:"+detail[4]);
				System.out.println("개봉일:"+detail[5]);
				System.out.println("등급:"+detail[6]);
				System.out.println("감독:"+detail[7]);
				System.out.println("---------------------------------------");
			}
		}
	}
}
