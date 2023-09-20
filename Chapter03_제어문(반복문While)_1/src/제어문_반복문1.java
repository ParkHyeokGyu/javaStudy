/*
	웹
	--- 변수, 연산자, 제어문, 메소드, 클래스, 인터페이스, 예외처리
				  -----
				  if/for/while/break
	while
		반복횟수가 없는 경우
		데이터베이스 연동,파일 읽기
		
		초기값
		while(조건문){
			반복 수행문장
			증감식
		}
		
		int i=1;
		while(i<=10){
			System.out.println(i);
			i++;
		}
		
		초기값 ①
		while(조건문){ ②---┐--- false(종료),true(문장 수행)
			반복 수행문장 ③	 ㅣ
			증감식 ④-------┘
		}
 */
public class 제어문_반복문1 {
	public static void main(String[] args) {
		System.out.println("===== for =====");
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n===== while =====");
		int i=1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
	}
}
