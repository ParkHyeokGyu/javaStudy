// 간단한 프로그램 => 중복 없는 난수
public class 배열_5 {
	public static void main(String[] args) {
		int[] arr=new int[10];
		for(int i=0;i<arr.length;i++) {
			arr[i]=(int)(Math.random()*10)+1;
			for(int j=0;j<i;j++) {
				if(arr[i]==arr[j]) {
					i--;
					// index를 이용해 다시 난수 발생
					break;
				}
			}
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
