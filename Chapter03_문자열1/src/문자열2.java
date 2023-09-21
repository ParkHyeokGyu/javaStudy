/*
 	문자열
 	---- String 기능이 많다
 	1. 문자의 갯수 확인 : length()
 	2. 검색
 		startsWith : 시작하는 문자열이 같은 경우
 		endsWith : 끝나는 문자열이 같은 경우 => cookie
 		contains : 포함된 문자가 있는 경우
 		-------- 추천
 		equals : 같은 값 => id,password
 		------ 대소문자 구분
 	3. 문자열 제어
 		변경 : replace,replaceAll
              replace('a','b')
              replace("[가-힣]","")
              replace("[0-9A-Za-z]","")
              
        String s="Hello Java"
        		  0123456789
        문자 자르기 : substring(1) => "ello Java" => 1번부터 끝까지
        		   substring(4,7) => "o J" => 4번부터 7번전까지
        대문자 : toUpperCase
        소문자 : toLowerCase
    4. 모든 데이터형을 문자열로 변경
    	valueOf(1) => "1" => 윈도우나 웹은 문자열로만 통신
   	5. 분리 : split => String[] 배열
   		charAt(index)
   		"Hello Java" => charAt(0) => 'H'
   		index번호는 무조건 0번부터시작(자바)
   					   1번부터시작(오라클)
   	
   	String => 일반형
   	-------------- Call By Value/Call By Reference
   						String		배열/클래스
   	
   	String s="";
   	String s=new String("");
        	
 */
public class 문자열2 {
	public static void main(String[] args) {
		String s="Hello Java!!"; // 문자열의 길이는 공백을 포함한다
		System.out.println(s.length());
		if(s.startsWith("Hello")) {
			System.out.println("포함됨");
		}
	}
}
