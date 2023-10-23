/*
 	throws => 라이브러리에서 제공 => 결정(try~catch)
 	=> 복잡한 소스가 있는 경우 => 소스 추가를 할 때 : throws를 사용
 	=> 예외처리 클래스 
 	   Throwable/Exception
 	   --------- 예외의 최상위 클래스
 	   => 자동완성기 
 	=> 예외처리 : 수정이 가능한 에러
 	   => 네트워크 : IP,Web Site
 	   => IO : 파일 경로명/파일명
 	   => SQL : 오라클 문장(SELECT,INSERT,UPDATE,DELETE)
 	      => DML(데이터 조작)
 	=> throw
 	   => 임의로 발생 => 테스트(견고한 프로그램)
 */
package com.sist.exception;

public class MainClass_2 {
	public static void main(String[] args) {
		try {
			int a=10;
			if(a%2==0) {
				throw new Exception(a+"는 홀수가 아닙니다!!");
				// throw문장 아래에는 코딩을 할 수 없다
				// throw => 사용자 정의 예외처리
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
