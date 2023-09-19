
public class 문제1 {
	public static void main(String[] args) {
//		1) 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)
		int sum=0;
		for(int i=2;i<=100;i+=2)
			sum+=i;
		System.out.println(sum);
	}
}
