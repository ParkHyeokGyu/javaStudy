/*
 	묶는 기술 => 객체지향 => 재사용
 	1.변수 묶는 방법
 	  배열	같은 데이터형(메모리의 크기가 동일 => 연속적인 메모리 구조를 가진다)
 	  		=> 인덱스를 이용할 수 있다
 	  클래스	다른 데이터형(메모리 주소 접근 연산자(.))
 	
 	2.연산자/제어문
 	  메소드(명령문을 묶어서 사용)
 	  => 한개의 기능 => 부품(컴포넌트)
 	---------------------------
 	=> 조립 : 한 개의 프로그램
 	=> 게시판, 회원, 맛집, 채팅, 예약, 추천, 결제
 	   --------------------------------
 	   영화 : 게시판, 회원, 예약, 추천, 결제
 	   				   ------------- 수정
 	-----------------------------------------------
	1.가독성
	2.최적화 => React,Vue
	3.견고성 => 사전에 에러를 방지하는 프로그램 : 예외처리
			  프로그래머의 실수, 사용자의 잘못된 입력값
	-----------------------------------------------
	예외처리
	1.정의 => 사전에 에러를 방지
	2.목적 => 비정상 종료를 방지하고 정상 종료를 할 수 있게 만든다
	
		------
		------ 에러 => catch => 에러 확인, 에러 복구
		------
		
		에러 복구 => try~catch
		에러 무시 => 에러 회피 => throws
		견고한 프로그램 => 에러 발생(임의 발생) => throw
		프로그램은 항상 모든것을 지원하지 않는다 => 사용자 정의
		=> 사용자 정의 데이터형 : Music, Movie...
		   기존의 데이터형을 모아서 새로운 데이터형을 제작
		   => class
		=> 사용자 정의 메소드
		=> 사용자 정의 예외처리 => 필요한 예외처리가 없는 경우
		----------------------------------------
		결제모듈, 보안처리, 데이터베이스 => 솔루션(개발,SM/영업/운영)
	
		예외 복구
		형식)
			try{
				정상적으로 수행할 수 있는 문장
			}catch(Exception e){
				여러개 사용 가능
				try절 안의 명령문에서 오류 발생 시 예외처리/복구
			}finally{
				필요한 경우에만 사용
				try,catch절 관계없이 무조건 수행
				=> 서버 닫기, 오라클 닫기, 파일 닫기
			}
			
			문장1
			문장2 => 에러 발생(비정상 종료)
			try{
				문장3
				문장4 => 에러 발생(해당 문장 포함,아래의 문장들을 수행하지 않고 catch절로 이동)
				문장5
			}catch(예외처리 클래스){
				문장6
			}finally{
				문장7
			}
			문장8 => 종료
			
			실행 순서
			1-2-3-4-5-7-8 => 에러 없이 정상적으로 수행 시 catch절의 문장은 수행하지 않는다
			1-2-3-6-7-8 => 에러가 발생하더라도 finally절의 문장은 수행된다
			
			try{
				문장1
				문장2 => C에러 발생(catch절이 선언된 순서대로 Exception을 찾아간다)
				문장3
			}
			catch(A){A에 대한 에러 복구}
			catch(B){B에 대한 에러 복구}
			catch(C){C에 대한 에러 복구}
			finally{}
			
			A=>B=>C=>finally 순으로 실행
 */
package com.sist.exception;
import java.io.*;
public class MainClass_2 {
    public static void main(String[] args) {
    	// FileInputStream 1byte씩 읽어온다
    	// FileReader 2byte씩 읽어온다
    	FileReader fr=null;
    	try {
			fr=new FileReader("C:\\javaDev\\movie.txt");
			StringBuffer sb=new StringBuffer();
			int i=0;
			while((i=fr.read())!=-1) {
				sb.append((char)i);
			}
			System.out.println(sb.toString());
		} catch (IOException e) {
			/*
			 	getMessage() => 에러에 대한 메시지만 알려준다
			 	printStackTrace() => 권장
			 		 ------------
			 		 실행 중 에러 발생시 멈추고 해당위치를 확인
			 */
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
