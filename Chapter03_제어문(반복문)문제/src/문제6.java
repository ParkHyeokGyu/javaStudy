
public class 문제6 {
	public static void main(String[] args) {
//		6) 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
		}
		System.out.println("1-2+3...-10까지의 합:"+sum);
	}
}
