// 20개의 정수 난수 발생 => 짝수,홀수 갯수
public class 제어문_반복문11 {
	public static void main(String[] args) {
		int th=0;
		int fi=0;
		int se=0;
//		int even=0;
//		int odd=0;
		
		for(int i=0;i<20;i++) {
			int rand=(int)(Math.random()*10)+1;
			if(rand%3==0)
				th++;
			if(rand%5==0)
				fi++;
			if(rand%7==0)
				se++;
		}
		
		System.out.println("3의 배수:"+th);
		System.out.println("5의 배수:"+fi);
		System.out.println("7의 배수:"+se);
		System.out.println("-----------------------------");
		//1-2+3-4+5-6+7-8=9-10
		int sum=0;
		for(int i=1;i<=10;i++) {
			if(i%2==0)
				sum-=i;
			else
				sum+=i;
		}
		
		//BDFHJLN
		for(char c='B';c<='N';c+=2)
			System.out.print(c);
		
		/*
		 	for문 수행시에 => 수열(숫자마다 패턴을 가지고 있어야 반복문이 수행된다)
		 */
	}
}
