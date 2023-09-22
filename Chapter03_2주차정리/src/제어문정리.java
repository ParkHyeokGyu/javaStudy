/*
 	자바 제어문 종류
 	------------
 	조건문
 		단일조건문
 			if(조건문){ => true/false(부정연산자,논리연산자,비교연산자만 사용)
 				조건이 true일 시 수행하는 문장
 			}
 			독립적인 경우
 			
 		선택조건문 => true/false 나눠서 처리
 			로그인 여부,아이디 중복체크,검색어 입력 여부
 			if(로그인이 되었다면){
 				로그인이 된 경우
 			}else{
 				로그인이 안된 경우
 			}
 		
 		다중조건문 => 한개의 문장만 수행
 			if(조건문){
 				조건이 true일 시 수행하는 문장 => 수행 후 if문 종료
 				false일 시 다음 조건문 수행
 			}else if(조건문){
 				조건이 true일 시 수행하는 문장 => 수행 후 if문 종료
 				false일 시 다음 조건문 수행
 			}else if(조건문){
 				조건이 true일 시 수행하는 문장 => 수행 후 if문 종료
 				false일 시 다음 조건문 수행
 			}else{
 				위의 해당되는 조건이 없는 경우 => default
 			}
 			
 	선택문 => 한개의 값을 선택한 경우에 처리
 			별점,카테고리,메뉴,서버프로그램
 			switch(정수,문자,문자열){
 			case 값:
 				처리문장;
 			case 값:
 				처리문장;
 				break;
 			case 값:
 				처리문장;
 			}
 			
 	반복문
 		for : 횟수지정 => 배열,컬렉션
 					   -------- 인텍스 번호
 					   for-each => 향상된 for문
 					   for a of list =>js
 					   for i in => py
 			
 		1차 for문
 				 1	  2		4
 			for(초기값;조건식;증감식){
 				 3
 				반복수행문장	
 			}
 		
 		2차 for문
 			알고리즘 => sort,등수구하기...
 			
 				 1	  2		8
 			for(초기값;조건식;증감식){
 					 3	  4		6
 				for(초기값;조건식;증감식){
 					 5
 					반복수행문장
 				}
 				7
 				줄바꿈
 			}
 			
 		while
 		
 	반복제어문
 */
public class 제어문정리 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		for(int a:arr) { // 웹의 목록 출력
			System.out.println(a);
		}
	}
}
