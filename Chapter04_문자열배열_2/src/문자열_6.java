import java.io.*;
import java.util.*;

public class 문자열_6 {
	static String seoulData="";
	static {
		try {
			FileReader fr=new FileReader("C:\\javaDev\\seoul_location.txt");
			int i=0;
			StringBuffer data=new StringBuffer();
			while((i=fr.read())!=-1) {
				data.append((char)i);
			}
			fr.close();
			seoulData=data.toString();
		} catch (Exception e) {
			
		}
	}
	public static void main(String[] args) {
//		System.out.println(seoulData);
		// 1. 페이징 기법
		String[] seoul=seoulData.split("\n");
		Scanner sc=new Scanner(System.in);
		int curpage=1;
		int totalpage=(int)(Math.ceil(seoul.length/10.0)); // 올림함수
//		System.out.println("총페이지:"+totalpage);
		while(true) {
			System.out.print("페이지 선택(1~"+totalpage+"):");
			curpage=sc.nextInt();
			if(curpage<1||curpage>totalpage) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			
			final int ROW=10;
			int j=0; // 10개씩 나눠주는 변수
			int pagecnt=(curpage*ROW)-ROW; // for문의 시작위치를 잡아준다 (출력)
			
			/*
			 		1page 0~9
			 		2page 10~19
			 		3page 20~29
			 */
			
			for(int i=0;i<seoul.length;i++) {
				String[] ss=seoul[i].split("\\|");
				if(j<ROW&&i>=pagecnt) {
					System.out.println(ss[0]+"."+ss[1]);
					j++;
				}
			}
		}
	}
}
