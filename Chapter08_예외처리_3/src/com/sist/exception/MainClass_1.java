/*
 	throws => 선언 => 예외회피
 	=> method뒤에 붙어 있다 => 라이브러리에 주로 사용
 						   ------- 자동완성기 이용
 	=> throws이용할 수 있다,try~catch 이용
 	   예외처리의 중심은 try~catch
 	---------------------------------------
 	주의점
 	void method() throws Exception,IOExveption,SQLException{}
 	=> 사용
 	void main() throws Exception,IOExveption,SQLException{}
 	void main(){
 		try{}
 		catch(IOExveption e){}
 		catch(SQLException e){}
 		catch(Exception e){}
 	}
 	=> 가장 큰 예외처리로도 가능하다 => Exception으로 통합 가능
 	void main() throws Exception{}
 	void main(){
 		try{}
 		catch(Exception){}
 	}
 	
 */
package com.sist.exception;

import java.io.IOException;
import java.sql.SQLException;

public class MainClass_1 {
	// 코드가 많은 경우 => throws(이미 만들어진 소스)
	// 시작 => try~catch
	public void method() throws Exception,IOException,SQLException{
		int i=Integer.parseInt("10 ");
		System.out.println(i);
	}
	public static void main(String[] args) {
		MainClass_1 m=new MainClass_1();
		try {
			m.method();
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
