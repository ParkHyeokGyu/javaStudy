
public class 문제10 {
	public static void main(String[] args) {
//		10)1~30 짝수합,홀수합을 출력하는 프로그램을 작성
		int even=0;
		int odd=0;
		for(int i=1;i<=30;i++) {
			if(i%2==0)
				even+=i;
			else
				odd+=i;
		}
		System.out.println("짝수합:"+even);
		System.out.println("홀수합:"+odd);
	}
}
