package com.sist.music;

import java.util.Scanner;

public class MusicMain {
	public static void main(String[] args) {
//		System.out.println("<html>");
//		System.out.println("<body>");
//		for(int i=0;i<10;i++) {
//			System.out.println(i);
//		}
//		System.out.println("</body>");
//		System.out.println("</html>");
		Scanner sc=new Scanner(System.in);
		System.out.print("선택(Genie(1),Melon(2)):");
		int select=sc.nextInt();
		// 상위 클래스로 => 하위 클래스를 제어
		GenieMusicSystem ms=null;
		if(select==1) {
			ms=new GenieMusicSystem();
		}else {
			ms=new MelonMusicSystem();
		}

		// 1. 전체 목록 읽기
//		System.out.println(ms.title);
		// GenieMusicSystem클래스가 상위 클래스이므로 title 멤버변수는 GenieMusicSystem의 title변수를 사용한다 
		Music[] m=ms.musicAllData();
		for(Music mm:m) {
			System.out.println(mm.getMno()+"."+mm.getTitle());
		}
		
		// 2. 검색
		System.out.println("============================================");
		System.out.print("가수명 입력:");
		String singer=sc.next();
		Music[] findData=ms.musicSingerFindData(singer);
		for(Music mm:findData) {
			System.out.println(mm.getTitle()+"("+mm.getSinger()+")");
		}
	}
}
