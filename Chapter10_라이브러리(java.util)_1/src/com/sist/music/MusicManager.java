package com.sist.music;
// Music을 제어하는 프로그램

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MusicManager {
	// 접속하는 모든 유저에게 공유
	private static Music[] musics;
	// 초기화 => 클래스 블록에서는 초기화 불가
	/*
	 	1)인스턴스 블록
	 	2)static 블록
	 	3)생성자
	 */
	
	public MusicManager() {
		FileReader fr=null;
		try {
			fr=new FileReader("C:\\javaDev\\genie.txt"); // FileNotFoundException
			StringBuffer data=new StringBuffer();
			int read=0;
			while((read=fr.read())!=-1) {
				data.append((char)read);
			}
			StringTokenizer st=new StringTokenizer(data.toString(), "\n");
			musics=new Music[st.countTokens()];
			for(int i=0;i<musics.length;i++) {
				musics[i]=new Music();
				StringTokenizer st2=new StringTokenizer(st.nextToken(), "|");
				String rank=st2.nextToken();
				rank=rank.replaceAll("\\uFEFF", "");
				musics[i].setRank(Integer.parseInt(rank));
				musics[i].setTitle(st2.nextToken());
				musics[i].setSinger(st2.nextToken());
				musics[i].setAlbum(st2.nextToken());
				musics[i].setKey(st2.nextToken());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public Music[] musicAllData() {
		return musics;
	}
	
	/*
 	문제1
 	
 	예외에 대한 설명 중 틀린 것은 무엇입니까?

	① 예외는 사용자의 잘못된 조작, 개발자의 잘못된 코딩으로 인한 프로그램 오류를 말한다.

	② RuntimeException의 하위 예외는 컴파일러가 예외 처리 코드를 
	   체크하지 않는다.
	
	③ 예외는 try-catch 블록을 사용해서 처리된다.
	
	④ 자바 표준 예외만 프로그램에서 처리할 수 있다.
	
	예외처리 종류(예외 : java.io,java.net,java,sql)
						    -----------------
						    | 웹(네트워크)
	= 예외 복구
	  try{
	      정상 수행,예외가 발생되는 소스
	  }catch{
	      예외 발생 시 복구
	      => 예외의 위치
	         => getMessage()
	         => printStackTrace()
	         => 디버깅 확인 => 수정
	  }
	
	= 예외 회피(예외 떠넘기기)
	  => 라이브러리에서 많이 사용
	  => 예상되는 예외를 선언 => 컴파일러가 확인을 안하고 동작
	     method() theows 예외...(순서가 없다)
	  => 처리 방법은 throws이용,try~catch
	
	= 임의의 발생
	  => throw new 예외처리생성자()
	
	= 사용자 정의 예외처리
	  => class MyException extends Exception{}
	  
	문제2
	
	try-catch-finally 블록에 대한 설명 중 틀린 것은 무엇입니까?

	① try { } 블록에는 예외가 발생할 수 있는 코드를 작성한다.
	
	② catch { } 블록은 try { } 블록에서 발생한 예외를 처리하는 블록이다.
	
	③ try { } 블록에서 return문을 사용하면 finally { } 블록은 실행되지 않는다.
	  => 무조건 실행
	④ catch { } 블록은 예외의 종류별로 여러 개를 작성할 수 있다.

	*/
}
