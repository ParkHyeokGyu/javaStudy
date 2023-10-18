package com.sist.main2;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class SiteMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		// 제네릭을 명시해주면 형변환이 필요없다 => 리턴형이 제네릭에 명시된대로 바꿔준다
		Map<String,Controller> map=new HashMap<String,Controller>();
		map.put("c1", new MemberController());
		map.put("c2", new BoardController());
		map.put("c3", new MovieController());
		map.put("c4", new MusicController());
		map.put("c5", new SeoulController());
		while(true) {
			System.out.println("===== 메뉴 =====");
			System.out.println("1.회원 관리");
			System.out.println("2.게시판");
			System.out.println("3.영화");
			System.out.println("4.음악");
			System.out.println("5.서울 여행");
			System.out.println("6.종료");
			System.out.println("===============");
			System.out.print("메뉴 선택:");
			int menu=scan.nextInt();
			if(menu==6) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			Controller c=map.get("c"+menu);
			c.execute();
			
//			if(menu==1) {
//				MemberController mc=new MemberController();
//				mc.execute();
//			}else if(menu==2) {
//				BoardController bc=new BoardController();
//				bc.execute();
//			}else if(menu==3) {
//				MovieController mc=new MovieController();
//				mc.execute();
//			}else if(menu==4) {
//				MusicController mc=new MusicController();
//				mc.execute();
//			}else if(menu==5) {
//				SeoulController sc=new SeoulController();
//				sc.execute();
//			}else if(menu==6) {
//				System.out.println("프로그램을 종료합니다");
//				break;
//			}
		}
	}
}
