// 다중 catch => 에러마다 따로 처리
/*
 	
 	try{
 		문자열 => 정수 변환 에러
 	}catch(Exception e){
 	
 	}catch(NumberFormatException e){
 	
 	}catch(NullPointerException e){
 	
 	}
 	=> 위의 코드는 컴파일 에러
 	=> 예외 처리 최상위 클래스인 Exception이 가장 아래에 위치해야한다
 	
 	Throwable
 	---------
 	|
 	-------------
 	|			|
 	Error		Exception
 				|
 	---------------------
 	|					|
 	IOException			RuntimeException
 	SQLException		|
 						NumberFormatException
 						...
 						
 */
// 문자열을 입력 => 정수 변환 => 배열에 첨부 => 배열에 있는 값
package com.sist.exception;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.*;
public class MainClass_3 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		String s1=scan.next();
		// <input type=text/> => 문자열
		System.out.println("정수 입력:");
		String s2=scan.next();
		
		try {
			int[] arr=new int[2];
			arr[0]=Integer.parseInt(s1);
			arr[1]=Integer.parseInt(s2);
			
			int result=arr[0]/arr[1];
			System.out.println("result="+result);
		} catch (NumberFormatException e) {
			System.out.println("정수 변환을 할 수 없습니다");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 범위를 벗어났습니다");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다");
		} catch (RuntimeException e) {
			System.out.println("실행 시 에러...");
		} catch (Exception e) {
			System.out.println("기타 에러 발생...");
		} catch (Throwable e) {
			System.out.println("에러와 예외처리를 잡는다");
		}
		System.out.println("프로그램 종료");
		// RuntimeException,Throwable
		// SQLException
	}
}
