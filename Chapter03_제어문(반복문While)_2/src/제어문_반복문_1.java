/*
	while => 1차
	------------ 응용(파일읽기,데이터베이스(오라클연동))
	일반 프로그램의 반복문(for)
	
	초기값 1
	while(조건문) 2{ => 무한루프(while(true))
		반복 수행문장 3
		증감식 4 =====> 2번으로 이동
					  --------- false 종료
					  --------- true 문장 수행
	}
	
	응용
		for(){
			for(){
			
			}
		}
		
		for(){
			while(){
				if(){
					for(){
					
					}
				}
			}
		}
 */
// 1~100까지의 짝수의 합,홀수의 합
public class 제어문_반복문_1 {
	public static void main(String[] args) {
		int even=0;
		int odd=0;
		int i=1;
		
		while(i<=100) {
			if(i%2==0)
				even+=i;
			else
				odd+=i;
			i++;
		}
		
		System.out.println("1~100까지의 짝수의 합:"+even);
		System.out.println("1~100까지의 홀수의 합:"+odd);
	}
}
