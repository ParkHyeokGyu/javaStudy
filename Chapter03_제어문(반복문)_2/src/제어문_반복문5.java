/*
	★
	★★
	★★★
	★★★★
	
	i	j
	줄수	별표
	1	1
	2	2
	3	3
	4	4	=> i==j
	
	★★★★
	★★★
	★★
	★
	
	i	j
	줄수	별표
	1	4
	2	3
	3	2
	4	1	=> i+j=5 => j=5-i
	
	A
	BC
	DEF
	GHIJ
	
	i	j
	줄수	별표
	1	1
	2	2
	3	3
	4	4	=> i==j
 */
public class 제어문_반복문5 {
	public static void main(String[] args) {
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
		
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=5-i;j++) {
//				System.out.print("★");
//			}
//			System.out.println();
//		}
		
		char c='A';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(c++);
			}
			System.out.println();
		}
	}
}
