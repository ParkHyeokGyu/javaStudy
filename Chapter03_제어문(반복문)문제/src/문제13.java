
public class 문제13 {
	public static void main(String[] args) {
//		13)10~99까지 정수중에 같은 자리의 정수를 출력하시오
		for(int i=10;i<=99;i++) {
			if(i/10==i%10)
				System.out.print(i+"\t");
		}
	}
}