/*
	제어문 : 프로그래믈 제어 => 반복수행,선택한 부분만 출력,사용자 요청처리
	
	for : 반복횟수가 있을 경우 => 화면UI
		  웹 프로그램(Front)
		  
		  		1 →	2 ←	 4
		  for(초기값;조건식;증감식){
		  		3  ↙	↗
		  	반복수행문장
		  }
		  
		  초기값 => 조건검색
		  			true => 반복문장수행 => 초기값을 증감식에 따라 연산
		  			false => 종료
		  
		  2차 for(중첩조건문)
		  	알고리즘
		  	정렬,검색
		  		 
		  		 1	  2		7
		  	for(초기값;조건식;증감식){ => 출력 내용의 반복
		  			 3	  4		6
		  		for(초기값;조건식;증감식){
		  			  5
		  			출력 내용
		  		}
		  	}
		  
	while : 반복횟수가 없을 경우 => 서버프로그램(Back)
			크롤링,데이터베이스,파일읽기
			선조건(수행을 못할 수 있다)
			
			초기값			1
			while(조건식){	2 => true/false
				반복수행문장	3
				증감식		4
			}
			
			while(true)
			
	do~while : 무조건 한번 이상 수행
			   웹(사용빈도 거의 없다)
			   후조건
			   
			   초기값
			   do{			1
			   	반복수행문장	2
			   }while(조건식);3 => 증가된 값을 조건 검색
			   
			   int i=1;
			   do{
			   	System.out.println(i);	1,2,....10
			   	i++;	i=2,i=3,....i=10,i=11
			   }while(i<=10);
			   
	
 */
public class 제어문_반복문1 {
	public static void main(String[] args) {
		System.out.println("============ for ============");
		for(int i=1;i<=10;i++) {
			System.out.print(i+" ");
		}
		System.out.println("\n============ while ============");
		int i=1;
		while(i<=10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println("\n============ do~while ============");
		i=1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=10);
	}
}
