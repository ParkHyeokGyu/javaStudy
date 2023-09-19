// 100번의 알파벳 난수 발생 => A,B,C의 갯수
public class 제어문_반복문8 {
	public static void main(String[] args) {
		int a=0;
		int b=0;
		int c=0;
		
		for(int i=0;i<10;i++) {
			char ch=(char)((Math.random()*26)+'A');
			System.out.print(ch+" ");
			if(ch=='A')
				a++;
			else if(ch=='B')
				b++;
			else if(ch=='C')
				c++;
		}
		
		System.out.println();
		System.out.println("A의 갯수:"+a);
		System.out.println("B의 갯수:"+b);
		System.out.println("C의 갯수:"+c);
	}
}
