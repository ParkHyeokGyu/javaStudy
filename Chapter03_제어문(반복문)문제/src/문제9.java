
public class 문제9 {
	public static void main(String[] args) {
//		9)100~999 사이의 4의배수가 아닌 수의 갯수,합을 출력하는 프로그램 작성
		int four=0;
		int sum=0;
		for(int i=100;i<=999;i++) {
			if(i%4!=0) {
				four++;
				sum+=i;
			}
		}
		System.out.println("4의 배수가 아닌 수의 갯수:"+four);
		System.out.println("4의 배수가 아닌 수의 합:"+sum);
	}
}
