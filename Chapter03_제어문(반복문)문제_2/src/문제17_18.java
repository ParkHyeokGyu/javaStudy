
public class 문제17_18 {
	public static void main(String[] args) {
//		17. 다음 결과를 출력하는 프로그램
//		 
//		 출력예) A B C D E
//			   A B C D E
//			   A B C D E
//			   A B C D E
//			   A B C D E
		for(int i=1;i<=5;i++) {
			char ch='A';
			for(int j=1;j<=5;j++) {
				System.out.print(ch++);
			}
			System.out.println();
		}
//		18. 다음 결과를 출력하는 프로그램
//		 
//		 출력예) A A A A A
//			   B B B B B               
//		       C C C C C
//		       D D D D D
//		       E E E E E
		char ch='A';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(ch);
			}
			ch++;
			System.out.println();
		}
	}
}
