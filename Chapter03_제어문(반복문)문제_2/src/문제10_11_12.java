
public class 문제10_11_12 {
	public static void main(String[] args) {
//		10. 1~100까지의 정수 중 4의 배수의 합계를 구하라
		int four=0;
		for(int i=0;i<=100;i++) {
			if(i%4==0) {
				four+=i;
			}
		}
		System.out.println("1~100까지의 정수 중 4의 배수의 합:"+four);
//		11. 10개의 정수를 입력받아 그 수들 중 짝수의 개수가 몇개인지 출력하는 프로그램 작성
		int even=0;
		System.out.print("정수 입력:");
		for(int i=1;i<=10;i++) {
			int num=(int)(Math.random()*100)+1;
			System.out.print(num+" ");
			if(num%2==0) {
				even++;
			}
		}
		System.out.println("\n짝수의 개수:"+even);
//		12. 10개의 정수를 입력받아 3의 배수의 개수와 5의 배수의 개수를 각각 출력하는 프로그램
		int three=0;
		int five=0;
		System.out.print("정수 입력:");
		for(int i=1;i<=10;i++) {
			int num=(int)(Math.random()*100)+1;
			System.out.print(num+" ");
			if(num%3==0) {
				three++;
			}
			if(num%5==0) {
				five++;
			}
		}
		System.out.println("\n3의 배수의 개수:"+three);
		System.out.println("5의 배수의 개수:"+five);
	}
}
