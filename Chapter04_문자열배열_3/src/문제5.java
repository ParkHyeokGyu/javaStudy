import java.util.Arrays;

public class 문제5 {
	public static void main(String[] args) {
//		10개의 난수를 배열 안의 모든 값을 더하고, 총합과 평균을 출력하시오.
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*100)+1;
		}
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("총합:"+sum);
		System.out.printf("평균:%.2f",(sum/(double)arr.length));
	}
}
