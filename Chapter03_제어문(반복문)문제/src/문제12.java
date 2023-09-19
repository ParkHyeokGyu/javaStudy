
public class 문제12 {
	public static void main(String[] args) {
//		12)1~1000까지에서 7의 배수의 합 ,9의 배수의 합
		int seven=0;
		int nine=0;
		int sum=0;
		for(int i=1;i<=1000;i++) {
			if(i%7==0)
				seven+=i;
			if(i%9==0)
				nine+=i;
			if(i%7==0&&i%9==0)
				sum+=i;
		}
		System.out.println("7의 배수:"+seven);
		System.out.println("9의 배수:"+nine);
		System.out.println("7의 배수+9의 배수:"+sum);
	}
}
