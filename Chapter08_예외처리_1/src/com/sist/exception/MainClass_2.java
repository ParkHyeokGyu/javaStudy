/*
 	예외처리의 기본(267page)
 		예외복구 => 가장 많이 사용된다
 		try~catch~finally
 		1)형식
 		  try{
 		      에러없이 실행이 가능한 소스
 		      정상수행하는 문장 => 개발자의 실수,사용자의 입력
 		  }catch(Exception e){
 		      예외복구 => 다시 입력 요청,다음 문장으로 이동
 		  } => catch는 예상되는 예외를 따로 처리한다면 여러개 사용이 가능
 		
 		2)동작 흐름
 		  
 		  문장1
 		  문장2
 		  try{ => 전체 / 부분 => 에러가 발생할 수 있는 부분
 		      문장3
 		      문장4
 		      문장5   
 		  }catch(Exception e){
 		      문장6
 		  }
 		  문장7
 		  문장8
 		  
 		  => 1-2-3-4-5-7-8
 		  ---------------------------------------
 		  문장1
 		  문장2
 		  try{ => 전체 / 부분 => 에러가 발생할 수 있는 부분
 		      문장3
 		      문장4 => int a=10/0; => 에러 발생
 		      문장5   
 		  }catch(Exception e){
 		      문장6
 		  }
 		  문장7
 		  문장8
 		  
 		  => 1-2-3-6-7-8
 		  ---------------------------------------
 		  문장1
 		  문장2 => 에러 발생
 		  try{ => 전체 / 부분 => 에러가 발생할 수 있는 부분
 		      문장3
 		      문장4 => 에러 발생 => catch로 이동,밑의 문장 수행 불가
 		      문장5
 		  }catch(Exception e){
 		      문장6 => 복구 => 문장3으로 이동
 		  }
 		  문장7
 		  문장8
 		  
 		  => 1-종료 => 비정상 종료
 		  ---------------------------------------
 		  try절에는 정상으로 수행하는 문장
 		  => 개발자 실수,사용자 입력값 : 에러 발생
 		  						 -------
 		  						 |종료 => 종료 방지를 위해 catch
 		  
 		  *** 수행문장에 이상이 없는 경우(에러가 없는 경우)
 		      try{소스}
 		  *** 수행문장에 이상이 있는 경우(에러가 있는 경우)
 		             ------------- 무시 => catch로 이동
 		  
 */
package com.sist.exception;

public class MainClass_2 {
	public static void main(String[] args) {
		System.out.println("문장1");
		System.out.println(10/0);
		try {
			System.out.println("문장3");
			System.out.println(10/0);
			System.out.println("문장5");
		} catch (Exception e) {
			System.out.println("문장6");
		}
		System.out.println("문장7");
		System.out.println("문장8");
	}
}
