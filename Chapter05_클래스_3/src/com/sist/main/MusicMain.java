package com.sist.main;
import java.util.*; // Scanner
import java.io.*; // 입출력(파일)
// 일반 데이터형
class Music{
	int rank;
	String title;
	String singer;
	String album;
	String key;
}
// 데이터형을 모아서 관리
class MusicData{
	// 사용자 정의 데이터형도 기본형처럼 사용이 가능하다
	Music[] musics=new Music[49];
	// 초기화
	// 1. 초기화 블록 2. 생성자
	// {구현} => 초기화 블록 => 자동으로 호출
	{
		// 예외처리 => 에러를 미리 방지할 때 => check,uncheck
		try {
			FileReader fr=
					new FileReader("C:\\javaDev\\genie.txt");
			String data="";
			int i=0; // 1굴자 => 정수형 => char
			while((i=fr.read())!=-1) {
				data+=(char)i;
			}
			fr.close();
//			System.out.println(data);
			String[] datas=data.split("\n");
			i=0;
			for(String s:datas) {
				String[] ss=s.split("\\|");
				musics[i]=new Music();
				if(ss[0].equals("47")) continue;
				try {
					musics[i].rank=Integer.parseInt(ss[0]);
				} catch (Exception e) {}
				musics[i].title=ss[1];
				musics[i].singer=ss[2];
				musics[i].album=ss[3];
				musics[i].key=ss[4];
				i++;
			}
		} catch (Exception e) {} 
	}
}
// 제어
public class MusicMain {
	public static void main(String[] args) {
		MusicData md=new MusicData();
		System.out.println("=============== 뮤직 Top50 ===============");
		for(int i=0;i<md.musics.length;i++) {
			System.out.println("순위:"+md.musics[i].rank);
			System.out.println("노래명:"+md.musics[i].title);
			System.out.println("가수명:"+md.musics[i].singer);
			System.out.println("앨범명:"+md.musics[i].album);
			System.out.println("동영상 키:"+md.musics[i].key);
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("동영상 선택(1~50=>47번제외):");
		int mno=sc.nextInt();
		Music mm=md.musics[mno-1];
		System.out.println("===== 상세보기 =====");
		System.out.println("순위:"+mm.rank);
		System.out.println("노래명:"+mm.title);
		System.out.println("가수명:"+mm.singer);
		System.out.println("앨범명:"+mm.album);
		System.out.print("동영상을 실행할까요?(y|n):");
		char c=sc.next().charAt(0);
		if(c=='y' || c=='Y') {
			try {
				Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe "
						+"http://youtube.com/embed/"+mm.key);
			} catch (Exception e) {}
		}else {
			System.out.println("프로그램 종료!!");
		}
	}
}
