/*
 *	if(조건문){
		조건문이 true일때 실행하는 문장
	}
	
	단일조건문 : 독립수행
	if문이 한 개의 문장으로 사용
	
	중첩 if
	if(조건문){ => if(조건문 && 조건문)
		if(조건문){
		
		}
	}
 */
public class 단일조건문_6 {
	public static void main(String[] args) {
		// 가위	바위	보
		int com=(int)(Math.random()*3);
		if(com==0)
			System.out.println("가위");
		if(com==1)
			System.out.println("바위");
		if(com==2)
			System.out.println("보");
	}
}
