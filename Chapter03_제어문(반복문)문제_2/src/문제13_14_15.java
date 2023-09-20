
public class 문제13_14_15 {
	public static void main(String[] args) {
//		13. 다음 결과를 출력하는 프로그램
//		 
//		 출력예) ********** (5행10열)
//			   **********
//			   **********
//			   **********
//			   **********
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=10;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
//		14. 다음 결과를 출력하는 프로그램
//		 
//		 출력예) 1 1 1 1 1
//			   2 2 2 2 2
//			   3 3 3 3 3
//			   4 4 4 4 4
//			   5 5 5 5 5 
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				System.out.print(i);
			}
			System.out.println();
		}
//		16. 다음 결과를 출력하는 프로그램
//		 
//		 출력예) 1 # # # #
//			   # 2 # # #
//			   # # 3 # #
//			   # # # 4 #
//			   # # # # 5
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j) {
					System.out.print(i);
				}else {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}
