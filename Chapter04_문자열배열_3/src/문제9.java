import java.util.Arrays;

public class 문제9 {
	public static void main(String[] args) {
//		정수 10개를 입력받아 배열에 저장하고, 배열에 있는 정수 중에서 3의 배수만 출력하시오
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		System.out.println(Arrays.toString(arr));
		for(int i:arr) {
			if(i%3==0) {
				System.out.print(i+"  ");
			}
		}
	}
}
