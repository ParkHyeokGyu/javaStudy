/*
 	자바 입출력(입력:InputStream, 출력:OutputStream)
 	=> 반드시 예외처리를 해야된다
 	=> 반드시 import를 이용해서 클래스를 읽어온다
 	       -------- import java.io.*;
 	
 	=> 특징
 	   단방향
 	   데이터 이동 통로를 이용하고있다
 	   ------------ Stream
 	   이동 통로
 	   1)1byte : 바이트 스트림
 	     ~InputStream,~OutputStream
 	     => 파일 업로드/파일 다운로드
 	     => 네트워크는 1바이트
 	   2)2byte : 문자 스트림
 	     ~Reader,~Writer
 	     => 파일 쓰기/파일 읽기
 	-------------------------------
 	바이트 스트림 => File
 	InputStream			OutputStream
 		|					|
 	FileInputStream		FileOutputStream
 	ObjectInputStream	ObjectOutputStream
 	
 	문자 스트림
 	Reader		Writer
 	  |			  |
 	FileReader	FileWriter
 	-------------------------------
 	보조 스트림
 	Buffered~ => 메모리에 미리 올려놓고 읽어들인다
 	=> BufferedReader,BufferedWriter
 	=> BufferedInputStream,BufferedOutputStream
 	
 	자바 특징
 	자바에서는 IO는 Stream을 사용하고 있다
 	            ------
 	            | 데이터가 이동하는 통로
 	              ---------------- FIFO = Queue
 	              LIFO = Stack(메모리)
 	=> IO
 	   = 메모리 입출력
 	   = 파일 입출력
 	   = 네트워크 입출력 => 웹
 	=> IO는 단방향 통신
 	        양방향 => 쓰레드를 이용해서 두 개의 프로그램을 동시에 처리
 	        ----- 채팅
 	=> 읽기/쓰기(1byte,2byte)
 	   자바(서버) =====> 브라우저 =====> 화면 출력
 	                    |
 	                  C/C++로 만들어진 프로그램
 	   char=>2		  char=>1       char=>2
 	      char=>byte로 변경  byte=>char로 변경
 	         encoding         decoding 
 	         
 	   = 1byte : 바이트 스트림
 	     ~InputStream,~OutputStream
 	   = 2byte : 문자 스트림
 	     ~Reader,~Writer
 	     *한글은 한 글자당 2byte => 한글이 깨질 수 있다
 	   
 	   메모리(데이터 저장) ========== 자바응용프로그램 ========== 모니터 전송
 	                      |                      |
 	                  InputStream            OutputStream
 	                  System.in              System.out
 	                  
 	                  class System{
 	                      static InputStream in;
 	                      static OutputStream out;
 	                  }
 	   
 	   IO 관련 클래스
 	   		Object
 	   		  |
 	   ------------------------------------------------------------------
 	   |		|					|						|			|
 	  *File		InputStream			OutputStream			Reader		Writer
 	   			|					|						|			|
 	   		*FileInputStream	*FileOutputStream	  *BufferedReader	BufferedWriter
 	   		FilterInputStream	FilterOutputStream	  *FileReader		*FileWriter
 	   			|					|
 	   	*BufferedInputStream	*BufferedOutputStream
 	   
 	   *ObjectInputStream	*ObjectOutputStream
 	   
 	   => 파일 모드(mode) => r,w,a
 	      r--w--...(리눅스)
 	      
 	      r 읽기
 	      FileReader r=new FileReader("경로");
 	      w 쓰기
 	      FileWriter w=new FileWriter("경로"); => create
 	      a
 	      FileWriter a=new FileWriter("경로",true); => append
 	   
 	   File : 독립된 클래스
 	   = File 정보
 	     new File("경로명\\파일명");
 	   = 디렉토리 정보
 	     new File("경로명");
 	   = 주요 기능
 	     => getName() : 파일명,폴더명
 	     => getPath() : 경로명~파일명
 	     => getParent() : 경로명
 	     => 특성
 	        1.canRead() : 읽기 전용
 	        2.canWrite() : 쓰기 전용
 	        3.isHidden() : 숨김 파일
 	     => 파일/폴더 확인
 	        isFile(),isDirectory()
 */
package com.sist.io;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
/*
 	FIFO
 	int[] arr=new int[10];
 	int index=0;
 	for(int i=0;i<arr.length;i++)
 	
 	LIFO
 	int index=9;
 	for(int i=9;i>=0;i--)
 */
public class MainClass_1 {
	public static void main(String[] args) {
		/*Queue<Integer> q=new LinkedList<Integer>();
		q.offer(10);
		q.offer(20);
		q.offer(30);
		q.offer(40);
		q.offer(50);
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		System.out.println("==========");
		Stack<Integer> s=new Stack<Integer>();
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		s.push(50);
		
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}*/
		
		String s="자바";
//		byte[] b=s.getBytes();
		try {
			System.out.println(URLEncoder.encode(s, "UTF-8"));
			System.out.println(URLDecoder.decode("%EC%9E%90%EB%B0%94", "UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
