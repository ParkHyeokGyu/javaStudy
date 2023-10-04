import java.util.Arrays;

public class 문제10 {
	public static void main(String[] args) {
//		10개의 정수를 입력받아서 짝수의 최대값,홀수의 최대값을 출력하는 프로그램을 작성하시오
		int[] arr=new int[10];
		int evenMax=0;
		int oddMax=0;
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		
		for(int i:arr) {
			if(i%2==0) {
				if(i>evenMax) evenMax=i;
			}else {
				if(i>oddMax) oddMax=i;
			}
		}
		System.out.println("짝수의 최대값:"+evenMax);
		System.out.println("홀수의 최대값:"+oddMax);
	}
}
